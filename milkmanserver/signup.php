<?php
require "DataBase.php";
$db = new DataBase();
if (isset($_POST['fullname']) && isset($_POST['address']) && isset($_POST['username']) && isset($_POST['password'])&& isset($_POST['mobileno'])) {
    if ($db->dbConnect()) {
        if ($db->signUp("users", $_POST['fullname'], $_POST['address'], $_POST['username'], $_POST['password'],$_POST['mobileno'])) {
            echo "Sign Up Success";
        } else echo "Sign up Failed";
    } else echo "Error: Database connection";
} else echo "All fields are required";
?>
