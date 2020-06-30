#include<iostream>
using namespace std;
int main()
{
  int fp,fd,fs,sp,sd,ss,ap,ad,as;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  int f=fp-(fp*fd/100)+fs;
  int s=sp-(sp*sd/100)+ss;
  int a=ap-(ap*ad/100)+as;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  cout<<"He will prefer ";
  if(f<=s&&f<=a)
    cout<<"Flipkart";
  else if(s<=f&&s<=a)
    cout<<"Snapdeal";
  else
    cout<<"Amazon";
}