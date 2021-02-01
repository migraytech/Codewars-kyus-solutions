public class Multiples {

    public static void main(String[] args) {

        int value = 20;
        //System.out.print(solution(value));
        System.out.print(10 %3);


    }

    public static int solution(int number) {

        // op sommen onder het getal van 10
        // multiples  x =5 , y = 3
        int y = 3;
        int x = 5;
        int solution = 0;
        if( number < 0) {
            return 0;
        }
        else{

            for( int i = 0; i < number; i++) {
                 int sumY = (i*y);
                 int sumX = (i*x);

                if(i %3 == 0 || i  %5 == 0)  //check the number is divisible by 3 or 5
                {
                    solution += i;

                }
            }
        }

        return solution;
    }

}
