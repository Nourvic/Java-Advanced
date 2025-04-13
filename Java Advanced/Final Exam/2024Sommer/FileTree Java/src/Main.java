import java.io.File;

public class Main {
    public static void main(String[] args) {

        Util util = new Util();
        JavaFilter jf = new JavaFilter();
        //  File[] jvaliste = util.allJavaFilesmitClass(new File("/Users/nourvic7/Desktop/Java Streams/Java Advanced/Praktika/P1/src"));
       // util.allJavaFilesmitClass(new File("/Users/nourvic7/Desktop/Java Streams/Java Advanced/Praktika"));
        for (File file : util.allJavaFilesmitClass(new File("/Users/nourvic7/Desktop/Java Streams/Java Advanced/Praktika/P1/src"))) {
            System.out.println(file.getName());
        }

        for (File file: util.allJavaFilesmitLamda(new File("Users/nourvic7/Desktop/Java Streams/Java Advanced/Praktika/P1/src"))){
            System.out.println(file.getName());
        }


    }
}