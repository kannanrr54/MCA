#include<stdio.h>
int g[4][4]={{0,2,3,0},
            {2,0,2,1},
            {3,2,0,4},
            {0,1,4,0}};
int parent[9];
int m,o,n=4,a,b,x=1,min,c=0;
int find(int y){
	if(parent[y])
		y=parent[y];
	return y;
}

int uni(int i,int j){
	if(i!=j){
		parent[j]=i;
		return 1;
	}
	return 0;
}
void main(){
	for (int i=0;i<n;i++){
	for (int j=0;j<n;j++){
		if(g[i][j]==0){
			g[i][j]=999;
		}}}
	while(x<n){
		min=999;
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if(min>g[i][j]){
					min=g[i][j];
					a=m=i;
					b=o=j;
				}	
			}
		}
		m=find(m);
		o=find(o);
		if(uni(m,o)){
			printf("%d -> %d - %d\n",a+1,b+1,min);
			x++;
			c+=min;
		}
		g[a][b]=g[b][a]=999;
	}
	printf("Cost - %d",c);	
}