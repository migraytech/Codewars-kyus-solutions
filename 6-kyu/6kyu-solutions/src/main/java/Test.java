public class Test {

    public static void main(String[] args) {
        String test = "0+1+2+3+4+5+6 = 21";

        System.out.print(showSequence(6)+"\n"+(test));
    }

    public static String showSequence(int value){

        if(value <= 0)
            return  String.format("%d"+"=0",value);;
        if(value < 0)
            return  String.format("%d"+"<0",value);
        int count = 0;
        String test = "";
        for(int i =0; i <= value; i++){

            if(i == value){
                count +=i;
                test = test + String.valueOf(i)+" = ";
                break;
            }
            count +=i;
            test = test + String.valueOf(i)+"+";

        }
        return test+String.valueOf(count).trim();
    }



}
