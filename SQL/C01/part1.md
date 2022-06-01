| CO1  | Design and build a simple relational database system and demonstrate competence with the fundamentals tasks involved with modeling, designing and implementing a database.  |
|---    |---                                                                    |

### DATA DEFINITION LANGUAGE (DDL):
#### 1. CREATE 2. ALTER 3. DROP 4. RENAME

##### 1.Create a table EMPLOYEE with following schema: (Emp_no, E_name, E_address, E_ph_no, Dept_no, Dept_name,Job_id , Salary)

```sql
SQL> CREATE TABLE EMPLOYEE
(Emp_no int PRIMARY KEY,E_name VARCHAR(30),
E_address VARCHAR(30),E_ph_no VARCHAR(12),
Dept_no VARCHAR(20),Dept_name VARCHAR(12),
Job_id CHAR(12),Salary VARCHAR(12));

Table created.

SQL> DESC EMPLOYEE;

 Name			Null?		Type
 ------------------------- --------------- ---------------------
 EMP_NO		NOT NULL 	NUMBER(38)
 E_NAME 				VARCHAR2(30)
 E_ADDRESS			VARCHAR2(30)
 E_PH_NO				VARCHAR2(12)
 DEPT_NO				VARCHAR2(20)
 DEPT_NAME			VARCHAR2(12)
 JOB_ID 				CHAR(12)
 SALARY 				VARCHAR2(12)

```
a)Add a new column; HIREDATE to the existing relation.

```sql
SQL> ALTER TABLE EMPLOYEE 
ADD HIREDATE DATE;

Table altered.

```
b)Change the datatype of JOB_ID from char to varchar2.

```sql
SQL> alter table EMPLOYEE 
modify(JOB_ID varchar2(5));

Table altered.

c)Change the name of column/field Emp_no to E_no.

SQL> ALTER TABLE EMPLOYEE 
RENAME COLUMN Emp_no TO E_no;

Table altered.

SQL> Desc EMPLOYEE

 Name			Null?    	Type
 ------------------------- ------------------ ---------------
 E_NO			NOT NULL 	NUMBER(38)
 E_NAME 				VARCHAR2(30)
 E_ADDRESS			VARCHAR2(30)
 E_PH_NO				VARCHAR2(12)
 DEPT_NO				VARCHAR2(20)
 DEPT_NAME			VARCHAR2(12)
 JOB_ID 				VARCHAR2(5)
 SALARY 				VARCHAR2(12)
 HIREDATE				DATE

d)Modify the column width of the job field of emp table

SQL> ALTER TABLE EMPLOYEE 
ADD Job char(20);

Table altered.

SQL> alter table EMPLOYEE 
modify Job char(5);

Table altered.

SQL> Desc EMPLOYEE
 Name			Null?    	Type
 ------------------------ ------------------ ----------------------
 E_NO			NOT NULL	NUMBER(38)
 E_NAME 				VARCHAR2(30)
 E_ADDRESS			VARCHAR2(30)
 E_PH_NO				VARCHAR2(12)
 DEPT_NO				VARCHAR2(20)
 DEPT_NAME			VARCHAR2(12)
 JOB_ID 				VARCHAR2(5)
 SALARY 				VARCHAR2(12)
 HIREDATE				DATE
 JOB					CHAR(5)


DATA MANIPULATION LANGUAGE (DML):
  Insert table  Update table  Delete Table
```

##### 2)Create a table EMPLOYEE with following schema:

```sql
(Emp_no, E_name, E_address, E_ph_no, Dept_no, Dept_name,Job_id , Salary)

SQL> CREATE TABLE EMPLOYEE
(Emp_no int PRIMARY KEY,E_name VARCHAR(30),
E_address VARCHAR(30),E_ph_no VARCHAR(12),
Dept_no VARCHAR(20),Dept_name VARCHAR(12),
Job_id CHAR(12),Salary VARCHAR(12));

Table created.

1)Insert aleast 5 rows in the table.

SQL> INSERT INTO EMPLOYEE VALUES(101,'Elizaba','ekm','1234567890','D10','MECH','abc','10000');

1 row created.

SQL> INSERT INTO EMPLOYEE VALUES(102,'Elsa','thrissur','0987654321','D10','MECH','bcd','10000');

1 row created.

SQL> INSERT INTO EMPLOYEE VALUES(12,'Emelsha','Angamaly','1111111111','D9','MCA','cde','20000');

1 row created.

SQL> INSERT INTO EMPLOYEE VALUES(103,'James','ekm','1111111221','D9','SALES','def','20000');

1 row created.

SQL> INSERT INTO EMPLOYEE VALUES(133,'Ann','trissur','1111333221','D8','SALES','efg','30000');

1 row created.
```
##### 2)Display all the information of EMP table.

