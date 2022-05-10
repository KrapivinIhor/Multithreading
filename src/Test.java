public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyFirstThread thread = new MyFirstThread();
            MySecondThread thread2 = new MySecondThread();
             thread.start();
             thread2.start();
        }
    }
}

