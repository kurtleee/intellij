import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class JPGToBase64 {
    public static void main(String[] args) {
        String imagePath = "/Downloads/DALL·E 2023-01-21 01.33.27.png"; // replace with the path to your image file
        try {
            FileInputStream imageInFile = new FileInputStream(imagePath);
            byte[] imageData = new byte[0];
            imageInFile.read(imageData);
            String imageDataString = Base64.getEncoder().encodeToString(imageData);
            System.out.println(imageDataString);
        } catch (IOException e) {
            System.out.println("Error converting JPG to base64");
        }
    }
}
