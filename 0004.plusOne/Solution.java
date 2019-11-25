class Solution {
    public int[] plusOne(int[] digits) {
        int pre = 1;
        int tmp;
        int[] r = new int[digits.length + 1];
        int index = digits.length - 1;
        do {
            tmp = digits[index] + pre;
            r[index + 1] = tmp % 10;
            pre = tmp / 10;
            index--;
        } while(index >= 0);
        if (pre != 0) {
            r[0] = pre;
            return r;
        }
        int[] dst = new int[digits.length];
        System.arraycopy(r, 1, dst, 0, digits.length);
        return dst;
    }
}
