
import java.util.ArrayList;



public  class SumOfArray{


    public static void main(String[] args) {


        int[] arr = {1, 4, 6, 8, 10, 11, 13};

        int target = 1;

        int[] result = sumOfArray(arr, target);

        System.out.println(result[0] + " " + result[1]);

    }


   static int[] sumOfArray(int[] arr, int target){

    ArrayList<Integer>  arrayList = new ArrayList<>();

    for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0; j < i ; j ++){
            if(arr[i] + arr[j] == target){
                arrayList.add(i);
                arrayList.add(j);
            }

        }
    
     }

    return arrayList.stream().mapToInt(a -> a).toArray();
    }
}