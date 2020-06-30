#include<iostream>
using namespace std;
int main()
{
  int r;
  cin>>r;
  int arr[r][r];
  int fd=0,bd=0;
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<r;j++)
    {
      cin>>arr[i][j];
      if(i==j)
        fd=fd+arr[i][j];
      if((i+j)==r-1)
        bd=bd+arr[i][j];
    }
  }
  if(bd==fd)
      cout<<"Yes";
    else
      cout<<"No";
}