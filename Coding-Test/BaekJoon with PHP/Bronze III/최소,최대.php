<?php
	$n = (int) fgets(STDIN);
	$a = explode(' ', fgets(STDIN));
	$inf = (int) 1e6;
	$mn = $inf;
	$mx = -$inf;
	for ($i = 0; $i < $n; $i++) {
		$cur = (int) $a[$i];
		$mn = min($mn, $cur);
		$mx = max($mx, $cur);
	}
	echo $mn." ".$mx."\n";
?>
