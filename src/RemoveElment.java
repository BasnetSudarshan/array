
import java.util.ArrayList;

public  class RemoveElment{


    static  int removeElement(int[] nums, int val){

    ArrayList<Integer> list  = new ArrayList<>();

  
      int count = 0;

        for(int i = 0 ; i < nums.length ; i ++){
             
            if(nums[i] != val){
                count ++;
            }

        }

        int arr[] = list.stream().mapToInt(a -> a).toArray();

        for(int i = 0 ; i < arr.length; i++){
            System.out.println("value :" + arr[i]);
        }

        


        return count;

    }

    public static void main(String[] args) {

        int arr[] = {3,2,2,3};

        int arr1[] = {1, 3, 4, 5, 3, 3};

        
        System.out.println(removeElement(arr, 3));
        System.out.println(removeElement(arr1, 3));


        
    }




}