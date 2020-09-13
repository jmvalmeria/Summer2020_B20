package day52_Exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        int[] arr = {10,20};

        try {
            System.out.println(arr[20]);
        }catch (ArithmeticException e){
            System.out.println("Airthmetic Exception is handled");
        }catch (ClassCastException e){
            System.out.println("Class Cast Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out Of Bound Exception");
        }catch (RuntimeException e){
            System.out.println("Run Time Exception");
        } //If we put Parent Exception before child it will give us a compile error

        System.out.println("===========================================");

        String str ="Cybertek";
        try{
            System.out.println(str.charAt(200));
        }catch (RuntimeException e){ //runtimeexception can handle and unchecked exception
            System.out.println(e.getMessage());
        }

        System.out.println("===========================================");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        System.out.println("Completed");

        System.out.println("===========================================");
        try {
            System.out.println(8/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
        }finally {
            System.out.println("Finally Block");
        }

        System.out.println("Completed");
    }


}
