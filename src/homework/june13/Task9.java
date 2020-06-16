package homework.june13;

//9) Convert a int to a String and make some operations (Same for other primitive types).
public class Task9 {

    public static void main(String[] args) {

        int intVar = 1;
        String aStr = String.valueOf(intVar);
        System.out.println(aStr + aStr);

        byte byteVar = 2;
        String byteVarStr = String.valueOf(byteVar);
        System.out.println(byteVarStr + byteVarStr);

        short shortVar = 3;
        String shortVarStr = String.valueOf(shortVar);
        System.out.println(shortVarStr + shortVarStr);

        double doubleVar = 4.4;
        String doubleVarStr = String.valueOf(doubleVar);
        System.out.println(doubleVarStr + doubleVarStr);

        long longVar = 5L;
        String longVarStr = String.valueOf(longVar);
        System.out.println(longVarStr + longVarStr);

        float floatVar= 6.6f;
        String floatVarStr = String.valueOf(floatVar);
        System.out.println(floatVarStr + floatVarStr);

        boolean booleanVar = false;
        String booleanVarStr = String.valueOf(booleanVar);
        System.out.println(booleanVarStr + booleanVarStr);

        char charVar = 'A';
        String charVarStr = String.valueOf(charVar);
        System.out.println(charVarStr + charVarStr);
    }
}
