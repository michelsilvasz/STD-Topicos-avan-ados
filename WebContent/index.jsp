<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			<img src="resources/img/biblioteca.png"></img> Login do sistema <img
				src="resources/img/biblioteca.png"></img></marquee>
		</h1>
		</titulo> </aside>
	<fundo_menu_escolha1>
	<section>
		<form action="login" method="post">
			<p>
				<b><label>Usu&aacute;rio</label></b><br />
				<input type="text" name="usuario" size="30" maxlength="20" placeholder="Usu&aacute;rio" /><br />
				<b><label>Senha</label><br /></b>
				<input type="password" name="senha" size="30" maxlength="20" placeholder="Senha"/><br />
			</p>
			<p><input type="submit" value="Enviar" /></p>
			<a href="control">Esqueceu a senha</a>
		
		</form>
	
	</section>
	
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