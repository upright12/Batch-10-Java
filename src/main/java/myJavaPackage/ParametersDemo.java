package myJavaPackage;

public class ParametersDemo {

    public void addition(int a, int b, int d){ // Parameter

        int c = a+b;
        System.out.println(c);

        int e = c+d;
        System.out.println(e);
    }

    public void addition2(){
        addition(40, 50, 60); // Argument
    }

    public void information(String name, String profession){
//        String name = "Bashir";
//        String profession = "IT Trainer";
        System.out.println("My name is "+ name + " and profession is "+ profession);
    }

    public static void main(String[] args) {
        ParametersDemo obj = new ParametersDemo();
       // obj.addition(70, 90, 100);
       // obj.addition2();
        obj.information("Bashir", "IT Trainer");
    }




}
