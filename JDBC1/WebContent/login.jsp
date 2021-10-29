<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel = "stylesheet" href = "login.css">
</head>
   
<body bgcolor ="skyblue">
    
    <header>
        <h1>
            <a href = "main.html">bikinicity</a>
        </h1>
        <nav>        
             <ul>
                 <li id="id"><a href = "#">아이디 찾기</a></li>   <!-- 보여주기식 -->
                 <li><a href = "#">비밀번호 찾기</a></li>         <!-- 보여주기식 -->
            </ul>
        </nav>
    </header>

    <div>
        <table>
            <tr>
                <td align="left" id="id">ID</td> <!-- 고객 아이디(id) : join.html에서 저장한 id값이랑 여기에 적은 id 값이 같으면 로그인되고 
                                                                        값이 다르면 비번이 다릅니다 로직을 만들어야함 -->
                <td><input type ="text"></td>
            </tr>

            <tr>
                <td align="left" id = "pw">pw</td>     <!-- 고객 비밀번호(pw) : join.html에서 저장한 pw값이랑 여기에 적은 pw 값이 같으면 로그인되고 값이 
                                                                    다르면 비번이 다릅니다 로직을 만들어야함-->
                <td><input type ="password"></td>
            </tr>
        </table>

        <form action = "http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/MainBoard.html"> 
            <button id ="login">로그인</button>  <!-- 로그인(login) : 여기 페이지 id,pw 와 join.html의 id,pw가 같으면 mainBoard.html로 넘어가고 
                                                                        실패시 실패창 뜨게 로직을 만들어야함--> 
        </form>
    </div>

</body>
</html>     