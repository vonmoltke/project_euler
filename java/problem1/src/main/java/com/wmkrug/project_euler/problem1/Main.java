package com.wmkrug.project_euler.problem1;

import java.lang.*;

public final class Main {
    public static void main(final String... args) {
        int sum = 0;

        for (int i = 1; i < 1000; ++i) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                sum += i;
            }
        }

        System.out.println("The answer is " + sum);
    }
}
