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
  int mera,flag=0;
  std::cin>>mera;
  for(i=0;i<n;i++)
  {
   if(a[i]==mera)
     flag=1;
    }
  if(flag)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}