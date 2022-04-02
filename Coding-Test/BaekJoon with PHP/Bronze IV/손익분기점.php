<?php
 // A: 고정 + B * i <
 // C * i
fscanf(STDIN, "%d %d %d", $a, $b, $c);
if ( $c <= $b ) $i = -1;
else $i = ($a/($c-$b))+1;
fprintf(STDOUT, "%d", $i);
?>