```sql
SQL> SELECT * from EMPLOYEE;

EMP_NO  E_NAME  E_ADDRESS  E_PH_NO  DEPT_NO  DEPT_NAME  JOB_ID  SALARY
------------  ------------  -----------------  -------------  -------------  ------------------  ----------  ------------
101	      Elizaba 	  ekm 		  1234567890   D10	     MECH	         abc	10000

102	      Elsa 	  thrissur	  0987654321   D10	     MECH	         bcd	10000

12	      Emelsha 	  Angamaly	  1111111111     D9	     MCA	         cde	20000

103	      James 	  ekm 		  1111111221    D9 	     SALES	         def	20000

133	      Ann 	  trissur	  1111333221    D8 	     SALES               efg	30000
```
##### 3)Display the record of each employee who works in department D10.

```sql
SQL> SELECT * from EMPLOYEE where DEPT_NO='D10';

EMP_NO  E_NAME  E_ADDRESS  E_PH_NO  DEPT_NO  DEPT_NAME  JOB_ID  SALARY
------------  ------------  -----------------  -------------  -------------  ------------------  ----------  ------------
101	      Elizaba 	  ekm 		  1234567890   D10	     MECH	         abc	10000

102	      Elsa 	  thrissur	  0987654321   D10	     MECH	         bcd	10000
```

##### 4)Update the city of Emp_no-12 with current city as Nagpur.

```sql
SQL> UPDATE EMPLOYEE 
SET E_ADDRESS='Nagpur' WHERE EMP_NO=12;

1 row updated.

5)Display the details of Employee who works in department MECH.

SQL> SELECT * from EMPLOYEE 
where DEPT_NAME='MECH';

EMP_NO  E_NAME  E_ADDRESS  E_PH_NO  DEPT_NO  DEPT_NAME  JOB_ID  SALARY
------------  ------------  -----------------  -------------  -------------  ------------------  ----------  ------------
101	      Elizaba 	  ekm 		  1234567890   D10	     MECH	         abc	10000

102	      Elsa 	  thrissur	  0987654321   D10	     MECH	         bcd	10000
```

##### 6)Delete the email_id of employee James.

```sql
SQL> Update employee 
set EMAIL_ID=””
where E_NAME='James';

1 row updated.

SQL> SELECT * FROM employee;


EMP_NO  E_NAME  E_ADDRESS  E_PH_NO  DEPT_NO  DEPT_NAME  JOB_ID  SALARY 
------------  ------------  -----------------  -------------  -------------  ------------------  ----------  ------------
EMAIL_ID
--------------

101	      Elizaba 	  ekm 		  1234567890   D10	     MECH	         abc	10000
elizaba@gmail.com

102	      Elsa 	  thrissur	  0987654321   D10	     MECH	         bcd	10000
elsa@gmail.com

12	      Emelsha 	  Angamaly	  1111111111     D9	     MCA	         cde	20000
emelsha@gmail.com

103	      James 	  ekm 		  1111111221    D9 	     SALES	         def	20000


133	      Ann 	  trissur	  1111333221    D8 	     SALES               efg	30000
ann@gmail.com

107	     John 	  thrsr 		  1212121212   D9	     SALES	         efg	32333
john@gmail.com

6 rows selected.

7)Display the complete record of employees working in SALES Department.

SQL> SELECT * FROM employee 
where DEPT_NAME='SALES';

EMP_NO  E_NAME  E_ADDRESS  E_PH_NO  DEPT_NO  DEPT_NAME  JOB_ID  SALARY 
------------  ------------  -----------------  -------------  -------------  ------------------  ----------  ------------
EMAIL_ID
--------------
103	      James 	  ekm 		  1111111221    D9 	     SALES	         def	20000


133	      Ann 	  trissur	  1111333221    D8 	     SALES               efg	30000
ann@gmail.com

107	     John 	  thrsr 		  1212121212   D9	     SALES	         efg	32333
john@gmail.com

```

##### 3.Create a table EMPLOYEE with following schema: (Emp_no, E_name, E_address, E_ph_no, Dept_no, Dept_name,Job_id, Designation , Salary) 

