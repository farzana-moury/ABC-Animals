package FileCheck;

import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        //Quick method to find out where java is looking

//      System.out.println(new File(".").getCanonicalFile().toString());
        File file = new File("wordSounds/alligator.mp3");
        //Output properties about this file
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is the file a directory? " + file.isDirectory());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Last modified on " + file.lastModified());
    }
}
