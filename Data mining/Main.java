#include<iostream>
#include<cmath>
using namespace std;
int countDigit(int n) 
{ 
    return floor(log10(n) + 1); 
} 
int main()
{
  int num;
  cin>>num;
  int a=0;
  int b=0;
  int len=countDigit(num);
  for(int i=len;i>=1;i--)
  {
    if(i%2==0)
      a=a+num%10;
    else
      b=b+num%10;
    num=num/10;
  }
  if(a==b)
    cout<<"Yes";
  else
    cout<<"No";
    
}