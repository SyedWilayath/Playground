#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
   }
  int lare=a[0];
  for(i=0;i<n;i++)
  {
   if(lare<a[i])
     lare=a[i];
    }
  
  std::cout<<lare<<" ";
}