package day59_OOPReview.warmup_Phone;
/*
4. create an interface called AppleApp that can inherit from Downloadable
                variables: AppStoreName, OS
 */
public interface AppleApp extends Downloadable {
    String appleStoreName="Apple Store";
    String OS="macOS";
}
