public class repeatRecursion {

    public static void main(String[] args) {


        System.out.println(repeat("", 500));

    }
    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();

        } else {
            return new String(new char[n]).replace("\0", s);
        }

    }
