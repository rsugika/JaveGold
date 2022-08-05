// package Section5;

import java.io.File;
import java.io.FileFilter;


public class Check2 {
    public static void main(String[] args) {
        // get list of files
         File rootDir = new File(".");
        //  File rootDir2 = new File(".");
         showTree(rootDir);
        //  showTree2(rootDir2);
        
        // extract only java file by using filter
        FileFilter filter = (path) -> {
            if (path.isDirectory()) {
                return true;
            }
            if (path.getName().endsWith(".java")) {
                return true;
            }
            return false;
        };
        
        showTree3(rootDir, filter, "");


    }

    private static void showTree(File dir) {
        // call getName() to display file name on console 
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    // private static void showTree2(File dir, String indent) {
    //     // call getName() to display file name on console 
    //     File[] files = dir.listFiles();
    //     for (File file : files) {
    //         System.out.println(indent + file.getName());
    //          if (file.isDirectory()) {
    //             showTree2(file, indent + " ");
    //          }
    //     }
    // }

    private static void showTree3(File dir, FileFilter filter, String indent) {

        File[] files = dir.listFiles(filter);
        for (File file : files) {
            System.out.println(indent + file.getName());
            if (file.isDirectory()) {
                showTree3(file, filter, indent + " ");
            }
        }
    }
}

