// quicksort
// import java.util.*;
// public class arrays{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         quicksort(arr,0,n-1);
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//     }
//     static void quicksort(int arr[],int low,int high){
//         if(low<high){
//             int p=partition(arr,low,high);
//             quicksort(arr,low,p-1);
//             quicksort(arr, p+1, high);
//         }
//     }
//     static int partition(int arr[],int low,int high){
//         int pivot=arr[high],i=low-1;
//         for(int j=low;j<high;j++){
//             if(arr[j]<pivot){
//                 i++;
//                 int temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//         int temp=arr[i+1];
//         arr[i+1]=arr[high];
//         arr[high]=temp;
//         return i+1;
//     }
// }
// ---------------------------------------
// merge sort
// import java.util.*;
// public class arrays{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         mergesort(arr,0,n-1);
//         for(int num:arr){
//             System.out.print(num+" ");
//         }
//     }
//     static void mergesort(int arr[],int low,int high){
//         if(low<high){
//             int mid=(low+high)/2;
//             mergesort(arr,low,mid);
//             mergesort(arr,mid+1,high);
//             merge(arr,low,mid,high);
//         }
//     }
//     static void merge(int arr[],int low,int mid,int high){
//         int[] left=Arrays.copyOfRange(arr,low,mid+1);
//         int[] right=Arrays.copyOfRange(arr,mid+1,high+1);
//         int i=0,j=0,k=low;
//         while(i<left.length && j<right.length){
//             if(left[i]<=right[j]){
//                 arr[k++]=left[i++];
//             }
//             else{
//                 arr[k++]=right[j++];
//             }
//         }
//         while(i<left.length){
//             arr[k++]=left[i++];
//         }
//         while(j<right.length){
//             arr[k++]=right[j++];
//         }
//     }
// }
// ----------------------------------------------
// dfs
// import java.util.*;
// public class arrays{
//     static void dfs(int v,List<List<Integer>> graph,boolean[] visited){
//         visited[v]=true;
//         System.out.println(v+" ");
//         for(int u:graph.get(v)){
//             if(!visited[u]) dfs(u,graph,visited);
//         }
//     }
//     public static void main(String[] args){
//         int n=6;
//         List<List<Integer>> graph=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             graph.add(new ArrayList<>());
//         }
//          graph.get(0).addAll(List.of(1,2,3));
//          graph.get(1).addAll(List.of(2,4));
//          graph.get(3).addAll(List.of(4,5));
//          boolean[] visited=new boolean[n];
//          dfs(0,graph,visited);
//     }
// }

// bfs
// import java.util.*;
// public class arrays{
//     static void bfs(int v,List<List<Integer>> graph,boolean[] visited){
//         visited[v]=true;
//         Queue<Integer> queue=new LinkedList<>();
//         queue.add(v);
//         while(!queue.isEmpty()){
//             int node=queue.poll();
//             System.out.print(node+" ");
//             for(int u:graph.get(node)){
//                 if(!visited[u]){
//                     visited[u]=true;
//                     queue.add(u);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//      int n=6;
//      List<List<Integer>> graph=new ArrayList<>();
//      for(int i=0;i<n;i++){
//         graph.add(new ArrayList<>());
//      }   
//       graph.get(0).addAll(List.of(1,2,3));
//         graph.get(1).addAll(List.of(2,4));
//         graph.get(3).addAll(List.of(4,5));
//         boolean[] visited=new boolean[n];
//         bfs(0,graph,visited);
//     }
// }
// --------------------------------------------
// prims
// public class arrays{
//     public static void main(String[] args){
//         int[][] g={
//             {0, 2, 0, 6, 0},
//             {2, 0, 3, 8, 5},
//             {0, 3, 0, 0, 7},
//             {6, 8, 0, 0, 9},
//             {0, 5, 7, 9, 0}
//         };
//         int V=g.length,cost=0;
//         boolean[] visited=new boolean[V];
//         visited[0]=true;
//         for(int i=0;i<V;i++){
//             int min=Integer.MAX_VALUE,u=-1,v=-1;
//             for(int j=0;j<V;j++){
//                 if(visited[j]){
//                     for(int k=0;k<V;k++){
//                         if(!visited[k] && g[j][k]!=0 && g[j][k]<min){
//                             min=g[j][k];
//                             u=j;
//                             v=k;
//                         }
//                     }
//                 }
//             }
//             if(v!=-1){
//                 visited[v]=true;
//                 cost+=min;
//             }
//         }
//         System.out.println( cost);
//     }
// }
// --------------------------------------
// floyd warshall
// public class arrays{
//     public static void main(String[] args) {
//         int INF=99999;
//         int[][] d={
//             {0, 3, INF, 5},
//             {2, 0, INF, 4},
//             {INF, 1, 0, INF},
//             {INF, INF, 2, 0}
//         };
//         int n=d.length;
//         for(int k=0;k<n;k++){
//             for(int i=0;i<n;i++){
//                 for(int j=0;j<n;j++){
//                     d[i][j]=Math.min(d[i][j],d[i][k]+d[k][j]);
//                 }
//             }
//         }
//         for(int[] row:d){
//             for(int val:row){
//                 System.out.print((val==INF?"INF":val)+" ");
//             }
//             System.out.println();
//         }
//     }}
// -----------------------------------------
// 0/1 knapsack
// public class arrays{
//     static int maxvalue=0;
//     static String path="";
//     public static void main(String[] args){
//         int[] arr={2,3,5,6,8};
//         int  target=8;
//         sub(arr,0,0,"",target);
//     }
//     static void sub(int[] arr,int i,int sum,String p,int target){
//         if(i==arr.length){
//             if(sum<=target && sum>maxvalue){
//                 maxvalue=sum;
//                 path=p;
//             }
//             return;
//         }
//         sub(arr,i+1,sum+arr[i],p+arr[i]+" ",target);
//         sub(arr,i+1,sum,p,target);
//     }
// }
// -----------------------------------------
// n queeens
// public class arrays{
//     public static void main(String[] args) {
//         int[] q=new int[8];
//         solve(q,0);
//     }
//     static boolean solve(int[] q,int r){
//         if(r==8){
//             for(int i:q){ System.out.print(i+" ");}
//             return true;
//         }
//         for(int c=0;c<8;c++){
//             boolean safe=true;
//             for(int i=0;i<r;i++){
//                 if(q[i]==c || Math.abs(q[i]-c)==Math.abs(i-r)){
//                     safe=false;
//                     break;
//                 }
//             }
//             if(safe){
//                 q[r]=c;
//                 if(solve(q,r+1)) return true;
//             }
//         }
//         return false;
//     }
// }