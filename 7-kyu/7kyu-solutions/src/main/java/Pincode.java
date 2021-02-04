public class Pincode {

    public static void main(String[] args) {


        String pincode = "090909";
        String pincode2 = "123456";
        String pincode3 = ".234";
        String pincode4 = "a.234";
                                                                                                                                                       ";



        System.out.print(validatePin());

    }



    public static boolean validatePin(String pin) {

        String newvalue = pin.trim().replaceAll("l", "");
        int valideLength = 4;
        int valideLength2 = 6;
        if (newvalue.length() == valideLength ||  newvalue.length() == valideLength2 ) {
            return newvalue.trim().matches("[0-9]+");
        }


        return false;

    }
}
