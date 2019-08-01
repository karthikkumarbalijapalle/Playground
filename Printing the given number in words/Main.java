#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  if(x==1)
    printf("One");
  else if(x==2)
    printf("Two");
  else if(x==3)
    printf("Three");
  else if(x==4)
    printf("Four");
  else if(x==5)
    printf("Five");
  else
    printf("Invalid");
    
  return 0;
}