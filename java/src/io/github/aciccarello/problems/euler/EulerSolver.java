package io.github.aciccarello.problems.euler;

import java.util.concurrent.Callable;

/**
 * Shape of project euler problems
 */
public interface EulerSolver extends Callable<Long> {
    String getDescription();
    int getNumber();
}
