<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-4">
				<form action="login" method="post">
					<div class="font-weight-bold text-center">LOGIN</div>
					<div class="form-group my-6">
						<label for="username">Username</label> <input type="text"
							name="username" id="username" class="form-control">
					</div>
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							name="password" id="password" class="form-control">
					</div>
					<div class="form-group">
						<button type="submit"
							class="btn btn-primary form-control text-center">Login</button>
					</div>
				</form>
				<p style="color: red">${errorMessage}</p>
				<p style="color: blue">${loginRequireMessage}</p>
			</div>
		</div>
	</div>
</body>

</html>