#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string fnum;
  cout<<"Floating part is : ";
  getline(cin,fnum);
  int flag=0;
  for(int i=0;fnum[i]!='\0';i++)
  {
    if(flag==1)
      cout<<fnum[i];
    if(int(fnum[i])==46)
      flag=1;
  }
  
}