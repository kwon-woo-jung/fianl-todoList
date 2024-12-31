package edu.kh.todo.modle.service;

import java.util.Map;

import edu.kh.todo.model.dto.Todo;

public interface TodoService {

	/**	(TEST) todoNo 가 1인 할 일 제목 조회
	 * @return title
	 */
	String testTitle();
	
	/** 할 일 목록 + 완료된 할 일 갯수 조회
	 * @return map
	 */
	
	Map<String, Object> selectAll();

	
	/** 할 일 추가
	 * @param todoTitle
	 * @param todoDetail
	 * @return result
	 */
	int addTodo(String todoTitle, String todoDetail);

	/** 할 일 상세조회
	 * @param todoNo
	 * @return todo
	 */
	Todo todoDetail(int todoNo);

	/** 완료 여부 변경
	 * @param todo
	 * @return
	 */
	int changeComplete(Todo todo);

	
}