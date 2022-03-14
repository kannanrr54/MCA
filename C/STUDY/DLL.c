#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next,*prev;
};
struct node *newnode,*temp,*head,*pre;
int x=0;
void Create(){
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter data\n");
	scanf("%d",&newnode->data);
	newnode->prev=0;
	newnode->next=0;
	if(x==0){
		head=temp=newnode;
		x++;
	}else{
		temp->next=newnode;
		newnode->prev=temp;
		temp=newnode;
	}	
}
void new(){
	newnode=(struct node *)malloc(sizeof(struct node));
	printf("Enter data\n");
	scanf("%d",&newnode->data);
	newnode->prev=0;
	newnode->next=0;	
}
void Dis(){
	temp=head;
	while(temp!=0){
		printf("%d",temp->data);
		temp=temp->next;
	}
}
void Bin(){
	new();
	newnode->next=head;
	head->prev=newnode;
	head=newnode;	
}
void Min(){
	temp=head;
	int u=0;
	printf("Enter position\n");
	scanf("%d",&u);
	new();
	while(temp->data!=u){
		temp=temp->next;
	}
	newnode->next=temp->next;
	newnode->prev=temp;
	temp->next->prev=newnode;
	temp->next=newnode;
}
void Ein(){
	temp=head;
	new();
	while(temp->next!=0)
		temp=temp->next;
	newnode->prev=temp;
	temp->next=newnode;
}
void Bd(){
	head->next->prev=head;
	head=head->next;
}
void Md(){
	temp=head;
	int u=0;
	printf("Enter position\n");
	scanf("%d",&u);	
	while(temp->data!=u){
		temp=temp->next;
	}
	temp->next->next->prev=temp;
	temp->next=temp->next->next;
}
void Ed(){
while(temp->next!=0){
		temp=temp->next;
	}
	temp->prev->next=0;	
}
void main(){
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