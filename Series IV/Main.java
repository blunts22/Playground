#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num;
  int a=2;
  for(int i=1;i<=n;i++)
  {
    
    cout<<num<<" ";
    
    if(i%2==0){
      a=a+4;
      }
    num=num+a;
    
  }
}