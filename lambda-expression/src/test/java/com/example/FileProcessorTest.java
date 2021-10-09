package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileProcessorTest {

    FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void testProcessFile() {
        try {
            String processFile = fileProcessor.processFile(BufferedReader::readLine);
            assertNotNull(processFile);

            System.out.println(processFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
