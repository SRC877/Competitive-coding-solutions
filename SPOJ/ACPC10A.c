#include <stdio.h>

int main() 
   {
	int a,b,c;
	while(1)
	{
		scanf("%d %d %d",&a,&b,&c);
		if(a==0 && b==0 && c==0)
		break;
		else 
		if((b-a)==(c-b))
		{
			printf("AP ");
			printf("%d\n",c+b-a);
		}
		else
		{
			printf("GP ");
			printf("%d\n",c*(b/a));
		}
	}
	return 0;
}
