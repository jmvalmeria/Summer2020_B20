package day06_ComparisionOperators;

public class implicit_explicit {
    public static void main(String[] args) {
        //implicit casting: casting smaller primitive type to larger primitive type
        short s1 = 100;
        long l1 = s1; //implicit

        long l2 = (long)s1; //manually
    }
}
