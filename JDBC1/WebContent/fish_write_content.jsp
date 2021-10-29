<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>어항기록</title>
    <link rel = "stylesheet" href = "fish_write_content.css">
</head>
<body bgcolor ="skyblue">

    <header>
        <h1>
          <a href = "main.jsp">bikinicity</a>
        </h1>
        <nav>        
            <ul>
                <li><a href = "main.jsp">로그아웃</a></li>
                <li><a href = "#">개인정보수정</a></li>
            </ul>
        </nav>
    </header>


        <div id="d1">
        <table>
            <td>환수 여부</td>
            <td>
            
            O <input type ="radio" name = "change" id="s"> 
            X <input type ="radio" name = "change" id="s">

            </td>

            <tr>
                <td>먹이 횟수</td>
                <td><a href="#">몇번</a></td>
            </tr>

            <tr >
                <td >평균 탁도</td>
                <td><a href="#">값</a></td>
            </tr>

            <tr >
                <td >평균 수온</td>
                <td><a href="#">값</a></td>
            </tr>
        </table>
        </div>

        <div id="d2">
            <table>
                <tr>
                    <td>메모</td>
                </tr>
                <tr >
                    <td><textarea cols="80" rows="6"></textarea></td>
                </tr>
            
            </table>
        </div>
        
        <form action="Calendar-master/index.jsp">
            <button>
                저장
            </button>
        </form>
            
       
       

       
        
        

        
    
</body>
</html>