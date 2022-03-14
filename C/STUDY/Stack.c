#include<stdio.h>
int s[10],n=10,top=-1;
void push(){
	if(top==n-1){
		printf("Overflow\n");
	}
	else{
		++top;
		printf("Enter data\n");
		scanf("%d",&s[top]);
	}
}
void pop(){
	if(top==-1){
		printf("underflow\n");
	}
	else{
		printf("Element popped - %d\n",s[top]);
		top--;
	}
}
void dis(){
	for (int i=0;i<=top;i++){
		printf("%d",s[i]);
	}
}
void main(){
	int o=1;
	printf("Enter any option \n1.Push\n2.pop\n3.display\n");
	while(o!=0){
		printf("Enter option\n");
		scanf("%d",&o);
		switch(o){
			case 1 : push();
			break;
			case 2 : pop();
			break;
			case 3 : dis();
			break;
		}
	}
}