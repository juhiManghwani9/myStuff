package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b[][] = {{3, 2, 1},
                {5, 6, 4},
                {1, 2, 3}};
        int a[][] = {{1,2,1,3,4},{2,1,3,1,4},{1,5,6,7,8},{1,2,1,2,1}};
        int s = 8;
        boolean flag = false;
        int n = a.length;
        int m = a[0].length;
        int start =0;
        int end = n*m -1;
        /*while(start <= end )
        {
            int mid = (start+end)/2;
            int midx = mid /2;
            int midy = mid%2;
            //System.out.println("midx: " + midx + "midy: "+ midy + " " + a[midx][midy]);
            if(a[midx][midy] == s) {
                System.out.println("found");
                flag = true;
                break;
            }
            else if(a[midx][midy] < s)
                start = mid+1;
            else
               end =  mid-1;

        }

        if(!flag)
            System.out.println("Not Found");*/

        System.out.println(maxMatSum(b,2));
    }

    public static int maxMatSum(int[][] mat, int k) {
        int res = 0;
        int[][] num = new int[mat.length][mat[0].length];
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][0];
            num[i][0] = sum;
        }
        sum = 0;
        for (int j = 0; j < mat[0].length; j++) {
            sum += mat[0][j];
            num[0][j] = sum;
        }
        for (int m = 1; m < mat.length; m++) {
            for (int n = 1; n < mat[0].length; n++) {
                num[m][n] = mat[m][n] + num[m-1][n] + num[m][n-1] - num[m-1][n-1];
            }
        }
        for (int m = 0; m < num.length - k; m++) {
            for (int n = 0; n < num[0].length - k; n++) {
                if(res < num[m+k][n+k] + num[m][n] - num[m+k][n] - num[m][n+k]) {
                    res = num[m+k][n+k] + num[m][n] - num[m+k][n] - num[m][n+k];
                }
            }
        }
        for(int i =0;i<num.length;i++){
            for(int j =0 ;j < num[i].length;j++){
                System.out.println(num[i][j]);
            }
        }
        return res;
    }
}
