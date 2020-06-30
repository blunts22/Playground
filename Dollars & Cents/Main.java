#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d;
  cin>>a>>b>>c>>d;
  int dol=a+c;
  dol=dol+(int(b+d))/100;
  int cen=(b+d)%100;
  cout<<dol<<"\n"<<cen;
}
