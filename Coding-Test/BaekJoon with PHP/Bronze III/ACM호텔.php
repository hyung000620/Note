<?php
$tt = intval(fgets(STDIN));
for($t=0; $t<$tt; $t++) {
    fscanf(STDIN, '%d %d %d', $h, $w, $n);
    echo ($n-1)%$h*100 + intdiv($n-1,$h) + 101 . "\n";
}
