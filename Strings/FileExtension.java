public class FileExtension {
    public static void main(String[] args) {

        String fileName = "photo.png";

        int dotIndex = fileName.lastIndexOf(".");

        String extension = fileName.substring(dotIndex + 1);

        System.out.println("File Extension: " + extension);
    }
}
