package Practice;
import java.util.Scanner;

class Guesser{
    int numByGuesser;
    public int byGuesser(){
        System.out.println("Guesser insert a Number : ");
        Scanner scan = new Scanner(System.in);
        numByGuesser = scan.nextInt();
        return numByGuesser;
    }
}
class Player{
    int numByPlayer;
    public int byPlayer(){
        System.out.println("Player insert your Number : ");
        Scanner scan = new Scanner(System.in);
        numByPlayer=scan.nextInt();
        return numByPlayer;
    }

}
class Umpire{
    int guesserNum;
    int numByPlayer1;
    int numByPlayer2;
    int numByPlayer3;

    public void collectNumByGuesser(){
        Guesser g = new Guesser();
        guesserNum = g.byGuesser();
    }

    public void collectNumByPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numByPlayer1 = p1.byPlayer();
        numByPlayer2 = p2.byPlayer();
        numByPlayer3 = p3.byPlayer();
    }

    void compare(){
        if(guesserNum==numByPlayer1){
            if(guesserNum==numByPlayer2 && guesserNum==numByPlayer3){
                System.out.println("Game tied all three guessed correct");
            }
            else if (guesserNum==numByPlayer2){
                System.out.println("Player 1 and Player 2 Guessed Correct");
            }
            else if (guesserNum==numByPlayer3){
                System.out.println("Player 1 and Player 3 Guessed Correct");
            }
            else {
                System.out.println("Player 1 won the game");
            }
        }
        else if (guesserNum==numByPlayer2){
            if(guesserNum==numByPlayer3){
                System.out.println("Player 2 and Player Gussed Correct");
            }
            else {
                System.out.println("Player 2 won the Game");
            }
        }
        else if (guesserNum==numByPlayer3){
            System.out.println("Player 3 won the Game");
        }
        else {
            System.out.println("No One Guessed Corrrectly");
        }
    }

}

public class Game {
    public static void main(String[] args) {
        
        Umpire u = new Umpire();
        u.collectNumByGuesser();
        u.collectNumByPlayer();
        u.compare();
    }
}
