package graphdata;

public class Test {
    public static void main(String[] args) {
        // Insert csv file into here to create path
        Path path = new Path("E:\\pathfinding\\graphdata\\data\\A_to_C.csv");
        System.out.println(path);
        System.out.println(path.shortestPath("A", "C"));;
    }
}
