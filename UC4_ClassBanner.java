class CharacterPattern {

    String[] pattern;

    CharacterPattern(String[] pattern) {
        this.pattern = pattern;
    }

    void display() {

        for (String line : pattern) {
            System.out.println(line);
        }

    }
}

public class UC4_ClassBanner {

    public static void main(String[] args) {

        String[] oopsBanner = {

            " *****   *****   *****   ***** ",
            "*     * *     * *     * *     ",
            "*     * *     * *     * *     ",
            "*     * *     * *     * ***** ",
            "*     * *     * *     *     * ",
            " *****   *****   *****  ***** "

        };

        CharacterPattern banner =
                new CharacterPattern(oopsBanner);

        banner.display();

    }
}