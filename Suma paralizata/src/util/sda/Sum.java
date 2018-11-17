package util.sda;

public class Sum implements Runnable {
    private int[] v;
    private int id;

    Sum(int v[], int id) {
        this.v = v;
        this.id = id;
    }

    @Override
    public void run() {
        int S=0;
        for(int i =0;i<v.length;++i)
        {
            S = S + v[i];
        }
        System.out.println(S);

    }
}
