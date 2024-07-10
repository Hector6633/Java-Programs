import java.io.File;

public class ListDirectoryContents {
    public static void main(String[] args) {
        // Directory path to be provided by the user
        String directoryPath = "path/to/your/directory"; // Replace with the desired directory path

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            listFilesAndSubdirectories(directory);
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static void listFilesAndSubdirectories(File directory) {
        // Get all the files and subdirectories
        File[] fileList = directory.listFiles();

        if (fileList != null && fileList.length > 0) {
            for (File file : fileList) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    // Recursively list subdirectories and files
                    listFilesAndSubdirectories(file);
                } else {
                    System.out.println("File: " + file.getName());
                }
            }
        } else {
            System.out.println("The directory is empty.");
        }
    }
}

