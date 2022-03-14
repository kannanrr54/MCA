#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
struct node *newnode,*temp,*head,*prev;
int x=0;
void Create(){
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter in the data\n");
	scanf("%d",&newnode->data);
	newnode->next=0;
	if(x==0){
		x++;
		head=temp=newnode;
	}
	else{
		temp->next=newnode;
		temp=newnode;
	}	
}
void new(){
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("Enter in the data\n");
	scanf("%d",&newnode->data);
	newnode->next=0;
}
void Dis(){
	temp=head;
	while(temp!=0){
		printf("%d ",temp->data);
		temp=temp->next;
	}
}
void Bin(){
	temp=head;
	new();
	newnode->next=head;
	head=newnode;
}
void Min(){
	int u=0;
	temp=head;
	new();
	printf("Enter the place to insert\n");
	scanf("%d",&u);
	while(temp->data!=u){
		temp=temp->next;	
	}	
	newnode->next=temp->next;
	temp->next=newnode;	
}
void Ein(){
	temp=head;
	new();
	while(temp->next!=0){
		printf("%d ",temp->data);
		temp=temp->next;
	}
	temp->next=newnode;
}
void Bd(){
	head=head->next;
}
void Md(){
	temp=head;
	int u=0;
	printf("Enter the place to delete\n");
	scanf("%d",&u);
	while(temp->data!=u)
		temp=temp->next;
	temp->next=temp->next->next;
}
void Ed(){
	temp=head;
	while(temp->next!=0){
		prev=temp;
		temp=temp->next;
	}
	prev->next=0;	
}
void main()
{
int o=1;
printf("Enter any option\n");
printf("1.Add Node\n2.Insert Beginning\n3.Insert Between\n4.Insert End");
printf("\n5.Delete Beginning\n6.Delete Between\n7.Delete End\n8.Display\n");

while(o!=0)
{
	printf("Enter in your option \n");
	scanf("%d",&o);
	switch(o){
	case 1:Create();
	break;
	case 2:Bin();
	break;
	case 3:Min();
	break;
	case 4:Ein();
	break;
	case 5:Bd();
	break;
	case 6:Md();
	break;
	case 7:Ed();
	break;
	case 8:Dis();
	break;
	}
}

}