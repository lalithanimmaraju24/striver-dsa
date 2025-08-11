package org.striver.dsa.graph;

import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, boolean[] visited, ArrayList<ArrayList<Integer>> adjacencyList, ArrayList<Integer> res){
        visited[node]= true;
        res.add(node);
        for(int nextNode: adjacencyList.get(node)){
            if(!visited[nextNode]){
                visited[nextNode] = true;
                dfs(nextNode, visited,adjacencyList,res);
            }
        }
    }
    public static void main(String[] args) {
        int n =8;
        int[][] input = new int[][]{{1,2},{1,3},{2,5},{2,6},{3,7},{3,4},{7,8},{4,8}};
        ArrayList<ArrayList<Integer>> list = GraphRepresentation.representAdjacencyList(8,input);
        ArrayList<Integer> res = new ArrayList<>();
        dfs(1,new boolean[n+1],list, res);
        res.forEach(System.out::println);
    }
}
