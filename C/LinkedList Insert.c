#include<stdio.h>
#include<stdlib.h>
struct node
  {
	int data;
	struct node *next;
  };
struct node *head,*newnode,*temp;
void Beg(int x)
{
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter the data ");
	scanf("%d",&newnode->data);
	newnode->next=head;
	head=newnode;
}
void Between(int x)
{
	
	temp=head;
	while(temp->next!=0)
	 {
		if(temp->data==x)
		{
			break;
		}
		temp=temp->next;	
	 }
	temp->next=newnode;
	newnode->next=temp->next;
}
void End()
{
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter the data ");
	scanf("%d",&newnode->data);
	while(temp->next!=0)
	 {
		temp=temp->next;	
	 }
	temp->next=newnode;
	newnode->next=0;
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
	int c=1,o,i,m;
	while(c==1)
	{
		printf("Enter any of the below option number\n1.AddNode\n2.Begining\n3.End\n4.Between\n5.Dispaly\n");
		scanf("%d",&o);
printf("Enter value to insert");
scanf("%d",&m);
		switch(o)
		{
			case 1 : addnode();
			break;
			case 2 : Beg(m);
			break;
			case 3 : Between(m);
			break;
			case 3 : End(m);
			break;
		}
		printf("Do you want to continue(0/1)\n");
		scanf("%d",&c);
	}	
  }
