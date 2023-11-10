package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceQuantity.containsKey(resource)) {
                resourceQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourceQuantity.get(resource);
                resourceQuantity.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }
        resourceQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}