<?php
fscanf(STDIN,'%d',$a);
fscanf(STDIN,'%d',$b);
fscanf(STDIN,'%d',$c);

if($a==60 && $b==60 && $c==60)
{echo "Equilateral";}
else if(($a+$b+$c) !=180)
{echo "Error";}
else{
if($a==$b || $b==$c || $a ==$c)
{echo "Isosceles";}
else {echo "Scalene";}
}
?>
