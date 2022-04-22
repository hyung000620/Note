<?
fscanf(STDIN,'%d %d %d',$a,$b,$c);
$arr=array($a,$b,$c);
sort($arr);
$answer=implode(" ",$arr);
echo $answer;
?>
