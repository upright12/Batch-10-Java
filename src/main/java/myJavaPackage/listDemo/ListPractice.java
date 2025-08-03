package myJavaPackage.listDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {
// Array is static but arraylist is dynamic
    // We can add, remove elements from arraylist
    //ArrayList follow insertion order
    // ArrayList can hold duplicate value

    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<Float> height = new ArrayList<>();


        public void ArraylistDemo(){
            ArrayList<String> name = new ArrayList<>();
            boolean isEmptybeforeAdd =   name.isEmpty();
            System.out.println(isEmptybeforeAdd);
            name.add("Bashir");
            name.add("Arafat");
            name.add("Sabrina");
            name.add("Shifat");
            System.out.println(name.get(2));

            System.out.println(name);

           // name.remove("Arafat");
            name.remove(1);
            System.out.println(name);

            name.add("Yesmin");
            System.out.println(name);

            name.add("Sabrina");
            System.out.println(name);
            name.add(null);
            System.out.println(name);

            name.add(2, "Arnob");
            System.out.println(name);

         boolean shifatIsThere = name.contains("Arafat");
            System.out.println(shifatIsThere);
          boolean isEmpty =   name.isEmpty();
            System.out.println(isEmpty);

            name.remove(6);
            Collections.sort(name);
            System.out.println(name);
            Collections.shuffle(name);
            System.out.println(name);


        }


    public static void main(String[] args) {
      ListPractice obj = new ListPractice();
      obj.ArraylistDemo();
    }
}
