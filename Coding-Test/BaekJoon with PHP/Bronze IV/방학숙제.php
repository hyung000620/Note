<?
fscanf(STDIN,'%d',$L);
fscanf(STDIN,'%d',$A);
fscanf(STDIN,'%d',$B);
fscanf(STDIN,'%d',$C);
fscanf(STDIN,'%d',$D);

$A=ceil($A/$C);
$B=ceil($B/$D);

$result = min($L-$A,$L-$B);
echo $result;
?>
