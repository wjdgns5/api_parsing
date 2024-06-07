package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/*
 *  JSON Array 형태를 파싱 해보자.
 */

public class MyHttpUserClient {
	
	
	public static void main(String[] args) {
		
		
		// 순수 자바코드에서 HTTP 통신
		// 1. 서버 주소 경로
		// 2. URL 클래스
		
		
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
			// 다운캐스팅 : 상위 클래스 --> 하위 클래스로 형 변환을 하는것을 의미 
			// openConnection --> URLConnection이다. HttpURLConnection
			// URLConnection 은 HttpURLconnection 보다 상위이다.
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			// Property 내부의 속성을 의미
			conn.setRequestProperty("Content-type", "application/json"); // 헤더
			
			// 응답 코드 확인
			int responseCode = conn.getResponseCode();
			System.out.println("response code : " +responseCode);
			
			// HTTP 응답 메세지에서 데이터를 추출 
			InputStream ip = conn.getInputStream();
			InputStreamReader is = new InputStreamReader(ip);
			BufferedReader in = new BufferedReader(is);
			
			String inputLine;
			StringBuffer buffer = new StringBuffer();
			while( (inputLine = in.readLine())!= null ) {
				buffer.append(inputLine);
			}
			in.close();
			
			System.out.println(buffer.toString());
			System.out.println("---------------");
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			Type UserType = new TypeToken <List<User>>() {}.getType();
			List<User> userList = gson.fromJson(buffer.toString(), UserType);
			
			System.out.println(userList.size());
			
			for (User user : userList) {
				System.out.println(user.toString());
			}
			
		} catch (IOException e) {
			// e.printStackTrace();
		}
		
		
	} // end of main

} // end of class
