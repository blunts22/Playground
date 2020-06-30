#include<iostream>
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int hcf=gcd(gcd(a,b),c);
  if ((a < b && b < c) || (c < b && b < a))
    cout<<"The treasure is in box which has number "<<b;
  else if((b < a && a < c) || (c < a && a < b))
    cout<<"The treasure is in box which has number "<<a;
  else
    cout<<"The treasure is in box which has number "<<c;
  cout<<"\nThe code to open the box is "<<hcf;
}