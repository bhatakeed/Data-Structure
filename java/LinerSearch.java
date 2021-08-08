class LinerSearch{  

    public static void search_element(int arr[],int search){
        
        boolean result=false;
         
        for(int i=0;i<arr.length;i++){
           
            if(search==arr[i]){
              result=true;
              break;
            }

        }

        if(result==true){
            System.out.println("Element "+search+" found in an array");
        }else{
            System.out.println("Element "+search+" not found in an array");
        }
        
    }

    public static void main(String args[]){  
     int array[]={1,2,3,4,5,6};  
     search_element(array,1);
    }  
}  