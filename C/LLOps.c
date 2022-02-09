#include<stdio.h>
#include<stdlib.h>
struct node
  {
	int data;
	struct node *next;
  };
struct node *head,*newnode,*temp,*prev;
void InsertBeg()
{
    int m;
	printf("Enter value to insert");
    scanf("%d",&m);
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=m;
	newnode->next=head;
	head=newnode;
}
void InsertBetween()
{
    int m,x;
	printf("Enter value to insert");
    scanf("%d",&m);
    printf("Enter after which value to insert");
    scanf("%d",&x);
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=m;
	temp=head;
	while(temp->next!=0)
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
void InsertEnd()
{
    int m;
    printf("Enter value to insert");
    scanf("%d",&m);
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=m;
	while(temp->next!=0)
	 {
		temp=temp->next;	
	 }
	temp->next=newnode;
	newnode->next=0;
}
void DeleteBeg()
{
	head=head->next;
}
void DeleteBetween()
{	
	int x;
	printf("Enter the node data for position");
	scanf("%d",&x);
	temp=head;
	while(temp->data!=x)
	 {
		temp=temp->next;	
	 }
	temp->next=temp->next->next;
	
}
void DeleteEnd()
{
	temp=head;
	while(temp->next!=0)
	 {
		prev=temp;
		temp=temp->next;
	 }
	prev->next=NULL;
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
	int o=1,c=0,m;
	printf("Enter value to insert");
    scanf("%d",&m);
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=m;
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
}
void main()
  {
	int c=1,o,i,m;
	head=0;
	while(c==1)
	{
		printf("Enter any of the below option number\n1.AddNode\n2.Insert-Begining\n3.Insert-End\n4.Insert-Between\n5.Delete-Begining\n6.Delete-End\n7.Delete-Between\n8.Dispaly\n");
		scanf("%d",&o);
		switch(o)
		{
			case 1 : addnode();
			break;
			case 2 : InsertBeg();
			break;
			case 3 : InsertBetween();
			break;
			case 4 : InsertEnd();
			break;
			case 5 : DeleteEnd();
			break;
			case 6 : DeleteEnd();
			break;
			case 7 : DeleteEnd();
			break;
			case 8 : display();
			break;
		}
		printf("Do you want to continue(0/1)\n");
		scanf("%d",&c);
	}	
  }
