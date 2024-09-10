import java.util.Scanner;

public class operator2 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number");
//        int number = sc.nextInt();

//        if(number>0)  {
//            System.out.println("number is poisitive");
//
//
//        } else if (number<0) {
//            System.out.println("number is negavtive");
//
//        }
//        else {
//            System.out.println("number is zero ");
        //Program 2

        int  n1,n2,n3;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1");
        n1 = sc.nextInt();

        System.out.println("enter the number 2");
        n2 = sc.nextInt();

        System.out.println("enter the number 3");
        n3 = sc.nextInt();

        if (n1>n2 && n1>n3)
            System.out.println("the greatest:"+n1);
        if (n2>n1 && n2>n3)
            System.out.println("the greatest:"+n2);
        if (n3>n2 && n3>n1)
            System.out.println("the greatest:"+n3);
//      programe 3

//        int day;
//        System.out.println("enter your number");
//        scanner sc = new scanner (system.in);
//        day = sc.nextInt();
//        switch (day){
//
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thrusday");
//                break;
//            case 5:
//                System.out.println("friday");
//                break;
//            case 6:
//                System.out.println("saturday");
//                break;
//            case 7:
//                System.out.println("sunday");
//                break;
//            default:
//                System.out.println("invalid input");
//    programe 4

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter month");
//        int month= sc.nextInt();
//
//        if (month==1) {
//            System.out.println("31");
//        } else if (month==2) {
//            System.out.println("28/29");
//        } else if (month==3) {
//            System.out.println("31");
//        } else if (month==4) {
//            System.out.println("30");
//        } else if (month==5) {
//            System.out.println("31");
//        } else if (month==6) {
//            System.out.println("30");
//        } else if (month==7) {
//            System.out.println("31");
//        } else if (month==8) {
//            System.out.println("31");
//        } else if (month==9) {
//            System.out.println("30");
//        } else if (month==10) {
//            System.out.println("31");
//        } else if (month==11) {
//            System.out.println("30");
//        } else if (month==12) {
//            System.out.println("31");
//        }
        //Program 5

//       Scanner sc = new Scanner(System.in);
//      System.out.println("Input a character:");
//       String str=sc.next();
//       char ch=str.charAt(0);
//        if (ch=='e' || ch=='a' ||ch=='i' || ch=='o' || ch=='u'){
//            System.out.println("this is a vowel ");
//
//        }
//        else {
//            System.out.println("this is a constant");
//        }
//        // Program 6
//        while(true) {
//            System.out.println("enter the year");
//           Scanner st = new Scanner(System.in);
//            int year = st.nextInt();if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println("this is a leap year");
//            } else {
//                System.out.println("this is not leap year");
//            }
//        }
//        Program 7
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//
//        if (number % 5 == 0 && number % 11 == 0) {
//            System.out.println(number + "is divisible by both 5 and 11.");
//        } else {
//            System.out.println(number +"is not divisible by both 5 and
//        11");
//        }

    }
}


