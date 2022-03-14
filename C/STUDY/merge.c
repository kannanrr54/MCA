#include<stdio.h>
void main(){
	int a[5]={1,3,5,7,9},b[5]={2,4,6,8,10};
	int c[10],k=0,i=0,j=0;
	while(i<5 && j<5)
	{
		
		if(a[i]<b[j]){
			c[k]=a[i];
			i++;
			k++;	
		}
		else{
			c[k]=b[j];
			j++;
			k++;
		}
	}
	while(i<5){
		c[k]=a[i];
		i++;
		k++;
	}
	while(j<5){
		c[k]=b[j];
		j++;
		k++;
	}
		
	for (int v=0;v<k;v++){
		printf("%d \n",c[v]);
	}
	
}