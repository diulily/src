package osnovyoop;

public class MinTabu {
    public void min(int minimum) {
        int[] a = new int[5];
        int i = 0;
        int min = a[i];
        for (i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

    }
}
