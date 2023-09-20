package java_practice.stringsandarrays;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        String college = "Lovely Professional University";
       // Scanner input = new Scanner(System.in);
        // System.out.println("Enter Your Good Name:");
        //name=input.next();
        //int length():
        // Returns the number of characters in the String.
        System.out.println(college.length());
        //Char charAt(int i):
        // Returns the character at ith index
        System.out.println(college.charAt(3));
        //String substring (int i):
        // Return the substring from the ith  index character to end.
        System.out.println(college.substring(7));
        //String substring (int i, int j):
        // Returns the substring from i to j-1 index.
        System.out.println(college.substring(7,10));
        //String concat( String str):
        // Concatenates specified string to the end of this string
        college=college.concat(" Punjab");
        System.out.println(college);
       // int indexOf (String s):
        // Returns the index within the string of the first occurrence of the specified string.
        System.out.println(college.indexOf("University"));
        //int indexOf (String s, int i):
        // Returns the index within the string of the first occurrence of the specified string, starting at the specified index.
        college=college.concat(" Lovely");
        System.out.println(college);
        System.out.println(college.indexOf("Love",1));
        // int lastIndexOf( String s):
        // Returns the index within the string of the last occurrence of the specified string.
        System.out.println(college.lastIndexOf("P"));
        //boolean equals( Object otherObj):
        // Compares this string to the specified object this is case-sensitive
        System.out.println("Punjab".equals(college.substring(31,37)));
        //boolean  equalsIgnoreCase (String anotherString):
        //Compares string to another string, ignoring case considerations.
        System.out.println("lOVEly".equalsIgnoreCase("LOVELY"));
       //int compareTo( String anotherString): Compares two string lexicographically.
        String one="hello world";
        String two ="Hello World";
        System.out.println(one.compareTo(two));
        //int compareToIgnoreCase( String anotherString):
        // Compares two string lexicographically, ignoring case considerations.
        System.out.println(one.compareToIgnoreCase(two));
        //String toLowerCase(): Converts all the characters in the String to lower case
        college=college.toLowerCase();
        System.out.println(college);
        //String toUpperCase(): Converts all the characters in the String to upper case.
        System.out.println(college.toUpperCase());
        //String trim():
        // Returns the copy of the String, by removing whitespaces at both ends. It does not affect whitespaces in the middle.
        String space="this is a space                 ";
        System.out.println(space.trim());
        // String replace (char oldChar, char newChar):
        // Returns new string by replacing all occurrences of oldChar with newChar.
        System.out.println(college.replace('v','n'));
    }
}
