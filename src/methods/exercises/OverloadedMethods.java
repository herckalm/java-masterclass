package methods.exercises;

public class OverloadedMethods {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(0, 68));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        return convertToCentimeters(totalInches);
    }
}

