<?php
while (true) {
  fscanf (STDIN,"%d %d %d",$a,$b,$c);
  $num_list = array($a, $b, $c);
  sort($num_list);

  if ($a==0 && $b==0 && $c==0) {
    break;
  } else {
    if (($num_list[0]*$num_list[0]) + ($num_list[1]*$num_list[1]) == ($num_list[2]*$num_list[2])) {
      fprintf(STDOUT,"%s\n",'right');
    } else {
      fprintf(STDOUT,"%s\n",'wrong');
    }
  }
}
?>
