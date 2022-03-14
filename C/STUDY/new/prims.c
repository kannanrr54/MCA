#include<stdio.h>
void main()
{
	int v=4,s[v],n=0,min=999,x,y;
	int total=0;
	int g[4][4]={
	{0,1,10,0},
  	{1,0,8,15},
  	{10,0,0,12},
  	{0,15,12,0}};
  	for (int i=0;i<4;i++){
  		s[i]=0;}
  	s[0]=1;
  	while(n<v-1){
  		min=999,x=0,y=0;
  		for (int i=0;i<4;i++){
  		if(s[i]){
  			for (int j=0;j<4;j++){
  				if(!s[j] && g[i][j]){
  					if(min>g[i][j]){
  						min=g[i][j];
  						x=i;
  						y=j;
					  }
				  }
			  }
		  }
		
	  }
	printf("%d - %d -> %d\n",x,y,g[x][y]);
	total+=g[x][y];
	s[y]=1;
	n++;
  }
	  }