package org.striver.dsa.graph;

import java.util.ArrayList;

public class GraphRepresentation {
    public static void representAdjacencyMatrix(int n,int[][] input){
        int[][] matrix = new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            matrix[input[i][0]][input[i][1]] = 1;
            matrix[input[i][1]][input[i][0]] = 1;
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> representAdjacencyList(int n,int[][] input){
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjacencyList.add(new ArrayList<>());
        }
        for(int i=0;i<input.length;i++){
            adjacencyList.get(input[i][0]).add(input[i][1]);
            adjacencyList.get(input[i][1]).add(input[i][0]);
        }
        for(int i=0;i<=n;i++){
            System.out.print(i+" -> ");
            for(int j=0;j<adjacencyList.get(i).size();j++){
                System.out.print(adjacencyList.get(i).get(j)+" ");
            }
            System.out.println();
        }
        return adjacencyList;
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] input = {{1, 2}, {1, 3}, {3, 4}, {2, 4}, {2, 5}, {4, 5}};
        representAdjacencyMatrix(n, input);
        representAdjacencyList(n,input);
    }
}
