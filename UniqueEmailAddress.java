import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public static void main(String[] args) {

    }

    public int findEmail(String[] emails) {
        Set<String> hashSet = new HashSet<>();
        for (String email : emails) {
            int indexOfAt = email.indexOf('@');
            String local = email.substring(0, indexOfAt);
                int indexOfDot = local.indexOf('.');
            if (indexOfDot >= 0){
                local = local.substring(0, indexOfDot);
            };
        }
        return -1;
    }
}
