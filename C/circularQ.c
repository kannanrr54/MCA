#include<stdio.h>
#include<stdlib.h>
#define n 3
int a[n],front=-1,rear=-1;
void EnQ()
{
	if(front==0 && rear==(n-1))
	{
		printf("Overflow\n");
	}
	else
	{
		if(front==-1 && rear==-1)
		{
			front=rear=0;
		}
		else if(front!=0 && rear==(n-1))
		{
			rear=0;
		}
		else
		{	
	        rear++;
		}
printf("Enter Data\n");
scanf("%d",&a[rear]);
	}

}
void DeQ()
{
	if(front==-1)
	{
		printf("Undefrlow\n");
	}
	else
	{
		if(front==rear)
		{
			front=rear=1;
		}
		else if(front==(n-1))
		{
			front=0;
		}
		else
		{
			front++;
		}

	}
}
void Display()
{
	if(front==-1 && rear==-1)
	{
		printf("Underflow\n");
	}
	else
	{
		if(front<rear)
		{
			for(int i=front;i<=rear;i++)
			{
				printf("%d\n",a[i]);
			} 
		}
		else
		{
		    if(rear<front)
		    {
		    for( int i=0;i<=rear;i++)
			{
			  printf("%d\n",a[i]);  
			}
		    }
			for(int i=front;i<n;i++)
			{
			printf("%d\n",a[i]);
			}
			
		}
	}
}
void main()
{
int a=0,c=1;
while(c==1)
{
printf("\nSelect any options\n1.Enqueue\n2.Dequeue\n3.Peak\n4.Display\n");
scanf("%d",&a);
	switch(a)
	{
		case 1 : EnQ();
		break;
		case 2 : DeQ();
		break;
		case 4 : Display();
		break;
	}
printf("Do you want to continue(0/1)");
scanf("%d",&c);
}
}
