#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  int first=x%100;
  int second=first/10;
  printf("%d",second);
  return 0;
}