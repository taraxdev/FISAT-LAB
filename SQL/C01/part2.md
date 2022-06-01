### CYCLE -1 - Part 2

|  CO1.2 |  Design and build a simple relational database system and demonstrate competence with the fundamentals tasks involved with modelling, designing and implementing a database. |
|---|---|

![](https://github.com/taraxdev/FISAT-LAB/blob/main/assets/C011.png)

          Table Name : CLIENT_MASTER

![](https://github.com/taraxdev/FISAT-LAB/blob/main/assets/C012.png)

![](https://github.com/taraxdev/FISAT-LAB/blob/main/assets/C013.png)


```sql
SQL> create table PRODUCT_MASTER(product_number varchar(6) primary key,description varchar(15),profitpercent number(4,2),unitmeasure varchar(10),qyonhand number(8),reorderlvl number(8),sellprice number(8,2),costprice number(8,2));

Table created.

SQL> desc PRODUCT_MASTER;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 PRODUCT_NUMBER 			   NOT NULL VARCHAR2(6)
 DESCRIPTION					    VARCHAR2(15)
 PROFITPERCENT					    NUMBER(4,2)
 UNITMEASURE					    VARCHAR2(10)
 QYONHAND					    NUMBER(8)
 REORDERLVL					    NUMBER(8)
 SELLPRICE					    NUMBER(8,2)
 COSTPRICE					    NUMBER(8,2)



SQL> INSERT into PRODUCT_MASTER values('P001','SOAP',01.01,'200gm',150,10,800,700);

1 row created.

SQL> INSERT into PRODUCT_MASTER values('P002','PASTE',01.34,'150gm',100,15,400,390);

1 row created.

SQL> INSERT into PRODUCT_MASTER values('P003','POWDER',01.94,'115gm',50,18,600,580);

1 row created.

SQL> INSERT into PRODUCT_MASTER values('P004','BOOK',03.94,'50gm',150,20,750,680);

1 row created.

SQL> INSERT into PRODUCT_MASTER values('P005','PEN',02.94,'190gm',90,20,980,880);

1 row created.


SQL> select * from PRODUCT_MASTER;

PRODUC DESCRIPTION     PROFITPERCENT UNITMEASUR   QYONHAND REORDERLVL  SELLPRICE  COSTPRICE
------ --------------- ------------- ---------- ---------- ---------- ---------- ----------
P001   SOAP			1.01 200gm	       150	   10	     800	700
P002   PASTE			1.34 150gm	       100	   15	     400	390
P003   POWDER			1.94 115gm		50	   18	     600	580
P004   BOOK			3.94 50gm	       150	   20	     750	680
P005   PEN			2.94 190gm		90	   20	     980	880


SQL> create table CLIENT_MASTER(clientno varchar(6) primary key,name varchar(20),address1 varchar(30),address2 varchar(30),city  varchar(15),pincode number(8),state varchar(15),baldue number(10,2));

Table created.

SQL> desc CLIENT_MASTER;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 CLIENTNO				   NOT NULL VARCHAR2(6)
 NAME						    VARCHAR2(20)
 ADDRESS1					    VARCHAR2(30)
 ADDRESS2					    VARCHAR2(30)
 CITY						    VARCHAR2(15)
 PINCODE					    NUMBER(8)
 STATE						    VARCHAR2(15)
 BALDUE 					    NUMBER(10,2)


create table SALES_MASTER(salesmanno varchar(6) primary key,salesmanname varchar(20),address1 varchar(30),address2 varchar(30),city varchar(15),pincode number(8),state varchar(15));

Table created.

SQL> desc SALES_MASTER;
 Name					   Null?    Type
 ----------------------------------------- -------- ----------------------------
 SALESMANNO				   NOT NULL VARCHAR2(6)
 SALESMANNAME					    VARCHAR2(20)
 ADDRESS1					    VARCHAR2(30)
 ADDRESS2					    VARCHAR2(30)
 CITY						    VARCHAR2(15)
 PINCODE					    NUMBER(8)
 STATE						    VARCHAR2(15)

SQL> insert into  CLIENT_MASTER values('C00001','Ramesh','Rohini','Rohini','Mumbai',683545,'Maharashtra',900);

1 row created.

SQL> insert into  CLIENT_MASTER values('C00002','Suresh','pitampura','pitampura','Banguluru',683549,'Maharashtra',800);

1 row created.

SQL> insert into  CLIENT_MASTER values('C00003','Tanya','sarojini','sarojini','Manguluru',683579,'Maharashtra',1000);

1 row created.

SQL> insert into  CLIENT_MASTER values('C00004','Mahi','hauzkhas','hauzkhas','Ernakulam',683565,'Kerala',1500);

1 row created.

SQL> insert into  CLIENT_MASTER values('C00005','Shubangi','noida','noida','Ernakulam',683535,'Kerala',1700);

1 row created.

SQL> select * from CLIENT_MASTER;

CLIENT NAME		    ADDRESS1			   ADDRESS2			  CITY		     PINCODE STATE		 BALDUE
------ -------------------- ------------------------------ ------------------------------ --------------- ---------- --------------- ----------
C00001 Ramesh		    Rohini	 		   Rohini			  Mumbai	      683545 Maharashtra	    900
C00002 Suresh	            pitampura			   pitampura			  Banguluru	      683549 Maharashtra	    800
C00003 Tanya		    sarojini			   sarojini			  Manguluru	      683579 Maharashtra	   1000
C00004 Mahi		    hauzkhas		  	   hauzkhas 		          Ernakulam	      683565 Kerala		   1500
C00005 Shubangi		    noida			   noida			  Ernakulam	      683535 Kerala		   1700

```



#### 1.generate SQL statements to perform the following computations on table data

(a) list the names of all clients having ‘a’ as the second letter in their names. 

```sql
SQL> select name from CLIENT_MASTER where name like '_a%';

NAME
--------------------
Nandhu
```

(b) listing of clients who stay in a city whose first letter is ‘M’ 

```sql
SQL> select * from CLIENT_MASTER where city like 'M%';

CLIENT NAME		    ADDRESS1			   ADDRESS2			  CITY		     PINCODE STATE		 BALDUE
------ -------------------- ------------------------------ ------------------------------ --------------- ---------- --------------- ----------
C00001 Akshaya		    vellaykudam 		   vellaykudam			  Mumbai	      683545 Maharashtra	    900
C00003 Amoolya		    kiliyeli			   kilyeli			  Manguluru	      683579 Maharashtra	   1000

```

(c) list all clients who stay in ‘Bangaluru’ or ‘Mangalore’

```sql
SQL> select * from CLIENT_MASTER where city='Banguluru' or city='Manguluru';

CLIENT NAME		    ADDRESS1			   ADDRESS2			  CITY		     PINCODE STATE		 BALDUE
------ -------------------- ------------------------------ ------------------------------ --------------- ---------- --------------- ----------
C00002 Anunayana	    kavanal			   kavanal			  Banguluru	      683549 Maharashtra	    800
C00003 Amoolya		    kiliyeli			   kilyeli			  Manguluru	      683579 Maharashtra	   1000
```

(d) list all clients whose BalDue is greater than 10000 

```sql
SQL> select * from CLIENT_MASTER where baldue>1000;

CLIENT NAME		    ADDRESS1			   ADDRESS2			  CITY		     PINCODE STATE		 BALDUE
------ -------------------- ------------------------------ ------------------------------ --------------- ---------- --------------- ----------
C00004 Nandhu		    varikkassery		   varikkassery 		  Ernakulam	      683565 Kerala		   1500
C00005 Akhil		    pulishery			   pulishery			  Ernakulam	      683535 Kerala		   1700
```
(f) list products whose selling price is greater than 500 and less than or equal to 750 

```sql
SQL> select * from PRODUCT_MASTER WHERE SELLPRICE>'500' AND SELLPRICE<='750';

PRODUC DESCRIPTION     PROFITPERCENT UNITMEASUR   QYONHAND REORDERLVL  SELLPRICE  COSTPRICE
------ --------------- ------------- ---------- ---------- ---------- ---------- ----------
P003   POWDER			1.94 115gm		50	   18	     600	580
P004   BOOK			3.94 50gm	       150	   20	     750	680

```

(g) listing of names,city and state of clients who are not in the state of ‘maharashtra’. 

```sql
SQL> select name,city,state from CLIENT_MASTER where state not in('Maharashtra');

NAME		     CITY	     STATE
-------------------- --------------- ---------------
Nandhu		     Ernakulam	     Kerala
Akhil		     Ernakulam	     Kerala
```

(i) calculating the average price of all products.

```sql
SQL> SELECT AVG(COSTPRICE) FROM PRODUCT_MASTER;

AVG(COSTPRICE)
--------------
	   646
```

(j) determining the maximum and minimum price for the product prices.

```sql
SQL>  select description,min(costprice) as Minimumprice,max(costprice) as Maxprice from PRODUCT_MASTER group by description;  

DESCRIPTION	MINIMUMPRICE   MAXPRICE
--------------- ------------ ----------
POWDER			 580	    580
BOOK			 680	    680
SOAP			 700	    700
PASTE			 390	    390
PEN			 880	    880
```

(k) count the number of products having the price greater than or equal to 500

```sql
SQL> select count(description) from PRODUCT_MASTER where sellprice>=500;

COUNT(DESCRIPTION)
------------------
		 4

```
