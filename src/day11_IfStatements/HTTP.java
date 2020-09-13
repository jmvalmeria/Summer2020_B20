package day11_IfStatements;

import java.util.Scanner;

public class HTTP {
    public static void main(String[] args) {
        /*HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings arelisted below:
    status code:
        200, OK
        201, Created
        202, Accepted
        301, Moved Permanently
        303, See Other
        304, Not Modified
        307, Temporary Redirect
        400, Bad Request
        401, Unauthorized
        403, Forbidden
        404, Not Found
        410, Gone
        500, Internal Server Error
        503, Service Unavailable

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.
                    Example:
                        if status code = 200
                        output: ok
                        if status code = 201:
                        output: Created
            NOTE: use single if statements ONLY. DO NOT use more that one print statement
*/

        Scanner in = new Scanner(System.in);
        int code = 000;
        String error = "Please, type the 3 digits of your HTTP protocol!";
        String error1 = "Please, type 3 digits valid HTTP protocol!";

        System.out.println("Please, type the 3 digits of your HTTP protocol: ");
        while (true){
            try{
                code = Integer.valueOf(in.nextLine());
                if (code == 200){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , OK");
                    System.out.println("********************************");
                    break;
                } else  if (code == 201){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Created");
                    System.out.println("********************************");
                    break;
                } else  if (code == 202){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Accepted");
                    System.out.println("********************************");
                    break;
                } else  if (code == 301){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Moved Permanently");
                    System.out.println("********************************");
                    break;
                } else  if (code == 303){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , See Other");
                    System.out.println("********************************");
                    break;
                } else  if (code == 304){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Not Modified");
                    System.out.println("********************************");
                    break;
                } else  if (code == 307){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Temporary Redirect");
                    System.out.println("********************************");
                    break;
                } else  if (code == 400){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Bad Request");
                    System.out.println("********************************");
                    break;
                } else  if (code == 401){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Unauthorized");
                    System.out.println("********************************");
                    break;
                } else  if (code == 403){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Forbidden");
                    System.out.println("********************************");
                    break;
                } else  if (code == 404){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Not Found");
                    System.out.println("********************************");
                    break;
                } else  if (code == 410){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Gone");
                    System.out.println("********************************");
                    break;
                } else  if (code == 500){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Internal Server Error");
                    System.out.println("********************************");
                    break;
                } else  if (code == 503){
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("Code " + code + " , Service Unavailable");
                    System.out.println("********************************");
                    break;
                } else {
                    System.out.println(error1);
                    continue;
                }
            }catch (Exception e){
                System.out.println(error);
            }
        }
    }
}
