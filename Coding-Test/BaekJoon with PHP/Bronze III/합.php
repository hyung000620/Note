<?php
$sum = 0;

fscanf(STDIN, "%d", $n);

for($i=1; $i<=$n; $i++) {
    $sum += $i;
}

echo $sum;
