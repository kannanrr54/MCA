#include<stdio.h>
#include<conio.h>
int a[5][5]={
			{0,1,1,1,0},
		{1,0,1,0,1},
		{1,1,0,0,0},
		{1,0,0,0,0},
		{0,1,0,0,0}};
        int v[5];
void dfs(int x){
	printf("%d ",x);
	v[x]=1;
		for(int j=0;j<5;j++){
			if(!v[j] && a[x][j]){
				dfs(j); 
			}
		}
	}
void main(){
	for (int i=0;i<5;i++){
		v[i]=0;
	}
	dfs(0);
	for (int i=0;i<5;i++){
		if(!v[i]){
			dfs(i);
		}
	}
}