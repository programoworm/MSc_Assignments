#include<stdio.h>
#include<omp.h>
main()
{
	int m,k;
	omp_set_dynamic(0);
	omp_set_num_threads(6);
	#pragma omp parallel 
	printf("\n hello %d of %d ",omp_get_thread_num(),omp_get_num_threads());
	m= omp_get_num_procs();
	k = omp_get_max_threads();
	printf("\nno of processors are %d",m);
	printf("\nmax no of threads are %d\n",k);
}
