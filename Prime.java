import java.util.Scanner;

public class Prime {

    public static void primeNum(int a){
        int x =0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                x++;
            }
        }
        if(x>2){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        obj.primeNum(num);
    }
    
}




