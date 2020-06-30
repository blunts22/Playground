#include <bits/stdc++.h> 
using namespace std;
int main()
{
  string s;
  getline(cin,s);
  cout<<s<<"\n";
  
  int flag=1;
  while(flag==1)
  {
    string s2;
    getline(cin,s2);
    reverse(s.begin(), s.end());
    if(s.at(0)==s2.at(0)){
      cout<<s2<<"\n";
      s=s2;}
    else
      flag=0;
  }
}
