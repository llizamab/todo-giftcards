<?php 

include 'header.php'

?>

    <header>
      <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <!-- Slide One - Set the background image for this slide in the line below -->
          <div class="carousel-item active" style="background-image: url('images/slice1.jpg')">
            <div class="carousel-caption d-none d-md-block">
              <h3>First Slide</h3>
              <p>This is a description for the first slide.</p>
            </div>
          </div>
          <!-- Slide Two - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('images/slice2.jpg')">
            <div class="carousel-caption d-none d-md-block">
              <h3>Second Slide</h3>
              <p>This is a description for the second slide.</p>
            </div>
          </div>
          <!-- Slide Three - Set the background image for this slide in the line below -->
          <div class="carousel-item" style="background-image: url('http://placehold.it/1900x1080')">
            <div class="carousel-caption d-none d-md-block">
              <h3>Third Slide</h3>
              <p>This is a description for the third slide.</p>
            </div>
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

    <!-- Page Content -->
    <div class="container">

      <h1 class="my-4">GiftCards populares</h1>

      <!-- Marketing Icons Section -->
      <div class="row">
<?php // search giftcards 

$result = json_decode(CallAPI("GET", $_ENV["GIFTCARDS_ENDPOINT"] . "/findAll"), true);

if (is_array($result)) {
    foreach ($result as $data) {
?>
		<div class="col-lg-4 mb-4">
          <div class="card h-100">
            <h5 class="card-header"><?php echo $data["nombre"]?></h5>
			<a href="item.php?id=<?php echo $data["id"]?>"><img class="card-img-top" src="<?php echo $data["urlImageMedium"]?>" alt=""></a>
            <div class="card-body">
			  <h4 class="card-title">
                <a href="item.php?id=<?php echo $data["id"]?>"><?php echo $data["titulo"]?></a>
              </h4>
              <p class="card-text"><?php echo $data["descripcion"]?></p>
            </div>
            <div class="card-footer">
              <a href="item.php?id=<?php echo $data["id"]?>" class="btn btn-primary">Comprar</a>
            </div>
          </div>
        </div>
<?php 
    }
}
?>
      </div>
      <!-- /.row -->

    </div>
    <!-- /.container -->

<?php include 'footer.php' ?>
