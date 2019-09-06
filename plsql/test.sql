declare
msg varchar2(20):='Hello RB';
begin
dbms_output.put_line(msg);
end;
/

--Armstrong number
declare
	x number(5):=&x;
	otemp x%type:=x;
	num x%type:=0;
	temp number(1);
begin
	--otemp:=x;
	while x!=0 loop
		--if x=1 then
		--	num:=num+1;
		--	exit;
		--end if;
		temp:=mod(x,10);
		dbms_output.put_line(temp);
		num:=num + temp**3;
		x:=trunc(x/10);
	end loop;
	if otemp=num then
		dbms_output.put_line(num||' Armstrong');
	else
		dbms_output.put_line(num||' Not Armstrong');
	end if;
end;
/

--
INSERT INTO CUSTOMERS VALUES (1, 'Ramesh', 32, 'Ahmedabad', 2000.00 );  

INSERT INTO CUSTOMERS VALUES (2, 'Khilan', 25, 'Delhi', 1500.00 );  

INSERT INTO CUSTOMERS VALUES (3, 'kaushik', 23, 'Kota', 2000.00 );
  
INSERT INTO CUSTOMERS VALUES (4, 'Chaitali', 25, 'Mumbai', 6500.00 ); 
 
INSERT INTO CUSTOMERS VALUES (5, 'Hardik', 27, 'Bhopal', 8500.00 );  

INSERT INTO CUSTOMERS VALUES (6, 'Komal', 22, 'MP', 4500.00 ); 

declare
cursor c_customers is select salary,name from customers where salary<5000 for update;-- of salary;
c_salary customers.salary%type;
c_name customers.name%type;
incr_sal number(5);
begin
/*open c_customers;
loop
fetch c_customers into c_salary,c_name;
exit when c_customers%notfound;
c_salary:=c_salary+500;
end loop;
update customers
set customers.salary=customers.salary+500
where current of c_customers;
close c_customers;*/
for customers_rec in c_customers loop
	if customers_rec.salary<5000	
		incr_sal:=500;
	else
		incr_sal:=100;
	end if;
	update customers
	set salary=salary+incr_sal;
	where current of c_customers;
end loop;
end;
/

