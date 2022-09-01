public class PrintBoard {

    public PrintBoard(){
    }

    public void print(){
        System.out.println();
        for (int i = 0; i < Main.gameBoard.length; i++){
            for (int j = 0; j < Main.gameBoard[i].length; j++){
                if (Main.gameBoard[i][j] == 1){
                    System.out.print("X ");
                }else if (Main.gameBoard[i][j] == -1){
                    System.out.print("O ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}
