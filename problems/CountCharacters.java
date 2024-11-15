import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String input = "Test is my passion";

        HashMap<Character, Integer> map = new HashMap<>();
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        map.entrySet().forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));
    }
}
