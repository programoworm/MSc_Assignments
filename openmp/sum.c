#include<stdio.h>
#include<omp.h>
int n_term(int n){
	int i,j;
	if(n<=2)
		return n;
	#pragma omp parallel sections
	{
		#pragma omp section
		{
			i=n_term(n-1);
		}
		#pragma omp section
		{
			j=n_term(n-2);
		}
	}
	return i*j;
}
int main(){
	int sum=0,i;
	int a[]={1,2,3,4,5};
	/*#pragma omp parallel for shared(a) private(i) reduction(+: sum)
	for(i=0;i<5;i++)
		sum=sum+a[i];*/
	printf("%d\n",n_term(8));
	return 0;
}
