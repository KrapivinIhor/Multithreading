public class MyFirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is  " + getName());
//        try {
//            sleep(1000L);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}

