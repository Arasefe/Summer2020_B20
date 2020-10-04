package day57_Polymorphism.PhoneTask;
/*
 2. create an interface named AppleAppStore
            variable: AppStoreName
            abstract method: downloadAppleApp();
 */
public interface AppleApp extends Downloadable {
    String AppStoreName = "App Store"; // public static final
    // 1 abstract method
}
