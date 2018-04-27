package io.github.aciccarello.euler;

import io.github.aciccarello.euler.problems.*;

/**
 * CLI for running project-euler answers
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Anthony's Project Euler solver");
        int problem = 1;
        switch (problem) {
            case 1:
                Runnable instance = new Problem1();
                instance.run();
                break;
            default:
                System.out.println("No solver found for that number");
        }
    }
}
