<?php
fscanf(STDIN, "%d %d %d", $a, $b, $c);
if($a==$b && $b==$c) fprintf(STDOUT, "%d", 10000+$a*1000);
else if ($a==$b) fprintf(STDOUT, "%d", 1000+$a*100);
else if ($b==$c) fprintf(STDOUT, "%d", 1000+$b*100);
else if ($c==$a) fprintf(STDOUT, "%d", 1000+$c*100);
else if ($a > $b && $a > $c) fprintf(STDOUT, "%d", $a*100);
else if ($b > $c && $b > $a) fprintf(STDOUT, "%d", $b*100);
else fprintf(STDOUT, "%d", $c*100);
