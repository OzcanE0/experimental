package thread;

import java.util.concurrent.*;

public class MediumLevel {

        public static void main(String[] args) {
            // Create a thread pool with 2 threads
            ExecutorService executorService = Executors.newFixedThreadPool(2);

            // Submit tasks to the thread pool
            Future<Integer> future1 = executorService.submit(new NumberTask(5));
            Future<Integer> future2 = executorService.submit(new NumberTask(10));

            // Shutdown the executor service when tasks are done
            executorService.shutdown();

            try {
                // Get results from the Future objects
                int result1 = future1.get();
                int result2 = future2.get();

                System.out.println("Result from Task 1: " + result1);
                System.out.println("Result from Task 2: " + result2);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

    class NumberTask implements Callable<Integer> {
        private int number;

        public NumberTask(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
                Thread.sleep(200);
            }
            return sum;
        }
    }


