package day50_Inheritance_Overriding.BrowserTask;

/* 3. creata a class called FirefoxBrowser
        actions: get(URL): opens the URL in Firefox browser
        close(): closes the Firefox browser*/

public class FirefoxBrowser extends WebDriver {

    public void getUrl(String URL){
        System.out.println("opening the \""+ URL +"\" in the Firefox browser");
    }

    public void close(){
        System.out.println("close the Firefox browser");
    }

}
