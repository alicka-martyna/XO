package studia;

import java.io.IOException;

interface Main {
    char[][] board = new char[3][3];

    public static void clearConsole() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
    public static void printBoard ()
    {
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("_________");
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("_________");
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }
    public static void main(String[] args){

        int positionX=0;
        int positionY=0;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++) {
                board[j][i] = ' ';
            }
        }
        board[positionX][positionY] = 219;


        System.out.println("Tic tak toe");

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        clearConsole();
        printBoard();




    }
}