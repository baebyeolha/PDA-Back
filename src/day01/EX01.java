import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  score = sc.nextInt();

        if(score>=90){
            System.out.println ("A");
        }
        else if(score >=80){
            System.out.println ("B");
        }
        else{
            System.out.println ("C");
        }

    }

}
