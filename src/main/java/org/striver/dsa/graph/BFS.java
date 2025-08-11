package org.striver.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjacencyList,int n){
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        queue.add(6);
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            bfs.add(node);
            vis[node] = true;
            for(int i=0;i<adjacencyList.get(node).size();i++){
                if(!vis[adjacencyList.get(node).get(i)]){
                    queue.add(adjacencyList.get(node).get(i));
                    vis[adjacencyList.get(node).get(i)] = true;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(bfs.get(i));
        }
        return bfs;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{{1,2},{1,6},{2,3},{2,4},{6,7},{6,8},{4,5},{7,5}};
        int n = 8;
        ArrayList<ArrayList<Integer>> adjacencyList = GraphRepresentation.representAdjacencyList(n,input);
        bfs(adjacencyList,n);
    }
}
