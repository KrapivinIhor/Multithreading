public class MySecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is  " + 10 + getName());
//        try {
//            sleep(1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
