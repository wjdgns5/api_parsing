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
public class human {
		
	private String name;
	private int age;
	private String address;
	
	public static void main(String[] args) {
		
	} // end of main
	
} // end of class
