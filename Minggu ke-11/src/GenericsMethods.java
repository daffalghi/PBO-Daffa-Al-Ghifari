public class GenericsMethods {

    //Java Generic Method
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        GenericsType<Integer> g3 = new GenericsType<>();
        g3.set(1);
        GenericsType<Integer> g4 = new GenericsType<>();
        g4.set(2);

        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        boolean isEqualint = GenericsMethods.<Integer>isEqual(g3, g4);
        //above statement can be written simply as
        isEqual = GenericsMethods.isEqual(g1, g2);
        isEqualint = GenericsMethods.isEqual(g3, g4)    ;

        System.out.println(isEqual);
        System.out.println(isEqualint);
        /*This feature, known as type inference, allows you to invoke
        a generic method as an ordinary method, without specifying a type
        between angle brackets */
        //Compiler will infer the type that is needed
    }
}