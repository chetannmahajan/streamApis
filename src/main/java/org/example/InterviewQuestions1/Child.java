package org.example.InterviewQuestions1;

    class Parent {
        Parent(){

        }

        Parent (String s){
            System.out.println("Parent Class Param  "+s);
        }
    }

    public class Child extends Parent {

        Child (){
            this("Constructor");
            System.out.println("Child Class Default Constructor");
        }

        Child (String s){
            System.out.println("Child Class Param Constructor "+s);
        }

        public static void main(String[] args) {
            Child obj = new Child();
        }

    }
