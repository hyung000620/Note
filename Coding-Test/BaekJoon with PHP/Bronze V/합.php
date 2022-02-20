<?php
fscanf(STDIN,"%d",$a);

$sum = 0;
for($i=1; $i<=$a; $i++){
    $sum +=$i;
}
echo $sum;
?>
