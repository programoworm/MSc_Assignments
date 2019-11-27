#include<stdio.h>
#include<unistd.h>
#include<string.h>
#include<stdlib.h>
#include<fcntl.h>
//#include<sys/types.h>
#include<sys/stat.h>
#include<sys/wait.h>
int main(){
	char str[]="Hi this is parent";
	int id=fork();
	if(!id){
		//wait(NULL);
		creat("text.txt",S_IREAD|S_IWRITE);
		printf("File is created by pid %d\n",getpid());
		exit(0);
	}
	else{	
		wait(NULL);
		int fd=open("text.txt",O_RDONLY|O_WRONLY);
		write(fd,str,strlen(str));
		printf("File has been written by %d\n",getpid());
	}
	return 0;
}
