<?php

set_time_limit(0);
error_reporting(E_ALL);

 $DataBaseAddress = "localhost";
 $DataBaseUser = "root";
 $DataBasePassword ="";
 $DataBaseName = "aircleaningplants";

 $connexion = mysql_connect($DataBaseAddress,$DataBaseUser,$DataBasePassword) or die("could not connect to the database");
 
 
 
 mysql_select_db($DataBaseName, $connexion) or die("cannot find the database!");
 
?>