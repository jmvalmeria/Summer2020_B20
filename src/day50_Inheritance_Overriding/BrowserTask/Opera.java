package day50_Inheritance_Overriding.BrowserTask;

/*4. create a class called Opera browser
        actions: get(URL): opens the URL in Opera browser
        close(): closes the Opera browser*/

public class Opera extends WebDriver {

    public void getUrl(String URL){
        System.out.println("opening the \""+ URL +"\" in the Opera browser");
    }

    public void close(){
        System.out.println("close the Opera browser");
    }

}
