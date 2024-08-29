package org.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();

            InputStream inputStreamXML = new FileInputStream("src/main/resources/application.xml");
            InputStream inputStream = new FileInputStream("src/main/resources/application.properties");

            properties.loadFromXML(inputStreamXML);
            // properties.load(inputStream);

            System.out.println(properties);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
