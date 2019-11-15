#include<stdio.h>
#include<omp.h>
main()
{
	int m,k;
	m= omp_get_num_procs();
	k = omp_get_max_threads();
	
	printf("\nno of processors are %d",m);
	printf("\nmax no of threads are %d\n",k);
}
