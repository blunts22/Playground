#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat1[c][r];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
      cin>>mat1[j][i];
  }

  for(int i=0;i<c;i++)
  {
    for(int j=0;j<r;j++)
      cout<<mat1[i][j]<<" ";
    cout<<"\n";
  }
}