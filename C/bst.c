#include <stdio.h>
#include <stdlib.h>
struct node
{
	int data;
	struct node *left, *right;
};
void inorder(struct node *r)
 {
	if(r!=NULL)
	 {
		inorder(r->left);
		printf("%d",r->data);
		inorder(r->right);
	 }
 }
 void min(struct node *r)
 {
    struct node *pre;
    while(pre->data != NULL && r->left!=NULL)
     {
         pre=r;
        r=r->left;
     }  
     printf("\nMin element is : %d",r->data);
 }
 void max(struct node *r)
 {
    struct node *pre;
    while(pre->data!=NULL && r->right!=NULL)
     {
        pre=r;
        r=r->right;
     }  
     printf("\nMax element is : %d",r->data);  
 }
 void insuc(struct node *r,int x)
 {
    struct node *temp=r,*l;
    struct node *n;
    while(temp->right!=NULL || temp->left!=NULL)
      {
        if(x==temp->data){
                n=temp;
                break;
            }
             else if(x> temp->data){
                temp=temp->right;  
            }
             else{
                l=temp;
                temp=temp->left;
            }  
      }
      if(temp->right!=NULL)
      {
          temp=temp->right;
          while(temp->left!=NULL)
          {
              temp=temp->left;
          }
          printf("\nInorder succesor of %d is %d",x,temp->data);
      }
      else
      {
          printf("\nInorder succesor of %d is %d",x,l->data);
      }
 }
 void search(struct node *r,int x)
 {
     int f=0;
     struct node *pre;
     while(pre->right!=NULL || pre->left!=NULL)
     {
         if(x==r->data)
         {
            pre=r;
            f=1;
            break;
         }
         else if(x> r->data){
            pre=r;
            r=r->right;  
         }
         else{
            pre=r;
            r=r->left;
         }
         
     }
     if(f==1){
         printf("Found");
     }
     else{
         printf("Not Found");
     }
 }
void main()
{
	int n, i, item,x;
	struct node *new, *temp, *root;
	printf("Enter the number of elements\n");
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
	{
		new = (struct node *) malloc(sizeof(struct node));
		new->right = NULL;
		new->left = NULL;
		printf("Enter the data \n");
		scanf("%d", &item);
		new->data = item;
		if (i == 0){
			root = new;
		}
		else{
			temp = root;
			while (1){
				if (item > temp->data){
					if (temp->right != NULL){
						temp = temp->right;
					}
					else{
						temp->right = new;
						break;
					}
				}
				else{
						if (temp->left != NULL){
							temp = temp->left;
						}
						else{
							temp->left = new;
							break;
						}
				}
			}
		}
	}
	inorder(root);
	printf("\nEnter the data to search \n");
	scanf("%d",&x);
	//search(root,x);
	min(root);
	max(root);
	int v=0;
	printf("Enter an element to get inorder succesor\n");
	scanf("%d",&v);
	insuc(root,v);
}
