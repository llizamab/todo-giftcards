<?php 
// header
include 'header.php';

// get id param
$id_giftcard = $_GET["id"];

$result = json_decode(CallAPI("GET", $_ENV["GIFTCARDS_ENDPOINT"] . "/findById", array("id" => $id_giftcard)), true);

if ($result == "" || !is_array($result)) {
    $message = "Error. No existe la giftcard";
    echo "<script type='text/javascript'>alert('$message'); window.location.replace('./index.php');</script>";
    die();
}

?>
    <!-- Page Content -->
    <div class="container">

      <!-- Page Heading/Breadcrumbs -->
      <h1 class="mt-4 mb-3"><?php echo $result['nombre']; ?>
        <small><?php echo $result['titulo'] ?></small>
      </h1>

      <!-- Portfolio Item Row -->
      <div class="row">

        <div class="col-md-5">
          <img class="img-fluid" src="<?php echo $result["urlImageMedium"] ?>" alt="">
        </div>

        <div class="col-md-7">
          <h3 class="my-3">Descripcion de la giftcard</h3>
          <p><?php echo $result["descripcion"] ?></p>
          <h3 class="my-3">Detalles</h3>
          <ul>
            <li>Valida para blablabl</li>
            <li>Duracion x meses desde la fecha de compra</li>
            <li>No canjeable por dinero</li>
            <li>xxxx uuu</li>
          </ul>
        </div>

      </div>
	  <div class="row">
		<div class="card card-register mt-3">
		  <div class="card-header">Destinatario</div>
		  <div class="card-body">
			<form>
			  <div class="form-group">
				<div class="form-row">
				  <div class="col-md-6">
					<label for="exampleInputName">Nombre</label>
					<input class="form-control" id="exampleInputName" type="text" aria-describedby="nameHelp" placeholder="Enter first name">
				  </div>
				  <div class="col-md-6">
					<label for="exampleInputLastName">Apellido</label>
					<input class="form-control" id="exampleInputLastName" type="text" aria-describedby="nameHelp" placeholder="Enter last name">
				  </div>
				</div>
			  </div>
			  <div class="form-group">
				<label for="exampleInputEmail1">Email</label>
				<input class="form-control" id="exampleInputEmail1" type="email" aria-describedby="emailHelp" placeholder="Enter email">
			  </div>
			  <div class="form-group">
				<div class="form-row">
				  <div class="col-md-12">
					<label for="exampleInputPassword1">Mensaje</label>
					<textarea class="form-control" id="exampleInputPassword1"  placeholder="..." ></textarea>
				  </div>
				</div>
			  </div>
			</form>
		  </div>
		</div>
		<div class="card card-register mt-3">
		  <div class="card-header">Medio de pago</div>
		  <div class="card-body">
		    <div class="col-md-12">
				<img class="img-fluid" src="images/webpay.png" alt="">
				<hr>
				<a class="btn btn-primary btn-block" href="#">Agregar al Carro</a>
			</div>
		  </div>
		</div>  
	  </div>
      <!-- /.row -->
	  
	  <hr>
	  <hr>
	  <hr>

      <!-- Related Projects Row -->
      <h3 class="my-4">Podria interesarte</h3>

      <div class="row">
	  <header>
		<div id="carouselExampleIndicators" class="carousel slide multi-item-carousel" data-ride="carousel">
        <div class="carousel-inner" >
		
			<div class="carousel-item active" >
			  <div class="col-md-3 col-sm-6 mb-4" style="float: left;" >
			  <a href="#">
				<img class="img-fluid" src="images/giftcard5.jpg" alt="">
			  </a>
			  </div>
			</div>

			<div class="carousel-item">
			  <div class="col-md-3 col-sm-6 mb-4" style="float: left;" >
			  <a href="#">
				<img class="img-fluid" src="images/giftcard4.jpg" alt="">
			  </a>
			  </div>
			</div>

			<div class="carousel-item">
			  <div class="col-md-3 col-sm-6 mb-4" style="float: left;" >
			  <a href="#">
				<img class="img-fluid" src="images/giftcard3.jpg" alt="">
			  </a>
			  </div>
			</div>

			<div class="carousel-item">
			  <div class="col-md-3 col-sm-6 mb-4" style="float: left;" >
			  <a href="#">
				<img class="img-fluid" src="images/giftcard2.jpg" alt="">
			  </a>
			  </div>
			</div>
			
			<div class="carousel-item">
			  <div class="col-md-3 col-sm-6 mb-4" style="float: left;" >
			  <a href="#">
				<img class="img-fluid" src="http://placehold.it/500x300" alt="">
			  </div>
			  </a>
			</div>
	    </div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>
		</div>
      </header>
      </div>
      <!-- /.row -->	  

    </div>
    <!-- /.container -->

<?php include 'footer.php' ?>
