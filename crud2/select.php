<?php

include "connect.php";

$consulta = $POST['consulta'];

$sql = mysqli_query ($link, "select * from tb_login where nome like '%consulta %' ");


while( $vetor = mysqli_fetch_array ($sql) ){
	
$id =$vetor['id_login'];
$nome = $vetor['nome'];
$email = $vetor['email'];
$senha = $vetor['senha'];

//echo "id: $id<br>";
echo "nome: $nome<br>";
//echo "email: $email<br>";
//echo "senha: $senha<hr>";


}









?>