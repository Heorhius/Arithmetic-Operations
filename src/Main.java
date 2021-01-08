public class Main {

    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println("11/2= " + mathOperations.divideWithIntResult(11,2));
        System.out.println("-10/5= " + mathOperations.divideWithIntResult(-10,5));
        System.out.println("-8/-3= " + mathOperations.divideWithIntResult(-8,-3));

        System.out.println("8/3= " + mathOperations.divideWithDoubleResult(8,3));
        System.out.println("-9/3= " + mathOperations.divideWithDoubleResult(-9,3));
        System.out.println("7/-2= " + mathOperations.divideWithDoubleResult(7,-2));

        System.out.println("12/3= " + mathOperations.getRemainderOfDivision(12, 3));
        System.out.println("-15/4= " + mathOperations.getRemainderOfDivision(-15, 4));
        System.out.println("10/-3= " + mathOperations.getRemainderOfDivision(10, -3));
    }


}
