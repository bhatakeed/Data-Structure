<?php
$arr=array(1,2,3,4,5,6);
$search_element=6;
$result=binary_search($arr,$search_element);
if($result!=-1){
    echo "Element ".$search_element." found on index ".$result;
}else{
    echo "Element ".$search_element." not found";
}



function binary_search($arr,$search_element){
   $element_on_index=-1;
   $high=sizeof($arr)-1;
   $low=0;

   while($low<$high){

      $mid=round(($high+$low)/2);

      if($search_element==$arr[$mid]){
         $element_on_index=$mid; 
         break;
      }else if($arr[$mid]>$search_element){
         $high=$mid;
      }else if($arr[$mid]<$search_element){
         $low=$mid;
      }

   }
  return $element_on_index;
}