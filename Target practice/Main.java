#include<iostream>
using namespace std;
int main()
{
  int tar;
  int sc=0;
  cin>>tar;
  int count=0;
  do
  {
    int a;
    cin>>a;
    sc=sc+a;
    count++;
  }
  while(sc<tar);
  cout<<"The number of turns is "<<count;
  
}