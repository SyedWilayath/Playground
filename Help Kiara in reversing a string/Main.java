#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, end=0, i;    
std::cin.getline(str,100);
for(i=0;str[i]!='\0';i++)
  end++;
 // std::cout<<end;
for(i=end;i>=0;i--)
  rev[end-i]=str[i-1];
std::cout<<rev;
}