```sql
SQL> create table emp33(emp_no int,e_name varchar(15),e_address varchar(20),e_phno int,dept_no int,dept_name varchar(10),job_id int,designation varchar(15),salary int,join_date date);

Table created.
SQL> desc emp33;
 Name			 Null?	  Type
 ----------------------- -------- ----------------
EMP_NO 			NUMBER(38)
E_NAME 			VARCHAR2(15)
E_ADDRESS			VARCHAR2(20)
E_PHNO 			NUMBER(38)
DEPT_NO			NUMBER(38)
DEPT_NAME		VARCHAR2(10)
JOB_ID 			NUMBER(38)
DESIGNATION		VARCHAR2(15)
SALARY 			NUMBER(38)
JOIN_DATE			DATE
Write SQL statements for the following query. 
SQL> insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,' &dept_name',&job_id,'&designation',&salary,'&join_date');
Enter value for emp_no: 101
Enter value for e_name: sindoora
Enter value for e_address: malapuram
Enter value for e_phno: 736590
Enter value for dept_no: 10
Enter value for dept_name: mech
Enter value for job_id: 1001
Enter value for designation: manager
Enter value for salary: 500000
Enter value for join_date: 13-dec-2020
old 1: insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,'&dept_name',&job_id,'&designation',&salary,'&join_date')
new 1: insert into emp33 values(101,'sindoora','malapuram',736590,10,'mech',1001,'manager',500000,'13-dec-2020')
1 row created.
Commit complete.
SQL> /
Enter value for emp_no: 102
Enter value for e_name: harikrish
Enter value for e_address: kottakal
Enter value for e_phno: 84657
Enter value for dept_no: 20
Enter value for dept_name: sales
Enter value for job_id: 1002
Enter value for designation: president
Enter value for salary: 30000
Enter value for join_date: 03-mar-2018
old   1: insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,'&dept_name',&job_id,'&designation',&salary,'&join_date')
new   1: insert into emp33 values(102,'harikrish','kottakal',84657,20,'sales',1002,'president',30000,'03-mar-2018')

1 row created.

Commit complete.
SQL> /
Enter value for emp_no: 103
Enter value for e_name: satheesh
Enter value for e_address: pathanamthitta
Enter value for e_phno: 84356
Enter value for dept_no: 21
Enter value for dept_name: cs 
Enter value for job_id: 1003
Enter value for designation: manager
Enter value for salary: 600000
Enter value for join_date: 14-jan-1980
old   1: insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,'&dept_name',&job_id,'&designation',&salary,'&join_date')
new   1: insert into emp33 values(103,'satheesh','pathanamthitta',84356,21,'cs',1003,'manager',600000,'14-jan-1980')

1 row created.

SQL> /
Enter value for emp_no: 104
Enter value for e_name: athira
Enter value for e_address: kachapilly
Enter value for e_phno: 843657
Enter value for dept_no: 15
Enter value for dept_name: cs
Enter value for job_id: 1005
Enter value for designation: ITproff
Enter value for salary: 25000
Enter value for join_date: 05-jun-2004
old   1: insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,'&dept_name',&job_id,'&designation',&salary,'&join_date')
new   1: insert into emp33 values(104,'athira','kachapilly',843657,15,'cs',1005,'Itproff', 25000,'05-jun-2004')

1 row created.

SQL> /
Enter value for emp_no: 105
Enter value for e_name: anagha
Enter value for e_address: palakkad
Enter value for e_phno: 76348
Enter value for dept_no: 18
Enter value for dept_name: mech
Enter value for job_id: 1009
Enter value for designation: analyst
Enter value for salary: 40000
Enter value for join_date: 29-aug-1999
old   1: insert into emp33 values(&emp_no,'&e_name','&e_address',&e_phno,&dept_no,'&dept_name',&job_id,'&designation',&salary,'&join_date')
new   1: insert into emp33 values(105,'anagha','palakkad',76348,18,'mech',1009,'analyst',40000,'29-aug-1999')

1 row created.

SQL> select * from emp33;

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------

101           sindoora	 malapuram	  736590      10                mech	      1001  
manager                500000     01-MAY-81

102           harikrish    kottakal             84657        20                sales	       1002 
president	      30000       03-DEC-81

103           satheesh    pathanamthitta	  84356        21                cs	                   1003 
manager	      600000     17-DEC-81

104           athira        kachapilly	  843657      15                cs	                   1005 
ITproff		     25000        19-JAN-80

105           anagha      palakkad            76348	        18               mech	      1009 
analyst		     40000        29-AUG-99
```

##### 1. List the E_no, E_name, Salary of all employees working for MANAGER.

