public class ComputerMove {
    int x, y;

    public ComputerMove(){
    }

    public void Move(){
        Choice();
        if (Main.gameBoard[x][y] == 0){
            Main.gameBoard[x][y] = -1;
        }else{
            Move();
        }
    }

    public void Choice(){
        x = (int) (Math.random() * Main.gameBoard[0].length);
        y = (int) (Math.random() * Main.gameBoard.length);
    }
}
