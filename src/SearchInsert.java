public class SearchInsert {

    static  int searchInsert(int[] nums, int target){

        if(nums[nums.length-1] < target){
            return nums.length;
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i] < target && nums[i+1] > target ){
                return i+1;
            }
        }


        return 0;


    }
    
    public static void main(String[] args) {


        int arr[] = {1, 3, 5, 6};

        System.out.println(searchInsert(arr, 5));
        System.out.println(searchInsert(arr, 2));
        System.out.println(searchInsert(arr, 4));
        
    }
}
