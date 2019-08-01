#include <stdio.h>
int main() {
	//Type your code
	
  int x,fact=1,sum=0,rem;
  
  scanf("%d",&x);
  int sem=x;
  while(x>0)
  {
  rem=x%10;
    x=x/10;
    fact=1;
    while(rem>0)
    {
      fact=fact*rem;
      rem--;
    }
    sum=sum+fact;
  }
  if(sum==sem)
    printf("Yes");
  else
    printf("No");
    return 0;
}