package islandperimeter;

/**
 You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. 
 Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, 
 and there is exactly one island (i.e., one or more connected land cells). 
 The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
 One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
 Determine the perimeter of the island.
 * @author Novjean
 */
public class IslandPerimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m =4 ;
        int n =4;
        int[][] mat = new int[m][n];
        
        //Initalizing with map with 1 as land and 0 as water
        mat[0][0] = 0;        mat[0][1] = 1;        mat[0][2] = 0;        mat[0][3] = 0;
        mat[1][0] = 1;        mat[1][1] = 1;        mat[1][2] = 1;        mat[1][3] = 0;
        mat[2][0] = 0;        mat[2][1] = 1;        mat[2][2] = 0;        mat[2][3] = 0;
        mat[3][0] = 1;        mat[3][1] = 1;        mat[3][2] = 0;        mat[3][3] = 0;
   
        int perimeter = CalcPerimeter(mat, m ,n);
        System.out.println("Perimeeter: " + perimeter);
    }
    
    public static int CalcPerimeter(int[][] mat, int m , int n)    {
        int perimeter = 0, islands = 0, neighbours = 0;
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j] == 1){
                    islands++;
                    if(i < m-1 && mat[i+1][j] == 1)
                        neighbours++;
                    if(j<n-1 && mat[i][j+1] == 1)
                        neighbours++;
                }
            }
        }
        perimeter = islands *4 - neighbours*2;      //calculate the perimeter
        return perimeter;
    }
}
