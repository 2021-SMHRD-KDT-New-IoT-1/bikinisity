<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>비키니시티-게시판</title>
    
</head>
<body bgcolor="skyblue"> <!--게시판 만들기-->
    
    
    <h1 align="center">자유게시판</h1>
    <br><br>

    <table border="1px"  algin="center"width="1900"; height="500">
    <tr>
        <th style="background-color:#eeeeee; text-align:center">번호</th>
        <th colspan="4" style="background-color:#eeeeee; text-align:center">제목</th>
        <th style="background-color:#eeeeee; text-align:center" >글쓴이</th>     
        <th style="background-color:#eeeeee; text-align:center">작성일</th>
        <th style="background-color:#eeeeee; text-align:center">조회수</th>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td >15</td>
        <td colspan="4">이거너무좋아요!</td>
        <td>방상혁</td>
        <td>2021-10-25</td>
        <td>300</td>
    </th>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>16</td>
        <td colspan="4">후회안합니다.....!!!</td>
        <td>김찬욱</td>
        <td>2021-10-17</td>
        <td>350</td>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>17</td>
        <td colspan="4">두번째 구매중입니다^^</td>
        <td>이강건</td>
        <td>2021-09-20</td>
        <td>400</td>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>18</td>
        <td colspan="4">사장님감사합니다^^~</td>
        <td>김경수</td>
        <td>2021-10-08</td>
        <td>700</td>
    </tr>
    </table>
    
    <input type="button" value="뒤로가기" id="f"/>      
    <input type="button" value="글쓰기" id="i"/>
    <script>
        document.getElementById("i").addEventListener("click",function(){
            location.href="BoardWrite.jsp";
        })
        document.getElementById("f").addEventListener("click",function(){
            location.href="MainBoard.jsp";
        })

    </script>
    </body>