class FindIndex{  

    public static void find_index(int arr[],int element){
        
        int result=-1;
        for(int i=0;i<arr.length;i++){
           
            if(element==arr[i]){
                result=i;
                break;
            }

        }

        if(result!=-1){
           System.out.print("Index of element "+element+" is "+result);
        }else{
           System.out.print("Element "+element+" not  found");
        }
        
    }

    public static void main(String args[]){  
     int array[]={1,2,3,4,5,6};  
     find_index(array,9);
    }  
}  