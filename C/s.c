#include<stdio.h>
void main()
{
	int g[10][10],n=0;
	printf("\nEnter the no. of vertices:");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		    printf("Enter the edge weight of %d to %d ",i,j);
			scanf("%d",&graph[i][j]);
		}
	}
	printf("\n");
	for(int i=0;i<4;i++)
	{
		if(a[i]>a[i+1])
		{
			int x=a[i];
			a[i]=a[i+1];
			a[i+1]=x;	
		}
		
	}
	for(int i=0;i<5;i++)
	{
		printf("%d ",a[i]);
	}
}