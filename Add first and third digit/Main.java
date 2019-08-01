#include<stdio.h>
int main()
{
  int x;
  scanf("%d",&x);
  int first=x/100;
  int second=x%10;
  int sum=first+second;
  printf("%d",sum);
  return 0;
}