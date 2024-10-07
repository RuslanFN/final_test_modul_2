package counter;

public class Counter {
    private static int count = 0;
    public static void add(){
        count++;
    }

    public static int getCount() {
        return count;
    }
    public static void printCount(){
        System.out.println("Count = " + String.valueOf(count));
    }
}
