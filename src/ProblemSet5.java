/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        
        ProblemSet5 ps = new ProblemSet5();
        
        //Exercise 1

        System.out.println("Exercise 1");
        System.out.println(" ");
        System.out.println(ps.surroundMe("cde", "abfg")); //"abcdefg"
        System.out.println(ps.surroundMe(null, "####")); //null
        System.out.println(ps.surroundMe("abc", null)); //"abc"
        System.out.println(ps.surroundMe("abc", "123")); //"abc"
        System.out.println(" ");


        //Exercise 2

        System.out.println("Exercise 2");
        System.out.println(" ");
        System.out.println(ps.endsMeet("abcdefg", 2)); //abfg
        System.out.println(ps.endsMeet(null, 2)); //null
        System.out.println(ps.endsMeet("", 2)); //""
        System.out.println(ps.endsMeet("abc", -1)); //"abc"
        System.out.println(" ");


        //Exercise 3

        System.out.println("Exercise 3");
        System.out.println(" ");
        System.out.println(ps.middleMan("abcdefg")); //"cde"
        System.out.println(ps.middleMan(null)); //null
        System.out.println(ps.middleMan("12")); //"12"
        System.out.println(ps.middleMan("a")); //"a"
        System.out.println(" ");

        //Exercise 4

        System.out.println("Exercise 4");
        System.out.println(" ");
        System.out.println(ps.isCentered("abcdefg", "cde")); //true
        System.out.println(ps.isCentered("abcdefg", "abc")); //false
        System.out.println(ps.isCentered(null, "abc")); //false
        System.out.println(ps.isCentered("abcd", "abc")); //false
        System.out.println(ps.isCentered("abc", null)); //false
        System.out.println(ps.isCentered("abcdefg", "cd")); //false
        System.out.println(" ");

        //Exercise 5

        System.out.println("Exercise 5");
        System.out.println(" ");
        System.out.println(ps.countMe("I am an example sentence", 'e')); //2
        System.out.println(ps.countMe(null, 'a')); //-1
        System.out.println(ps.countMe("abc$ def$", '$')); //-1
        System.out.println(ps.countMe("obama", '\u0398')); //-1
        System.out.println(" ");

        //Exercise 6

        System.out.println("Exercise 6");
        System.out.println(" ");
        System.out.println(ps.triplets("aaabbbccc")); //3
        System.out.println(ps.triplets("aaaa")); //2
        System.out.println(ps.triplets("abc")); //0
        System.out.println(ps.triplets(null)); //-1
        System.out.println(" ");

        //Exercise 7

        System.out.println("Exercise 7");
        System.out.println(" ");
        System.out.println(ps.addMe("123 abc 123")); //12
        System.out.println(ps.addMe("abcdefghijk")); //0
        System.out.println(ps.addMe(null)); //-1
        System.out.println(" ");

        //Exercise 8

        // System.out.println("Exercise 8");
        // System.out.println(" ");
        // System.out.println(ps.sequence("abbcccdddd")); //4        
        // System.out.println(ps.sequence("aAabBbBb")); //1        
        // System.out.println(ps.sequence("")); //0      
        // System.out.println(ps.sequence(null)); //-1       
        // System.out.println(" ");

        //Exercise 9

        // System.out.println("Exercise 9");
        // System.out.println(" ");
        // System.out.println(ps.intertwine("aceg", "bdfh")); //"abcdefgh"        
        // System.out.println(ps.intertwine("abc", "12345")); //"a1b2c345"        
        // System.out.println(ps.intertwine(null, "abcd")); //null     
        // System.out.println(ps.intertwine("abcd", null)); //null
        // System.out.println(ps.intertwine(null, null)); //null            
        // System.out.println(" ");

        //Exercise 10

        // System.out.println("Exercise 10");
        // System.out.println(" ");  
        // System.out.println(ps.isPalindrome("racecar")); //true    
        // System.out.println(ps.isPalindrome("Madam")); //false
        // System.out.println(ps.isPalindrome(null)); //false          
        // System.out.println(" ");

    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {

        String newString = "null";

        if (in != null && out != null && out.length() == 4) {
            newString = out.substring(0, 2) + in + out.substring(2, 4);
        } else if (in == null) {
            newString = null;
        } else {
            newString = in;
        }

        return newString;

    }
    
    // /*
    //  * Exercise 2.
    //  * 
    //  * Given a string and an integer, return a new string that represents the first
    //  * and last n characters of text.
    //  */
    
    public String endsMeet(String text, int n) {

        String newString = "null";

        if (text != null && n >= 1 && n <= text.length()) {
            newString = text.substring(0, n) + text.substring(text.length()-n, text.length());
        } else if (text == null) {
            newString = null;
        } else {
            newString = text;
        }

        return newString;

    }
    
    // /*
    //  * Exercise 3.
    //  * 
    //  * Given a string, return a new string using the middle three characters of text.
    //  */
    
    public String middleMan(String text) {
       
        String newString = "null";

        if (text != null && text.length() >= 3 && text.length() % 2 != 0) {
            newString = text.substring(text.length()/2-1, text.length()/2+2);
        } else if (text == null) {
            newString = null;
        } else {
            newString = text;
        }

        return newString;
    }
    
    // /*
    //  * Exercise 4.
    //  * 
    //  * Given two strings, determine whether or not target is equivalent to the middle
    //  * three characters of text.
    //  */
    
    public boolean isCentered(String text, String target) {

        String newString = "null";
        boolean newBool = false;

        if (text != null && text.length() >= 3 && text.length() % 2 != 0 && target != null && target.length() == 3) {
            newString = text.substring(text.length()/2-1, text.length()/2+2);

            if (newString.equals(target)) {
                newBool = true;
            } else {
                newBool = false;
            }

        } else {
            newBool = false;
        }

        return newBool;

    }
    
    // /*
    //  * Exercise 5.
    //  * 
    //  * Given a string and a character, compute the number of words that end in suffix.
    //  */
    
    public int countMe(String text, char suffix) {

        int newInt = 0;
        int count = 0;

        if (text != null && Character.isLetter(suffix) && ((suffix >= 'a' && suffix <= 'z') || (suffix >= 'A' && suffix <= 'Z'))) {

            for (int i = 0; i < text.length(); i++) {    
                if (text.charAt(i) == suffix && (i == text.length() - 1 || text.charAt(i+1) == ' ')) {
                    newInt++;
                }
            }    

        } else {
            newInt = -1;
        }


        return newInt;

    }
    
    // /*
    //  * Exercise 6.
    //  * 
    //  * Given a string, compute the number of triplets in text.
    //  */
    
    public int triplets(String text) {
        
        int newInt = 0;

        if (text != null) {

            for (int i = 0; i < text.length(); i++) {

                if (i+2 < text.length() && (text.charAt(i) == text.charAt(i+1) && text.charAt(i) == text.charAt(i+2))) {
                    newInt += 1;
                }

            }

        } else {
            newInt = -1;
        }

        return newInt;

    }
    
    // /*
    //  * Exercise 7.
    //  * 
    //  * Given a string, compute the sum of the digits in text.
    //  */
    
    public long addMe(String text) {

        long newLong = 0;
        boolean isInt = false;
        int temp = 0;

        if (text != null) {

            for (int i = 0; i < text.length(); i++) {

                isInt = false;

                try {
                    temp = Integer.parseInt(Character.toString(text.charAt(i)));
                    isInt = true;
                } catch (Exception e) {
                    isInt = false;
                }

                if (isInt) {
                    newLong += temp;
                }

            }
            
        } else {
            newLong = -1;
        }

        return newLong;

    }
    
    // /*
    //  * Exercise 8.
    //  * 
    //  * Given a string, compute the length of the longest sequence.
    //  */
    
    public long sequence(String text) {

        long current = 0;
        long record = 0;
        char previousCharacter = text.charAt(0);

        if (text != null) {
            
            for (int i = 0; i < text.length(); i++) {

                if (text.charAt(i) == previousCharacter) {
                    current += 1;
                } else {
                    current = 0;
                }

                if (current > record) {
                    record = current;
                }


            }

        } else {
            record = -1;
        }

        return record;

    }
    
    // /*
    //  * Exercise 9.
    //  * 
    //  * Given two strings, return a new string built by intertwining each of the
    //  * characters of a and b.
    //  */
    
    // public String intertwine(String a, String b) {

    // }
    
    // /*
    //  * Exercise 10.
    //  * 
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    
    // public boolean isPalindrome(String text) {

    // }
}
