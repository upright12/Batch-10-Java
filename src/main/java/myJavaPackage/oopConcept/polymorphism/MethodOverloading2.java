package myJavaPackage.oopConcept.polymorphism;

public class MethodOverloading2 {

    public void login(String userName, String Password){
        System.out.println("Macys Login");
    }

   public void login(String userName, int pin){
       System.out.println("Walmart Login");
   }

    public void login(String userName, int pin, String Password){
        System.out.println("Amazon Login");
    }

}
