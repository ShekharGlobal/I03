package com.example.exception;
class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Using resource...");
    }

    @Override
    public void close() {
        System.out.println("Resource closed!");
    }
}

public class CustomTryWithResources {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.use();
        }
        // Automatically calls resource.close()
    }
}
