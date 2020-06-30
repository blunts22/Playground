
#include<iostream>
#include<cmath>
using namespace std;
int check(int a,int b)
{
  return pow(a,b);
}
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(check(a,b)>=c)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}
