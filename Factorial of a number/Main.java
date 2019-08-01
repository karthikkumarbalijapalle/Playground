#include <stdio.h>
int main() {
	//Type your code
  int x,fact=1;
  scanf("%d",&x);
  while(x>0)
  {
  fact=fact*x;
  x--;
  }
  printf("%d",fact);
  
	return 0;
}