package classwork.lesson22.fileExample;

import java.io.File;
import java.io.IOException;

public class FileExample {

    static String filePath = "C:\\Users\\Dell\\IdeaProjects\\JavaCore\\src\\homework\\fileutil\\sample3.txt";
//    static String newFilePath = "C:\\Users\\Dell\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\testFolder\\hello3.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(filePath);

//        myFile.renameTo(new File(newFilePath));

//        System.out.println(myFile.exists());
//        if(!myFile.exists()){
//            myFile.createNewFile();
//            System.out.println(myFile.exists());
//        }
//
//        System.out.println("is file: " + myFile.isFile());
//        System.out.println("is directory: " + myFile.isDirectory());
//
//        if(myFile.isDirectory()){
//            File[] files = myFile.listFiles();
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }
        System.out.println(myFile.length());
    }

}
