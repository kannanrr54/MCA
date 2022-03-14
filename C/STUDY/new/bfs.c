#include<stdio.h>
#include<conio.h>
 int a[4][4]={
			{0,1,0,1},
	        {1,0,1,0},
	        {0,1,0,1},
	        {1,0,1,0}};
int q[4],v[4],r=0,f=0;
bfs(int x){
	for(int i=0;i<4;i++){
		if(!v[i] && a[x][i]){
			q[++r]=i;
			v[i]=1;
			printf("->%d ",i);
		}
	}
	if(++f<=r){
		bfs(q[f]);
	}
}
void main(){
	for (int i=0;i<4;i++)
	v[i]=0;
	
	v[0]=1;
	q[0]=0;
	printf("0");
	bfs(0);
	
}