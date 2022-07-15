package classwork.lesson22.fileExample.ioExample;

import java.io.*;

public class DataIOStream {
    static String filePath = "C:\\Users\\Dell\\IdeaProjects\\JavaCore\\src\\classwork\\lesson22\\fileExample\\file\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();
        }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(filePath));
        out.writeInt(54);
        out.writeBoolean(true);
        out.close();
    }
    private static void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(filePath));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        inputStream.close();
    }
}

