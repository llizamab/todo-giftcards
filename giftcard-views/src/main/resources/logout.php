<?php 
include 'utils.php';

session_start();

// si inicio de sesion
if (isset($_SESSION["user"])) {
    $token = $_SESSION["token"];
    $userId = $_SESSION["user"]["idUsuario"];
    // llamo al servicio de logout
    $result = json_decode(CallAPI("POST", $_ENV["ACCES_ENDPOINT"] . "/logoutUser", array("userId" => $userId, "token" => $token)), true);
    
    // evaluo el retorno
    $retorno = $result["status"];
    // si es ok
    if ($retorno == "OK") {
        // la destruyo
        $_SESSION = array();
        if (ini_get("session.use_cookies")) {
            $params = session_get_cookie_params();
            setcookie(session_name(), '', time() - 42000,
                $params["path"], $params["domain"],
                $params["secure"], $params["httponly"]
                );
        }
        session_destroy();
        // retorno
        $data = array("status" => "ok");
        echo json_encode($data);
        die();
    }
}

// muestro el error
$data = array("status" => "ko", "error" => "No se logro desconectar la session");
echo json_encode($data);

?>