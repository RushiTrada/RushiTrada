public class Swap {
    public static void main(String[] args) {
      
            System.out.println("Please provide two numbers as command line arguments.");
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        System.out.println("Original numbers: num1=" + num1 + ", num2=" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping: num1=" + num1 + ", num2=" + num2);
    }
}