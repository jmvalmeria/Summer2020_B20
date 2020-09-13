package day13_next_methods;

public class Browser {
    public static void main(String[] args) {
        /*6. write a program that can display the selected browser
            1.1  declear a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary*/

        String browserName = "chrome";
        String result = " ";

        switch (browserName) {
            case "chrome":
                result = "Chrome";
                break;

            case "firefox":
                result = "Firefox";
                break;

            case "opera":
                result = "Opera";
                break;

            case "safari":
                result = "Safari";
                break;

            case "edge":
                result = "Edge";
                break;

            default:
                result = "Invalid Browser Name";

        }

        System.out.println(result);
    }
}
