package day51_Exceptions;

public class ExceptionsHandling2 {

    public static void main(String[] args) {

        String exceptionResult = "";

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            exceptionResult = e.getMessage();
        }

        System.out.println(exceptionResult);

    }

}
