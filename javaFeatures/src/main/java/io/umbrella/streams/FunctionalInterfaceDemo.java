package io.umbrella.streams;

@FunctionalInterface
interface MyFunctionalInterface {

    static boolean isEmpty(String string) {
        if (string == null) {
            return true;
        }
        return true;
    }

    String concatString(String[] strings);
    /*  test method can't exist with the presence of @FunctionalInterface annotaion*/
    //void test();

    default boolean hasText(String string) {
        if (string == null) return false;

        if (string.trim().length() == 0) {
            return true;
        }
        return true;

    }
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        String[] strings = new String[]{"Hello", " ", "word!"};
        /*  Use of lambda expression to instantiate myFunctionalInterface */
        MyFunctionalInterface myFunctionalInterface = (String[] arrayString) -> {
            StringBuilder stringBuilder = new StringBuilder();
            for (String element : arrayString) {
                stringBuilder.append(element);
            }
            return stringBuilder.toString();
        };
        System.out.println(myFunctionalInterface.concatString(strings));
    }
}

