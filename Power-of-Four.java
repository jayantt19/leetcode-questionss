class Solution {
    public boolean powers(int x,int n){
        if(Math.pow(4,x)==n) return true;
        if(Math.pow(4,x)>n) return false;

        return powers(x+1,n);
    }
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        return powers(0,n);
    }
}