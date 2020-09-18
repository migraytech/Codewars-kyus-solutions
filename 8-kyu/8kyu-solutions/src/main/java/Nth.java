public class Nth {


    //array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
    //array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.

    public static void main(String[] args) {

       int array1 [] = new int [] {1,2};
       int array2 [] = new int[] {3,1,2,2};
       int array3 [] = new int[] {3,1,2};
       int result = nthPower(array1,2);
       System.out.println(result);
    }
    public static int nthPower(int[] array, int n) {

        // check length of array bigger is than with n
        // return -1;
         int value = -1;
        //return yourCondition ? "ifTrue" : "ifFalse";
        return  array.length-1 < n ? value : (int) Math.pow(array[n],n);
    }
}
