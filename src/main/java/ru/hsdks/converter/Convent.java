package ru.hsdks.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class Convent {
    private ObjectMapper objectMapper = new ObjectMapper();

    public void writer(File file, Student student) {
        try {
            objectMapper.writeValue(file, student);
        } catch (IOException e) {}
    }

    public String writerAsString(Student student) {
        try {
            return objectMapper.writeValueAsString(student);
        } catch (JsonProcessingException e) {}
        return null;
    }

    public Student read(File file, Class<Student> klass) {
        try {
            return objectMapper.readValue(file, klass);
        } catch (IOException e) {}
        return null;
    }
}
