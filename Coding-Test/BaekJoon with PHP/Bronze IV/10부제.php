<?
fscanf(STDIN,'%d',$n);
fscanf(STDIN,'%d %d %d %d %d',$a,$b,$c,$d,$e);

$arr=$a.' '.$b.' '.$c.' '.$d.' '.$e;
$arr=explode(' ',$arr);
$cnt=0;
foreach($arr as $v)
{
if($v==$n){$cnt++;}
}

echo $cnt;
?>
