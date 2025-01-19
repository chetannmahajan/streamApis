package org.example.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Student {
    // Instance variables (specific to each student)
    String name;
    String stream;
    int id;

    // Static variable (common for all students)
    static String collegeName;

    // Constructor to initialize instance variables
    Student(String name, String stream, int id) {
        this.name = name;
        this.stream = stream;
        this.id = id;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Stream: " + stream + ", ID: " + id + ", College: " + collegeName);
    }

    public static void main(String[] args) {
        // Set static member (college name)
        Student.collegeName = "ABC College";

        // Create Student objects
        Student s1 = new Student("Alice", "Computer Science", 101);
        Student s2 = new Student("Bob", "Mechanical Engineering", 102);
        Student s3 = new Student("Charlie", "Electrical Engineering", 103);

        // Display details of each student
        s1.display();
        s2.display();
        s3.display();
    }

//    String name;
//    String stream;
//    String id;
//    static String collageName;
//
//    Student(String name, String stream, String id){
//        this.name = name;
//        this.stream = stream;
//        this.id = id;
//    }
//
//    void Display(){
//        System.out.println(name + " " + stream + " " + id + " " + collageName);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id='" + id + '\'' +
//                ", stream='" + stream + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) && Objects.equals(stream, student.stream) && Objects.equals(id, student.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, stream, id);
//    }
//
//    public static void main(String[] args) {
//        collageName = "Abc collage";
//        Student student1 = new Student("Chetan", "computer", "1");
//        Student student2 = new Student("you", "IT", "2");
//        Student student3 = new Student("Someperson", "Civil", "3");
//        Student student4 = new Student("Someperson", "Civil", "3");
//
//        student1.Display();
//        student2.Display();
//        student3.Display();
//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        List<Student> list = students.stream().distinct().toList();
//        list.forEach(Student::Display);
//
//
//        HashSet<Student> students1 = new HashSet<>();
//        students1.add(student1);
//        students1.add(student2);
//        students1.add(student3);
//        students1.add(student4);
//        System.out.println("--------------");
//        students1.forEach(student -> System.out.println(student.toString()));
//    }
}
