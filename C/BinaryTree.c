#include<stdio.h>
#include<stdlib.h>
struct node
 {
	struct node *left,*right;
	int data;
 };
struct node *NewNode()
  {
	int  x;
	struct node *temp;
	temp=(struct node *)malloc(sizeof(struct node));
	printf("Enter the data (enter in 0 if no data)\n");
	scanf("%d",&temp->data);
	if(temp->data==0){
	 return NULL;
	}
	printf("\nLeft Child of node %d\n",temp->data);
	temp->left=NewNode();
	printf("\nRight Child of node %d\n",temp->data);
	temp->right=NewNode();
  }
void preorder(struct node *r)
 {
	if(r!=NULL)
	 {
		printf("%d",r->data);
		preorder(r->left);
		preorder(r->right);
	 }
 }
void postorder(struct node *r)
 {
	if(r!=NULL)
	 {
		postorder(r->left);
		postorder(r->right);
		printf("%d",r->data);	
	 }
 }
void inorder(struct node *r)
 {
	if(r!=NULL)
	 {
		inorder(r->left);
		printf("%d",r->data);
		inorder(r->right);
	 }
 }
void main()
 {
	int x;
	struct node *root;
	root=NewNode();
	preorder(root);
	printf("\n");
	postorder(root);
	printf("\n");
	inorder(root);
	
 }
