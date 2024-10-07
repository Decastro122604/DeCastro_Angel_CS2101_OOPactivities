public class Escseq {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int multiple = i * 7;
            if (i % 2 == 0) {
                // Print with a tab
                System.out.println("\t" + multiple);
            } else {
                // Print without a tab
                System.out.println(multiple);
            }
        }
    }
}
