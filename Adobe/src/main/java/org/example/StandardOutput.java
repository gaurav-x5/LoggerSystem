package org.example;

public class StandardOutput implements LoggerOutput{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
