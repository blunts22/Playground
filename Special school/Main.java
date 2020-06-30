#include <bits/stdc++.h> 
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  getline(cin,b);
  reverse(b.begin(), b.end());
  if(a.compare(b)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}
