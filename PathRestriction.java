public class PathRestriction {
    public static void main(String[] args) {
boolean[][] maze = {
        {true,true,true},
        {true,false,true},
        {true,true,true}};
Restriction("",maze,0,0);
    }
    static void Restriction(String p, boolean[][] maze, int r, int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r < maze.length-1){
            Restriction(p+'D',maze,r+1,c);
        }
        if (c < maze.length-1){
            Restriction(p+'H',maze,r,c+1);
        }
    }
}
