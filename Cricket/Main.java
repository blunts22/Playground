#include<iostream>
using namespace std;
int main()
{
  int ball,run1,run2,ball2;
  cin>>ball;
  cout<<ball/6<<"\n";
  cin>>run1;
  cin>>run2;
  cin>>ball2;
  int co=ball2/6;
  float cover=float(co)+(float(ball2%6)/10);
  cout<<cover<<"\n";
  float crri=run2/cover;
  float crrf=(int)(crri * 10 + .5);
  crrf=(float)crrf / 10;
  cout<<crrf<<"\n";
  float tr=float(run1)/50;
  float trr=(int)(tr * 10 + .5);
  trr=(float)trr / 10;
  cout<<trr<<"\n";
  if(crrf>trr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}