class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {


        int gridSize=grid.length;
      //  int gridColSize=grid[0].length;
        int tempResult[]=new int[(gridSize*gridSize)+1];
        int ansResult[]=new int[2];
      
            for(int i=0;i<gridSize;i++)
            {
                for(int j=0;j<grid[i].length;j++)
                {
                    for(int k=1;k<=gridSize*gridSize;k++)
                    {
                        if(grid[i][j]==k)
                        {
                                tempResult[k]++;
                               break;
                        }
                    }
                }
            }

            for(int i=0;i<tempResult.length;i++)
            {
                if(tempResult[i]==2)
                    ansResult[0]=i;
                else if(tempResult[i]==0)
                    ansResult[1]=i;


            }
        
        return ansResult;
        
    }
}