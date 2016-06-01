<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>STD - Sistema Tramitação de Documentos</title>
<link rel="stylesheet" type="text/css" href="estilo1.css"/>
</head>
<body>
	<!-- Inicio cabecalho -->
	<header>
		
	</header>
	<!-- Fim cabecalho -->
	
	<!-- Inicio section -->
	
	<aside> <titulo>
		<h1>
			<marquee>
			<img src="resources/img/biblioteca.png"></img> Inserir e Enviar <img
				src="resources/img/biblioteca.png"></img></marquee>
		</h1>
		</titulo> </aside>
	<fundo_menu_escolha1>
			<section>
			<form>
				<label1><b>Tipo documento:</b></label1>
				<select name="tipoDoc" id="tipoDoc" >
					<option value="txt " selected="selected">Tipo</option>
					<option value="TXT">.TXT </option>
					<option value="DOC">.DOC</option>
					<option value="XLS">.XLS</option>
					<option value="PPT">.PPT</option>
					<option value="PDF">.PDF</option>
				</select> <br></br>
				<label1><b>Nome documento:</b></label1>
				<input type="text" name="nomeDoc" id="nomeDoc"/> <br><br>
				<label1><b>Descrição:</b></label1>
				<textarea name ="descDoc" id="descDoc" rows="2" cols="20"></textarea> <br><br>
				<label1><b>Centro de Custo:</b></label1>
				<select name="centroC" id="centroC" >
					<option value="" selected="selected">Selecione a área</option>
					<option value="CT">Contábil e tributária </option>
					<option value="RC">Recursos Humanos</option>
					<option value="LG">Logistica</option>
					<option value="TI">Tecnologia da informação</option>
				</select> <br></br>
				<label1><b>Destinatario:</b></label1>
				<input type="text" name="nomeDest" id="nomeDest"/> <br><br>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="submit" value="Enviar" />
			</form>
				
				
					<br></br><br></br><br></br><br>
			</section>
	
	<!-- Fim section -->	
	
	<!-- inicio rodape -->
	<footer>
		<jsp:include page="templates/footer.html"></jsp:include>
	</footer>
	</fundo_menu_escolha1>
</body>
</html>