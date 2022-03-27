<?php
fscanf(STDIN,"%d",$A);
fscanf(STDIN,"%d",$B);

if($A < 0 and $B <0) $msg = 3; 
else if($A < 0 and $B > 0) $msg = 2;
else if($A >0 and $B > 0) $msg = 1;
else $msg = 4;


echo $msg;
?>
