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
    <span id="title">��������</span>
    <table >
        <tr>
            <td id="id">LED</td>                      
            <td ><button id="b1">����</button></td>     <!-- ��ư Ŭ���� ���� �ø��� ��ȣ�� �´� ������ �����ü� �ְ� �� (b1) -->
        </tr>
        <tr>
            <td>LED</td>
            <td id ="c1"></td>    <!-- ��ư Ŭ���� ���� �ø��� ��ȣ�� �´� LED ON,OFF ������ ǥ�� (c1) -->
        
        
        <tr>
            <td>�����ֱ�</td>
            <td ><button id="b2">����</button></td>   <!-- ��ư Ŭ���� ���� �ø��� ��ȣ�� �´� ������ �����ü� �ְ� �� (b2) -->
        </tr>
        <tr>
            <td>�����ֱ�</td>
            <td ></td>             <!-- ���� �ø��� ��ȣ�� �°� ���̸� �־����� "���̸� �־����ϴ�"���, ���� �ʾ����� "���̸� �����ʾҽ��ϴ�"��� 
                                        ������ �������� (b2) -->
        </tr>
        <tr>
            <td><button id="b3">-</button></td>    <!-- ���� �µ� ������ �����ͼ� -1�� ���ִ� ������ �������� (b3) -->
        </tr>
        <tr>
            <td>���� �µ�:</td>                     
            <td id ="c2"></td>               <!-- ���� �ø��� ��ȣ�� �°� ���� �µ��� ��� (c2)-->
        </tr>
        <tr>
            <td><button id="b4">+</button></td>    <!-- ���� �µ� ������ �����ͼ� +1�� ���ִ� ������ �������� (b4) -->
        </tr>
        </tr>
        
    </table>
</body>
</html>