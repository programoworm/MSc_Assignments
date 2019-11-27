#include<stdio.h>
#include<stdlib.h>
#include<omp.h>
int main(){
	int Q[10],front=0,rear=-1,count=0,id;
	omp_set_dynamic(0);
	#pragma omp parallel num_threads(2)
	{
		id=omp_get_thread_num();
		if(!id)
			while(1){
				#pragma omp critical
				if(count<10){
					rear++;
					Q[rear]=rand()%10;
					count++;
					printf("Producer produced! Item is %d\n",Q[rear]);
				}
				else
					printf("Producer no space!\n");
			}
		else
			while(1){
				#pragma omp critical
				if(count>0){
					printf("Consumer consumed! Item is %d\n",Q[front]);
					front++;
					count--;
				}
				else
					printf("No item to consume!\n");
			}
	}
	return 0;
}