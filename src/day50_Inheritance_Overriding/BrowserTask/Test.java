package day50_Inheritance_Overriding.BrowserTask;

public class Test {

    public static void main(String[] args) {

        ChromeBrowser browser1 = new ChromeBrowser();
        FirefoxBrowser browser2 = new FirefoxBrowser();
        Opera browser3 = new Opera();

        browser1.getUrl("http://www.google.com");
        browser1.close();
        System.out.println("======================================");
        browser2.getUrl("http://www.google.com");
        browser2.close();
        System.out.println("======================================");
        browser3.getUrl("http://www.google.com");
        browser3.close();
    }
}
