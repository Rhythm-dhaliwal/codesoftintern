

import java.util.Scanner;

public class task2 {
    public static void main(String args[]) {
        System.out.println("\t\t\t\t\t\tSTUDENT GRADE CALCULATOR");
        System.out.println("ENTER THE NUMBERS OF EACH SUBJECT: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("SCIENCE: ");
        int science = sc.nextInt();
        System.out.print("MATHS: ");
        int maths = sc.nextInt();
        System.out.print("ENGLISH: ");
        int english = sc.nextInt();
        System.out.print("SST: ");
        int sst = sc.nextInt();
        System.out.print("HINDI: ");
        int hindi = sc.nextInt();

        total(maths, sst, science, hindi, english);

        sc.close();
    }

    public static void total(float a, float b, float c, float d, float e) {
        float total = a + b + c + d + e;
        float ave = total / 5;
         System.out.print("TOTAL NUMBERS ARE: " + total + "/500" + "\nAVERAGE PERCENTAGE: " + ave +"%\nGRADE: ");
        if (ave <= 20) {
            System.out.print("E");
        } else if (ave <= 40) {
            System.out.print("D");
        } else if (ave <= 60) {
            System.out.print("C");
        } else if (ave <= 80) {
            System.out.print("B");
        } else {
            System.out.print("A");
        }
       
    }

}
