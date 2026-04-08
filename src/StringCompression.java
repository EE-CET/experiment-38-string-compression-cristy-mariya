import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }

        if (compressed.length() > s.length()) {
            System.out.println(s);
        } else {
            System.out.println(compressed.toString());
        }
    }
}
