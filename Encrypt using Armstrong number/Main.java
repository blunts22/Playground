#include<iostream>
#include<string> 
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int len= to_string(n).size();
    int sum;
    int a=n;
    while(a>0)
    {
      sum=sum+power(a%10,len);
      a=a/10;
    }
    if(sum==n)
      return 1;
    else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}