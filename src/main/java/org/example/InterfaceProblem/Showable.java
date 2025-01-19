package org.example.InterfaceProblem;

public interface Showable {

    default void Display() {
        System.out.println("zxcvbn");
    }
}
