package myJavaPackage;

public class VariablesDemo {
    /*
    There are few types of variables
    1. Global variables -- The variables we declare inside the class
    2. Local variables-- The variables we declare inside the method
    3. Static variables/methods
    4. Parameter

    Note: we cannot printout in the class, Only we can do inside method
     */

    String model = "iPhone 16"; // global variable
   // System.out.println(model); -- not possible, class cannot hold any command

    public void clickPicture(){  // custom method
        float screenSize = 5.54454f; // Local variable
        System.out.println(screenSize); // method can hold command but cannot run
        System.out.println(model);
    }

    public void purchaseStock() {
        double iphoneStockprice = 400.343493743;
        System.out.println(iphoneStockprice);
        System.out.println(model);
    clickPicture();


    }


    public static void main(String[] args) {
        byte ramSize = 100; // Local variable
        System.out.println(ramSize); // main method can hold and run command
        //System.out.println(model);
        VariablesDemo obj = new VariablesDemo();
        obj.purchaseStock();

    }






}
