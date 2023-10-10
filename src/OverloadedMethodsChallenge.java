public class OverloadedMethodsChallenge {

    public static void main(String[] args) {
        double test1 = convertToCentimeters(5, 6);
        double test2 = convertToCentimeters(2, 0);
        double test3 = convertToCentimeters(0, 1);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
    }

    public static double convertToCentimeters(int feet, int inches) {
        //converts feet and inches to centimeters
         return convertToCentimeters(feet * 12 + inches);
    }

    public static double convertToCentimeters(int inches) {
    //converts inches to centimeters
        return inches * 2.54;

    }

}
