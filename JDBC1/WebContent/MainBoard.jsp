<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>��Ű�Ͻ�Ƽ</title>
    <link rel="stylesheet" href="CSS.css">
    

</head>

<body bgcolor="skyblue">
    <header>
        <h1>
            <a href = "http://127.0.0.1:5500/main.html">bikinicity</a>
        </h1>
        <nav>
            <ul>
                <li><a href ="http://127.0.0.1:5500/main.html">�α׾ƿ�</a></li>  <!-- �α׾ƿ� ������ main.html�� �Ѿ�� �����ֱ��-->
                <li><a href = "#">������������</a></li>                             <!-- �����ֱ��-->
            </ul>
        </nav>
    </header>





    <br> <br> <br> 
     

    <div style="text-align: center;">
        <form action="board.jsp">   
            <button class="button1">�Խ���</button> 
        </form>
        <br><br><br><br>

        <form action="photoboard1.jsp"> 
            <button class="button1">���䰶����</button>  
        </form>
        
            <br><br><br><br>
        <form action="http://127.0.0.1:5500/%EA%B1%B4%EC%9D%B4%EA%BA%BC/fish_information.jsp">
            <button class="button1" id="i" >��������</button>  <!-- �� ���̵� �´� ���� ������ �Ѿ (i)-->
        </form>
            <br><br><br><br>
        <form action="http://127.0.0.1:5500/Calendar-master/index.jsp">  
            <button class="button1" id="w">���ױ��</button>  <!-- �� ���̵� �´� ���� ������� �Ѿ (w)-->
        </form>   
    
    </div>

 
</body>

</html>