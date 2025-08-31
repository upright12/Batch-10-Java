package myJavaPackage.oopConcept.polymorphism.overriding;

public class Cats extends Animal {
//
    /**
     * purpose
     * created by Samin.on....
     *
     */
    @Override
    public void sound(){
       String myCat = "kitty";
        System.out.println(myCat + " sound is meaw");
    }


    public static void main(String[] args) {
        Cats obj = new Cats();
        obj.sound();
    }

}
