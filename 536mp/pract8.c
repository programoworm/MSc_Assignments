#include<stdio.h>
#include<omp.h>
main()
{
	int x=10,id=0;
	omp_set_dynamic(0);
	#pragma omp parallel num_threads(2)
	{
		id = omp_get_thread_num();
		if(id==0)
		{
			while(1)
			{
			printf("\nreader section %d\n",x);
			fgetc(stdin);
			}
		}
		else
		{
			#pragma omp critical
			{
			while(1)
			{
			x=x+2;
			printf("\nwriter section %d\n",x);
			fgetc(stdin);
			}
			}
		}
	}
}
