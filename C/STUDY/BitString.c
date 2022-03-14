#include<stdio.h>
void main(){
	int a[5]={1,2,3,4,5},b[5]={6,7,8,9,10},u[10]={1,2,3,4,5,6,7,8,9,10},a1[10],b1[10],c[10];
	for(int i=0;i<10;i++){
		for(int j=0;j<5;j++){
			if(a[j]==u[i]){
				a1[i]=1;
				break;
			}
			else{
				a1[i]=0;
			}
		}
		for(int j=0;j<5;j++){
			if(b[j]==u[i]){
				b1[i]=1;
				break;
			}
			else{
				b1[i]=0;
			}
		}
	}
	for(int i=0;i<10;i++){
		printf("%d ",a1[i]);
	}
	printf("\n");
	for(int i=0;i<10;i++){
		printf("%d ",b1[i]);
	}
	
	printf("Union\n");
	for(int i=0;i<10;i++){
		printf("%d ",a1[i]|b1[i]);
	}
	printf("\nIntersection\n");
	for(int i=0;i<10;i++){
		printf("%d ",a1[i]*b1[i]);
	}
	printf("\nDifference\n");
	for(int i=0;i<10;i++){
		if(b1[i]==0){
			c[i]=1;
		}
		else{
			c[i]=1;
		}
		printf("%d ",a1[i]*c[i]);
	}
}