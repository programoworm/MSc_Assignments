#include<stdio.h>
#include<omp.h>
main()
{
int a[] = {1,2,3,4,5,6,7,8,9,10};
int sum ,i=0,sum1;
#pragma omp parallel for reduction(+:sum)
for(i = 0;i<10;i++)
{
	sum = sum + a[i];
	sum1 = sum1 +(i*(i+1));
}
printf("sum of array elements are %d",sum);
printf("sum of the series is %d",sum1);
}
