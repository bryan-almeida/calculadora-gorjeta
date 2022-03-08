<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
    <title>Calcular Gorjeta</title>
</head>
<body>
	
	<nav class="navbar navbar-dark bg-dark mb-4">
	  <div class="container-fluid">
	    <span class="navbar-brand mb-0 h1">CALCULADORA DE GORJETAS</span>
	  </div>
  	</nav>
  	
  	
  	<div class="container" >
	
		<form action="<%= request.getContextPath()%>/ServletGorjeta" method="post" id="formGorjeta">
		
			<div class="mb-3">
			    <label for="numeroPessoa" class="form-label">NÚMERO DE PESSOAS: </label>
			    <input type="number" class="form-control" name="numeroPessoa" id="numeroPessoa" value="${modelGorjeta.numeroPessoa}">
			 </div>
			<div class="mb-3">
			    <label for="valorServico" class="form-label">VALOR DO SERVIÇO: </label>
			    <input type="number" class="form-control" name="valorServico" id="valorServico" value="${modelGorjeta.valorServico}">
			 </div>
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">PORCENTAGEM DA GORJETA: </label>
			    <select class="form-select" name="porcentagemGorjeta" id="porcentagemGorjeta" value="${modelGorjeta.numeroPessoa}">
				  <option selected>Selecione a Porcentagem</option>
				  <option value="5">5%</option>
				  <option value="10">10%</option>
				  <option value="15">15%</option>
				  <option value="20">20%</option>
				</select>
			  </div>
			  
			  
			  
			  <div class="mb-3">
			    <div>VALOR DA GORJETA: <span class="fw-bold">R$ <input type="text" class="border-0" value="${modelGorjeta.calcularGorjeta()}"></span></div>
			    <div>VALOR TOTAL: <span class="fw-bold">R$ <input type="text" class="border-0" value="${modelGorjeta.calcularTotal()}"></span></div>
			    <div>TOTAL PARA CADA PESSOA: <span class="fw-bold">R$  <input type="text" class="border-0" value="${modelGorjeta.calcularCadaPessoa()}"></span></div>
			    
			 </div>
			 
			 
			  

			  <button  class="btn btn-success">ATUALIZAR</button>
			  <span onclick="limparForm()" class="btn btn-danger">LIMPAR</span>
		
		
		</form>
		
	
	</div>
	
	
	
	
	<script type="text/javascript">
	
		function limparForm() {
			var elementos = document.getElementById("formGorjeta").elements;
			
			for (i = 0; i < elementos.length; i++) {
				elementos[i].value= '';
				
			}
			
		}
	
	</script>


	 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>