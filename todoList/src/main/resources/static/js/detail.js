// 목록으로 버튼 동작 (메인페이지로 요청)
const goTolist = document.querySelector('#goToList');

goToList.addEventListener("click", () => {
  location.href = "/"; // 메인 페이지 요청(GET 방식)
});

// 완료 여부 변경 버튼
const todocompleteBtn = document.querySelector(".todocomplete-btn");

todocompleteBtn.addEventListener("click", e => {

  // 요소.dataset : data-* 속성에 저장된 값 반환
  // data-todo-no 세팅한 속성값 얻어오기

  const todoNo = e.target.dataset.todoNo;
  let todocomplete = e.target.innerText; // 기존 완료 여부 값 얻어오기

  // Y <-> N
  todocomplete = (todocomplete === 0) ? 1 : 0;

  // 완료 여부 수정 요청하기
  location.href = `/todo/changetodoComplete?todoNo${todoNo}&todocomplete=${todocomplete}`;

  // console.log(todoNo);
});





// 수정 버튼
const updateBtn = document.querySelector("#updateBtn");


// 삭제 버튼
const deleteBtn = document.querySelector("#deleteBtn");