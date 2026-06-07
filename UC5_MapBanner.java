import java.util.HashMap;
import java.util.Map;

public class UC5_MapBanner {

    public static void main(String[] args) {

        Map<Character, String[]> letters = new HashMap<>();

        letters.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        letters.put('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        letters.put('S', new String[]{
                " ******",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        String word = "OOPS";

        for (int row = 0; row < 6; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = letters.get(ch);

                System.out.print(pattern[row] + "  ");
            }

            System.out.println();
        }
    }
}
