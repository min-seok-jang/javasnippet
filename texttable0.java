import java.io.*;
import java.util.Scanner;

public class texttable {

    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 문자열 입력 받기
        System.out.print("문자를 입력하세요: ");
        String input = scanner.nextLine();

        // 입력 받은 문자열 출력
        System.out.println("입력된 문자열: " + input);

        // Scanner 객체 닫기
        scanner.close();


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


