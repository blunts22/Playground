#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a<=200)
    cout<<"Rs."<<int(a*0.5);
  else if(a<=400)
 cout<<"Rs."<<int(a*0.65+100);
  else if(a<=600)
    cout<<"Rs."<<int(a*0.8+2000);
  else
    cout<<"Rs."<<int(a*1.25+425);
}