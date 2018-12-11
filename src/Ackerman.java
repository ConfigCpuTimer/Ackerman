public class Ackerman {
    /**
     * @param n
     * @param m
     * @return
     */
    public static int ackerman(int n, int m) {
        if(n == 1 && m == 0) {
            return 2;
        } else if(n == 0) {
            return 1;
        } else if(m == 0) {
            return n + 2;
        } else {
            return ackerman(ackerman(n - 1, m), m - 1);
        }
    }

    public static int ackerman(int n) {
        if(n == 0) {
            return 1;
        } else if(n == 1) {
            return 2;
        } else {
            return ackerman(ackerman(n - 1, n), n - 1);
        }
    }

    public static int alpha(int n) {
        if(n == 1) {
            return 0;
        } else {
            int i = 0;

            while(true) {
                if(ackerman(i) < n && ackerman(i + 1) >= n) {
                    return i + 1;
                } else {
                    i++;
                }
            }
        }
    }
}
