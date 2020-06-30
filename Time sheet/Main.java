#include<iostream>
using namespace std;
int calculate(int hours)
{
  float result;
  if(hours>8)
    result=hours*100+(hours-8)*15;
  else
    result=hours*100;
  return result;
}
int main()
{
  int sun,mon,tue,wed,thur,fri,sat;
  cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
  float total=calculate(sun)*1.5+calculate(mon)+calculate(tue)+calculate(wed)+calculate(thur)+calculate(fri)+calculate(sat)*1.25;
  cout<<total;
}