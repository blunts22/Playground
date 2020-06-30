#include<iostream>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int len=str.size();
  for(int i=0;i<len;i++)
  {
    char c=str.at(i);
    int a=int(c);
    if(a>=65 && a<=90)
      cout<<c;
    if(a>=97 && a<=122)
      cout<<c;
  }
}
