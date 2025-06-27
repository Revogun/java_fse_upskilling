package com.example;

public class FileService {
    private final FileReader reader;
    private final FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {
        return "Processed " + reader.read();
    }
}