#include<iostream>
using namespace std;
void largestInColumn(int mat[10][10],int N, int M) 
{ 		int maxm =0; 
	for (int i = 0; i < N; i++) { 
      for (int j = 1; j < M; j++) { 			// than the maximum element // of the column and replace it 
			if (mat[i][j] > maxm) 
				maxm = mat[i][j]; 
		}
    }

		// print the largest element of the column 
		cout <<"The maximum element is "<<maxm; 
	
} 

// Driver code 
int main() 
{ 
	int n, m; cin>>n>>m;
	int mat[10][10];
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      cin>>mat[i][j];
    }}
	largestInColumn(mat,n,m); 

	return 0; 
} 
