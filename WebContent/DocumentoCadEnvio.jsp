<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="br.com.std.model.business.StdDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@page import="br.com.std.model.business.DadosDocumentoTramite"%>
<%@page import="br.com.std.model.business.StdDAO"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Rally Race Extreme</title>
<link rel="stylesheet" type="text/css" href="estilo1.css"/>
<meta/>
</head>
<script>
 function showTimer() {
  var time=new Date();
  var hour=time.getHours();
  var minute=time.getMinutes();
  var second=time.getSeconds();
  if(hour<10)   hour  ="0"+hour;
  if(minute<10) minute="0"+minute;
  if(second<10) second="0"+second;
  var st=hour+":"+minute+":"+second;
  document.getElementById("timer").innerHTML=st; 
 }
 function initTimer() {
  // O metodo nativo setInterval executa uma determinada funcao em um determinado tempo  
  setInterval(showTimer,1000);
 }
</script>
<body onLoad="initTimer();">
	<aside> <titulo>
		<h1>
			<marquee>
			<img src="resources/img/biblioteca.png"></img>Dados Tramite <img
				src="resources/img/biblioteca.png"></img></marquee>
		</h1>
		</titulo> </aside>
  	<fundo_menu_escolha1>
            <section>    
        <%
        	try {
        		StdDAO cd = new StdDAO();
                 List<DadosDocumentoTramite> l = cd.lista1();
				for (DadosDocumentoTramite v1 : l ) {
				
		%>
		
		
				 <b><label>Numero id:</label></b> <%= v1.getIdTramite() %> <br></br>
                 <b><label>Nome Documento:</label></b> <%= v1.getNomeDocumento() %> <br></br>
                 <b><label>Descrição:</label></b> <%= v1.getDescricao() %> <br></br>
                 <b><label>Data:</label></b> <%= v1.getDataTramite() %> <br></br>
              	 <b><label>Centro de Custo:</label></b> <%= v1.getCentroCusto() %> <br></br>
              	  <b><label>Destinatario:</label></b> <%= v1.getDestinatario() %> <br></br>
                
            
        <%
				} } catch (Exception e) {
					
				} finally {
					}
				
		%>   
		
		</section>
		<a href="menu.jsp">Voltar</a>
	<br></br><br></br>
	<!-- Fim section -->	
	
	<!-- inicio rodape -->
	<footer>
		<jsp:include page="templates/footer.html"></jsp:include>
	</footer>
	<br>
<b><span id="timer">Relógio</span></b>
	</fundo_menu_escolha1>
		 
   
</body>
</html>