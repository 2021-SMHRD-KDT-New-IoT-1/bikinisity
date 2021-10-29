<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel = "stylesheet" href = "fish_information.css">
</head>

<body bgcolor ="skyblue">
    <a href="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/MainBoard.jsp"><span id="back"><button><</button></span></a>
    <span id="title">어항정보</span>
    <table >
        <tr>
            <td id="id">LED</td>                      
            <td ><button id="b1">전원</button></td>     <!-- 버튼 클릭시 어항 시리얼 번호에 맞는 정보를 가져올수 있게 함 (b1) -->
        </tr>
        <tr>
            <td>LED</td>
            <td id ="c1"></td>    <!-- 버튼 클릭시 어항 시리얼 번호에 맞는 LED ON,OFF 정보를 표시 (c1) -->
        
        
        <tr>
            <td>먹이주기</td>
            <td ><button id="b2">실행</button></td>   <!-- 버튼 클릭시 어항 시리얼 번호에 맞는 정보를 가져올수 있게 함 (b2) -->
        </tr>
        <tr>
            <td>먹이주기</td>
            <td ></td>             <!-- 어항 시리얼 번호에 맞게 먹이를 주었으면 "먹이를 주었습니다"출력, 주지 않았으면 "먹이를 주지않았습니다"출력 
                                        로직을 만들어야함 (b2) -->
        </tr>
        <tr>
            <td><button id="b3">-</button></td>    <!-- 현재 온도 정보를 가져와서 -1씩 해주는 로직을 만들어야함 (b3) -->
        </tr>
        <tr>
            <td>현재 온도:</td>                     
            <td id ="c2"></td>               <!-- 어항 시리얼 번호에 맞게 현재 온도를 출력 (c2)-->
        </tr>
        <tr>
            <td><button id="b4">+</button></td>    <!-- 현재 온도 정보를 가져와서 +1씩 해주는 로직을 만들어야함 (b4) -->
        </tr>
        </tr>
        
    </table>
</body>
</html>