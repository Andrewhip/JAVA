import java.io.IOException;
import java.io.FileWriter;

public class Sem2Task1 {
    public static void main(String[] args) {
        String inputString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] keyValuePairs = inputString.replaceAll("\\{|\\}", "").split(", ");

        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM students WHERE ");
        for (String keyValuePair : keyValuePairs) {
            String[] pair = keyValuePair.split(":");
            String key = pair[0].replaceAll("\"", "");
            String value = pair[1].replaceAll("\"", "");

            if (!value.equals("null")) {
                queryBuilder.append(key).append(" = \"").append(value).append("\" AND ");
            }
        }

        String query = queryBuilder.toString().replaceAll(" AND $", ";");
        System.out.println(query);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(query);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
