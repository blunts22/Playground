#include<iostream>
using namespace std;
int main()
{
  int num;
  cin>>num;
  int b=0;
  int c=1;
  if(num==1)
    cout<<b;
  else if(num==2)
    cout<<c;
  else
  {
    
    for(int i=3;i<=num;i++)
    {
      int temp=b;
      b=c;
      c=temp+c;
       
    }
    cout<<c;
  }
  
}