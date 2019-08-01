#include <stdio.h>
int main() {
	//Type your code
  int x,num;
  scanf("%d",&x);
  for(num=1;num<=2*x;num++)
  {
    if(num%2==1)
    {
    printf("%d\n",num);
    }
  } 
	return 0;
}