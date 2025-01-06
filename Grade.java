import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Avg marks ");
        int avg = sc.nextInt();
        if (avg >= 90) {
            System.out.println("Grade A+");
        } 
        else if (avg >= 80) {
            System.out.println("Grade A");
        }
        else if (avg >= 70) {
            System.out.println("Grade B+");
            }
        else if (avg >= 60){
            System.out.println("Grade B");
        }
        else if (avg >= 50){
            System.out.println("Grade C");
        }
        else if (avg >= 40){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Grade F");
            }
    }
}