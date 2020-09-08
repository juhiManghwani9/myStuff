public class Solution {
    public static int rev(int n)
    {
        int x,r =0;
        int i = n;
        while( n != 0)
        {
            x = n % 10;
            r = r * 10 + x;
            n = n / 10;
        }
        //if(i == r)
            //return r;
        return r;

    }

    public static void sumOfNumbers(int n){
        for(int i =1; i< n; i++) {
            int r = rev(i);
            //System.out.println(r);
            if (r > 0) {
                int sum = i + r;
                if (sum == n) {
                    System.out.println(i + " " + r);
                    break;
                }
            }
        }
    }

    public static void main(String args[]){
        sumOfNumbers(121);
    }
}
