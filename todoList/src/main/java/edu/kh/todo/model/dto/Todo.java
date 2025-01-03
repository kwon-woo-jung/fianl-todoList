package edu.kh.todo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
	private int 	todoNo; 	  // 할 일 번호
	private String  todoTitle;    // 할 일 제목
	private String  todoDetail;   // 할 일 내용
	private String  todoComplete; // 할 일 완료 여뷰 ("Y", "N")
	private String  regDate; 	  // 할 일 등록일
	 
	
}
