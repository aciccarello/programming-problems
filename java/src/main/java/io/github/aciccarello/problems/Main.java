package io.github.aciccarello.problems;

import io.github.aciccarello.problems.euler.*;

import java.util.concurrent.*;

/**
 * CLI for solving programming problems
 */
public class Main {

    public static void main(String[] args) {
        int timeoutMinutes = 60;

	// write your code here
        System.out.println("Welcome to Anthony's programming problem solver");
        EulerSolver problem = new Problem3();

        System.out.println("Problem " + problem.getNumber() + ": " + problem.getDescription());
        ScheduledExecutorService runner = Executors.newSingleThreadScheduledExecutor();
        try {
            long startTime = System.nanoTime();
            Long answer = runner.submit(problem).get(timeoutMinutes, TimeUnit.MINUTES);
            long endTime = System.nanoTime();
            System.out.println("The answer to problem " + problem.getNumber() + " is " + answer);

            String timeMessage = "The answer was found in ";
            long milliseconds = TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
            if (milliseconds < 1000) {
                timeMessage += milliseconds + " milliseconds";
            } else {
                long seconds = TimeUnit.SECONDS.convert(milliseconds, TimeUnit.MILLISECONDS);
                if (seconds < 60) {
                    timeMessage += seconds + " seconds";
                } else {
                    long minutes = seconds / 60;
                    seconds = seconds % 60;
                    timeMessage += minutes + " minutes and " + seconds + " seconds";
                }
            }
            System.out.println(timeMessage);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("Solver timed out after " + timeoutMinutes + " minutes");
        } {

        }

        System.exit(0);
    }
}
