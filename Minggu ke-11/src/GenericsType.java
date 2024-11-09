public class GenericsType<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid
        String str = (String) type.get();
        System.out.println(str);
        GenericsType type1 = new GenericsType(); //raw type
        type1.set("Java"); //valid
        type1.set(10); //valid and autoboxing support
        Integer inte = (Integer) type1.get();
        System.out.println(inte);
    }
}
