public class TypeCasting {
    /*
    * that approach is useful when it's necessary to change
    * a static typing of a variable. It can be done to a lower
    * number type to a higher one and so forth.
    * */

    public static void main(String[] args) {
        floatToDouble();
    }

    public static void floatToDouble() {
        float x = 60.9f;
        double y = x;
        System.out.println(y);
        // good-to-know: when casting is done on a number who have a
        // number different than zero on its decimals it might break
        // the output. On the given example its value is 60.900001525878906
    }

    public void invalidCastingExamples() {
        float x = 60.9f;
        boolean isPossible = x;
        String xToString = x;
    }
}
