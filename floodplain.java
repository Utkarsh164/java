public class floodplain 
{
    static void flood(int[][] plain,
                      int[] c,
                      int[] r,
                      int col,
                      int ncol,
                      int[][] v,
                      int i,
                      int j
                      )
    {
        v[i][j]=ncol;
        for(int index=0;index<4;index++)
        {
            int ni=i+c[index];
            int nj=j+r[index];
            if(i>0 && j>0 && i<plain.length && j<plain[0].length && plain[i][j]==col && v[i][j]!=ncol)
            {
                flood(plain,c,r,col,ncol,v,ni,nj);
            }
        }
    }
    public static void main(String[] args) {
        int[][] plain={{1,1,1},{2,2,0},{2,2,2}};
        int color=2;
        int newcol=6;
        int[][] visited=plain;
        int[] col={-1,0,0,1};
        int[] row={0,-1,1,0}; 
        for(int i=0;i<plain.length;i++)
        {
            for(int j=0;j<plain[0].length;j++)
            {
                if(plain[i][j]==color)
                {
                    flood(plain,col,row,color,newcol,visited,i,j);
                }
            }
        }

        for(int i=0;i<plain.length;i++)
        {
            for(int j=0;j<plain[0].length;j++)
            {
                System.out.print(visited[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
