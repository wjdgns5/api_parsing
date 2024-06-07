package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyHttpTestClient {
	
	public static void main(String[] args) {
		
		// 순수 자바코드에서 HTTP 통신
		// 1. 서버 주소 경로
		// 2. URL 클래스
		// 3. url.openConnection <-- Stream I/O 작업
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/albums/2");
			// HttpURLConnection : HTTP 특정 기능을 지원하는 URL 연결
			// openConnection() : URLConnection 클래스의 인스턴스를 반환함
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("content-type", "application/json");
			
			// 응답 코드 확인
			int responseCode = conn.getResponseCode();
			System.out.println("response code : " +responseCode);
			
			// HTTP 응답 메세지에서 데이터를 추출 
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String inputLine;
			StringBuffer buffer = new StringBuffer();
			while( (inputLine = in.readLine())!= null ) {
				buffer.append(inputLine);
			}
			in.close();
			
			System.out.println(buffer.toString());
			System.out.println("---------------------------");
			// Gson library 활용 
			// Gson gson = new Gson(); 
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			Test TestDTO = gson.fromJson(buffer.toString(), Test.class);
			
			System.out.println("유저 아이디 : "+TestDTO.getUserId());
			System.out.println("아이디 : " +TestDTO.getId());
			System.out.println("제목 : " +TestDTO.getTitle());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} // end of main
	

} // end of class
