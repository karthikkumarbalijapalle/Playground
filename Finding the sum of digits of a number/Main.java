#include <stdio.h>
int main() {
	//Type your code
  int x,sum=0;
  scanf("%d",&x);
  while(x>0)
  {
    int i=x%10;
    sum=sum+i;
    x=x/10;
  }
  printf("%d",sum);
    
	return 0;
}