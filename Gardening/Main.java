#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r;
  cin>>c;
  cin>>t;
  if((t>=(c+1))&&(t<=(2*c)))
    cout<<"It is a mango tree";
  else if((t>=(c*(r-2)+1))&&(t<=(c*r-1)))
    cout<<"It is a mango tree";  
  else
    cout<<"It is not a mango tree";
}