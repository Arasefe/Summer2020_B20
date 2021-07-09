package day28_Recap;
/*
3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com

            output:
                name: cybertek
                domain: gmail
 */

public class _3ExtractDomainOfEmail {

    public static void main(String[] args) {

        String myEmail="ismail_yildirim@yahoo.com";
        String myName=myEmail.substring(0,myEmail.indexOf('@'));
        String myDomain=myEmail.substring(myEmail.indexOf('@')+1,myEmail.indexOf('.'));

        System.out.println(myName);
        System.out.println(myDomain);

        String email = "Cybertek.School@yahoo.com";

        String name = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        System.out.println(name);
        System.out.println(domain);


    }


}
