#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int graph[4][4] ={{0,2,3,0},
                	{2,0,2,1},
                    {3,2,0,4},
                    {0,1,4,0}};

int i,j,a,b,u,v,n=4,ne=1;
int min,cost=0,parent[9];
int find(int);
int uni(int,int);
void main()
{
	/*printf("\nEnter the no. of vertices:");
	scanf("%d",&n);
	printf("\nEnter the cost adjacency matrix:\n");*/
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		   /* printf("Enter the edge weight of %d to %d ",i,j);
			scanf("%d",&graph[i][j]);*/
			if(graph[i][j]==0)
				graph[i][j]=999;
		}
	}
		for (int i=0;i<4;i++){
	for (int j=0;j<4;j++){
		printf("%d\n",graph[i][j]);
		}}
	printf("The edges of Minimum cost Spanning Tree are\n");
	while(ne < n)
	{
	    min=999;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(graph[i][j] < min)
				{
					min=graph[i][j];
					a=u=i;
					b=v=j;
				}
			}
		}
		u=find(u);
		v=find(v);
		if(uni(u,v))
		{
			printf("edge (%d,%d) =%d\n",a+1,b+1,min);
			cost +=min;
			ne++;
		}
		graph[a][b]=graph[b][a]=999;
	}
	printf("\nMinimum cost = %d\n",cost);
}
int find(int i)
{
	while(parent[i])
	{
	    i=parent[i];
	}
	return i;
}
int uni(int i,int j)
{
	if(i!=j)
	{
		parent[j]=i;
		return 1;
	}
	return 0;
}