<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration With JSP</title>
<link href="Bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
</head>
<body>

<form action="reg" method="post">
<div class="container">
	<div class="row">
			
				<div class="col-md-3"></div>
					<div class="col-md-6 col-xs-12">
						<div class="jumbotron">
						
						<h1 class="text-center">Registration Page</h1>
						<br>
						<div class="form-group">
							<label class="control-label" for="Employee_ID_Number"> Employee_ID_Number</label>
							<input type="text" name="Employee_ID_Number" class="form-control" placeholder="Employee_ID_Number" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="username"> User Name</label>
							<input type="text" name="username" class="form-control" placeholder="Username" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="email">Email</label>
							<input type="text" name="email" class="form-control" placeholder="Email" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="mobile">Mobile No</label>
							<input type="text" name="mobile" class="form-control" placeholder="Mobile No" required="required">
						</div>
						<div class="form-group">
							<label class="control-label" for="password">Password</label>
							<input type="password" name="password" class="form-control" placeholder="Password" required="required">
						</div>
						<div>
							<button type="submit" class="btn btn-outline-warning">Registration</button>
							<br>
						</div>
						<div>
							<br>
							All Ready a member ?<a href="login.jsp">Login</a>
						</div>
						
					</div>
				</div>
				<div class="col-md-3"></div>		
			
		</div>
	</div>
	
</form>
<script type="text/javascript" src="Bootstrap/js/bootstrap.js"></script>
</body>
</html>