#include<stdio.h>
#include<conio.h>
int a[7][7]={
		{0,1,1,1,0,0,0},
        {1,0,1,0,0,0,0},
        {1,1,0,1,1,0,0},
        {1,0,1,0,1,0,0},
        {0,0,1,1,0,1,1},
        {0,0,0,0,1,0,0}, 
        {0,0,0,0,1,0,0}};
int q[20],visited[20],n=7,i,j,f=1,r=0;
void bfs(int v) {
		
	for (i=0;i<n;i++){
	   printf("i - %d -- V - %d\n",i,visited[i]);
		if(a[v][i] && !visited[i]){
	  	q[++r]=i;
	  }
	} 
	if(f<=r) {
		visited[q[f]]=1;
		bfs(q[f++]);
	}
}
void main() {
	int v;
	for (i=0;i<n;i++){
		q[i]=0;
		visited[i]=0;}
	q[r]=0;
	visited[0]=1;
	bfs(0);
	printf("\n The node which are reachable are:\n");
	for (int i=0;i<n;i++) {
	printf("%d\t",q[i]);}

}