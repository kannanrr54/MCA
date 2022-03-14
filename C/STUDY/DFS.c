#include<stdio.h>
#define v 5
int g[v][v]={
		{0,1,1,1,0},
		{1,0,1,0,1},
		{1,1,0,0,0},
		{1,0,0,0,0},
		{0,1,0,0,0}};
int s[v];
void dfs(int i){
	printf("%d \n",i);
	s[i]=1;
	for (int j=0;j<v;j++){
		if(!s[j] && g[i][j]==1){
			dfs(j);
		}
	}
}
void main()
{
	
	for (int i=0;i<v;i++){
		s[i]=0;
	}
	dfs(0);
	for(int i=0;i<v;i++){
		if(!s[i])
		dfs(i);
	}
}
