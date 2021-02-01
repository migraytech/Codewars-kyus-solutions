public class TicTacToeGenerator {
    public static void main(String[] args) {

        char [] board = new char[]{'O', 'X', 'X', 'O'};
        int width = 2;
        System.out.print(displayBoard(board,width));
    }


     public static String displayBoard(final char[] board, int width) {
         StringBuilder displayBoard = new StringBuilder();
         String element = "";
         for (int i = 0; i <board.length ; i++) {

             if (i == width) {
                 for (int j = 0; j < width ; j++) {
                     if (j != width-1) {
                         element = String.valueOf((board[j + width * i]));
                         displayBoard.append(String.format("%s |", element));
                     }
                     else if( j == width-1) {
                         element = String.valueOf((board[j + width * i]));
                         displayBoard.append(String.format("%s ", element));
                     }
                 }
             }
             else  {
                 displayBoard.append(String.format("\n {0} \n",(width * 4 - 1)));
                 for (int j =0;  j< width; j++) {
                     if (j != width - 1) {
                         element = String.valueOf((board[j + width * i]));
                         displayBoard.append(String.format("%s |", element));
                     }
                     else if (j == width - 1)
                         element = String.valueOf((board[j + width * i]));
                     displayBoard.append(String.format("%s ", element));
                 }

             }

         }
         return displayBoard.toString(); //your code here
     }



}
