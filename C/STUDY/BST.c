#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *left,*right;
};
struct node *root,*newnode,*temp,*pre1;
int x=0;
void insert(){
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->right=0;
	newnode->left=0;
	printf("Enter data\n");
	scanf("%d",&newnode->data);
	if(x==0){
		root=newnode;
		x++;
	}
	else{
		temp=root;
		while(1){
			if(newnode->data>temp->data){
				if(temp->right!=0){
				temp=temp->right;
				}
				else{
					temp->right=newnode;
					break;
				}
			}
			else{
				if(temp->left!=0){
					temp=temp->left;
				}
				else{
					temp->left=newnode;
					break;
				}
			}
			
		}
	}
}
int in(struct node *r){
	if(r!=NULL){
		in(r->left);
		printf("%d",r->data);
		in(r->right);
	}
}
void pre(struct node *r){
	if(r!=NULL){
		printf("%d ",r->data);
		pre(r->left);
		pre(r->right);
	}
}
void post(struct node *r){
	if(r!=NULL){
		post(r->left);
		post(r->right);	
		printf("%d ",r->data);
	}
}
void insuc(struct node *r,int u)
{
	temp=r;
	while(temp->data!=u){
		pre1=temp;
		if(u<temp->data)
		{
			if(temp->left!=0){
				temp=temp->left;
			}
			else{
				break;
				}
		}
		else
		{
				if(temp->right!=0){
					temp=temp->right;
				}
				else{
					break;
				}	
		}	
		}
		
		if(temp->right==NULL){
		printf("suc - %d",pre1->data)	;
		}
		{
		temp=temp->right;
		while(temp->left!=NULL){
			temp=temp->left;}
		printf("%d",temp->data);	
		}
		
}
void main(){
int o=1;
printf("Enter any option\n");
printf("1.Insert\n2.In\n3.post");
printf("\n4.pre\n5.Insuc\n");
while(o!=0)
{
	printf("Enter in your option \n");
	scanf("%d",&o);
	switch(o){
	case 1:insert();
	break;
	case 2:in(root);
	break;
	case 3:post(root);
	break;
	case 4:pre(root);
	break;
	case 5:insuc(root,10);
	break;

	}
}	
}