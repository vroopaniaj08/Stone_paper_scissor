import java.util.Random;
import java.util.Scanner;
public class Stone_paper_scissor {
    public static void main(String[] args) {
        System.out.println("Rock : 0\nPaper : 1\nScissor : 2");
        System.out.println("Enter your move , According to their number given above:-");
        int computer = 0,player = 0;
        Random rps = new Random();
        Scanner er = new Scanner(System.in);
        for (int i=0;i<10;i++) {
            int number = rps.nextInt(3);
            System.out.print("player's value:");
            int turn = er.nextInt();
            System.out.printf("computer value :%d\n",number);
            if(number == 0 && turn == 1){
                System.out.print("player:");
                System.out.println(++player);
                System.out.printf("computer:%d\n",computer);
            }
            else if (number == 0 && turn == 2){
                System.out.printf("player:%d\n",player);
                System.out.printf("computer:%d\n",++computer);
            }
            else if (number == 1 && turn == 0){
                System.out.printf("player:%d\n",player);
                System.out.printf("computer:%d\n",++computer);
            }
            else if (number == 1 && turn == 2){
                System.out.printf("player:%d\n",++player);
                System.out.printf("computer:%d\n",computer);
            }
            else if (number == 2 && turn == 0){
                System.out.printf("player:%d\n",++player);
                System.out.printf("computer:%d\n",computer);
            }
            else if (number == 2 && turn == 1){
                System.out.printf("player:%d\n",player);
                System.out.printf("computer:%d\n",++computer);
            }
            else {
                System.out.printf("player:%d\n",++player);
                System.out.printf("computer:%d\n",++computer);
            }
        }
        if(player > computer){
            System.out.println("Player won , Computer lose");
        }
        else if(player < computer){
            System.out.println("Player lose , Computer won");
        }
        else {
            System.out.println("Match Tied.");
        }
    }
}
