package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class io9 {
    public static void main(String[] args) throws IOException {
        String filePath = "D:/Coding Assignments/inputoutput/config.properties";
        FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println("Property Value: " + prop.getProperty("keyName"));
        fis.close();
    }
}
