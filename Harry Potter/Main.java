#include<iostream>
#include <sstream>
using namespace std;
int main()
{
  string a;
  int x=0;
  getline(cin,a);
  char b=a.at(0);
  int p=int(b)-48;
  
  int sr=stoi(a);
  p=p+(sr%10);
  cout<<p;
}