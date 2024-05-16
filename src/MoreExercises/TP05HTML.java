package MoreExercises;

import java.util.Scanner;

public class TP05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        StringBuilder htmlOutput = new StringBuilder();
        htmlOutput.append("<h1>\n")
                .append("   ").append(title)
                .append("\n</h1>\n");
        htmlOutput.append("<article>\n")
                .append("   ").append(content)
                .append("\n</article>\n");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("end of comments")) {
                break;
            }
            htmlOutput.append("<div>\n")
                    .append("   ").append(line)
                    .append("\n</div>\n");
        }

        System.out.println(htmlOutput);
    }
}