#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int b;
  char a[10];
  cin>>a;
  cin>>b;
  if(strcmp(a,"front")==0)
  {
    if(b==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(b==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  
}