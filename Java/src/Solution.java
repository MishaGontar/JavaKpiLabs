import java.util.Arrays;

class Solution {
    public static void appAccept(String message , boolean correct){
        if (!correct){
            throw new RuntimeException(message);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int [] i = new int[]{1,0,2,3,0,4,5,0};
        System.out.println(sol.findMaxConsecutiveOnes(i));
        sol.duplicateZeros(i);
        System.out.println(i[i.length-1]);
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] == 1){
                cur ++;
            }
            if (nums[i] == 0 ){
                if (cur > max){
                    max = cur;
                }
                cur = 0;
            }
        }
        if (cur > max){
            max = cur;
        }
        return max;
    }
    public int findNumbers(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            if (num.length() % 2 == 0) {
                answer++;
            }
        }
        return answer;
    }
    public int[] sortedSquares(int[] nums) {
        int [] answer = new int [nums.length];
        for (int i = 0 ; i < nums.length ; i ++){
            int a = nums[i] * nums[i];
            answer[i] = a;
        }
        Arrays.sort(answer);
        return answer;
    }
    public void duplicateZeros(int[] arr) {
        int [] mas = new int[arr.length];
        int a = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if(a < arr.length){
                mas[a] = arr[i];
                if (arr[i] == 0){
                    if (a+1 != mas.length){
                        mas[a+1] = 0;
                        a++;
                    }
                }
                a++;
            }else{
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mas[i];
        }
    }

    }