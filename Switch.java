import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    System.out.println("1:January");
    System.out.println("2:February");
    System.out.println("3:March");
    System.out.println("4:April");
    System.out.println("5:May");
    System.out.println("6:June");
    System.out.println("7:July");
    System.out.println("8:August");
    System.out.println("9:September");
    System.out.println("10:October");
    System.out.println("11:November");
    System.out.println("12:December");
    System.out.println("Enter a number");
    int x = sc.nextInt();
    switch (x) {
        case 1:
            System.out.println("January");
            System.out.println("January has 31 Days");
            break;
        case 2:
            System.out.println("February");
            System.out.println("February has 28 Days");
            break;
        case 3:
            System.out.println("March");
            System.out.println("March has 31 Days");
            break;
        case 4:
            System.out.println("April");
            System.out.println("April has 30 Days");
            break;
        case 5:
            System.out.println("May");
            System.out.println("May has 31 Days");
            break;
        case 6:
            System.out.println("June");
            System.out.println("June has 30 Days");
            break;
        case 7:
            System.out.println("July");
            System.out.println("July has 31 Days");
            break;
        case 8:
            System.out.println("August");
            System.out.println("August has 31 Days");
            break;
        case 9:
            System.out.println("September");
            System.out.println("September has 30 Days");
            break;
        case 10:
            System.out.println("October");
            System.out.println("October has 31 Days");
            break;
        case 11:
            System.out.println("November");
            System.out.println("November has 30 Days");
            break;
        case 12:
            System.out.println("December");
            System.out.println("December has 31 Days");
            break;
            
        }

    }
}