<?php 
include 'utils.php';

// validate credentials
$email = $_POST["email"];
$password = $_POST["password"];

//si viene info
if ($password != null && trim($password) != ""
    && $email != null && trim($email) != "") {
    // llamo al api
    $result = json_decode(CallAPI("POST", $_ENV["ACCES_ENDPOINT"] . "/loginUser", array("email" => $email, "password" => $password)), true);

    // evaluo el retorno
    $retorno = $result["status"];
    // si es ok
    if ($retorno == "OK") {
        // inicio la sesion y guardo el token
        session_start();
        $_SESSION["token"] = $result["token"];
        $_SESSION["user"] = $result["user"];
        // redirigo al login
        $data = array("status" => "ok");
        echo json_encode($data);
        die();
    }
    // si no es valido
    else {
        // muestro el error
        $data = array("status" => "ko", "error" => "Usuario y/o contrase&ntilde;a invalidos");
        echo json_encode($data);
        die();
    }
}
// muestro el error
$data = array("status" => "ko", "error" => "Usuario y/o contrase&ntilde;a invalidos");
echo json_encode($data);
?>