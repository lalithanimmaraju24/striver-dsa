package org.striver.dsa.Step_1.Basic_Hashing;

import java.util.Scanner;

public class Theory {
    public static int[] numberHashing(int[] arr){
        int[] res = new int[1000];
        for(int i=0;i<arr.length;i++){
            res[arr[i]]+=1;
        }
        return res;
    }
    public static int[] characterHashing_lowerCase(String s){
        int[] res = new int[26];
        for(int i=0;i<s.length(); i++){
            res[s.charAt(i)-'a']+=1;
        }
        return res;
    }
    public static int[] characterHashing(String s){
        int[] res = new int[256];
        for(int i=0;i<s.length();i++){
            res[s.charAt(i)]+=1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,1};
        String str = "saisurya";
        String allCaseStr = "SaiSurya";
//      int[] res = numberHashing(arr);
//      int[] res = characterHashing_lowerCase(str);
        int[] res = characterHashing(allCaseStr);
        Scanner s = new Scanner(System.in);
        int Q = s.nextInt();
        for(int i=0;i<Q;i++){
            System.out.println(res[s.next().charAt(0)]);
        }
    }

}
