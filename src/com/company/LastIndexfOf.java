package com.company;

public class LastIndexfOf {
    public static void main(String[] args) {
        String s = "Tea Tea";
      //  String geBtLast2Chars = s.substring(s.length()-3, s.length()-1);

       // System.out.println("Last two chars of String: " + getLast2Chars);

        StringBuilder sb = new StringBuilder(s);
         sb.replace(0, 3, "The price of " +sb);

        System.out.println(sb);
    }
}
