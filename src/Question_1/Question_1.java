package Question_1;


interface GreaterThan {
    boolean performOperation(int a, int b);
}

interface IncrementNum {
    int increment(int a);
}

interface Concat {
    String concatinateString(String s1, String s2);
}

interface ToUpperCase {
    String upperCase(String s);
}

public class Question_1 {


    static boolean greatedThan(int a, int b, GreaterThan greaterThan) {
        return greaterThan.performOperation(a, b);
    }

    static int incrementNum(int a, IncrementNum incrementNum) {
        return incrementNum.increment(a);
    }

    static String concatString(String s1, String s2, Concat concat) {
        return concat.concatinateString(s1, s2);
    }

    static String toUpperCase(String s1, ToUpperCase toUpperCase) {
        return toUpperCase.upperCase(s1);
    }

    public static void main(String[] args) {

        //First number is greater than second number or not Parameter (int ,int ) Return boolean
        System.out.println(greatedThan(10, 6, (a, b) -> a > b));

        //Convert a string to uppercase and return . Parameter (String) Return (String)
        System.out.println(toUpperCase("hello", a -> a.toUpperCase()));

        //Concatination of 2 string Parameter (String , String ) Return (String)
        System.out.println(concatString("Hello", "World", (s1, s2) -> s1 + s2));

        //Convert a string to uppercase and return . Parameter (String) Return (String)
        System.out.println(toUpperCase("hello", s1 -> s1.toUpperCase()));

    }
}
