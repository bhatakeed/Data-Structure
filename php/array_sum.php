<?php
$arr=array(1,2,3,4,5,6,7);
sumArray($arr);



function sumArray($arr){
  $sum =0;  
  foreach($arr as $element){
      $sum+=$element;
  }
  echo "Sum of elements in an array is ".$sum;
}