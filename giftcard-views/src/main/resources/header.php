<?php 

include 'utils.php'

?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><?php echo $_ENV["PAGE_TITLE"]?></title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/modern-business.css" rel="stylesheet">
	<link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

  </head>
  <body>
    <!-- Navigation -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="index.php"><?php echo $_ENV["PAGE_TITLE"]?></a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Categorias
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
                <a class="dropdown-item" href="#">Categoria 1</a>
                <a class="dropdown-item" href="#">Categoria 2</a>
                <a class="dropdown-item" href="#">Categoria 3</a>
              </div>
            </li>
			<li class="nav-item">
			  <form class="form-inline my-2 my-lg-0 mr-lg-2">
				<div class="input-group">
				  <input class="form-control" type="text" placeholder="Search for...">
				  <span class="input-group-btn">
					<button class="btn btn-primary" type="button">
					  <i class="fa fa-search"></i>
					</button>
				  </span>
				</div>
			  </form>
			</li>
			<?php 
			// sin inicio de sesion
	if (!isset($_SESSION["user"])) {
			?>
            <li class="nav-item">
              <a class="nav-link" href="login.php"><i class="fa fa-fw fa-sign-in"></i> Iniciar sesi&oacute;n</a>
            </li>
			<li class="nav-item">
              <a class="nav-link" href="register.html"><i class="fa fa-fw fa-registered"></i> Registrarse</a>
            </li>
            <?php 
	}
    // con inicio de sesion
	else {
			?>
			<li class="nav-item">
              <a class="nav-link" href="#"><i class="fa fa-fw fa-desktop"></i> Mi cuenta</a>
            </li>
			<li class="nav-item">
              <a class="nav-link" href="#"><i class="fa fa-fw fa-shopping-cart"></i> Carrito</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#" id="logout"><i class="fa fa-fw fa-sign-out"></i> Cerrar sesi&oacute;n</a>
            </li>
            <?php 
	}
			?>
          </ul>
        </div>
      </div>
    </nav>
