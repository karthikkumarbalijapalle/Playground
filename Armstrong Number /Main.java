#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int x,len=0,sum=0,rem;
  scanf("%d",&x);
  int num=x;
  int sem=x;
  while(num>0)
  {
    len++;
    num=num/10;
  }
  while(x>0)
  {
  rem=x%10;
  sum=sum+pow(rem,len);
  x=x/10;
    
  }
  if(sem==sum)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number"); 
	return 0;
}