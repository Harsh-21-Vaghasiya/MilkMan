<?php
require "DataBaseConfig.php";

class DataBase
{
    public $connect;
    public $data;
    private $sql;
    protected $servername;
    protected $username;
    protected $password;
    protected $databasename;

    public function __construct()
    {
        $this->connect = null;
        $this->data = null;
        $this->sql = null;
        $dbc = new DataBaseConfig();
        $this->servername = $dbc->servername;
        $this->username = $dbc->username;
        $this->password = $dbc->password;
        $this->databasename = $dbc->databasename;

    }

    function initialize(){
        try{
        $this->connect = mysqli_connect($this->servername, $this->username, $this->password);

        if($this->connect->connect_error){
            die("Connection failed: " . $this->connect->connect_error);
        }

        $sql = 'CREATE DATABASE milkman';
        echo $sql;
        if ($this->connect->query($sql)) {
            echo "Database created successfully";
        } else {
            echo "Error creating database: " . mysqli_error($this->connect);
        }

        $this->connect = mysqli_connect($this->servername, $this->username, $this->password, $this->databasename);
        $sql2 = "CREATE TABLE users (
            id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
            fullname VARCHAR(30) NOT NULL,
            username VARCHAR(30) NOT NULL,
            password VARCHAR(50) NOT NULL,
            email VARCHAR(50) NOT NULL,
            reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
            )";
        

        if ($this->connect->query($sql2)) {
            echo "Table users created successfully";
        } else {
            echo "Error creating table: " . mysqli_error($this->connect);
        }
        $this->connect = mysqli_connect($this->servername, $this->username, $this->password, $this->databasename);
    }catch(Exception $e){
        echo "Error: " . $e->getMessage();
    }
    }

    function dbConnect()
    {
        try{
        $this->connect = mysqli_connect($this->servername, $this->username, $this->password, $this->databasename);
        }catch(Exception $e){
            $this->initialize();
            return $this->connect;
        }
        return $this->connect;
    }

    function prepareData($data)
    {
        return mysqli_real_escape_string($this->connect, stripslashes(htmlspecialchars($data)));
    }

    function logIn($table, $username, $password)
    {
        $this->connect = mysqli_connect($this->servername,$this->username, $this->password, $this->databasename);
        $username = $this->prepareData($username);
        $password = $this->prepareData($password);
        $this->sql = "select * from " . $table . " where username = '" . $username . "'";
        $result = mysqli_query($this->connect, $this->sql);
        $row = mysqli_fetch_assoc($result);
        if (mysqli_num_rows($result) != 0) {
            $dbusername = $row['username'];
            $dbpassword = $row['password'];
            if ($dbusername == $username && password_verify($password, $dbpassword)) {
                $login = true;
            } else $login = false;
        } else $login = false;

        return $login;
    }

    function signUp($table, $fullname, $email, $username, $password)
    {
        $fullname = $this->prepareData($fullname);
        $username = $this->prepareData($username);
        $password = $this->prepareData($password);
        $email = $this->prepareData($email);
        $password = password_hash($password, PASSWORD_DEFAULT);
        $this->sql =
            "INSERT INTO " . $table . " (fullname, username, password, email) VALUES ('" . $fullname . "','" . $username . "','" . $password . "','" . $email . "')";
        if (mysqli_query($this->connect, $this->sql)) {
            return true;
        } else return false;
    }



 

}

?>
