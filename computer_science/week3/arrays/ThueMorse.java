public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Construct the Thue-Morse sequence of length n

        // 1. Use a string
        // String thue = "0";
        // String morse = "1";
        // for (int i = 0; i < n; i++) {
        //     String t = thue;
        //     String m = morse;
        //     thue += m;
        //     morse += t;
        // }

        // 2. Use an array
        String[] tm = new String[n];
        tm[0] = "0";
        int i = 1;
        while (i < 2*n) {
            // Determine the location of first null value
            int pos = -1;
            for (int j = 0; j < n; j++) {
                if (tm[j] == null) {
                    pos = j;
                    break;
                }
            }
            for (int j = 0; j < pos && pos+j < n; j++) {
                if (tm[j] == "0") tm[pos+j] = "1";
                else tm[pos+j] = "0";
            }

            i *= 2;
        }

        // Construct the corresponding Thue-Morse weave
        String sign = "";
        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (tm[j] == tm[k]) sign = "+";
                else sign = "-";
                if (k < n-1) System.out.print(sign + "  ");
                else System.out.println(sign);
            }
        }
    }
}
