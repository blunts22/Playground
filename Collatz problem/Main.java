#include<iostream>
using namespace std;
int main()
{
   int num;
   cin>>num;
   cout<<num<<"\n";
  int count=0;
   while(num>1)
   {
     if(num%2==0)
       num=num/2;
     else
       num=3*num+1;
     cout<<num<<"\n";
     count++;
   }
   cout<<count;
}