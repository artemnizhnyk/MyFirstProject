package Multithreading;

public class RunnbleEx1 {
    public static void main(String[] args) {
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Dania Dolbaeb");

            }
        });
        thread6.start();
        System.out.println("123");


    }
}
