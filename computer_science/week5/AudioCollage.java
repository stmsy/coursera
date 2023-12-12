public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) b[i] = alpha * a[i];
        return b;
    }

    // Returns a new array that is the reverse of a[]
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        int j = a.length - 1;
        for (int i = 0; i < b.length; i++) b[i] = a[j-i];
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[]
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) c[i] = a[i];
        for (int i = a.length; i < c.length; i++) c[i] = b[i - a.length];
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary
    public static double[] mix(double[] a, double[] b) {
        int length = Math.max(a.length, b.length);
        double[] c = new double[length];
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) c[i] += a[i];
            if (i < b.length) c[i] += b[i];
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor
    public static double[] changeSpeed(double[] a, double alpha) {
        int length = (int) Math.floor(a.length / alpha);
        double[] b = new double[length];
        for (int i = 0; i < b.length;  i++) {
            int j = (int) Math.floor(i * alpha);
            b[i] = a[j];
        }
        return b;
    }

    // Creates an audio collage and plays it on standard audio
    public static void main(String[] args) {
        double[] buzzer = StdAudio.read("buzzer.wav");
        double[] chimes = StdAudio.read("chimes.wav");
        double[] cow = StdAudio.read("cow.wav");
        double[] dialup = StdAudio.read("dialup.wav");
        double[] harp = StdAudio.read("harp.wav");

        double alpha1 = 0.5;
        double[] a = amplify(buzzer, alpha1);
        double[] b = reverse(chimes);
        double[] c = mix(cow, dialup);
        double alpha2 = 2.0;
        double[] d = changeSpeed(harp, alpha2);
        double[] e = merge(a, b);
        double[] f = merge(c, d);
        double[] g = merge(e, f);
        StdAudio.play(e);
    }
}
