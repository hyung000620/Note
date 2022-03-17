<?php
$g = "";

fscanf(STDIN, "%d", $n);

if($n >= 90) {
    $g = "A";
} elseif($n >= 80) {
    $g = "B";
} elseif($n >= 70) {
    $g = "C";
} elseif($n >= 60) {
    $g = "D";
} else {
    $g = "F";
}

echo $g;
