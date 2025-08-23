package myJavaPackage.loops;

public class LoopPractice {

    // check which number is even or odd between 2-10
    // here some strings, like "java", "Selenium", "C#" "API", "SQL"
    // 2, 4, 5, 7, 8, 10, 13



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

        // print 1-100

    }

    public static void print1_100(){

        int a = 1; // initialize // start

        while(a<=10) {// condition
        // please print value of a
           // System.out.println(a + " times --- Hello Everyone");

            if (a%2 ==0){
                System.out.println(a + " is an even number");
            }

            else if (a%2==1){
                System.out.println(a+ " is an odd number");
            }

        a++;

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
        //loopIntro2();
        print1_100();

    }




}
