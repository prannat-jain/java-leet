import java.util.Arrays;

class test {
    public static void main(String[] args){

        int[] array = {3,2,4};
        System.out.println(Arrays.toString(twoSum(array, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] returnArray = new int[2];


        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                int sum = nums[i] + nums[j];

                if (sum == target) {
                    returnArray[0] = i;
                    returnArray[1] = j;
                    break;
                }

            }
        }
        return returnArray;
    }
}


