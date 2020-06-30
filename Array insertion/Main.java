#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int arr[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cout<<"Enter the location where you wish to insert an element\n";
  int loc;
  cin>>loc;
  if(loc<1 || loc>n)
  {
    cout<<"Invalid Input\n";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  int val;
  cin>>val;
  cout<<"Array after insertion is\n";
  for(int j =0;j<n;j++)
  {
    if(j==(loc-1))
      cout<<val<<"\n";
    cout<<arr[j]<<"\n";
  }
}
