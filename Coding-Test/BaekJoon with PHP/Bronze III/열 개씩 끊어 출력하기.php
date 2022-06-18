<?php
fscanf(STDIN,"%s",$str);
$len = strlen($str);
for( $i=0; $i<$len; $i+=10 ) {
    echo substr($str, $i, 10)."\n";
}
