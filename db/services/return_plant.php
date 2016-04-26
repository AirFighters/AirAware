<?php


include_once('plant_database_connect.php');

header('Access-Control-Allow-Origin: *');
function return_disease($i)
{

$my_request = "SELECT * FROM  `plants` WHERE `id` = " .$i  ;


$my_result = mysql_query($my_request);
$row=mysql_fetch_array($my_result);

//	print_r(json_encode($row)) ;
	 print_r(json_encode($row['name'])) ;
     print_r(json_encode($row['substancesToClear'])) ;
     print_r(json_encode($row['description'])) ;	 
		
	   	
		
	   
}

return_disease($_GET['i']);

?>