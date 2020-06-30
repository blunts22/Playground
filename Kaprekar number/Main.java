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
  int len=pow(10,countDigit(num));
  int sqr=pow(num,2);
  int kap=(sqr%len)+int(sqr/len);
  if(kap==num)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
    
}
