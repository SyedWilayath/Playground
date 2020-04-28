#include<iostream>
int main()
{
  int m,n,i,j;
  std::cin>>m>>n;
  int a[m][n],b[m][n],c[m][n];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
     std::cin>>a[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
     std::cin>>b[i][j];
  for(i=0;i<m;i++)
    for(j=0;j<n;j++)
     c[i][j]=a[i][j]+b[i][j];
    for(i=0;i<m;i++){
    for(j=0;j<n;j++){
     std::cout<<c[i][j]<<" ";
    }
      std::cout<<"\n";
    }
}