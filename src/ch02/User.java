package ch02;
/*
 
 {
  "id": 1,
  "name": "Leanne Graham",
  "username": "Bret",
  "email": "Sincere@april.biz",
  "address": {
    "street": "Kulas Light",
    "suite": "Apt. 556",
    "city": "Gwenborough",
    "zipcode": "92998-3874",
    "geo": {
      "lat": "-37.3159",
      "lng": "81.1496"
    }
  },
  "phone": "1-770-736-8031 x56442",
  "website": "hildegard.org",
  "company": {
    "name": "Romaguera-Crona",
    "catchPhrase": "Multi-layered client-server neural-net",
    "bs": "harness real-time e-markets"
  }
}
 
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	private int id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;
	
	Address address;
	Company company;
	
	
} // end of class

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Address {
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	Geo geo;
	
} // end of class

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Geo {
	private String lat;
	private String lng;
	
} // end of class

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Company {
	private String name;
	private String catchPhrase;
	private String bs;
	
} // end of class











