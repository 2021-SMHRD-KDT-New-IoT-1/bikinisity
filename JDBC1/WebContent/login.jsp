<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>�α���</title>
    <link rel = "stylesheet" href = "login.css">
</head>
   
<body bgcolor ="skyblue">
    
    <header>
        <h1>
            <a href = "main.html">bikinicity</a>
        </h1>
        <nav>        
             <ul>
                 <li id="id"><a href = "#">���̵� ã��</a></li>   <!-- �����ֱ�� -->
                 <li><a href = "#">��й�ȣ ã��</a></li>         <!-- �����ֱ�� -->
            </ul>
        </nav>
    </header>

    <div>
        <table>
            <tr>
                <td align="left" id="id">ID</td> <!-- �� ���̵�(id) : join.html���� ������ id���̶� ���⿡ ���� id ���� ������ �α��εǰ� 
                                                                        ���� �ٸ��� ����� �ٸ��ϴ� ������ �������� -->
                <td><input type ="text"></td>
            </tr>

            <tr>
                <td align="left" id = "pw">pw</td>     <!-- �� ��й�ȣ(pw) : join.html���� ������ pw���̶� ���⿡ ���� pw ���� ������ �α��εǰ� ���� 
                                                                    �ٸ��� ����� �ٸ��ϴ� ������ ��������-->
                <td><input type ="password"></td>
            </tr>
        </table>

        <form action = "http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/MainBoard.html"> 
            <button id ="login">�α���</button>  <!-- �α���(login) : ���� ������ id,pw �� join.html�� id,pw�� ������ mainBoard.html�� �Ѿ�� 
                                                                        ���н� ����â �߰� ������ ��������--> 
        </form>
    </div>

</body>
</html>     