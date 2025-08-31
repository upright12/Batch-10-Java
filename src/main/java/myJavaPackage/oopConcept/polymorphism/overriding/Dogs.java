package myJavaPackage.oopConcept.polymorphism.overriding;

public class Dogs extends Animal {
    /**
     * Purpose of this method is
     * created by Propa on ....
     * @param sound
     */
    @Override
    public void sound(){
        String dog = "Lally";
        System.out.println(dog + " sound is barking");
    }


    public static void main(String[] args) {
        Dogs obj = new Dogs();
        obj.animal("Bark");
    }
}
