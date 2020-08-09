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
cursor c_customers is select salary,name from customers;-- where salary<5000 for update;-- of salary;
c_salary customers.salary%type;
c_name customers.name%type;
incr_sal number(5);
begin
open c_customers;
loop
fetch c_customers into c_salary,c_name;
exit when c_customers%notfound;
if c_salary<5000 then
	incr_sal:=500;
else
	incr_sal:=100;
end if;
update customers
set salary=salary+incr_sal
where customers.salary=c_salary;
end loop;
close c_customers;
end;
/

open c_customers;
loop
fetch c_customers into c_salary,c_name;
exit when c_customers%notfound;
c_salary:=c_salary+500;
end loop;
update customers
set customers.salary=customers.salary+500
where current of c_customers;
close c_customers;
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

========================================
declare
	x number:=&x;
	s number:=0;
	d number;
	temp number;
begin
	temp:=x;
	while x!=0 loop
		d:=mod(x,10);
		s:=s+d**3;
		x:=trunc(x/10);
	end loop;
	if s=temp then
		dbms_output.put_line('Armstrong');
	else
		dbms_output.put_line('Not Armstrong');
	end if;
end;
/

========================================
create table square(
	n number primary,
	sq number
);
declare
	i number;
	n number:=&n;
	p number;
	cursor c_square is select n,sq from square;
	sq_rec c_square%rowtype;
begin
	for i in 1..n loop
		p:=i**2;
		insert into square values(i,p);
	end loop;
	dbms_output.put_line('Number    Square');
	open c_square;
	loop
		fetch c_square into sq_rec;
		exit when c_square%notfound;
		dbms_output.put_line(sq_rec.n||'          '||sq_rec.sq);
	end loop;
end;
/
========================================
create table customer(
	c_id number(3),
	c_name varchar2(25),
	purched number(5)	
);


declare
	i number;
	n number:=&n;
	price number(5);
	id number(3);
	--cust varchar2:='cust';
begin
	id:=100;
	price:=10000;
	for i in 1..n loop
		price:=price-910;
		insert into customer values(id,'cust'||i,price);
		id:=id+1;
	end loop;
end;
/
select * from customer;
=========================================
--declare
--p number;
create or replace function fact(num number)
return number
is
f number;
begin
	if num<=1 then
		f:=1;
	else
		f:=num*fact(num-1);
	end if;
	return f;
end;
begin
	p:=fact(6);
	dbms_output.put_line(p);
end;
/
