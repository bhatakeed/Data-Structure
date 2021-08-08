class sum{  

    public static int sum_array(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
           sum+=arr[i];
        }

        return sum;
    }

    public static void main(String args[]){  
     int array[]={1,2,3,4,5,6};  
     System.out.println(sum_array(array));  
    }  
}  