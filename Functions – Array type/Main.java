#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array\n";
  int n;
  cin>>n;
  int arr[n];
  int flage=0;
  int flago=1;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
      flage=1;
    else
      flago=0;
  }
  if(flage+flago==1)
    cout<<"The array is Mixed";
  else if(flage+flago==2)
    cout<<"The array is Even";
  else
    cout<<"The array is Odd";
}
