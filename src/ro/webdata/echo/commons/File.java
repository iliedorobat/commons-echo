package ro.webdata.echo.commons;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public final class File {
    public static final String EXTENSION_ASP = "asp";
    public static final String EXTENSION_CSV = "csv";
    public static final String EXTENSION_JSON = "json";
    public static final String EXTENSION_RDF = "rdf";
    public static final String EXTENSION_TXT = "txt";
    public static final String EXTENSION_XML = "xml";
    public static final String EXTENSION_SEPARATOR = ".";

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String USER_HOME = System.getProperty("user.home");
    public static final String WORKSPACE_DIR = System.getProperty("user.dir");

    public static final String PATH_FILES_DIR = WORKSPACE_DIR + FILE_SEPARATOR + "files";
    public static final String PATH_DATASET_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "dataset";
    public static final String PATH_INPUT_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "input";
    public static final String PATH_OUTPUT_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "output";

    private File() {}

    /**
     * Create directory if it does not exist
     * @param filePath The full path where the file will be written
     */
    public static void createDirectory(String filePath) {
        if (filePath != null) {
            String directoryName = filePath.substring(0, filePath.lastIndexOf(FILE_SEPARATOR));
            java.io.File directory = new java.io.File(directoryName);

            if (!directory.exists()) {
                directory.mkdir();
            }
        }
    }

    /**
     * Check if a file already exists
     * @param filePath The full path of the file which is subject to verification
     * @return True/False
     */
    public static boolean exists(String filePath) {
        if (filePath == null) {
            return false;
        }

        java.io.File file = new java.io.File(filePath);

        return file.exists() && !file.isDirectory();
    }

    /**
     * Write data to disk
     * @param sw The writer input
     * @param filePath The full path where the file will be written
     * @param append Specify if the text should be appended to the existing one
     */
    public static void write(StringWriter sw, String filePath, boolean append) {
        createDirectory(filePath);
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath, append);
            fw.write(sw.toString());
//            System.out.println("The records have been written to disk.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                System.err.println("The 'FileWriter' could not be closed."
                        + "\nError: " + e.getMessage());
            }
        }
    }

    /**
     * Write data to disk
     * @param str The input string
     * @param filePath The full path where the file will be written
     * @param append Specify if the text should be appended to the existing one
     */
    public static void write(String str, String filePath, boolean append) {
        StringWriter sw = new StringWriter();
        sw.write(str);
        write(sw, filePath, append);
    }

    /**
     * Write data to disk
     * @param list The list of strings to be written to disk
     * @param filePath The full path where the file will be written
     * @param append Specify if the text should be appended to the existing one
     */
    public static void write(ArrayList<String> list, String filePath, boolean append) {
        StringWriter writer = new StringWriter();

        for (String string : list) {
            writer.append(string).append("\n");
        }

        File.write(writer, filePath, append);
    }

    public static StringBuilder read(String fileName) {
        BufferedReader br = null;
        StringBuilder sb = null;

        try {
            br = new BufferedReader(new FileReader(fileName));
            sb = new StringBuilder();
            String readLine;

            while ((readLine = br.readLine()) != null) {
                if (readLine.length() > 0) {
                    sb.append(readLine).append("\n");
                }
            }

            // Remove the last "Enter"
            sb.delete(sb.lastIndexOf("\n"), sb.length());
        } catch (FileNotFoundException e) {
            System.err.println("The file " + fileName + " have not been found."
                    + "\nError: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.err.println("The file 'BufferedReader' could not be closed."
                        + "\nError: " + e.getMessage());
            }
        }

        return sb;
    }

    public static ArrayList<String> getFileNames(String directoryPath, String extension, boolean excludeDemo) {
        ArrayList<String> fileNames = new ArrayList<>();
        ArrayList<String> allFileNames = getFileNames(directoryPath, extension);

        for (String fullName : allFileNames) {
            int dotIndex = fullName.lastIndexOf(".");
            String fileName = fullName.substring(0, dotIndex);
            boolean isDemoFile = fileName.startsWith("demo");

            if ((excludeDemo && !isDemoFile) || !excludeDemo && isDemoFile) {
                fileNames.add(fileName + EXTENSION_SEPARATOR + extension);
            }
        }

        return fileNames;
    }

    public static ArrayList<String> getFileNames(String directoryPath, String extension) {
        ArrayList<String> fileNames = new ArrayList<>();
        java.io.File directory = new java.io.File(directoryPath);
        java.io.File[] subDirectories = directory.listFiles();

        if (subDirectories != null) {
            for (java.io.File file : subDirectories) {
                String fileName = file.getName();
                String fileExtension = getFileExtension(fileName);

                if (extension == null || extension.equals(fileExtension)) {
                    fileNames.add(fileName);
                }
            }
        } else {
            System.err.println(directoryPath + " does not contain any directories!");
        }

        Collections.sort(fileNames);
        return fileNames;
    }

    public static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(EXTENSION_SEPARATOR) + 1).toLowerCase();
    }
}
