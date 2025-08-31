import java.util.HashSet;

public class ValidSudoku {

    static void isValidSudoku(String[][] board)
    { 
        int c=-1;
        for(int i=0;i<9;i++)
        {
            HashSet<String> h=new HashSet<>();
            HashSet<String> a=new HashSet<>();
            c=c+1;
            for(int j=0;j<9;j++)
            {

                if(board[i][j]!=".")
                {   
                    if(h.contains(board[i][j]))
                    {
                    System.out.println("row"+i);
                    System.out.println("cooumn"+j);
                    }
                    else
                    {
                        
                        h.add(board[i][j]);
                        
                       
                    }
                }
                   if(board[j][i]!=".")
                   {
                        if(a.contains(board[j][c]))
                        {
                        System.out.println("row"+i);
                        System.out.println("cooumn"+j);
                        }
                       else
                       {
                        a.add(board[j][c]);
                       }
                    }
                
            } 
                
        }
        System.out.print("done");
    }

 public static void main(String args[])
 {
    String b[][]={{".",".",".",".","5",".",".","1","."}
                 ,{".","4",".","3",".",".",".",".","."}
                 ,{".",".",".",".",".","3",".",".","1"}
                 ,{"8",".",".",".",".",".",".","2","."}
                 ,{".",".","2",".","7",".",".",".","."}
                 ,{".","1","5",".",".",".",".",".","."}
                 ,{".",".",".",".",".","2",".",".","."}
                 ,{".","2",".","9",".",".",".",".","."}
                 ,{".",".","4",".",".",".",".",".","."}};
    isValidSudoku(b);
 }
    
}
