package io.github.aciccarello.problems;

import io.github.aciccarello.problems.euler.*;

import java.util.concurrent.*;

/**
 * CLI for solving programming problems
 */
public class Main {

    public static void main(String[] args) {
        int timeoutMinutes = 5;

	// write your code here
        System.out.println("Welcome to Anthony's programming problem solver");
        EulerSolver problem = new Problem2();

        System.out.println("Problem " + problem.number + " :" + problem.description);
        ScheduledExecutorService runner = Executors.newSingleThreadScheduledExecutor();
        try {
            Integer answer = runner.submit(problem).get(timeoutMinutes, TimeUnit.MINUTES);
            System.out.print("The answer to problem " + problem.number + " is " + answer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("Solver timed out after " + timeoutMinutes + " minutes");
        } {

        }
    }
}
