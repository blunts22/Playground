#include <iostream>
using namespace std;
int main() 
{
  int n;
  cin>>n;
  int num=1;
  for(int i =1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(int j=1;j<=n;j++)
      {
        if(j==n)
          num=num+1;
        cout<<num;
      }
    }
    else
    {
      for(int j=1;j<=n;j++)
      {
        if(j==1)
          cout<<num+1;
        else
          cout<<num;
        
      }
       num++;
    }
   
      cout<<"\n";
  }
}