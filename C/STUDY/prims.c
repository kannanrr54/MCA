#include<stdio.h>
void main()
{
	int v=4,s[v],n=0;
	int total=0;
	int g[4][4]={
	{0,1,10,0},
  	{1,0,8,15},
  	{10,0,0,12},
  	{0,15,12,0}};
  	for (int i=0;i<v;i++){
  		s[i]=0;
	  }
  	s[0]=1;
  	while(n<v-1){
  		int min=999999,x=0,y=0;
  		for (int i=0;i<v;i++){
  			if(s[i]){
  				for (int j=0;j<v;j++){
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
		  n++;
		  printf("%d - %d -> %d\n",x,y,g[x][y]);
		  total+=g[x][y];
		  s[y]=1;
	  }
  	printf("Total cost = %d",total);
	
}