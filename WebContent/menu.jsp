<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STD - Sistema Tramitação de Documentos</title>
<link rel="stylesheet" type="text/css" href="estilo1.css"/>
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
	<!-- Inicio cabecalho -->
	<header>
		
	</header>
	<!-- Fim cabecalho -->
	
	<!-- Inicio section -->
	
	<aside> <titulo>
		<h1>
			<marquee>
			<img src="resources/img/biblioteca.png"></img> Menu <img
				src="resources/img/biblioteca.png"></img></marquee>
		</h1>
		</titulo> </aside>
	<fundo_menu_escolha1>
			<section>
			<Label1 ><b><h2>Selecione sua requisição</b></h2><br></Label1 >
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	<a href="falta fazer tela">Inserir Documento</a><br/><br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	<a href="falta fazer tela">Localizar Documento</a><br/>
					<br></br><br></br><br></br><br></br><br></br><br></br><br></br><br>
			</section>
	
	<!-- Fim section -->	
	
	<!-- inicio rodape -->
	
	<span id="timer"><b>Relógio</b></span> <br>
	<footer>
		<jsp:include page="templates/footer.html"></jsp:include>
	</footer>
	
	</fundo_menu_escolha1>
</body>
</html>