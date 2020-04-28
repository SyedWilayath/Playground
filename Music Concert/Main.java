#include<iostream>
#include<cstdlib>
int main(){
  int n,fe=0,i;
    std::cin>>n;
  int *people = (int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
    std::cin>>*(people+i);
  for(i=0;i<n;i++)
  {
	if(*(people+i)%2==0)
      fe++;
  }    
  std::cout<<n-fe<<"\n"<<fe;
  return 0;
}