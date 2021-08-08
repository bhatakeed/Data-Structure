class BinarySearch{  

    public static int binary_search(int arr[],int find_element){
        
        int array_size=arr.length;
        int high=array_size;
        int low=0;
        int element_index=-1;

        while(low<high){

              int midIndex=(high+low)/2;

              if(arr[midIndex]==find_element){
                  element_index=midIndex;
                  break;
              }else if(find_element<arr[midIndex]){
                    high=midIndex;
              }else if(find_element>arr[midIndex]){
                    low=midIndex;
              }


        }
        
        return element_index;
    }

    public static void main(String args[]){  
     int array[]={1,2,3,4,5,6,7};
     int search_element=5;  
     int result=binary_search(array,search_element);

        if(result!=-1){
            System.out.print("Element "+search_element+" found on index "+result);
        }else{
            System.out.print("Element "+search_element+" not found");
        }
    }  
}  