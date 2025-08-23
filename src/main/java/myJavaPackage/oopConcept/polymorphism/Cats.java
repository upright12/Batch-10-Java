package myJavaPackage.oopConcept.polymorphism;

public class Cats extends OverRiding1 {

    /**
     * purpose
     * created by Samin.on....
     * @param sound
     */

    @Override
    public void animal(String sound){
       String myCat = "kitty";
        System.out.println("kittys sound is "+sound);
    }


    public static void main(String[] args) {
        Cats obj = new Cats();
        obj.animal("meaw");
    }

}
