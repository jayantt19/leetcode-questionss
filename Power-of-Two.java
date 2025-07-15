class Solution {
    public static boolean powers(int n, int x) {
        if (Math.pow(2, x) > n) return false;
        if (Math.pow(2, x) == n) return true;

        return powers(n, x + 1);
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false; // handle edge case
        return powers(n, 0);
    }
}
