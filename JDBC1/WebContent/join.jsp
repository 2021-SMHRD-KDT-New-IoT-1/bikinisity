<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ȸ������</title>
    <link rel = "stylesheet" href = "join.css">
</head>
<body bgcolor ="skyblue">

    <header>
        <h1>
            <a href = "main.jsp">bikinicity</a>
        </h1>
    </header>

    <div>

        <table>

            <tr>
                <td align="left" id="name", name = "name">�̸�</td>     <!-- �� �̸� (name)--> 
                <td><input type = "text"></td>
            </tr>
            
            <tr>
                <td align="left" id="address", name ="address" >�ּ�</td>    <!-- �� �ּ� (address)-->
                <td><input type = "text"></td>
            </tr>

            <tr>
                <td align="left" id="id" name ="id">���̵�</td>           <!-- �� ���̵� (id)-->
                <td><input type = "text"></td>
            </tr>
    
            <tr>
                <td align="left" id="pw" name = "pw" >��й�ȣ</td>   <!-- �� ��й�ȣ (pw)--> 
                <td><input type = "password"></tr>
            </tr>

            <tr>
                <td align="left" id="email" name = "email">�̸���</td>       <!-- �� �̸��� (email)-->
                <td><input type = "text"></td>
                <td>
                <select>
                    <option>���ϼ���</option>
                    <option value="���̹�">naver.com</option>
                    <option value ="����">daum</option>
                </select>
                </td>
            </tr>

            
            
        </table>
    
        <form action = "main.jsp"> 
			<input type = "submit" class = "btn" value ="ȸ������">
		
        </form>

    </div>

    

</body>
</html>