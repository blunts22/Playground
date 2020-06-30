#include <bits/stdc++.h> 
using namespace std;  
  
#define OUT 0  
#define IN 1  
    
unsigned countWords(char *str)  
{  
    int state = OUT;  
    unsigned wc = 0; 
  
    while (*str)  
    {  
        if (*str == ' ' || *str == '\n' || *str == '\t')  
            state = OUT;  
    
        else if (state == OUT)  
        {  
            state = IN;  
            ++wc;  
        } 
        ++str;  
    }  
    return wc;  
}  
int main(void)  
{  
    char str[100];
    cin.get(str, 100);
    int len=countWords(str); 
    if(len>10)
      cout<<"Caption not eligible for the contest";
    else
      cout<<"Caption eligible for the contest";
    return 0;  
}  