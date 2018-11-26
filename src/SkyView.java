public class SkyView {
    private double[][] view;
    public SkyView(int nr,int nc, double[] scanned)
    {
        int x=0;
        view = new double[nr][nc];
        for(int i=0;i<nr;i++)
        {
            if(i%2==1)
            {
                for(int j=nc-1;j>=0;j--)
                {
                    view[i][j] = scanned[x];
                    x++;
                }
            }
            else
            {
                for(int j=0;j<nc;j++)
                {
                    view[i][j] = scanned[x];
                    x++;
                }
            }
        }
    }
    public double getAverage(int sr,int er, int sc, int ec)
    {
        double avgdiv = (er-sr)*(ec-sc);
        double count =0.0;

        for(int i=sr;i<=er;i++)
        {
            for(int j=sc;j<=ec;j++)
            {
                count += view[i][j];

            }
        }
        return count/avgdiv;
    }
    public String toString()
    {
        String s = "";
        for(int i = 0;i<view.length;i++)
        {

            for(int j=0;j<view[i].length;j++)
            {

                s += view[i][j] + " ";

            }
            s+= "\n";
        }
        return s;
    }
}
