<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>��Ű�Ͻ�Ƽ-�Խ���</title>
    
</head>
<body bgcolor="skyblue"> <!--�Խ��� �����-->
    
    
    <h1 align="center">�����Խ���</h1>
    <br><br>

    <table border="1px"  algin="center"width="1900"; height="500">
    <tr>
        <th style="background-color:#eeeeee; text-align:center">��ȣ</th>
        <th colspan="4" style="background-color:#eeeeee; text-align:center">����</th>
        <th style="background-color:#eeeeee; text-align:center" >�۾���</th>     
        <th style="background-color:#eeeeee; text-align:center">�ۼ���</th>
        <th style="background-color:#eeeeee; text-align:center">��ȸ��</th>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td >15</td>
        <td colspan="4">�̰ųʹ����ƿ�!</td>
        <td>�����</td>
        <td>2021-10-25</td>
        <td>300</td>
    </th>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>16</td>
        <td colspan="4">��ȸ���մϴ�.....!!!</td>
        <td>������</td>
        <td>2021-10-17</td>
        <td>350</td>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>17</td>
        <td colspan="4">�ι�° �������Դϴ�^^</td>
        <td>�̰���</td>
        <td>2021-09-20</td>
        <td>400</td>
    </tr>
    
    <tr style="background-color:#eeeeee; text-align:center">
        <td>18</td>
        <td colspan="4">����԰����մϴ�^^~</td>
        <td>����</td>
        <td>2021-10-08</td>
        <td>700</td>
    </tr>
    </table>
    
    <input type="button" value="�ڷΰ���" id="f"/>      
    <input type="button" value="�۾���" id="i"/>
    <script>
        document.getElementById("i").addEventListener("click",function(){
            location.href="BoardWrite.jsp";
        })
        document.getElementById("f").addEventListener("click",function(){
            location.href="MainBoard.jsp";
        })

    </script>
    </body>