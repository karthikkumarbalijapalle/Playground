#include <stdio.h>
int main() {
	//Type your code
  int x;
  scanf("%d",&x);
  while(x>99)
  {
    x=x/10;
  }
  int second=x%10;
  printf("%d",second);
  
	return 0;
}