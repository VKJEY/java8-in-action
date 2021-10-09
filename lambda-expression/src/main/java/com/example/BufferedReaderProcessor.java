package com.example;

import java.io.BufferedReader;
import java.io.IOException;

interface BufferedReaderProcessor {

    String process(BufferedReader br) throws IOException;
}