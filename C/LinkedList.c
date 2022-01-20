#include<stdio.h>
#include<stdlib.h>
struct node
  {
	int data;
	struct node *next;
  };
struct node *head,*newnode,*temp;
void search(int x)
{	//bool f=false;
	temp=head;
	int p=0,f=0;
	while(temp!=0)
	  {
		
		p++;
		if(temp->data==x)
		{
			f=1;
			break;
		}
		temp=temp->next;
		
	  }
	if(f==1)
	  {
		printf("Position is %d\n",p);
	  }
	else
	 {
		printf("Element not present\n");
	 }
}
void count()
{
	temp=head;
	int c=0;
	while(temp!=0)
	  {
		printf("%d\n",temp->data);
		temp=temp->next;
		c++;
	  }
	printf("Count is %d\n",c);
}
void display()
{
	temp=head;
	while(temp!=0)
	  {
		printf("%d\n",temp->data);
		temp=temp->next;
	  }
}
void addnode()
{
	int o=1,c=0;
	head=0;
	while(o==1)
	  {
		newnode=(struct node *)malloc(sizeof(struct node));
		printf("Enter the data ");
		scanf("%d",&newnode->data);
		newnode->next=0;
		if(head==0)
		  {
			head=temp=newnode;
		  }
		else
		  {
			temp->next=newnode;
			temp=newnode;
		  }
		printf("Do you want to continue insertion (0/1) ");
		scanf("%d",&o);
	  }
}
void main()
  {
	int c=1,o,i;
	while(c==1)
	{
		printf("Enter any of the below option number\n1.AddNode\n2.Display\n3.Count\n4.Search\n");
		scanf("%d",&o);
		switch(o)
		{
			case 1 : addnode();
			break;
			case 2 : display();
			break;
			case 3 : count();
			break;
			case 4 :
			printf("Enter the integer to find\n");
			scanf("%d",&i);
			search(i);
			break;
		}
		printf("Do you want to continue(0/1)\n");
		scanf("%d",&c);
	}	
  }
