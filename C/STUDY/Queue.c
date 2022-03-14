#include<stdio.h>
int q[10],n=10,front=-1,rear=-1;
void insert(){
if(front==0 && rear==n-1){
	printf("Overflow\n");
}	
else if(front==-1 && rear==-1){
	front=rear=0;
}
else{
	rear++;
}
printf("Enter Data\n");
scanf("%d",&q[rear]);
}
void delete(){
if(front==-1 || front>rear){
	printf("Underflow");
}
else{
	front++;
	if(front>rear){
		front=rear=-1;
	}
}
}
void dis(){
	for (int i=front;i<=rear;i++){
		printf("%d",q[i]);
	}
}
void main(){
	int o=1;
	printf("Enter any option \n1.insert\n2.delete\n3.display\n");
	while(o!=0){
		printf("Enter option\n");
		scanf("%d",&o);
		switch(o){
			case 1 : insert();
			break;
			case 2 : delete();
			break;
			case 3 : dis();
			break;
		}
	}
}