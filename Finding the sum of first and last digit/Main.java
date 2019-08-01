#include <stdio.h>
int main() {
	//Type your code
  int x;
  scanf("%d",&x);
  int second=x%10;
  while(x>9)
  {
    x=x/10;
  }
  int sum=x+second;
  printf("%d",sum);
  
	return 0;
}