#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr[r][c];
 
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      int a;
      cin>>a;
      arr[i][j]=a;
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      int b;
      cin>>b;
      arr[i][j]=arr[i][j]+b;
      
      cout<<arr[i][j]<<" ";
    }
    cout<<"\n";
  }
}
