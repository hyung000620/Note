<?php
fscanf(STDIN,"%d",$n);
ob_start();
for($i=$n; $i>0; $i--) echo "$i\n";
ob_flush();
