package CodersArcade.collectionsFramework.extra;
import java.io.FileWriter;
import java.util.Properties;
public class SaveProperties {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.setProperty("app.version", "1.2.0");
        props.setProperty("maintainer", "Saurav");
        props.setProperty("organisation", "Coders Arcade");
        props.store(new FileWriter("./app.properties"),
                "Application Settings");
    }
}
