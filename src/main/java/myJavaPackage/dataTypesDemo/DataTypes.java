package myJavaPackage.dataTypesDemo;

public class DataTypes {

 /*
 byte -- it can hold upto 127
 short -- 32767
 int  -- 2,147,483,647
 long -- 9223372036854775807
 float
 double
 boolean
 char
 String = text, like name, address, words, multiple words,
  */

    public static void main(String[] args) {
      String model;
      model = "iphone 15"; // iphone 15 is assigned to model variable
      model = "iphone 16";
    String  firstName = "Bashir";
     firstName = "Tipu";
     String lastName = "Uddin";
     lastName = "Ahmed";
       // System.out.println(firstName);
        System.out.println(lastName);
       byte   ramSize = 100;
        short stockQuantity = 30000;
        stockQuantity = 25000;
        int price = 1200000;
        System.out.println("The price of the phone is $"+price);
        float screenSize = 5.54454f;
        double iphoneStockprice = 400.343493743;
        boolean isPhoneAvailable = true;
        char phoneSize = 'L';
        char gender = 'M';

String givenName = "Bashir";
      // long receiptN0 = 9223372036854775807L;

//      System.out.println("The model of the phone is " +  model + ". \n This is a latest model as of now."); // concatination
//     System.out.println("The size of phone ram is "  + ramSize + "\t The price depends on the ramzise too");
//      System.out.println(screenSize);

    // printing multiple variables in a single line

        System.out.println("The phone model is "+ model + " Ram size is "+ ramSize
        + " Stock Quantity is " + stockQuantity);

    // how to update the variable
        // Example  -- model = "iphone 16"

        System.out.println("Git change");
    }









}
