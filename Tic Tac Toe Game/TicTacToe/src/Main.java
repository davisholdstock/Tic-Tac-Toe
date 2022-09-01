import java.util.Scanner;

public class Main {
    public static int[][] gameBoard = new int[3][3];
    static PrintBoard printBoard = new PrintBoard();
    static ComputerMove computerMove = new ComputerMove();
    static UserChoice userChoice = new UserChoice();
    static Winner winner = new Winner();
    public static Scanner keyboard = new Scanner(System.in);
    static String sc;
    static int r, c, loops = 0, turns = 9;

    public static void main(String[] args) throws Exception {
        System.out.println("Do you want to go first (y/n)");
        sc = keyboard.next();
        if (sc.toLowerCase().equals("y")){
            turns++;
            loops++;
        }
        System.out.println("Possible combinations -" +
                        "\n top left" +
                        "\n top center" +
                        "\n top right" +
                        "\n middle left" +
                        "\n middle center" +
                        "\n middle right" +
                        "\n bottom left" +
                        "\n bottom center" +
                        "\n bottom right \n");
        while (loops < turns){
            if(loops % 2 == 1)
                userChoice.Choice();
            else
                computerMove.Move();

            printBoard.print();
            loops++;
            if (loops > 4){
                if (winner.HasWon() == 1){
                    System.out.println("You have won");
                    return;
                }else if (winner.HasWon() == -1){
                    System.out.println("You have lost");
                    return;
                }
            }
        }
        System.out.print("It is a tie");
    }
}
