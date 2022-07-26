<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
    <form>
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Enter username" id="title">
        </div>

        <div class="form-group">
          <textarea class="form-control summernote" rows="5" id="content"></textarea>
        </div>
      </form>
      <button id="btn-save" class="btn btn-primary">글쓰기완료</button>
</div>
<script>
  $('.summernote').summernote({
    tabsize: 2,
    height: 300
  });
</script>
<%@ include file="../layout/footer.jsp"%>
<script src="/js/board.js"></script>