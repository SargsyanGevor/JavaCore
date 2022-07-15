package homework.fileutil;

import java.io.*;

import java.util.Scanner;

public class FileUtil {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        fileSearch();
        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        File myFile = new File(path + "\\" + fileName);
        System.out.println(myFile.exists());
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input any word");
        String keyword = scanner.nextLine();
        File myFile = new File(path);
        if (myFile.isDirectory()) {
            File[] files = myFile.listFiles();
            for (File file : files)
                if (file.getName().endsWith(".txt")) {
                    try (BufferedReader bw = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = bw.readLine()) != null) {
//                            System.out.println(line);
                            if (line.contains(keyword)) {
                                System.out.println(file.getName());
                            }

                        }

                    }

                }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("Please input path");
        String txtPath = scanner.nextLine();
        System.out.println("Please input any word");
        String keyword = scanner.nextLine();

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        long size = 0;
        System.out.println("Please input path");
        String path = scanner.nextLine();
        File mayFile = new File(path);
        if (mayFile.isDirectory()) {
            File[] files = mayFile.listFiles();
            for (File file : files) {
                long a = file.length();
                size = size + a;
            }
            System.out.println("The volume of files in the folder is equal " + size + " bytes:");
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Please input path");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();
        System.out.println("Please input file content");
        String fileContent = scanner.nextLine();
        File myFile = new File(path + "\\" + fileName);
        myFile.createNewFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\" + fileName))) {
            bw.write(fileContent);
        }
    }
}


