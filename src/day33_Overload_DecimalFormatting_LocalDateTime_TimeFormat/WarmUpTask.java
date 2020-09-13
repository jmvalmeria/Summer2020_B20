package day33_Overload_DecimalFormatting_LocalDateTime_TimeFormat;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class WarmUpTask {
    /*Task01:
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
    Task02:
        1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order
    Task03:
        1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. creata a method that can print out the unique characters from an array of chars*/


    //Task01
    public static int addition(int a, int b){
        return a + b;
    }

    public static double addition(double a, double b){
        return a + b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }



    //Task02
    public static int[] arrDescending(int[] arr){
        int[] result = new int[arr.length];
        Arrays.sort(arr);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static double[] arrDescending(double[] arr){
        double[] result = new double[arr.length];
        Arrays.sort(arr);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static String[] arrDescending(String[] arr){
        String[] result = new String[arr.length];
        Arrays.sort(arr);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static char[] arrDescending(char[] arr){
        char[] result = new char[arr.length];
        Arrays.sort(arr);

        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            result[index] = arr[i];
            index++;
        }

        return result;
    }



    //Task03
    public static void unique(int[] arr){
        String unique = "";


        for (int each : arr){
           int count = 0;
           for (int element : arr){
               if (each == element){
                   count++;
               }
           }

           if (count == 1){
               unique += each + " ";
           }
        }

        System.out.println(unique);
    }

    public static void unique(double[] arr){
        String unique = "";


        for (double each : arr){
            int count = 0;
            for (double element : arr){
                if (each == element){
                    count++;
                }
            }

            if (count == 1){
                unique += each + " ";
            }
        }

        System.out.println(unique);
    }

    public static void unique(String[] arr){
        String unique = "";


        for (String each : arr){
            int count = 0;
            for (String element : arr){
                if (each.equals(element)){
                    count++;
                }
            }

            if (count == 1){
                unique += each + " ";
            }
        }

        System.out.println(unique);
    }

    public static void unique(char[] arr){
        String unique = "";


        for (char each : arr){
            int count = 0;
            for (char element : arr){
                if (each == element){
                    count++;
                }
            }

            if (count == 1){
                unique += each + " ";
            }
        }

        System.out.println(unique);
    }

}
