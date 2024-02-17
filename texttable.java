import java.io.*;
import java.util.Scanner;

public class texttable {

    public static void main(String[] args) {

        int i, j;

        for(i = 1; i <= 10; i++) {
            
            for(j = 1; j <= i; j++) {

         	System.out.print("*");

            }

         	System.out.println(" " + i);

        }

        for(i = 10; i >= 1; i--) {
            
            for(j = 1; j <= i; j++) {

         	System.out.print("*");

            }

         	System.out.println(" " + (11 - i));

        }	

        for(i = 10; i >= 1; i--) {
            
            for(j = 1; j <= 10 - i; j++) {

                System.out.print(" ");

            }

            for(j = 1; j <= i; j++) {

         	System.out.print("*");

            }

         	System.out.println(" " + (11 - i));

        }	

        for(i = 10; i >= 1; i--) {
            
            for(j = 1; j <= i - 1; j++) {

                System.out.print(" ");

            }

            for(j = 10; j >= i; j--) {

         	System.out.print("*");

            }

         	System.out.println(" " + (11 - i));

        }	

        for(i = 1; i <= 6; i++) {
            
            for(j = 6; j >= i; j--) {

                System.out.print(" ");

            }

            for(j = 1; j <= (i * 2) - 1; j++) {

         	System.out.print("*");

            }

         	System.out.println(" " + i);

        }	

        for(i = 6; i >= 1; i--) {
            
            for(j = 6; j >= i; j--) {

                System.out.print(" ");

            }

            for(j = 1; j <= (i * 2) - 1; j++) {

         	System.out.print("*");

            }

         	System.out.println(" " + (7 - i));

        }	


    }

}


