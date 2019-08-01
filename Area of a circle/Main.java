#include<stdio.h>
int main()
{
  //Type your code here
  float x;
  scanf("%f",&x);
  float radius=x/2;
  float area=3.14*radius*radius;

  printf("%.2f",area);

  return 0;
}