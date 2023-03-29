//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

class Pair{
    int node;
    int parent;
    Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] vis=new boolean[V];
       for(int i=0;i<V;i++){
           if(vis[i]==false){
               if(check(i,vis,adj)){
                   return true;
               }
           }
       }
       return false;
    }
    public boolean check(int i,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
         Queue<Pair> q=new ArrayDeque<>();
        vis[i]=true;
       q.add(new Pair(i,0));
       while(q.size()>0){
           int nod=q.peek().node;
           int paren=q.peek().parent;
           q.remove();
           for(Integer it:adj.get(nod)){
               if(vis[it]==false){
                   vis[it]=true;
                   q.add(new Pair(it,nod));
               }else{
                   
               if(paren!=it){
                       return true;
                   }
               }
           }
       }
       return false;
    }
}