<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>비키니시티</title>
    <link rel="stylesheet" href="CSS.css">
    

</head>

<body bgcolor="skyblue">
    <header>
        <h1>
            <a href = "http://127.0.0.1:5500/main.html">bikinicity</a>
        </h1>
        <nav>
            <ul>
                <li><a href ="http://127.0.0.1:5500/main.html">로그아웃</a></li>  <!-- 로그아웃 누르면 main.html로 넘어가는 보여주기식-->
                <li><a href = "#">개인정보수정</a></li>                             <!-- 보여주기식-->
            </ul>
        </nav>
    </header>





    <br> <br> <br> 
     

    <div style="text-align: center;">
        <form action="board.jsp">   
            <button class="button1">게시판</button> 
        </form>
        <br><br><br><br>

        <form action="photoboard1.jsp"> 
            <button class="button1">포토갤러리</button>  
        </form>
        
            <br><br><br><br>
        <form action="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/fish_information.jsp">
            <button class="button1" id="i" >어항정보</button>  <!-- 고객 아이디에 맞는 어항 정보로 넘어감 (i)-->
        </form>
            <br><br><br><br>
        <form action="http://127.0.0.1:5500/Calendar-master/index.jsp">  
            <button class="button1" id="w">어항기록</button>  <!-- 고객 아이디에 맞는 어항 기록으로 넘어감 (w)-->
        </form>   
    
    </div>

 
</body>

</html>