import java.util.Arrays;

public class PathFinder {




    public static void main(String[] args) {
        String a = ".W.\n"+
                ".W.\n"+
                "...";
        //System.out.println(a);
        System.out.println(pathFinder(a));
    }



// You are at position [0, 0] in maze NxN and you can only move in one of the four cardinal directions (i.e. North, East, South, West).
// Return true if you can reach position [N-1, N-1] or false otherwise.

    public static boolean pathFinder(String maze) {
        char wall = 'W'; //Walls are marked
        char line = '\n';
        char dot = '.';  //Empty positions are marked

        String Wall = "W";  //Walls are marked
        String Dot = ".";  //Empty positions are marked
        String Lines = "\n";

        int x = 0,y = 0;

        // start position [0,0]
        // count the position
        char [] lines =  maze.trim().toCharArray();
        String [] path =  maze.trim().split("");
        //check and split three lines
        for(int i = 0; 9 >lines.length; i++){
            //If the latest wall is a wall
           if(lines[lines.length-1] == wall) {
               return false;
               // count the position
               // start position [0,0]
               // count the position
               // start position [0,0]
           }
        }

        return true;
    }


}
