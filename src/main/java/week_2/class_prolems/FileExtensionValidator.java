package week2.class_problems;
public class FileExtensionValidator {

    static final String[] ACCEPTED_EXTENSIONS = {"pdf", "docx", "zip"};

    public static void main(String[] args) {
        System.out.println(validateFileExtension("Assignment1.PDF"));
        System.out.println(validateFileExtension("notes.txt"));
    }

    static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected — invalid file type";
        }

        String extension = filename.substring(dotIndex + 1);

        for (String accepted : ACCEPTED_EXTENSIONS) {
            if (extension.equalsIgnoreCase(accepted)) {
                return "Accepted";
            }
        }

        return "Rejected — invalid file type";
    }
}