<?php
$nl = "\n";
fscanf(STDIN, "%d %d", $a, $b);
echo ($a+$b).$nl.($a-$b).$nl.($a*$b).$nl.floor($a/$b).$nl.$a%$b;
?>
