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
    int m;
	printf("Enter value to insert");
    scanf("%d",&m);
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=m;
	newnode->next=head;
	head=newnode;
}
void Between()
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
void End()
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
		printf("Enter any of the below option number\n1.AddNode\n2.Begining\n3.End\n4.Between\n5.Dispaly\n");
		scanf("%d",&o);
		switch(o)
		{
			case 1 : addnode();
			break;
			case 2 : Beg();
			break;
			case 4 : Between();
			break;
			case 3 : End();
			break;
			case 5 : display();
			break;
		}
		printf("Do you want to continue(0/1)\n");
		scanf("%d",&c);
	}	
  }
