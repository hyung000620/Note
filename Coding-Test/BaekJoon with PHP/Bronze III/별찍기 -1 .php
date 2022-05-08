<?php
fscanf(STDIN, "%d", $a);

for ($i=0; $i < $a; $i++) {
    $str = ''; 
	for ($j=0; $j <= $i; $j++) { 
		$str.= '*';
	}
    echo $str."\n";
}
?>
