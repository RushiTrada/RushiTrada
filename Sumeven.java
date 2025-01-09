public class Sumeven{
    public static void main(String[] args) {
        int n=0;
        int sume=0;
        do{
            if(n%2==0)
            sume=sume+n;
            n++;

            }while(n<=50);
            System.out.println("1 to 50 even numbers sum is "+sume);
        }
}