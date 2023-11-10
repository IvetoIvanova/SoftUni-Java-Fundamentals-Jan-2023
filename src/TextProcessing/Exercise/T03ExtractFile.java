package TextProcessing.Exercise;

import java.util.Scanner;

public class T03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathToAFile = scanner.nextLine();
        int lastIndex = pathToAFile.lastIndexOf("\\");
        String fullFileName = pathToAFile.substring(lastIndex + 1);

        int pointIndex = fullFileName.indexOf(".");
        String fileName = fullFileName.substring(0, pointIndex);
        String fileExtension = fullFileName.substring(pointIndex + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}