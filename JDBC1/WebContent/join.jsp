<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel = "stylesheet" href = "join.css">
</head>
<body bgcolor ="skyblue">

    <header>
        <h1>
            <a href = "main.jsp">bikinicity</a>
        </h1>
    </header>

    <div>

        <table>

            <tr>
                <td align="left" id="name", name = "name">이름</td>     <!-- 고객 이름 (name)--> 
                <td><input type = "text"></td>
            </tr>
            
            <tr>
                <td align="left" id="address", name ="address" >주소</td>    <!-- 고객 주소 (address)-->
                <td><input type = "text"></td>
            </tr>

            <tr>
                <td align="left" id="id" name ="id">아이디</td>           <!-- 고객 아이디 (id)-->
                <td><input type = "text"></td>
            </tr>
    
            <tr>
                <td align="left" id="pw" name = "pw" >비밀번호</td>   <!-- 고객 비밀번호 (pw)--> 
                <td><input type = "password"></tr>
            </tr>

            <tr>
                <td align="left" id="email" name = "email">이메일</td>       <!-- 고객 이메일 (email)-->
                <td><input type = "text"></td>
                <td>
                <select>
                    <option>메일선택</option>
                    <option value="네이버">naver.com</option>
                    <option value ="다음">daum</option>
                </select>
                </td>
            </tr>

            
            
        </table>
    
        <form action = "main.jsp"> 
			<input type = "submit" class = "btn" value ="회원가입">
		
        </form>

    </div>

    

</body>
</html>