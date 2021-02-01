public class BouncingBall {
    public static void main(String[] args) {

        double h =30.0;
        double bounce = 0.66;
        double window = 1.5;
        System.out.print(bouncingBall(h,bounce,window));

    }

    public static int bouncingBall(double h, double bounce, double window) {

        if(h < 0 || bounce < 0  || bounce> h || window >h)
            return -1;

        double solution = (h /window) * bounce +2;
        int value = (int) Math.round(solution);

        return value ;
    }
}
