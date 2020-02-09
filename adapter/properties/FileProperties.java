package adapter.properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends FileIO {
    private Properties properties;
    
    public FileProperties() {
        this.properties = new Properties();
    }
    
    // ./filenameのプロパティを読み込む
    public void readFromFile(String filename) throws IOException {
        FileInputStream in = null;
        
        try {
            in = new FileInputStream(filename);
            properties.load(in);
        } finally {
            if (in != null) { in.close(); }
        }
    }
    
    // ./filenameにプロパティを書き込む
    public void writeToFile(String filename) throws IOException {
        FileOutputStream out = null;
        
        try {
            out = new FileOutputStream(filename);
            properties.store(out, "written by FileProperties");
        } finally {
            if (out != null) { out.close(); }
        }
    }
    
    public void setValue(String key, String value) {
        properties.setProperty(key, value);
    }
    
    public String getValue(String key) {
        return properties.getProperty(key, "");
    }
}