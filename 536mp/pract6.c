#include<stdio.h>
#include<omp.h>
int x =5;
first()
{
	#pragma omp critical
	{
		x++;
		printf("from first %d",x);
	}
}
second()
{
	#pragma omp critical
	{
		x--;
		printf("from second %d",x);
	}
}
main()
{
	#pragma omp parallel sections                     
	{
		#pragma omp section
		{
			first();
		}
		#pragma omp section
		{
			second();
		}
	}
}
