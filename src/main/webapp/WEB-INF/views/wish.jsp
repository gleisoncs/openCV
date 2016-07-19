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
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/bootstrap/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>

<body id="page-top">

	<section id="services">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 text-left">
					<h2 class="section-heading" onclick="${pageContext.request.contextPath}/home">onePage</h2>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<form class="form-signin" action="${pageContext.request.contextPath}/wishSave" method="POST">
							<h2 class="form-signin-heading">Fill Up Information</h2>
							<label for="labelWish" class="sr-only">Wish</label> <input type="text" name="wish" class="form-control"
								placeholder="I wish something" autofocus>
							<button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>