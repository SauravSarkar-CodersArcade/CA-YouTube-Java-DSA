package CodersArcade.collectionsFramework.extra;
import java.util.Properties;
public class SystemProps {
    public static void main(String[] args) {
        Properties sysProps = System.getProperties();
        System.out.println("========================== System Properties ==========================");
        System.out.println("Java Version          : " + System.getProperty("java.version"));
        System.out.println("Java Vendor           : " + System.getProperty("java.vendor"));
        System.out.println("Java Home             : " + System.getProperty("java.home"));
        System.out.println("OS Name               : " + System.getProperty("os.name"));
        System.out.println("OS Architecture       : " + System.getProperty("os.arch"));
        System.out.println("User Name             : " + System.getProperty("user.name"));
        System.out.println("User Home Dir         : " + System.getProperty("user.home"));
        System.out.println("User Current Dir      : " + System.getProperty("user.dir"));
        System.out.println("========================== System Properties ==========================");
        // Optional -> List everything
        // sysProps.list(System.out);
        // Set a custom property
        System.setProperty("codersarcade.session", "online");
        System.out.println("Custom Property : " + System.getProperty("codersarcade.session"));

        // Check if a specific property is available of not
        if(System.getProperty("os.name").toLowerCase().contains("windows")){
            System.out.println("Running in Windows System!!!!");
        }else {
            System.out.println("Running in Unix-like system.");
        }

    }
}
