<?php 
    
fscanf(STDIN,"%d %d",$n, $x);
$input = fgets(STDIN);
$arrData = explode(' ', $input);

$rowData = [];
foreach ($arrData as $data) {
	if ($x > $data) {
		$rowData[] = $data;	
	}
}

echo implode(' ', $rowData);    
    
?>
