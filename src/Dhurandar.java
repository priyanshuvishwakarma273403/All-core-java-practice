import java.util.concurrent.TimeUnit;

public class Dhurandar {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public static final String RED_BOLD = "\u001B[38;2;255;0;0m";
    public static final String CYAN_BOLD = "\u001B[38;2;255;215;0m";
    public static final String GRAY = "\u001B[90m";
    public static final String BOLD = "\u001B[1m";

    public static void typeText(String text, double charDelay, String color) {
        for (char c : text.toCharArray()) {
            System.out.print(color + c + RESET);
            System.out.flush();
            try {
                TimeUnit.MILLISECONDS.sleep((long) (charDelay * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void printLyrics() {
        String[] lyrics = {
                "Ya akhi doos-doos ‘indi khosh faslah",
                "Ya akhi tfuz-tfuz wallah khosh raksah",
                "Ya akhi dus-dus ‘indi khosh faslah",
                "Ya akhi tfuz-tfuz wallah khosh raksah",

                "Helu-helu zayn makanah helu",
                "Il-decoration malah helu",
                "Sweeli raqset il-marshmallow",
                "Rabi’na hafouh kilah kamil killoh",

        };

        double[] totalIntervals = {4.93, 4.93, 4.99, 3.93, 3.93, 3.93,3.93,3.93};
        double charDelay = 0.157;

        System.out.println(BLUE);
        System.out.println("------------------------------------------");
        System.out.println("|          DHURANDHAR          |");
        System.out.println("------------------------------------------" + RESET + "\n");

        try {
            TimeUnit.MILLISECONDS.sleep(1200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int i = 0; i < lyrics.length; i++) {
            // alternate between two soft colors
            String color = (i % 2 == 0) ? RED_BOLD : CYAN_BOLD;

            long start = System.currentTimeMillis();
            typeText(lyrics[i], charDelay, color);
            long elapsedMs = System.currentTimeMillis() - start;
            double elapsedSec = elapsedMs / 1000.0;
            double pause = totalIntervals[i] - elapsedSec;
            if (pause < 0) pause = 0;

            try {
                TimeUnit.MILLISECONDS.sleep((long) (pause * 1000));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println();
        typeText("Dm Me For Java Code...Webnex~~~~", 0.07, GRAY);
        System.out.println(RESET);
    }

     public static void main(String[] args) {
        printLyrics();
    }
}