const arr=[2,44,55,66,77,88,99,100,200];
var element=44;
result=search_element(arr,element);
if(result!=-1)
console.log("Element "+element+" found on index "+result);
else
console.log("Element "+element+" not found ");

function search_element(arr,element){
   var result=-1; 
   var high=arr.length;
   var low=0;

   while(low<high){
      var mid =parseInt((high+low)/2);
      if(element==arr[mid]){
          result=mid;
          break;
      }else if(element<arr[mid]){
          high=mid;
      }else if(element>arr[mid]){
          low=mid;
      }
   }

   return result;
}