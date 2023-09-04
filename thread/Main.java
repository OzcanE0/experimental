class NumberPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LetterPrinter extends Thread {
    @Override
    public void run() {
        for (char letter = 'a'; letter <= 'e'; letter++) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new NumberPrinter();
        Thread thread2 = new LetterPrinter();

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                for (int i = 1; i <= 3; i++) {
                    System.out.println("High Priority Thread: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread3.start();

        try {
            thread1.join();
            thread2.join();
         //   thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Threads have finished!");
    }
}
