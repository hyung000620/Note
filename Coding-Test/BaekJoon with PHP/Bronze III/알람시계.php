<?
fscanf(STDIN,"%d %d",$H,$M);
if ($M-45<0) 
{
    $H=$H-1;
    $M=$M+60-45;
    if ($H<0) {$H=23;}
}
else {$M=$M-45;}
echo $H." ".$M;
?>
