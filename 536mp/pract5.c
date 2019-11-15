#include<stdio.h>
#include<omp.h>
main()
{
#pragma omp parallel sections
{	
	#pragma omp section
	{
		printf("bleh bluh");
		printf("first section");
	}
	#pragma omp section
	{
		printf("khikhikhi");
		printf("second section");
	}
}
}

