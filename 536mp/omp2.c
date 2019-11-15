#include<stdio.h>
#include<omp.h>
main()
{
	int a[2][2];
	int b[2][2];
	int c[2][2];
	int i,m,k;
	printf("enter first matrix\n");
	for(m=0;m<2;m++)
	{
		for(k=0;k<2;k++)
		{
			scanf("%d",&a[m][k]);
		}
	}
	printf("\nenter second matrix\n");
	for(m=0;m<2;m++)
	{
		for(k=0;k<2;k++)
		{
			scanf("%d",&b[m][k]);
		}
	}
	omp_set_dynamic(0);
	m = omp_get_num_procs();
	omp_set_num_threads(m);
	#pragma omp parallel for shared(a) shared(b) shared(c) private(i) private(m)
	for(i=0;i<2;i++)
	{
		for(m=0;m<2;m++)
		{
			c[i][m] = a[i][m] + b[i][m];
		}
	}
	printf("\nadded matrix is\n");
	for(i=0;i<2;i++)
	{
		for(m=0;m<2;m++)
		{
			printf("%d ",c[i][m]);
		}
		printf("\n");
	}
}
	
	
