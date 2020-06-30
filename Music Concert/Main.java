#include<iostream>
using namespace std;
int main(){
  int n;
  cin>>n;
  int arr[n];
  int m=0,f=0;
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
      f+=1;
    else
      m+=1;
  }
  cout<<m<<"\n";
  cout<<f;
  
}