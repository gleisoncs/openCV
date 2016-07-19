<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>onePage</title>

<!-- Bootstrap Core CSS -->
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="${pageContext.request.contextPath}/bootstrap/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
</head>

<body id="page-top">

	<section id="account">

		<div id="page-wrapper">
			<form action="${pageContext.request.contextPath}/stage/copyClient"
				method="post">

				<div class="row">
					<div class="col-lg-12">
						<h2 class="page-header">Stage Dev</h2>
					</div>
					<div>
						<table class="table table-bordered table-hover table-striped">
							<thead>
								<tr>
									<th>Imagem</th>
									<th>CPF</th>
									<th>Nome</th>
									<th>Telefone</th>
									<th>Produtos</th>
									<th>Siebel8</th>
									<th>Select</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${result1List}" var="result1">
									<tr>
										<td>${result1.result1}</td>
										<td>${result1.result2}</td>
										<td>${result1.result3}</td>
										<td><c:forEach items="${result1.result21}" var="result2">
										${result2.result2}-
									</c:forEach></td>
										<td>${result1.result19}</td>
										<td><input type="checkbox" name="checkboxSelected"
											value="${result1.result1}" /></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</form>
		</div>
	</section>
</body>
</html>