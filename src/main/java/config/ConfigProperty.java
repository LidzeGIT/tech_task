package config;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperty {
    private static FileInputStream fis;
    private static Properties PROPERTIES;

    static {
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fis);
        } catch (IOException fnfe) {
            fnfe.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);

    }
}
