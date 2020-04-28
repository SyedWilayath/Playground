#include<iostream>
int main()
{
    int i,j,m,n;
 
  std::cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  
}