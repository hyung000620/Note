<?php
fscanf(STDIN, "%d %d", $a, $b);
fscanf(STDIN, "%d", $c);
$tot = $a*60+$b+$c;
if($tot>=1440) $tot=$tot-1440;
fprintf(STDOUT, "%d %d", ($tot - $tot%60) / 60, $tot%60);
