#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int mat[r][c];
  int sum=0;
  for(int i=0;i<r;i++)
  {
    
    for(int j=0;j<c;j++)
    {
      cin>>mat[i][j];
      if(i==0){
        sum=sum+mat[i][j];
        continue;}
      if(i==(r-1)){
        sum=sum+mat[i][j];
        continue;}
      if(i+j==(c-1)){
        sum=sum+mat[i][j];
        continue;}
    }
    
  }
   cout<<"Sum of Zig-Zag pattern is "<<sum; 
}