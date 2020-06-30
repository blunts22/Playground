#include<iostream>
using namespace std;
int main()
{
  int max,ad,ch;
  cin>>max;
  cin>>ad;
  cin>>ch;
  int w=(ad*75)+(ch*30);
  if(w<=max)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}