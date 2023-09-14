package com.WhizTraining.FileReadWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        try{
            Properties prop = new Properties();
            String path = System.getProperty("user.dir")+"/src/main/java/com/WhizTraining/FileReadWrite/project.properties";
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
            System.out.println(prop.getProperty("url"));
            fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
