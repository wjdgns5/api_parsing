package ch01;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class human_Connect {
	
	public static void main(String[] args) {
		
		human human1 = new human("홍길동", 20, "부산");
		human human2 = new human("이순신", 33, "서울");
		human human3 = new human("세종대왕", 59, "세종시");
		
		human humans[] = {human1, human2, human3};
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String str1= gson.toJson(human1);
		System.out.println(str1);
		
		System.out.println("---------------");
		
		Gson gson2 = new Gson();
		String str2 = gson2.toJson(human2);
		System.out.println(str2);
		
		System.out.println("---------------");
		
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		String str3 = gson3.toJson(human3);
		System.out.println(str3);
		
		System.out.println("---------------");
		
		human humanObject = gson.fromJson(str1, human.class);
		human humanArr[] = gson.fromJson(gson.toJson(humans), human[].class);
		
		
		
		
		
		
		
		
		
		
	} // end of main

} // end of class
