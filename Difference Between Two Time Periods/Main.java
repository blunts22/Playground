#include<iostream>
using namespace std;
int main()
{
  int h1,h2,m1,m2,s1,s2;
  cin>>h1>>m1>>s1;
  cin>>h2>>m2>>s2;
  if(s1<s2){
    s1=s1+60;
    m1=m1-1;}
  int s=s1-s2;
  if(m1<m2){
    m1=m1+60;
    h1=h1-1;}
  int m=m1-m2;
  int h=h1-h2;
  cout<<h<<":"<<m<<":"<<s;
}