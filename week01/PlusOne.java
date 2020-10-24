/**
 * 加一
 * 这个解法其实没有充分利用+1这个条件，加任何小于10的数都适用
 * */
public class PlusOne{
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int acc = 0;

        if(digits[n-1]+1<10){
            digits[n-1]=digits[n-1]+1;
            return digits;
        }else{
            digits[n-1]=(digits[n-1]+1)%10;
        }
        acc=1;
        for(int i=n-2;i>=0;i--){
            if(acc==0) {
                break;
            }
            if(digits[i]+1>=10){
                digits[i]=(digits[i]+1)%10;
            }else{
                digits[i]=digits[i]+1;
                acc=0;
            }
        }
        if(acc==0){
            return digits;
        }else{
            int[] res = new int[n+1];
            res[0]=1;
            for(int i=0;i<n;i++){
                res[i+1]=digits[i];
            }
            return res;
        }
    }
}