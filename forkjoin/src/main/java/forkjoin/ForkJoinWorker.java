package forkjoin;

import java.util.concurrent.ForkJoinPool;


public class ForkJoinWorker {

    public static void main(String[] args) {
            int n = 48;
            calc(2, n);

    }

    private static void calc(int processors, int n) {
        long time = System.currentTimeMillis();
        FibonacciProblem bigProblem = new FibonacciProblem(n);

        FibonacciTask task = new FibonacciTask(bigProblem);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);

        long result = task.result;
        System.out.println("Computed Result: " + result);
        System.out.println("processors: " + processors + " n: " + n);
        System.out.println("Elapsed Time: " + (System.currentTimeMillis() - time));
    }

}
