package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{

    private Properties properties;



    public Properties  InitializeConfigFile() throws IOException
    {
        properties = new Properties();
        FileInputStream fis = new FileInputStream("/Users/praveensharma/IdeaProjects/Cucumber_BDD_Framework/src/test/java/com/Config/config.properties");
        properties.load(fis);

        return properties;
    }


}
