package com.eoussama.jox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class Jox {
  public static void main(String[] args) throws IOException {
    if (args.length > 1) {
      System.out.println("Usage: jox [script]");
      System.exit(64); 
    } else if (args.length == 1) {
      // runFile(args[0]);
    } else {
      // runPrompt();
    }
  }
}