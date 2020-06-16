package homework.june13;

//8) Convert a String to an array of String.
//  It's not quite clear how that String will look like. So implementing two approaches:
//  1. Let assume we have a string consisted from 1 to N words, then it  can be split into array by " " (space),
//      e.g. every word is an array element
//  2. Let assume we have string representing one word e.g. "Automation" then we can represent this word as an array
//      where one letter = array element
public class Task8 {

    public static void main(String[] args) {
        String str1 = "Software Test Automation";
        String str2 = "Automation";

        String[] arrBySpace = toStringArr1(str1);

        for(String s : arrBySpace) {
            System.out.println(s);
        }

        String[] arrLetters = toStringArr2(str2);

        for(String s : arrLetters) {
            System.out.println(s);
        }

    }

    //split by " " (space)
    static String[] toStringArr1(String str) {
        return str.split(" ");
    }

    //arr of letters
    static String[] toStringArr2(String str) {

        String[] arr = new String[str.length()];

        for(int i = 0; i < str.length(); i++) {
           arr[i] = str.substring(i, i+1);
        }
        return arr;
    }

}
