package myJavaPackage.loops;

public class LoopPractice {

    static void loopIntro(){
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        int a = 2; // initialization

        while(a<=100){  // condition


            System.out.println("We are learning Java");


            a++;// a+1 // increment
        }



    }

    static void loopIntro2(){
        int a = 100;
        while (a>=1){
            System.out.println("The value of a is " + a);
            a--;
        }

    }

// create a loop from 50 -70 and print "Hello


    // between 1-100-- please determine which number is even and which is odd

    static void evenOdd(){
        int a = 1;
        while (a<=100){
            if(a%2==0){
                System.out.println(a + " is a even number");
            }
            else {
                System.out.println( a + " is a odd number");
            }
            a++;// a==2, a==3, a==4, a==5
        }


    }


    public static void main(String[] args) {

    // loopIntro();
        loopIntro2();

    }




}
