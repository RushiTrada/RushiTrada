public class Rushi {
    public static void main(String args[]) {
        int i = 0,num = 1;
        int n = 5;
        while (i < n) {
            int j = 0;
            while (j <= i) {
                System.out.print(num + " ");
                num +=1;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}