package gadingpackage.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while(true){
                String line = reader.readLine();
                if(line==null){
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable t) {
            System.out.println("Error membaca file " + t.getMessage());
        }

    }
}
