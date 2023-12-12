public class LongestSeq {
    public static void main(String[] args) {
        int counter = 1;
        boolean isConsecutive = true;

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            int y = StdIn.readInt();
            if (x != y) {
                isConsecutive = false;
                counter = 0;
            }
            else {
                isConsecutive = true;
                counter++
            }
        }
    }
}
