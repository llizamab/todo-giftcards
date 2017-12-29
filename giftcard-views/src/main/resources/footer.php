    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Todo-Giftcards 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
<?php 
// si inicio de sesion
if (isset($_SESSION["user"])) {
    ?>
    // agrego la funcion para logout
    <script type="text/javascript">
      $("#logout").click(function(event) {
    	  // Send the data using post
    	  $.post("logout.php", {}, function(result) {
    		  if (result != "") {
        		  var obj = JSON.parse(result);
        		  // si no hubo error
        		  if (obj.status == "ok") {
        			  window.location.replace('./index.php');
        		  }
    		  }
    	  });
    	});
      </script>
<?php 
}
	?>
  </body>

</html>