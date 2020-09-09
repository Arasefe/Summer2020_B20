package day51_Exceptions.BrowsersTask;
/*
 3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
 */
public class FirefoxBrowser extends WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Opening "+url+" in Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Closing the FirefoxDriver browser");
    }
}
