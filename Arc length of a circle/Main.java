#include<stdio.h>
int main()
{
  float r,c;
  scanf("%f%f",&r,&c);
  float arc=2*3.14*r*(c/360);
  printf("%.2f",arc);
return 0;
}