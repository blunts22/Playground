#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat[r][c];
  int arr[c];
  for(int i=0;i<c;i++)
    arr[i]=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>mat[i][j];
      if(mat[i][j]>arr[j])
        arr[j]=mat[i][j];
    }
  }
  for(int i=0;i<c;i++)
    cout<<arr[i]<<"\n";
}