package com.knoldus.kup.CoreJava.Question22;
import com.knoldus.kup.CoreJava.Main;
import java.util.Scanner;
public class DigitCheck {
        //    sumDoubleEven() will return the integer after double the value by multiplying with 2.
        public static int sumDoubleEven(long checkNum) {
            int sum = 0;
            String num = checkNum + "";
            for (int i = num.length() - 2; i >= 0; i -= 2) {
                sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
            }
            return sum;
        }

        public static int getDigit(int checkNum) {
            if (checkNum < 9)
                return checkNum;
            return checkNum / 10 + checkNum % 10;
        }

        public static int sumodd(long checkNum) {
            int sum = 0;
            String num = checkNum + "";
            for (int i = num.length() - 1; i >= 0; i -= 2)
                sum += Integer.parseInt(num.charAt(i) + "");
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Main.print("Please! Enter digits");
            String in = scanner.next();
            long num = Long.parseLong(in);
            Main.print(sumDoubleEven(num) + sumodd(num));
            if((sumDoubleEven(num) + sumodd(num)) % 10==0){
                Main.print("Okay");
            }else {
                Main.print("Not Okay");
            }
            System.out.println();

        }

    }
//OUTPUT
/*Please! Enter digits
        *4012888888881881
        *90
        *Okay */