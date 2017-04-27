package chapter13.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DisplayURL {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("URL = " + arg);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(arg).openStream()));) {
                while (true) {
                    String line = reader.readLine();
                    if (line == null) {
                        break;
                    }
                    System.out.println(line);
                }
            } catch (MalformedURLException e) {
                System.out.println("URLの形式が誤っています:" + e);
            } catch (IOException e) {
                System.out.println("I/Oエラーです:" + e);
            }
        }
    }
}
