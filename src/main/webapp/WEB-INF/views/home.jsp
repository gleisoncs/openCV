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
				<div class="col-lg-6 text-center">
					<h2 class="section-heading" onclick="${pageContext.request.contextPath}/home">onePage</h2>
					<hr class="primary">
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<a href="${pageContext.request.contextPath}/wish"><i class="fa fa-4x fa-book wow bounceIn text-primary" data-wow-delay=".1s"></i></a>
						<h3>I wish</h3>
						<p class="text-muted">Tell what you wish</p>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 text-center">
					<div class="service-box">
						<a href="${pageContext.request.contextPath}/teach"><i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s"></i></a>
						<h3>I want teach</h3>
						<p class="text-muted">Offer your services</p>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>