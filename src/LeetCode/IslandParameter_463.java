package LeetCode;

public class IslandParameter_463 {

    public int islandPerimeter(int[][] grid) {
        int counter = 0;
        int checker = 0;
        for(int[] row: grid) {
            for(int column: row) {
                if(column == 1) counter++;
            }
            checker++;
        }

        if(checker == counter && checker > 2) {
            return counter * 2;
        }

        return (counter + 1) * 2;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,1}, {1,1}};
        IslandParameter_463 object = new IslandParameter_463();
        int result = object.islandPerimeter(grid);
        System.out.println(result);
    }
}
