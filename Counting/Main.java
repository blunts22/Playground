#include<iostream>
#include <string.h>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  int len=str.size();
  int v=0,c=0,ws=0,d=0,s=0;
  for(int i=0;i<len;i++)
  {
    char a=str.at(i);
    if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' || str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U')
            ++v;
    else if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
                ++c;
    else if (str[i] >= '0' && str[i] <= '9')
                      ++d;
    else if(str[i]==' ')
      ++ws;
    else
                      ++s;
  }
  cout<<"Vowels:"<<v;
  cout<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<ws;
  cout<<"\nDigits:"<<d;
  cout<<"\nSymbols:"<<s;
}