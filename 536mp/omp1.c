#include<stdio.h>
#include<omp.h>
main()
{
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int b[] = {1,2,3,4,5,6,7,8,9,10};
	int c[10];
	int i,m,k;
	omp_set_dynamic(1);
	m = omp_get_num_procs();
	omp_set_num_threads(m);
	#pragma omp parallel for shared(a) shared(b) shared(c) private(i)
	for(i=0;i<10;i++)
	{
		c[i] = a[i] + b[i];
	}
	for(i=0;i<10;i++)
	{
		printf("\n%d",c[i]);
	}
}
