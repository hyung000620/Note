<?php
while (true) {
    fscanf(STDIN,"%d %d",$A,$B);
    if ($A!=0 && $B!=0) {
    $sum=$A+$B;
    echo $sum."\n";
    }
    else {
        break;
    }
}
?>
