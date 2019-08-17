<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
<style type="text/css">
 body {
  background-image: url("./images/LoginBackground.jpg");
  background-color: #cce6ff;
  max-width: 100%;
  height: 100%; 
  background-size: cover;
}
strong
{
	color : red;
}
.login-form {
	position: absolute;
 	top: 50%;
 	left: 50%;
 	transform: translate(-50%,-50%);
	width: 400px;
    margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
          background-color: #0e4367;
  		  border: none;
  		  color: white;   
  		  padding: 12px 16px;  
          font-size: 15px;
          font-weight: bold;
          cursor: pointer;
    }
    .errormsg {
	color: red;
}
</style>
</head>
<body>
<div class="login-form">
    <form:form method="post" action="userLoginProcess" modelAttribute="login">
        <h2 class="text-center">Customer Login</h2>       
        <div class="form-group">
            <form:input name="" class="form-control" placeholder="First name" type="text" path="firstName"
										required="required" />
			<small><form:errors path="firstName" cssClass="errormsg" /></small>
        </div>
        
        <div class="form-group">
           <form:input class="form-control" path="password" maxlength="15"
										placeholder="Password" type="password" required="required" />
           <small><form:errors path="password" cssClass="errormsg" /></small>
        </div>
        
        <div class="form-group">
            <form:button class="btn btn-primary btn-block " name="Login"
									style="float: middle;">Login</form:button>
        </div>
      
        <div class="form-group">
            <a href="userRegistration">New User Registration</a>
        </div>
         <strong>${message}</strong>        
    </form:form>
</div>
  
</body>
</html>