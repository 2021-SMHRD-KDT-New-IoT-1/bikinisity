<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포토갤러리</title>
    <style>
        #back>button{
            width: 5%;
            height: 40px;
            margin-left: 9.8%;
}
        
        #title{
            font-size: 50px;
            margin-left: 26%;
        }
    </style>

</head>
<body bgcolor="skyblue">
    <a href="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/MainBoard.html"><span id="back"><button><</button></span></a>
    <span id="title">포토갤러리</span>
    <table align ="center">
    <tr>
        <td><img src="img\열대어1.jpg" width="400" height="350"></td>
        <td><img src="img\열대어2.jpg" width="400" height="350"></td>
        <td><img src="img\열대어3.jpg" width="400" height="350"></td>
    </tr>
    <tr>
        <td><b>니모</b><br>2021-10-08</td>
        <td><b>애쉬</b><br>2021-10-09</td>
        <td><b>캘린</b><br>2021-10-15</td>
    </tr>
    <br>
    <tr>
        <th><img src="img\열대어4.jpg" width="400" height="350"></th>
        <th><img src="img\열대어5.jpg" width="400" height="350"></th>
        <th><img src="img\열대어6.jpg" width="400" height="350"></th>
    </tr>
    <tr>
        <td><b>야미</b><br>2021-10-16</td>
        <td><b>나미</b><br>2021-10-17</td>
        <td><b>경수</b><br>2021-10-20</td>
    </tr>
</table>
</body>
</html>