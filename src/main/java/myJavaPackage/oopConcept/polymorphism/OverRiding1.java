package myJavaPackage.oopConcept.polymorphism;

public class OverRiding1 {

    /**
     * The purpose of the this method is ...
     * created by Bashir on 8/17/2025
     * @param sound
     */
    public void animal(String sound){
        System.out.println(sound);
    }


    public static void main(String[] args) {
        OverRiding1 obj = new OverRiding1();
        obj.animal("");
    }
}
