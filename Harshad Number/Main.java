#include<iostream>
using namespace std;
int main()
{
  int num;
  
  cin>>num;
  int temp=num;
  int sum=0;
  while(temp>0)
  {
    sum=sum+temp%10;
    temp=int(temp/10);
  }
  int div=num/sum;
  if(div*sum==num)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}