package ex_09_Switch;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the broswer: ");
        String Browser =sc.next();

        switch (Browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC");
                break;
            case "firefox" :
                System.out.println("Starting the Firefox");
                System.out.println("........");
                System.out.println("TC");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }

    }

}
