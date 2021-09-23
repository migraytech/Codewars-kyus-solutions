public class Pincode {

    public static void main(String[] args) {
        
    }



    public static boolean validatePin(String pin) {

        String newvalue = pin.trim();
        int valideLength = 4;
        int valideLength2 = 6;

        if(pin.contains("\n"))
            return false;
        if (newvalue.length() == valideLength ||  newvalue.length() == valideLength2 ) {
            return newvalue.trim().matches("[0-9]+");
        }

        return false;

    }
}
