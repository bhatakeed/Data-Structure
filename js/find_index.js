const arr=[2,44,55,66,77,88,99,100];
var element=100;
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