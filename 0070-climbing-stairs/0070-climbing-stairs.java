class Solution {
    static public int main(int n){
        return climbStairs(n);
    }
    static int[] arr=new int[51];
    static public int climbStairs(int n) {
        if(n<3) return n;
        if(arr[n]==0)
            return arr[n]=climbStairs(n-1)+climbStairs(n-2);
        return arr[n];
    }
}