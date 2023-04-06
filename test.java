import org.apache.commons.codec.digest.DigestUtils;

public class MessageDigestExample {
    public static void main(String[] args) {
        String input = "Hello World!";
        String md5 = DigestUtils.md5Hex(input);
        System.out.println("MD5: " + md5);

        String sha1 = DigestUtils.sha1Hex(input);
        System.out.println("SHA-1: " + sha1);

        String sha256 = DigestUtils.sha256Hex(input);
        System.out.println("SHA-256: " + sha256);
    }
}