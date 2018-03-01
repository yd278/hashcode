public class Position {
    public int x;
    public int y;
    public static int dist(Position a, Position b){
        return Math.abs(a.x-b.x)+Math.abs(a.y-b.y);
    }
}
