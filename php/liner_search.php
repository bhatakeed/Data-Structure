<?php
$arr=array(1,2,3,4,5,6,7);
$search_element=0;
$result=search($arr,$search_element);
if($result!=-1){
    echo "Element ".$search_element." found on index ".$result;
}else{
    echo "Element ".$search_element." not found";
}



function search($arr,$search_element){
   $element_on_index=-1;
  foreach($arr as $key=>$value){
      if($value==$search_element){
        $element_on_index=$key;
        break;
      }
  }
  return $element_on_index;
}