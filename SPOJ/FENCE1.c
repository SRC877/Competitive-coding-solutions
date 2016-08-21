#include <stdio.h>
int main()
{
    int l;
    float pi=3.141592653589,res;
	while(1)
	{
		scanf("%d",&l);
		if(l==0)break;
		res=(float) (l*l/(2*pi));
		printf("%.2f\n",res);
	
	}
	return 0;
}