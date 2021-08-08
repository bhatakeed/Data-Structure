const arr=[1,2,4,5,6,7,8,9,10];
var result=0;
result=sum_array(arr);
console.log(result);

function sum_array(arr){
   var sum=0; 
   for(var i=0;i<arr.length;i++){
     sum+=arr[i];
   }
   return sum;
}