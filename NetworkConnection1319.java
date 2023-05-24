import java.util.*;




public class NetworkConnection1319 {

    static public int makeConnected(int n, int[][] connections){
        int extraWires=0;
        HashSet<Integer> connectedSystems = new HashSet();
        for(int idx=0; idx<connections.length; idx++){
            if(connectedSystems.contains(connections[idx][0]) && connectedSystems.contains(connections[idx][1])){
                extraWires++;
            }
            connectedSystems.add(connections[idx][0]);
            connectedSystems.add(connections[idx][1]);
        }
        if(extraWires>=(n-connectedSystems.size())){
            return n-connectedSystems.size();
        }
        return -1;
    }

    public static void main(String[] args) {
//        int n=6;
//        int [][] connections= new int[][] {{0,1},{0,2},{0,3},{1,2},{1,3}};
//        int n=4;
//        int[] []  connections = new int[] [] {{0,1},{0,2},{1,2}};
        int n=6;
        int [] [] connections = new int[][] {{0,1},{0,2},{0,3},{1,2}};
        System.out.println(makeConnected(n,connections));
    }
}
