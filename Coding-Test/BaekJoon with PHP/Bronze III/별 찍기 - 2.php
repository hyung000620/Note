<?php
    fscanf(STDIN,"%d",$a);
    for($i=1;$i<=$a;$i++){
        unset($y);
        for($j=0;$j<$a-$i;$j++){
            $y .=" ";
        }
        for($j=$a-$i;$j<$a;$j++){
            $y .="*";
        }
       $k .=$y."\n";
    }
echo $k;
