/**
 * 加一
 *
 * */
public class PlusOne{
/**
 * 这个解法其实没有充分利用+1这个条件，加任何小于10的数都适用
 * */
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

    /**
     *  比较简单巧妙的解法
     * */
    public int[] plusOneNew(int[] digits) {
        int n =digits.length;
        for(int i=n-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]>0){
                break;
            }
        }
        if(digits[0]==0){
            digits = new int[n+1];
            digits[0]=1;
        }
        return digits;
    }
}