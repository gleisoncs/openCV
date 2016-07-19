<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Signin CSS -->
<link href="${pageContext.request.contextPath}/bootstrap/css/signin.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="${pageContext.request.contextPath}/bootstrap/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>

<body>

	<div class="container">

		<form class="form-signin" action="${pageContext.request.contextPath}/home">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="inputEmail" class="sr-only">Email address</label> <input type="email" id="inputEmail"
				class="form-control" placeholder="Email address" autofocus> <label for="inputPassword"
				class="sr-only">Password</label> <input type="password" id="inputPassword" class="form-control"
				placeholder="Password">
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me"> Remember me
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>

	</div>
	<!-- /container -->
</body>
</html>