```sql
SQL> select emp_no,e_name,salary from emp33 where designation='manager';

    EMP_NO 	E_NAME	 SALARY
    ------------- ------------------ -------------
       101   	sindoora	  500000
       103 	satheesh	  600000
       
```
##### 2. Display all the details of the employee whose salary is more than the Sal of any IT PROFF..

```sql
SQL> select * from emp33 where salary>all(select salary from emp33 where designation='ITproff');

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------

101           sindoora	 malapuram	  736590      10                mech	      1001  
manager                500000     01-MAY-81

102           harikrish    kottakal             84657        20                sales	       1002 
president	      30000       03-DEC-81

103           satheesh    pathanamthitta	  84356        21                cs	                   1003 
manager	      600000     17-DEC-81

105           anagha      palakkad            76348	        18               mech	      1009 
analyst		     40000        29-AUG-99
```

##### 3. List the employees in the ascending order of Designations of those joined after 1981.

```sql
SQL> select * from emp33 where join_date>'31-dec-1981' order by designation asc;

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------
105           anagha      palakkad            76348	        18               mech	      1009 
analyst		     40000        29-AUG-99

106            jacob        palamattom	 43859	         30              mech	      5032 
clerk		      25000       12-JAN-00
```

##### 4. List the employees along with their Experience and Daily Salary.

```sql
SQL>select emp_no,e_name,floor(months_between(current_date,join_date)/12) as experience,(salary/30) as daily_salary from emp33;

    EMP_NO E_NAME	   EXPERIENCE    DAILY_SALARY
------------------------------------- -------------------- -------------------------------------
   101		sindoora		    40	   		16666.6667
   102 		harikrish		    40	                        1000
   103 		satheesh		    40	    		 20000
   104 		athira		                42			833.333333
   105 		anagha		  	    22			1333.33333
   106 		jacob 		    	    22			833.333333

6 rows selected.
```

##### 5. List the employees who are either ‘CLERK’ or ‘ANALYST’ .

```sql
SQL> select * from emp33 where designation='clerk' or designation='analyst';

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------

105           anagha      palakkad            76348	        18               mech	      1009 
analyst		     40000        29-AUG-99

106            jacob        palamattom	 43859	         30              mech	      5032 
clerk		      25000       12-JAN-00
```

##### 6. List the employees who joined on 1-MAY-81, 3-DEC-81, 17-DEC-81,19-JAN-80 .

```sql
SQL> select * from emp33 where join_date='1-may-81' or join_date='3-dec-81' or join_date='17-dec-81' or join_date='19-jan-80';

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------

101           sindoora	 malapuram	  736590      10                mech	      1001  
manager                500000     01-MAY-81

102           harikrish    kottakal             84657        20                sales	       1002 
president	      30000       03-DEC-81

103           satheesh    pathanamthitta	  84356        21                cs	                   1003 
manager	      600000     17-DEC-81

104           athira        kachapilly	  843657      15                cs	                   1005 
ITproff		     25000        19-JAN-80
```

##### 7. List the employees who are working for the Deptno 10 or20.

```sql
SQL> select * from emp33 where dept_no=10 or dept_no=20;

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------

101           sindoora	 malapuram	  736590      10                mech	      1001  
manager                500000     01-MAY-81

102           harikrish    kottakal             84657        20                sales	       1002 
president	      30000       03-DEC-81
```


##### 8. List the Enames those are starting with ‘S’ .

```sql
SQL> select e_name from emp33 where e_name like('s%');
E_NAME
---------------
sindoora
satheesh
```

##### 9. Dislay the name as well as the first five characters of name(s) starting with ‘H’ .

```sql
SQL> select e_name from emp33 where length(e_name)=6 and e_name like 'h%';
E_NAME
---------------
harikrish
```

##### 10. List all the emps except ‘PRESIDENT’ & ‘MGR” in asc order of Salaries.

```sql
SQL> select * from emp33 where designation not in('president','manager') order by salary asc;

EMP_NO  E_NAME  E_ADDRESS	  E_PHNO  DEPT_NO  DEPT_NAME  JOB_ID
------------ ------------- ------------------ ------------- -------------- ------------------ -------------------- DESIGNATION  SALARY  JOIN_DATE
-------------------- ------------- -------------------
104           athira        kachapilly	  843657      15                cs	                   1005 
ITproff		     25000        19-JAN-80

105           anagha      palakkad            76348	        18               mech	      1009 
analyst		     40000        29-AUG-99

106            jacob        palamattom	 43859	         30              mech	      5032 
clerk		      25000       12-JAN-00
```

