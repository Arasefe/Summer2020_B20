package day51_Exceptions.BrowsersTask;
/*
 4. create a class called OperaBrowser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
 */
public class OperaBrowser extends WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Opening "+url+" in Opera browser");

    }

    @Override
    public void close() {
        System.out.println("Closing the Opera browser");
    }
}
