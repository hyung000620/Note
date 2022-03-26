<?php
$n = "\n";
fscanf(STDIN, "%d", $a);
fscanf(STDIN, "%d", $b);
$b1 = substr($b,0,1);
$b2 = substr($b,1,1);
$b3 = substr($b,2,1);
echo ($a*$b3).$n.($a*$b2).$n.($a*$b1).$n.($a*$b);
?>
