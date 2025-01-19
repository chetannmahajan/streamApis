package org.example.InterfaceProblem;

public class Document implements Printable, Showable {


    @Override
    public void Display() {
        //and with own definition.
        Printable.super.Display();
    }

    public static void main(String[] args) {
        Document document = new Document();
        document.Display();
    }
}
