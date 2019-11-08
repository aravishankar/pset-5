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
        
        // //Exercise 1

        // System.out.println("Exercise 1");
        // System.out.println(" ");
        // System.out.println(ps.surroundMe("cde", "abfg")); //"abcdefg"
        // System.out.println(ps.surroundMe(null, "####")); //null
        // System.out.println(ps.surroundMe("abc", null)); //"abc"
        // System.out.println(ps.surroundMe("abc", "123")); //"abc"
        // System.out.println(" ");


        // //Exercise 2

        // System.out.println("Exercise 2");
        // System.out.println(" ");
        // System.out.println(ps.endsMeet("abcdefg", 2)); //abfg
        // System.out.println(ps.endsMeet(null, 2)); //null
        // System.out.println(ps.endsMeet("", 2)); //""
        // System.out.println(ps.endsMeet("abc", -1)); //"abc"
        // System.out.println(" ");


        // //Exercise 3

        // System.out.println("Exercise 3");
        // System.out.println(" ");
        // System.out.println(ps.middleMan("abcdefg")); //"cde"
        // System.out.println(ps.middleMan(null)); //null
        // System.out.println(ps.middleMan("12")); //"12"
        // System.out.println(ps.middleMan("a")); //"a"
        // System.out.println(" ");

        // //Exercise 4

        // System.out.println("Exercise 4");
        // System.out.println(" ");
        // System.out.println(ps.isCentered("abcdefg", "cde")); //true
        // System.out.println(ps.isCentered("abcdefg", "abc")); //false
        // System.out.println(ps.isCentered(null, "abc")); //false
        // System.out.println(ps.isCentered("abcd", "abc")); //false
        // System.out.println(ps.isCentered("abc", null)); //false
        // System.out.println(ps.isCentered("abcdefg", "cd")); //false
        // System.out.println(" ");

        // //Exercise 5

        // System.out.println("Exercise 5");
        // System.out.println(" ");
        // System.out.println(ps.countMe("I am an example sentence", 'e')); //2
        // System.out.println(ps.countMe(null, 'a')); //-1
        // System.out.println(ps.countMe("abc$ def$", '$')); //-1
        // System.out.println(ps.countMe("obama", '\u0398')); //-1
        // System.out.println(" ");

        // //Exercise 6

        // System.out.println("Exercise 6");
        // System.out.println(" ");
        // System.out.println(ps.triplets("aaabbbccc")); //3
        // System.out.println(ps.triplets("aaaa")); //2
        // System.out.println(ps.triplets("abc")); //0
        // System.out.println(ps.triplets(null)); //-1
        // System.out.println(" ");

        // //Exercise 7

        // System.out.println("Exercise 7");
        // System.out.println(" ");
        // System.out.println(ps.addMe("123 abc 123")); //12
        // System.out.println(ps.addMe("abcdefghijk")); //0
        // System.out.println(ps.addMe(null)); //-1
        // System.out.println(" ");

        // //Exercise 8

        // System.out.println("Exercise 8");
        // System.out.println(" ");
        // System.out.println(ps.sequence("abbcccdddd")); //4        
        // System.out.println(ps.sequence("aAabBbBb")); //1        
        // System.out.println(ps.sequence("")); //0      
        // System.out.println(ps.sequence(null)); //-1  
        // System.out.println(ps.sequence("   "));     
        // System.out.println(" ");

        // //Exercise 9

        // System.out.println("Exercise 9");
        // System.out.println(" ");
        // System.out.println(ps.intertwine("aceg", "bdfh")); //"abcdefgh"        
        // System.out.println(ps.intertwine("abc", "12345")); //"a1b2c345"        
        // System.out.println(ps.intertwine(null, "abcd")); //null     
        // System.out.println(ps.intertwine("abcd", null)); //null
        // System.out.println(ps.intertwine(null, null)); //null            
        // System.out.println(" ");

        // //Exercise 10

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

        String surroundMeString = "null";

        if (in != null && out != null && out.length() == 4) {
            surroundMeString = out.substring(0, 2) + in + out.substring(2, 4);
        } else if (in == null) {
            surroundMeString = null;
        } else {
            surroundMeString = in;
        }

        return surroundMeString;

    }
    
    // /*
    //  * Exercise 2.
    //  * 
    //  * Given a string and an integer, return a new string that represents the first
    //  * and last n characters of text.
    //  */
    
    public String endsMeet(String text, int n) {

        String endsMeetString = "null";

        if (text != null && n >= 1 && n <= text.length()) {
            endsMeetString = text.substring(0, n) + text.substring(text.length()-n, text.length());
        } else if (text == null) {
            endsMeetString = null;
        } else {
            endsMeetString = text;
        }

        return endsMeetString;

    }
    
    // /*
    //  * Exercise 3.
    //  * 
    //  * Given a string, return a new string using the middle three characters of text.
    //  */
    
    public String middleMan(String text) {
       
        String middleManString = "null";

        if (text != null && text.length() >= 3 && text.length() % 2 != 0) {
            middleManString = text.substring(text.length()/2-1, text.length()/2+2);
        } else if (text == null) {
            middleManString = null;
        } else {
            middleManString = text;
        }

        return middleManString;
    }
    
    // /*
    //  * Exercise 4.
    //  * 
    //  * Given two strings, determine whether or not target is equivalent to the middle
    //  * three characters of text.
    //  */
    
    public boolean isCentered(String text, String target) {

        String centeredString = "null";
        boolean newBool = false;

        if (text != null && text.length() >= 3 && text.length() % 2 != 0 && target != null && target.length() == 3) {
            centeredString = text.substring(text.length()/2-1, text.length()/2+2);

            if (centeredString.equals(target)) {
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

        int count = 0;

        if (text != null && Character.isLetter(suffix) && ((suffix >= 'a' && suffix <= 'z') 
          || (suffix >= 'A' && suffix <= 'Z'))) {

            for (int i = 0; i < text.length(); i++) {    
                if (text.charAt(i) == suffix && (i == text.length() - 1 || text.charAt(i+1) == ' ')) {
                    count++;
                }
            }    

        } else {
            count = -1;
        }


        return count;

    }
    
    // /*
    //  * Exercise 6.
    //  * 
    //  * Given a string, compute the number of triplets in text.
    //  */
    
    public int triplets(String text) {
        
        int count = 0;

        if (text != null) {

            for (int i = 0; i < text.length(); i++) {

                if (i+2 < text.length() && (text.charAt(i) == text.charAt(i+1) && text.charAt(i) == text.charAt(i+2))) {
                    count += 1;
                }

            }

        } else {
            count = -1;
        }

        return count;

    }
    
    // /*
    //  * Exercise 7.
    //  * 
    //  * Given a string, compute the sum of the digits in text.
    //  */
    
    public long addMe(String text) {

        long sum = 0;
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
                    sum += temp;
                }

            }
            
        } else {
            sum = -1;
        }

        return sum;

    }
    
    // /*
    //  * Exercise 8.
    //  * 
    //  * Given a string, compute the length of the longest sequence.
    //  */
    

    public long sequence(String text) {
        
        long record = 1;
        long sequenceLength = 1;
        char first = ' ';
        char second = ' ';
        
        if (text != null) {
            
            for (int i = 1; i < text.length(); i++) {

                first = text.charAt(i-1);
                second = text.charAt(i);

                if (first == second) {

                    sequenceLength += 1;

                    if (sequenceLength > record) {
                        record = sequenceLength;
                    }

                } else {
                    sequenceLength = 1;
                }

            }

            if (text.length() == 0) {
                record = 0;
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
    
    public String intertwine(String a, String b) {

        long record = 0;
        // boolean isARecord = false;
        String intertwined = "";

        if (a != null && b != null) {

            if (a.length() > b.length()) {

                record = a.length();
                // isARecord = true;
                
            } else {
                record = b.length();
            }

            for (int i = 0;i < record; i++) {
                if (i < a.length() && i < b.length()) {

                    intertwined += String.valueOf(a.charAt(i));
                    intertwined += String.valueOf(b.charAt(i));

                } else if (i < a.length()) {
                    intertwined += String.valueOf(a.charAt(i));
                } else if (i < b.length()) {
                    intertwined += String.valueOf(b.charAt(i));
                }
            }

        } else {
            intertwined = null;
        }

        return intertwined;

    }
    
    // /*
    //  * Exercise 10.
    //  * 
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    
    public boolean isPalindrome(String text) {
        boolean isPalindrome = false;
        String reverseString = "";

        if (text != null) {

            for (int i = text.length()-1 ; i >= 0; i--) {
                reverseString += String.valueOf(text.charAt(i));
            }

            if (text.equals(reverseString)) {
                isPalindrome = true;
            }

        } else {
            isPalindrome = false;
        }

        return isPalindrome;

    }

}
