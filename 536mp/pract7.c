#include<stdio.h>
#include<omp.h>
main()
{
	int q[100],front=0,rear=-1,id,d,ins=0,count=0;
	omp_set_dynamic(0);
	#pragma omp parallel num_threads(2)
	{
	id = omp_get_thread_num();
	if(id==0)
		while(1)
		{
			#pragma omp critical
			{
				if(count<100)
				{
					rear = (rear+1)%100;
					ins++;
					q[rear] = ins;
					printf("\nproducer %d",ins);
					count++;
				}
				else
				{
					printf("\nproducer no space");
				}
					fgetc(stdin);
			}
		}
	else
		while(1)
		{
			#pragma omp critical
			{
				if(count!=0)
				{
					d=q[front];
					front = (front +1)%100;
					printf("\n consumer %d",d);
					count--;
				}
				else
				{
					printf("consumer no items");
				}
					fgetc(stdin);

			}
		}
	}
}
				 
