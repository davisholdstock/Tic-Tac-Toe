public class Winner {
    int win = 0, youX, youY;
    
    public Winner(){

    }

    public int HasWon(){
        if (Main.gameBoard[0][0] == Main.gameBoard[0][1] && Main.gameBoard[0][1] == Main.gameBoard[0][2])
            return Main.gameBoard[0][0];
        if (Main.gameBoard[1][0] == Main.gameBoard[1][1] && Main.gameBoard[1][1] == Main.gameBoard[1][2])
            return Main.gameBoard[1][0];
        if (Main.gameBoard[2][0] == Main.gameBoard[2][1] && Main.gameBoard[2][1] == Main.gameBoard[2][2])
            return Main.gameBoard[2][0];
        if (Main.gameBoard[0][0] == Main.gameBoard[1][0] && Main.gameBoard[1][0] == Main.gameBoard[2][0])
            return Main.gameBoard[0][0];
        if (Main.gameBoard[0][1] == Main.gameBoard[1][1] && Main.gameBoard[1][1] == Main.gameBoard[2][1])
            return Main.gameBoard[0][1];
        if (Main.gameBoard[0][2] == Main.gameBoard[1][2] && Main.gameBoard[1][2] == Main.gameBoard[2][2])
            return Main.gameBoard[0][2];
        if (Main.gameBoard[0][0] == Main.gameBoard[1][1] && Main.gameBoard[1][1] == Main.gameBoard[2][2])
            return Main.gameBoard[0][0];
        if (Main.gameBoard[2][0] == Main.gameBoard[1][1] && Main.gameBoard[1][1] == Main.gameBoard[0][2])
            return Main.gameBoard[2][0];
        else 
            return 0;
    }

    
}
