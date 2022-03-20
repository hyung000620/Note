<?php
fscanf(STDIN, "%d", $one);
echo (($one % 400 === 0) || ($one % 4 === 0) && ($one % 100 !== 0)) ? 1 : 0;
?>
