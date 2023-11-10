package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T04SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredUsers = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {

            String[] commandsArr = scanner.nextLine().split("\\s+");
            String command = commandsArr[0];


            switch (command) {
                case "register":
                    String username = commandsArr[1];
                    String licensePlateNumber = commandsArr[2];

                    if (registeredUsers.containsKey(username)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    } else {
                        registeredUsers.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    }

                    break;
                case "unregister":
                    String userName = commandsArr[1];

                    if (!registeredUsers.containsKey(userName)) {
                        System.out.printf("ERROR: user %s not found%n", userName);
                    } else {
                        registeredUsers.remove(userName);
                        System.out.printf("%s unregistered successfully%n", userName);
                    }
                    break;
            }
        }

        registeredUsers.forEach((key, value) ->
                System.out.printf("%s => %s%n", key, value));
    }
}