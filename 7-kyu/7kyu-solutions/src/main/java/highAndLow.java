public class highAndLow {


    public static void main(String[] args) {

        String test =  "8 3 -5 42 -1 0 0 -9 4 7 4 -4";

        System.out.print(highAndLow(test));

    }


    public static String highAndLow(String numbers) {
        // Code here or

        if(numbers == null || numbers.equals("")) return "";

        int lowest = Integer.MIN_VALUE;
        int highest =0;

        String [] arr = numbers.trim().split(" ");


        lowest = Integer.parseInt(arr[0]);
        highest = Integer.parseInt(arr[0]);
        for (String value: arr) {

            if(Integer.parseInt(value) < lowest)
                lowest = Integer.parseInt(value);

            if(Integer.parseInt(value) > highest)
                highest = Integer.parseInt(value);

        }

        String solution = String.valueOf(highest) +" "+String.valueOf(lowest);


        return solution;
    }

}
