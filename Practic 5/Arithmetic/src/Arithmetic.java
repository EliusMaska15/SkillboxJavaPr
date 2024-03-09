public class Arithmetic {
    int c;
    int d;



    public  Arithmetic(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public int Summa() {
        int summa = c + d;
        return summa;
    }

    public int Multipli() {
        int multipli = c * d;
        return multipli;
    }

    public int Max() {
        int max;
        if (c < d) {
            max = d;
        } else max = c;
        return max;
    }

    public int Min() {
        int min;
        if (c < d)
            min = c;
        else min = d;
        return min;
    }
}