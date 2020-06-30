#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int even=0,odd=0;
  for(int i=0;i<a;i++)
  {
    int d;
    cin>>d;
    if(d%2==0)
      even=even+d;
    else
      odd=odd+d;
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}