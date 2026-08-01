class Solution {
    boolean graphColoring(int v, int[][] edges, int m) 
    {
        int colorArr[]=new int[v];
        Arrays.fill(colorArr,-1);
        return canColor(edges,colorArr,v,m,0);
    }
    boolean canColor(int edges[][],int colorArr[],int v,int m,int currentNode){
        if(currentNode==v) {
            return true;
        }
        for(int color=1;color<=m;color++)
        {
            if(isColorPossible(colorArr,color,edges,currentNode))
            {
                colorArr[currentNode]=color;
              
                if(canColor(edges,colorArr,v,m,currentNode+1)){      //we wre giving if() condition because on finding one valid true branch in a tree
                    return true;                                     //we will not check for the remaining branches
                }                                                    //return true for that valid branch while bachtracking
              
                colorArr[currentNode]=-1;      //backtracking step
            }
        }
        return false;
    }
   boolean isColorPossible(int colorArr[], int color, int edges[][], int currentNode) 
   {
        for (int edge[] : edges) 
        {
           int u = edge[0];
           int v = edge[1];
           // as the graph is undirected [u,v] u ---> v and v ---> u, so check for both
           if (u == currentNode && colorArr[v] == color)   return false;     // 1. u ---> v.   current node is u, so check the colour of v
           if (v == currentNode && colorArr[u] == color)   return false;     // 2. v ---> u    current node is v, so check the colour of u
        }
        return true;
    } 
}
