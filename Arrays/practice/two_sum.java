package Arrays;

public class two_sum {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5};
        int target = 6;

        for (int i = 0; i < nums.length; i++) {
            for (int n = 0; n < nums.length; n++){
                int check = nums[i] + nums[n];
                if (check == target){
                    System.out.printf("Output: [%d, %d]", nums[i], nums[n]);
                    break;
                }
            }
        }
    }
}
