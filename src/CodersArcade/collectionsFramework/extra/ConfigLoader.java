package CodersArcade.collectionsFramework.extra;
import java.io.FileReader;
import java.util.Properties;
public class ConfigLoader {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.load(new FileReader("./config.properties"));
        String dbUrl = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        System.out.println("DB URL: " + dbUrl);
        System.out.println("DB Username: " + username);
    }
}
