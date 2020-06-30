#include <iostream>
#include <cstring>
using namespace std;
int main()
{
  char str[100], rev[100];     
  int count = 0, end, i; 
  cin.get(str, 100);
  i=strlen(str);
  for(int j=i-1;j>=0;j--)
    cout<<str[j];

}