public class TypeCastingExample {
    public static void main(String[] args) {

        double num1 = 9.78;

        int castedInt = (int) num1;
        System.out.println("Double to Int: " + castedInt);

        int num2 = 50;
        double castedDouble = num2;

        System.out.println("Int to Double: " + castedDouble);
    }
}
