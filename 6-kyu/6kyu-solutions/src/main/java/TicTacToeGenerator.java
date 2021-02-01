public class TicTacToeGenerator {
    public static void main(String[] args) {

        char [] board = new char[]{'O', 'X', 'X', 'O'};
        int width = 2;
        System.out.print(displayBoard(board,width));
    }


     public static String displayBoard(final char[] board, int width) {
         StringBuilder displayboard = new StringBuilder();
         int count = 0;
         String element = "";
         for (int i = 0; i <board.length ; i++) {
             
             if (count == width) {
                 element = String.valueOf((board[i]));
                 displayboard.deleteCharAt(width+1);
                 displayboard.append(String.format("%n%s |", element));
                 count = 0;
             }

             else if (count < width) {
                 element =   String.valueOf(board[i]);
                 displayboard.append(String.format("%1$1"+"s |",element));
                 count++;
             }

             if(i == board.length-1)
                 displayboard.deleteCharAt(displayboard.length()-1);
         }
         return displayboard.toString(); //your code here
     }
}
