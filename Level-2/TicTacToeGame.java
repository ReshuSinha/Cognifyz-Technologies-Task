import java.util.Scanner;
public class TicTacToeGame{
    public static boolean haveWon(char board[][],char player){
        //Check the rows
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player)
            return true;
        }
        //check the columns
        for(int col=0;col<board.length;col++){
            if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player)
            return true;
        }
        //check for left diagonal
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
            return true;
        }
        //check for right diagonal
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
        }
        return false;
    }
    public static void printBoard(char board[][]){
        //Print the board
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
               System.out.print(board[row][col]+"|");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sn=new Scanner(System.in);
        char board[][]=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                //Initializing board with empty spaces
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+player+" enter your move:");
            int row=sn.nextInt();
            int col=sn.nextInt();
            if(board[row][col]==' '){
                //place the element
                board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won the game.");
                }
                else{
                    player=(player=='X')?'O':'X';
                }
            }
            else{
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }
}
