 #include<stdio.h>
 int q[20],visited[20],n=4,f=0,r=0;
 int a[4][4]={
			{0,1,0,1},
	        {1,0,1,0},
	        {0,1,0,1},
	        {1,0,1,0}};
 void bfs(int v) {
   for (int i = 0; i < n; i++) {
     if (a[v][i] && !visited[i]) {
       q[++r] = i;
       visited[i] = 1;
       printf(" -> %d", i);
     }
   }
   f = f + 1;
   if (f <= r)
     bfs(q[f]);
 }
 void main() {
   int v = 0;
   for (int i = 0; i < n; i++) {
     visited[i] = 0;
   }
   q[r] = v;
   printf("\nBFS traversal is:\n");
   visited[v] = 1;
   printf("%d", v);
   bfs(v);
   if (r != n - 1)
     printf("\n BFS is not possible");
 }