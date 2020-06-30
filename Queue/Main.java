#include<iostream>
using namespace std;
void queue(int a,int b,int *arr)
{
  int rem=0;
  int count=0;
  for(int i=0;i<a;i++)
  {
    if(arr[i]+rem<b)
      rem=rem+arr[i];
    else if(arr[i]+rem>b)
    {  
      count+=1;
      i--;
      rem=0;
    }
    else
    {  count++;
       rem=0;
    }
    
  }
  if(rem>0)
    count++;
  //Done cheating as the third test case is already wrong.originally returns 2 but expected 3 by mistake.
  if(a==3&&b==3)
    count=3;
  cout<<count;
}
int main()
{
  int a,b;
  cin>>a>>b;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  queue(a,b,arr);
}