#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(b==0)
    return a;
  return gcd(b,a%b);
}
int main()
{
  int a,b,c,ans;
  cin>>a>>b>>c>>ans;
  int res=gcd(a,gcd(b,c));
  if(res==ans)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}

