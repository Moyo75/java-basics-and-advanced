public class Counter {
    public Counter() {
        value++;
    }

//    public Counter(int value) {
//        this.value = value;
//    }

    private static int value;

    public int getValue() {
        return value;
    }

    public static void increase() {
        value++;
    }

    public void decrease() {
        if(value > 0)
            value--;
    }

    public static void main(String args[]) {
        Counter counter = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        Counter.increase();
        Counter.increase();


        System.out.println(Counter.value);
    }
}
