<?php 

include "connect.php";

$email = $_POST['email'];
$senha =$_POST['senha'];
$nome =$_POST['nome'];

mysqli_query($link,"insert into tb_login (email,senha,nome) values ('$email',
	'$senha','$nome')");

  header('location:form_insert.php');










?>