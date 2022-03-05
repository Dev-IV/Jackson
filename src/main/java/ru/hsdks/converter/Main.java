package ru.hsdks.converter;


import java.io.File;


public class Main {
    public static void main(String[] args) {
        Convent convent = new Convent();
        Student student = new Student(1, "Alex", "Java");
        File file = new File("student.json");

        System.out.println(convent.writerAsString(student));

        convent.writer(file, student);

        Student studentResult = convent.read(file, Student.class);
        System.out.println(studentResult);

    }
}