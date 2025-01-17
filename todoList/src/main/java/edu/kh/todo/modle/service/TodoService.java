package edu.kh.todo.modle.service;

import java.util.List;
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

	/** 전체 할 일 개수 조회
	 * @return
	 */
	int getTotalCount();

	/** 완료된 할 일 개수 조회
	 * @return
	 */
	int getCompleteCount();


	/** 할 일 목록 조회
	 * @return
	 */
	List<Todo> selectList();

	/** 할 일 삭제 요청 (DELETE 방식)
	 * @param todoNo
	 * @return
	 */
	int todoDelete(int todoNo);

	int todoUpdate(Todo todo);





	
}













