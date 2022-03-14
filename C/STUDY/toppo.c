#include<stdio.h>
void main(){
	int a[4][4];//={{0,1,1,0},{0,0,0,1},{0,0,0,1},{0,0,0,0}};
	int ind[4],f[4],n=0,in=0;
	for(int i=0;i<4;i++){
		ind[i]=0;
		f[i]=0;
		}
		  printf("\nEnter 1 if an edge exits or otherwise\n");
  for (int i=0;i<4;i++){
			for(int j=0;j<4;j++){
      scanf("%d", & a[i][j]);
    }
  }
	while(n<4){
		//finding indegree of all vertices
    int in = 0, ind[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a[j][i] == 1) {
          in ++;
        }
      }
      ind[i] = in ; in = 0;
    }
    //Actual sorting
    int t = 0;
    for (t = 0; t < n; t++) {
      if (ind[t] == 0 && f[t] == 0) {
        f[t] = 1;
        printf("%d ", t + 1);
        break;
      }
    }
    printf("\n");
    //updating matrix with new values
    for (int i = 0; i < n; i++) {
      if (a[t][i] == 1) {
        a[t][i] = 0;
      }
    }
    n++;
	}
	
}