#include<iostream>
using namespace std;
int main()
{
  int a;
  float score=0.0;
  for(int i=1;i<=3;i++)
  {
    cin>>a;
    if(a<0){
      score=score-1.0;
      break;}
    else if(a%2==0){
      score=score-0.5;
      i--;}
    else
      score=score+1.0;
  }
  cout<<score;
}