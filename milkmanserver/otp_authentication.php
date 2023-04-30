<?php
require "DataBase.php";
$db = new DataBase();
if (isset($_POST['sendotp'])) {


if ($_POST['sendotp']=="1234") {
    echo"Login Success";
} else echo "wrong Otp";

    // if ($db->dbConnect()) {
    //     if ($db->otp_authentication("users", $_POST['username'], $_POST['password'])) {
    //         echo "Login Success";
    //     } else echo "Username or Password wrong";
    // } else echo "Error: Database connection";



} else echo "All fields are required1";
?>
