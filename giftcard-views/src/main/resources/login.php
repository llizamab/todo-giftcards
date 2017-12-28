<?php
include 'utils.php';

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title><?php echo $_ENV["PAGE_TITLE"] ?></title>
  <!-- Bootstrap core CSS-->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">	
  <!-- Navigation -->
   <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
     <div class="container">
       <a class="navbar-brand" href="index.php"><?php echo $_ENV["PAGE_TITLE"] ?></a>
       <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
       </button>
       <div class="collapse navbar-collapse" id="navbarResponsive">
         <ul class="navbar-nav ml-auto">
           <li class="nav-item">
             <a class="nav-link" href="index.php">Volver</a>
           </li>
         </ul>
       </div>
     </div>
   </nav>
  <hr>

  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Iniciar Sesi&oacute;n</div>
      <div class="card-body">
        <form id="loginForm" method="POST" enctype="application/x-www-form-urlencoded; charset=utf-8" >
          <div class="form-group">
            <label for="exampleInputEmail1">Email</label>
            <input class="form-control" id="inputEmail" type="email" aria-describedby="emailHelp" placeholder="Ingrese email">
          </div>
          <div class="form-group">
            <label for="exampleInputPassword1">Contrase&ntilde;a</label>
            <input class="form-control" id="inputPassword" type="password" placeholder="...">
          </div>
          <div class="form-group" id="divErr">
          </div>
          <a class="btn btn-primary btn-block" id="btnLogin" href="#">Iniciar Sesi&oacute;n</a>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="register.html">Registrarse</a>
          <a class="d-block small" href="forgot-password.html">Olvido su contrase&ntilde;a?</a>
        </div>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
      <script type="text/javascript">
          $("#btnLogin").click(function(event) {
        	  // get data
        	  var email = $("#inputEmail").val();
        	  var password = $("#inputPassword").val();
        	  // Send the data using post
        	  $.post("validaLogin.php", {email: email, password: password}, function(result) {
        		  
        		  if (result != "") {
            		  var obj = JSON.parse(result);
            		  // si no hubo error
            		  if (obj.status == "ok") {
            			  window.location.replace('./index.php');
            		  } else {
            			  // muestro error
            			  $("#divErr").append("<div class='alert alert-danger alert-dismissible fade show' role='alert'>"
            					  + obj.error
            					  + "<button type='button' class='close' data-dismiss='alert' aria-label='Close'>"
            					  + "<span aria-hidden='true'>&times;</span>"
            					  + "</button></div>");
            		  }
        		  }
        	  });
        	});
      </script>
</body>

</html>
