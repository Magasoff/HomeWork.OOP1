import java.util.Objects;

public class Utile {
    public static String validateString(String value, String defaultValue) {
        return (value == null || value.isBlank() || value.isEmpty()) ? defaultValue : value;
    }

    public static Integer validateNum(Integer value) {
        return value == null || value < 0 ? 0 : value;
    }
}
