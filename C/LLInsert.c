#include<stdio.h>
#include<stdlib.h>
struct node
  {
	int data;
	struct node *next;
  };
struct node *head,*newnode,*temp;
void Beg()
{
	
	printf("Enter the data ");
	scanf("%d",&newnode->data);
	newnode->next=head;
	head=newnode;
}
void Between()
{	
	int x;
	printf("Enter the node data for position");
	scanf("%d",&x);
	printf("Enter the data ");
	scanf("%d",&newnode->data);
	temp=head;
	while(temp->next!=NULL)
	 {
		if(temp->data==x)
		{
			break;
		}
		temp=temp->next;	
	 }
	newnode->next=temp->next;
	temp->next=newnode;
	
}
void End()
{
	printf("Enter the data ");
	scanf("%d",&newnode->data);
	while(temp->next!=NULL)
	 {
		temp=temp->next;	
	 }
	temp->next=newnode;
	newnode->next=0;
}
void display()
{
	temp=head;
	int count=0;
	while(temp!=0)
	  {
		printf("%d\n",temp->data);
		count++;
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
	int c=1,o,i,m;
	while(c==1)
	{
		printf("Enter any of the below option number\n1.AddNode\n2.Begining\n3.End\n4.Between\n5.Dispaly\n");
		scanf("%d",&o);
		newnode=(struct node *)malloc(sizeof(struct node));
		switch(o)
		{
			case 1 : addnode();
			break;
			case 2 : Beg(m);
			break;
			case 3 : End(m);
			break;
			case 4 : Between();
			break;
			case 5 : display();
			break;
		}
		printf("Do you want to continue(0/1)\n");
		scanf("%d",&c);
	}	
  }
