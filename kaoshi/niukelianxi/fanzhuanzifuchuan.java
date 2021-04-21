package niukelianxi;
//写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
public class fanzhuanzifuchuan {
    public static void main(String[] args) {
        solve("falsdfa");

    }
    public static String solve (String str) {
        char[] chars = str.toCharArray();
        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        return new String(chars);
    }
}
