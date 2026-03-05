public class practical1 {
    public static void main(String[] args) {
        byte Byte = 10;
        short Short = 200;
        int Int = 1000;
        long Long = 100000L;
        float Float = 10.5f;
        double Double = 99.99;
        char Char = 'S';
        boolean Boolean = true;

        String String = "Hello Java";
        int[] Array = {10, 20, 30, 40, 50};
        System.out.println("Byte value: " + Byte);
        System.out.println("Short value: " + Short);
        System.out.println("Int value: " + Int);
        System.out.println("Long value: " + Long);
        System.out.println("Float value: " + Float);
        System.out.println("Double value: " + Double);
        System.out.println("Char value: " + Char);
        System.out.println("Boolean value: " + Boolean);
        System.out.println("String value: " + String);
        System.out.print("Array values: ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
