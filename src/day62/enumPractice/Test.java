package day62.enumPractice;

public class Test {
    public static void main(String[] args) {
        Color favoriteColor=Color.Green;
        System.out.println(favoriteColor);

        Title myTitle=Title.PO;
        System.out.println(myTitle);

        Title banuTitle=Title.Scrum_Master;
        System.out.println(banuTitle);

        Title arasTitle=Title.QA;
        System.out.println(arasTitle);

        Title tulparTitle=Title.Business_Analyst;
        System.out.println(tulparTitle);

        Browser browserName=Browser.chrome;
        System.out.println(browserName);

        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;
            case firefox:
                System.out.println("Firefox browser is set");
                break;
            case safari:
                System.out.println("Safari browser is set");
                break;
            case edge:
                System.out.println("Edge browser is set");
                break;

        }



        ShoeSize myShoe=ShoeSize.EIGHT;
        System.out.println(myShoe);

    }
}
