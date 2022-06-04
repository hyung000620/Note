<?php
$s=explode(' ',rtrim(fgets(STDIN)));
$s[0]=$s[0]>$s[2]-$s[0]?$s[2]-$s[0]:$s[0];
$s[1]=$s[1]>$s[3]-$s[1]?$s[3]-$s[1]:$s[1];
echo $s[0]>$s[1]?$s[1]:$s[0];
