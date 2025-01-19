package org.example.InterfaceProblem;

public interface Printable {

    default void Display() {
        System.out.println("qwerty");
    }
}
