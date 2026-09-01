package JAVA_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program01 {
    public static void main(String[] args) throws IOException {
       // System.in.read(); //InputStream class method read()

        InputStreamReader isr = new InputStreamReader(System.in);//InputStreamReader will convert Stream of bytes to Stream of characters

        BufferedReader br = new BufferedReader(isr); //BufferedReader will read Stream of characters in chunks not one one

        String name = br.readLine();// To read String from input
        System.out.println(name);
    }
}
