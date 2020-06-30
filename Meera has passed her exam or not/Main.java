#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int x[30];
  for(int i=0;i<n;i++)
    cin>>x[i];
  int p;
  cin>>p;
  for(int i =0; i<n; i++)
  {
  if(x[i]==p)
  {
    cout<<"She passed her exam";
    return 0;
  }
  }
  cout<<"She failed";
}