<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판글쓰기</title>
  <style>
    caption{
      font-size:40px ;
    }
  </style>

  
</head>
<body bgcolor="skyblue">

	<table summary="글쓰기 전체 테이블">
		
		
   		<colgroup>
   			<col width="20%">
   			<col width="80%">
   		</colgroup>
   	

		<table summary="테이블 구성" align="center">
		<caption><h2>게시판 글쓰기</h2></caption>	
    		<tr>
				<td>작성자</td>
				<td><input type=text name=name size=10 maxlength=8></td>
			</tr>
			<tr>
	 			<td>E-Mail</td>
	 			<td><input type=text name=email size=30></td>
    		</tr>
    		<tr>
     			<td>홈페이지</td>
     			<td><input type=text name=homepage size=30></td>
    		</tr>
    		<tr>
     			<td>제 목</td>
     			<td><input type=text name=title></td>
    		</tr>
    		<tr>
     			<td>내 용</td>
     			<td><textarea name=content rows ="10" cols="100"style="margin: 0px; width: 727px; height: 497px;"></textarea>></textarea></td>
    		</tr>
    		<tr>
     			<td>비밀번호</td> 
     			<td><input type=password name=password size=15 maxlength=15></td>
    		</tr>
    		<tr>
     			<td colspan=2><hr size=1></td>
    		</tr>
    		<tr>
     			<td colspan="2"><div align="center">
     			<input type="submit" value="등록" id="submit">         <!-- 작성된 게시글(작성자, E-Mail, 홈페이지, 제목, 내용)을 고객 아이디에 맞게 등록 (submit) -->  
         		<input type="button" value="뒤로" id="back"></div>	
				<script>
					document.getElementById("back").addEventListener("click",function(){
						location.href="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/Board.jsp";
					})
					document.getElementById("submit").addEventListener("click",function(){
						location.href="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/Board.jsp";
					})
			
				</script>
     			</td>
    		</tr> 
		</table>
	</form> 
</table>


</body>
</html>