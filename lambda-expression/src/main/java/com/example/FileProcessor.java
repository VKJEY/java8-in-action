package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    
    public String readLines(int noOfLines) throws IOException {
        return processFile(BufferedReader::readLine);
    }

    public String processFile(BufferedReaderProcessor processor) throws IOException{
    	File f=new File("src/main/resources/data.txt");
    	System.out.println(f.getAbsolutePath());
    	 
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            return processor.process(br);
        }
    }
}
