#include<stdio.h>
#include<omp.h>
main()
{
	int a[] = {1,2,3,4,5,6,7,8,9,10};
	int i,m,k;
	omp_set_dynamic(0);
	m = omp_get_num_procs();
	omp_set_num_threads(m);
	#pragma omp parallel for shared(a) private(i)
	for(i=0;i<10;i++)
	{
		printf("\n a[%d] = %d from thread %d of %d",i,a[i],(omp_get_thread_num()+1),omp_get_num_threads());
	}
}
