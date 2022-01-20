#include<stdio.h>
#include<stdlib.h>
#define n 5
#define m 5
int a[n]={1,3,5,7,9},b[m]={2,4,6,8,10};
void main()
{
int i=0,j=0,c[10],k=0;
	while(i<n && j<m)
	 {
		if(a[i]<b[j])
		{
			c[k]=a[i];
			i++;
			k++;

		}
		else
		{
			c[k]=b[j];
			j++;
			k++;

		}
	   
	 }
	while(i<n)
	{
		c[k]=a[i];
		i++;
		k++;

	}
	while(j<m)
	{
		c[k]=b[j];
		k++;
		j++;
	}
	for(int i=0;i<k;i++)
	{
		printf("%d\n",c[i]);
	}
}
