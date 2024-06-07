package ch02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
{
"userId": 1,
"id": 1,
"title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
"body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
}
*/


@Getter // getter 자동 생성
@Setter // setter 자동 생성

@NoArgsConstructor // 아무런 매개변수가 없는 생성자
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자

@ToString

public class Test {
	
	private int userId;
	private int id;
	private String title;
	private String body;

} // end of class
