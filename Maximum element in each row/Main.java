#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat[r][c];
  int row[r];
  for(int i=0;i<r;i++)
    row[i]=0;
  for(int i=0;i<r;i++)
  {
    int max=0;
    for(int j=0;j<c;j++)
    {
      cin>>mat[i][j];
      if(mat[i][j]>max)
        max=mat[i][j];
    }
    row[i]=max;
  }
   for(int i=0;i<r;i++)
     cout<<row[i]<<"\n";
}
