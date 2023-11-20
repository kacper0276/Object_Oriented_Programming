public class Main {
    static void capitalizeEverySecond(StringBuilder stringbuilder) {
        for(int i = 1; i < stringbuilder.length(); i+=2) {
            stringbuilder.setCharAt(i, Character.toUpperCase(stringbuilder.charAt(i)));
        }
    }

    public static void main(String[] args) {
        StringBuilder stringbuilder = new StringBuilder("napisTe231ast");
        capitalizeEverySecond(stringbuilder);
        System.out.println(stringbuilder);
    }
}