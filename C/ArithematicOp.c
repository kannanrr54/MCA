#include<stdio.h>
#define n 5
int a[n],x,n;
void sum()
{
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
	}
	printf("Sum is %d",sum);
}
void small()
{
	int sm=a[0];
	for(int i=1;i<n;i++)
	{
		if(sm>a[i])
		{
			sm=a[i];
		}
	}
	printf("Smallest number is %d",sm);
}
void large()
{
	int lg=a[0];
	for(int i=1;i<n;i++)
	{
		if(lg<a[i])
		{
			lg=a[i];
		}
	}
	printf("Smallest number is %d",lg);
}
void reverse()
{
	printf("Reverse is \n");
	for(int i=n-1;i>=0;i--)
	{
		printf("%d\n",a[i]);	
	}
	
}
void mean()
{
	int sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
	}
	printf("Mean is %d",sum/n);
}
void main()
{
	//printf("Enter in the array size");
	//scanf("%d",&n);
	printf("Enter array elements");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter in any operation number\n1.Sum\n2.Smallest\n3.Largest\n4.Reverse\n5.Mean\n");
	scanf("%d",&x);
	switch(x)
	{
		case 1	:sum();
		break;
		case 2	:small();
		break;
		case 3	:large();
		break;
		case 4	:reverse();
		break;
		case 5	:mean();
		break;
		default :printf("Invalid selection");
	}
}


	
