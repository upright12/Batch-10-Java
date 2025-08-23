package myJavaPackage.oopConcept.polymorphism;

public class Dogs extends OverRiding1 {
    /**
     * Purpose of this method is
     * created by Propa on ....
     * @param sound
     */
    @Override
    public void animal(String sound){
        String dog = "Lally";
        System.out.println("Lally's sound is "+sound);
    }


    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.animal("Bark");
    }
}
