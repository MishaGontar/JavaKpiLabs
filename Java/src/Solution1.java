import java.util.Arrays;

class Solution1 {
    public String convert(String s, int numRows) {
        String chiv = "";
        String[] words = s.toUpperCase().split("");
        int sumN = (numRows + numRows) - 2 ;
        int cur = 0;
        System.out.println(Arrays.toString(words));

        if (numRows == 1){
            return s;
        }
        for (int i = 1 ; i <= numRows ; i ++) {
            int n = sumN +cur;
            for (int m = i - 1; m <= words.length - 1; m += n) {
                chiv += words[m];
                System.out.println(chiv);
                if (n > words.length - 1) {
                    break;
                }
                if ( sumN == 0 || cur == 0){

                }
                if (sumN != 0 && sumN + m <= words.length - 1){
                   chiv += words[sumN + m];
                    System.out.println(sumN + m + " check1    " + m);
                    System.out.println(chiv);
                }
                if (cur != 0 && cur+m <= words.length - 1){
                    chiv += words[cur+m];
                    System.out.println(cur+m + " check2    " + m);
                    System.out.println(chiv);
                }
                System.out.println(cur + m + " check3    " + m);
                System.out.println(chiv);
                if (m + sumN > words.length - 1) {
                    break;
                }
            }
        }
        return chiv;
}
}