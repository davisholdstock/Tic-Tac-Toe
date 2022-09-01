import java.util.Scanner;

public class UserChoice {
    public static Scanner keyboard = new Scanner(System.in);
    static String sc;

    
    public UserChoice(){

    }

    public void Choice(){
        System.out.println("Where do you want to play?");
            sc = keyboard.nextLine();
            if (sc.toLowerCase().equals("top left")){
                if (Main.gameBoard[0][0] == 0)                
                    Main.gameBoard[0][0] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("top center")){
                if (Main.gameBoard[0][1] == 0)
                    Main.gameBoard[0][1] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("top right")){
                if (Main.gameBoard[0][2] == 0)
                    Main.gameBoard[0][2] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("middle left")){
                if (Main.gameBoard[1][0] == 0)
                    Main.gameBoard[1][0] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("middle center")){
                if (Main.gameBoard[1][1] == 0)
                    Main.gameBoard[1][1] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("middle right")){
                if (Main.gameBoard[1][2] == 0)
                    Main.gameBoard[1][2] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("bottom left")){
                if (Main.gameBoard[2][0] == 0)
                    Main.gameBoard[2][0] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("bottom center")){
                if (Main.gameBoard[2][1] == 0)
                    Main.gameBoard[2][1] = 1;
                else
                    Choice();
            }else if (sc.toLowerCase().equals("bottom right")){
                if (Main.gameBoard[2][2] == 0)
                    Main.gameBoard[2][2] = 1;
                else
                    Choice();
            }else{
                System.out.println("Possible combinations -" +
                                "\n top left" +
                                "\n top center" +
                                "\n top right" +
                                "\n middle left" +
                                "\n middle center" +
                                "\n middle right" +
                                "\n bottom left" +
                                "\n bottom center" +
                                "\n bottom right");
            }
    }
}
