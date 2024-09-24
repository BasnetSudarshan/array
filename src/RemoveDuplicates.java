





public class RemoveDuplicates {


    static int removeDupliate(int[] nums){

        int uniqueNumber = 0;
        for(int i = 1; i < nums.length ; i++){

            if(nums[i] != nums[uniqueNumber]){

                uniqueNumber++;
                // nums[uniqueNumber] = nums[i];
                
            }
        }

        return uniqueNumber;

    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 1, 1};
        System.out.println(removeDupliate(arr));
        
    }
    
}
