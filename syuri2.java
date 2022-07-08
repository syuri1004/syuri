import java.util.Random;
import java.util.Scanner;

 public class syuri2{
     public static void main(String[] args){
        int i,num,heads=0,tails=0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        for(i = 0;i<3;i++){
            num = rand.nextInt(10);
            if(num%2 == 0){
                System.out.println((i+1)+ " head");
                heads++;
            }else{
                System.out.println((i+1)+ " tail");
                tails++;
            }
        }
        System.out.println("Head "+heads+ " Tail "+tails);
        System.out.println("Who are you");
        System.out.print(">");
        String name = sc.nextLine();
        System.out.println("Hello, "+name);
     }
 }
