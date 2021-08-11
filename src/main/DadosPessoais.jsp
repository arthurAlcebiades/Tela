<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
        function retornar() {
            history.go(-1);
        }
    </script>

</head>
<body>
	<%
	String usuario = request.getParameter("usuario");
	String senha = request.getParameter("senha");
	
	%>
	<h1>Usuário: <%= usuario %></h1>
	<h1>Senha: <%= senha %></h1>
	
	<%if(usuario == null){ 
		response.sendRedirect("Login.jsp");
	}else{
		out.print("<h1>Seja bem vindo:" + usuario + "<h1><br/>");
	}
	%>

 <a href="Login.jsp">Voltar</a>
		
</body>
</html>