package ch01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dog extends Object {
	
	private String name;
	private int age;
	private String major;
	
	public static void main(String[] args) {
		
		
	}
	


}
