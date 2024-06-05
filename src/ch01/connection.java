package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class connection {

	public static void main(String[] args) throws IOException {
		
		String urlString = "https://jsonplaceholder.typicode.com/todos/1";
		
		URL url = new URL(urlString);
		// url.openConnection() 연결 요청 진행
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		
		conn.setRequestMethod("GET");
		
		// Http 응답 메세지에서 데이터를 추출
		int responseCode = conn.getResponseCode();
		System.out.println("HTTP CODE : " +responseCode);
		
		InputStreamReader input = new InputStreamReader(conn.getInputStream());
		BufferedReader brIn = new BufferedReader(input);
		
		String inputLine;
		StringBuffer responseBuffer = new StringBuffer();
		
		while( (inputLine = brIn.readLine())!= null ) {
			responseBuffer.append(inputLine);
		}
		
		brIn.close();
		
		String strHtmls[] = responseBuffer.toString().split(",");
		System.out.println("index count : " + strHtmls.length);
		
		for (String string : strHtmls) {
			System.out.println(string);
		}
		
		
		
		
		
	} // end of main

} // end of class
