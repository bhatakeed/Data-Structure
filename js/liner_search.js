const arr=[1,2,4,5,6,7,8,9,10];
var element=0;
result=search_element(arr,element);
if(result!=-1)
console.log("Element "+element+" found on index "+result);
else
console.log("Element "+element+" not found ");

function search_element(arr,element){
   var result=-1; 
   for(var i=0;i<arr.length;i++){
     if(element==arr[i]){
          result=i;
          break;
     }
   }
   return result;
}