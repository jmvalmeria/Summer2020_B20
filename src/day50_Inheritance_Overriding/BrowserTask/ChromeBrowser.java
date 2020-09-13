package day50_Inheritance_Overriding.BrowserTask;

/*2. create a class called ChromeBrowser
        actions: get(URL): opens the URL in chrome browser
        close(): closes the chrome browser*/

public class ChromeBrowser extends WebDriver {

    public void getUrl(String URL){
        System.out.println("opening the \""+ URL +"\" in the Chrome browser");
    }

    public void close(){
        System.out.println("close the Chrome browser");
    }

}
