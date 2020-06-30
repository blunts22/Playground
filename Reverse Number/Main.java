#include <iostream>
int main() 
{
	int n;
    std::cin>>n;
    int num=0;
    while(n>0)
    {
      int a=n%10;
      num=num*10+a;
      n=n/10;
    }
    std::cout<<num;
}