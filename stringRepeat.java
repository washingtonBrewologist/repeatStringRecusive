/*
Write a recursive method repeat that accepts a string s and an integer n as 
parameters and that returns a String consisting of n copies of s.
*/


public class repeatRecursion {

    public static void main(String[] args) {


        System.out.println(repeat());

    }
    public static String repeat(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();

        } else {
            return new String(new char[n]).replace("\0", s);
        }

    }
