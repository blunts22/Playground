#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int num=1;
  for(int i=1;i<=n;i++)
  {
    if(i%2==1){
    for(int j=1;j<=i;j++)
    {
      cout<<num;
      num++;
      if(j!=i)
        cout<<"*";
    }}
    else{
      num=num+i-1;
    for(int j=1;j<=i;j++)
    {
      cout<<num;
      num--;
      if(j!=i)
        cout<<"*";
    }
      num=num+i+1;
    }
    cout<<"\n"; 
  }
}