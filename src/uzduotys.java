import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;

public class uzduotys {

    public static void main(String[] args) {


//    String name = "Povilas";
//    String surname = "Slivinskas";
//   int age = 1992;
//   int year = 2022;
//
//    System.out.println("As esu " + name + " " + surname);
//    System.out.println("Man yra" + " " + (year - age) +  " " + "metu");
//
//    System.out.println( Math.round( Math.random() * 10 ) );
//    int min = 0; int max = 4;
//    System.out.println(min + (int)
//            (Math.random() * (max - min + 1)));
//
//
//
//int num1 = 1;
//int num2 = 4;
//
//
//    if(num1 > num2) {
//
//        System.out.println(num1 + " yra didesnis uz " + num2);
//        double notRounded = (double) num1 / num2;
//        System.out.println(notRounded);
//        System.out.println(Math.round(notRounded * 100) / 100);
//
//    }else{
//        System.out.println(num1  + " yra mazesnis uz " + num2);
//        double notRounded = (double) num2 / num1;
//        System.out.println(  (double) Math.round(notRounded * 100) / 100);
//
//    }
//
//
////    OOOOOOOOOOO 3 uzd0000000000
//
//
//    int num1 = (int) Math.round(Math.random() * 25 );
//    int num2 = (int) Math.round(Math.random() * 25 );
//    int num3 = (int) Math.round(Math.random() * 25 );
//
//
//    System.out.println(num1 + " " + num2 + " " + num3);
//
//    if ((num1 > num2 && num1 < num3)
//    {
//        System.out.println(num1 + "yra vidutine reiksme");
//
//
//
//    }
//        int min = 0;
//        int max = 4;
//
//        int num1 = (int) (Math.round(Math.random() * 4));
//        int num2 = (int) (Math.round(Math.random() * 4));
//
//        System.out.println(num1);
//        System.out.println(num2);
//
//        if ((num1 != 0) && (num2 != 0)) {
//            if (num1 > num2) {
//                System.out.println(Math.round (num1 / num2) * 100.0) / 100.0;
//            } else {
//                System.out.println(Math.round (num2 / num1 * 100.0) / 100.0;
//            }
//        } else {
//            System.out.println("dalyba is nulio negalima");
//        }

//        System.out.println(Math.round(16.348 * 100.0) / 100.0);


//// 3
//
//
//
//        int number1 = (int) (Math.random() * 25);//17
//        int number2 = (int) (Math.random() * 25);//20
//        int number3 = (int) (Math.random() * 25);//15
////
////
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
////
//        if ((number1 > number2 && number1 < number3) || (number1 < number2 && number1 > number3)) {
//            System.out.println(number1 + " yra vidutine reiksme");
//
//        }if ((number2 > number1 && number2 < number3) || (number2 < number1 && number2 > number3)) {
//            System.out.println(number2 + " yra vidutine reiksme");
//
//        }if ((number3 > number1 && number3 < number2) || (number3 < number2 && number3 > number1)) {
//            System.out.println(number3 + " yra vidutine reiksme");
//    }
// 4
//
//
//    int min = 1;
//    int max = 10;
//
//    int number1 = (int) (Math.random() * (max - min + 1));
//    int number2 = (int) (Math.random() * (max - min + 1));
//    int number3 = (int) (Math.random() * (max - min + 1));
//
////    1.a + b > c
////2.a + c > b
////3.b + c > a
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//
//    if (number1 + number2 > number3 ){
//    System.out.println("Pirma Trikampi galima padaryti");}
//
//    if (number1 + number3 > number2 ){
//    System.out.println("Antra Trikampi galima padaryti");}
//
//    if (number2 + number3 > number1 ){
//    System.out.println("Trecia Trikampi galima padaryti");}

////// 5
//        int num1 = (int) (Math.round(Math.random() * 2));
//        int num2 = (int) (Math.round(Math.random() * 2));
//        int num3 = (int) (Math.round(Math.random() * 2));
//        int num4 = (int) (Math.round(Math.random() * 2));
//
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//
//        if (num1 == 0) {
//            zeros++;
//        }
//        if (num2 == 0) {
//            zeros++;
//        }
//        if (num3 == 0) {
//            zeros++;
//        }
//        if (num4 == 0) {
//            zeros++;
//
//        }
//        if (num1 == 1) {
//            ones++;
//        }
//        if (num2 == 1) {
//            ones++;
//        }
//        if (num3 == 1) {
//            ones++;
//        }
//        if (num4 == 1) {
//            ones++;
//        }
//
//        if (num1 == 2) {
//            twos++;
//        }
//        if (num2 == 2) {
//            twos++;
//        }
//        if (num3 == 2) {
//            twos++;
//        }
//        if (num4 == 2) {
//            twos++;
//        }
//
//        System.out.println("Nuliu yra " + zeros + " " + "Vienetu yra " + ones  + " " + "Dvejetu yra " + twos);
//
//////////////// 6

//        int nr1 = (int) Math.round(Math.random() * 20 - 10);
//        int nr2 = (int) Math.round(Math.random() * 20 - 10);
//        int nr3 = (int) Math.round(Math.random() * 20 - 10);
//        System.out.println(nr1);
//        System.out.println(nr2);
//        System.out.println(nr3);
//        if (nr1 == 0) {
//            System.out.println("(" + nr1 + ")");
//        }
//        if (nr2 == 0) {
//            System.out.println("(" + nr2 + ")");
//        }
//        if (nr3 == 0) {
//            System.out.println("(" + nr3 + ")");
//        }
//if (nr1 > 0){
//    System.out.println("{" + nr1 + "}");
//}if (nr2 > 0){
//    System.out.println("{" + nr2 + "}");
//}if (nr3 > 0){
//    System.out.println("{" + nr3 + "}");
//}
//
//        if (nr1 < 0){
//            System.out.println("[" + nr1 + "]");
//        }if (nr2 < 0){
//            System.out.println("[" + nr2 + "]");
//        }if (nr3 < 0){
//            System.out.println("[" + nr3 + "]");
//        }

////////////7

//        int candles = (int) Math.round(Math.random() * (3000 - 5) + 5); //0.99* 3000 =
//        System.out.println("Zvakiu kiekis " + candles);
//        int candlePrice = 1;
//
//        if (candles <= 1000) {
//            System.out.println("Zvakiu kaina " + candles);
//        }
//
//        if (candles > 1000) {
//            System.out.println(candles * 0.97);
//        }
//
//        if (candles > 2000) {
//            System.out.println(candles * 0.96);
//
//        }

        /////////////////8

//        int number1 = (int) (Math.random() * 100);
//        int number2 = (int) (Math.random() * 100);
//        int number3 = (int) (Math.random() * 100);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//
//        int Vidurkis = (number1 + number2 + number3) / 3;
//        System.out.println("Vidurkis yra " + Vidurkis);
//
//        if (number1 < 10) {
//            Vidurkis = (number2 + number3) / 2;
//            System.out.println("Vidurkis be <10 yra " + Vidurkis);
//        }
//        if (number2 < 10) {
//            Vidurkis = (number1 + number3) / 2;
//            System.out.println("Vidurkis be <10 yra " + Vidurkis);
//        }
//        if (number3 < 10) {
//            Vidurkis = (number1 + number2) / 2;
//            System.out.println("Vidurkis be <10 yra " + Vidurkis);
//        }
//
//        if (number1 > 90) {
//            Vidurkis = (number2 + number3) / 2;
//            System.out.println("Vidurkis be >90 yra " + Vidurkis);
//        }
//        if (number2 > 90) {
//            Vidurkis = (number1 + number3) / 2;
//            System.out.println("Vidurkis be >90 yra " + Vidurkis);
//        }
//        if (number3 > 90) {
//            Vidurkis = (number1 + number2) / 2;
//            System.out.println("Vidurkis be >90 yra " + Vidurkis);
//        }


        ///////////////9

    //    git config --global user.name "pslivinskas"
     //   git config --global user.email "povilaslsivinskas@gmail.com"











    }


}


