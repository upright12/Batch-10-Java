package myJavaPackage.finalKeywords;
/*
Final keyword can be used before class, methods and variables
if it is in before class, we cannot extend that class.
If it is before a method, no one can override it.
If it is before a variable, no one can change the value.
 */
public class Final_1 {
final String schoolName = "Upright Tech Solutions";
    /**
     * purpose of this
     * created by Bashir on ....
     * @param a
     * @param b
     */

    public void add(int a, int b){

        System.out.println("I am learning addition in Java");

    }


    public static void main(String[] args) {
        Final_1 obj = new Final_1();
        //obj.schoolName = "Upright Tech";
        System.out.println(obj.schoolName);
    }
}
