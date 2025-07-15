class Solution {
    public static boolean powers(int x,int n){
        if(Math.pow(3,x)>n) return false;
        if(Math.pow(3,x)==n) return true;

        return powers(x+1,n);
    }
    public boolean isPowerOfThree(int n) {
       if(n<=0) return false;
       return powers(0,n);
    }
}