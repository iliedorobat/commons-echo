package ro.webdata.echo.commons;

import java.io.*;

public final class File {
    public static final String EXTENSION_CSV = "csv";
    public static final String EXTENSION_RDF = "rdf";
    public static final String EXTENSION_TXT = "txt";
    public static final String EXTENSION_XML = "xml";
    public static final String EXTENSION_SEPARATOR = ".";

    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String WORKSPACE_DIR = System.getProperty("user.dir");

    public static final String PATH_FILES_DIR = WORKSPACE_DIR + FILE_SEPARATOR + "files";
    public static final String PATH_DATA_PROCESSING_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "data-processing";
    public static final String PATH_INPUT_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "input";
    public static final String PATH_OUTPUT_DIR = PATH_FILES_DIR + FILE_SEPARATOR + "output";

    private File() {}

    /**
     * Write the processed data on the disc
     * @param sw The writer input
     * @param filePath The full path where the file will be written
     *
     * @deprecated deprecated in favour of write(StringWriter sw, String filePath, boolean override)
     */
    //TODO: remove it
    public static void write(StringWriter sw, String filePath) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath);
            fw.write(sw.toString());
//            System.out.println("The records have been written on the disc.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.err.println("The 'FileWriter' could not be closed."
                        + "\nError: " + e.getMessage());
            }
        }
    }

    /**
     * Write the processed data on the disc
     * @param sw The writer input
     * @param filePath The full path where the file will be written
     * @param append Specify if the text should be appended to the existing one
     */
    public static void write(StringWriter sw, String filePath, boolean append) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(filePath, append);
            fw.write(sw.toString());
//            System.out.println("The records have been written on the disc.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.err.println("The 'FileWriter' could not be closed."
                        + "\nError: " + e.getMessage());
            }
        }
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
                    sb.append(readLine + "\n");
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
                br.close();
            } catch (IOException e) {
                System.err.println("The file 'BufferedReader' could not be closed."
                        + "\nError: " + e.getMessage());
            }
        }

        return sb;
    }
}
