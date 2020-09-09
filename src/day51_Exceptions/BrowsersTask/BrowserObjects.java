package day51_Exceptions.BrowsersTask;

public class BrowserObjects {
    public static void main(String[] args) {
        WebDriver chrome=new ChromeBrowser();

        chrome.get("https://www.google.com");
        chrome.close();

        FirefoxBrowser firefoxBrowser=new FirefoxBrowser();
        firefoxBrowser.get("https://www.facebook.com");
        firefoxBrowser.close();

        OperaBrowser operaBrowser=new OperaBrowser();
        operaBrowser.get("https://www.etsy.com");
        operaBrowser.close();

    }
}
