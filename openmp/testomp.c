#include<stdio.h>
#include<omp.h>
int main(){
	#pragma omp parallel sections num_threads(2)
	{
		printf("%d\n",omp_get_num_threads());
		#pragma omp section
		{
			printf("First %d\n",omp_get_thread_num());
		}
		#pragma omp section
		{
			printf("Second %d\n",omp_get_thread_num());
		}
		/*#pragma omp section
		{
			printf("Third %d\n",omp_get_thread_num());
		}*/
	}
	return 0;	
}
