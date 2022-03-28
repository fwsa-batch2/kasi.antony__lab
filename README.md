### MODERN-TAILORS
PPT link : 


```
SHOW DATABASES;
```

| Database           |
|:------------------:|
| information_schema |
| mysql              |
| performance_schema |
| studnet_academy    |
| sys                |

----
```
CREATE DATABASE Modern_Tailors_app;
```
```
SHOW DATABASES;
```

| Database           |
|:------------------:|
| Modern_Tailors_app |
| information_schema |
| mysql              |
| performance_schema |
| studnet_academy    |
| sys                |

```
USE Modern_Tailors_app;
```
----
```
CREATE TABLE User_Details (
	Id_no INT AUTO_INCREMENT PRIMARY KEY,
    FUll_name VARCHAR(50) NOT NULL,
    User_name VARCHAR(50) UNIQUE NOT NULL,
    contact_number VARCHAR(20) NOT NULL,
    email_id VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    Confirm_password VARCHAR(50) NOT NULL
);
```
```
DESC User_Details;
```


| Field            | Type        | Null | Key | Default | Extra          |
|:----------------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| Id_no            | int         | NO   | PRI | NULL    | auto_increment |
| FUll_name        | varchar(50) | NO   |     | NULL    |                |
| User_name        | varchar(50) | NO   | UNI | NULL    |                |
| contact_number   | varchar(20) | NO   |     | NULL    |                |
| email_id         | varchar(50) | NO   | UNI | NULL    |                |
| password         | varchar(50) | NO   |     | NULL    |                |
| Confirm_password | varchar(50) | NO   |     | NULL    |                |


```
INSERT INTO User_Details VALUES(1001 , "Kasi Antony" , "Kasi" , 9887766553 , "kasi@gmail.com" , "kasi@123"  ) , (1002 , "Chithraj" , "Chithu" , 97476746653 , "chithraj@gmail.com" , "chittu@2003"  ) , (1003 , "Pavan Raaj" , "Pavan" , 877766453 , "pavan@gmail.com" , "pavan@123"  ), (1004 , "Suguram" , "Sugu" , 912223444553 , "sugu@gmail.com" , "sugu@123"  ),(1005 , "Keerthana" , "Keerthi" , 7756453421 , "keerthana@gmail.com" , "keerthi@123"  );
```

```
SELECT * FROM User_Details;
```

----

```
CREATE TABLE roles_details (
	role_Id INT PRIMARY KEY,
    role_name VARCHAR(100) NOT NULL
);
```

```
DESC roless_details;
```


```
INSERT INTO roles_details VALUES (1,"Admin"),(2,"Students"),(3,"Teacher");
```
```
SELECT * FROM roles_details;
```
| ID_no | Name      | Email_id             | Contact    | Age  |
|:-----:|:---------:|:--------------------:|:----------:|:----:|
|     1 | Ando raj  | andoraj12@gmail.com  | 9789255748 |   20 |
|     2 | Kasi ando | kasiando12@gmail.com | 6381850501 |   22 |

----

```
CREATE TABLE roles (
    user_id INT,
    role_id INT,
    FOREIGN KEY (user_id)
        REFERENCES User_Details (Id_no),
	FOREIGN KEY (role_id)
		REFERENCES roles_details(role_Id)
);
```

```
DESC roles;
```



```
INSERT INTO roles VALUES(1001,1),(1002,2),(1003,3),(1004,3),(1005,2);
```

```
SELECT * FROM roles;
```


----

```
CREATE TABLE COURSE_DETAILS (
	course_id INT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL
);
```
```
DESC COURSE_DETAILS;
```

```
insert INTO COURSE_DETAILS VALUES(101,"Gents",1003),(102,"Women",1004),(103,"Kids",1003),(104,"Sweing machine tutorial",1003);
```

```
DESC COURSE_DETAILS;
```

```
SELECT * FROM COURSE_DETAILS;
```

----
```
CREATE TABLE USER_COURSE (
	user_id INT,
    course_id INT,
    FOREIGN KEY (user_id)
		REFERENCES User_Details (Id_no),
	FOREIGN KEY (course_id)
		REFERENCES COURSE_DETAILS (course_id)
);
```

```
DESC USER_COURSE;
```

```
insert INTO USER_COURSE VALUES(1002,101),(1002,104),(1005,103);
```

```
SELECT * FROM USER_COURSE;
```

----
```
CREATE TABLE QUERIES (
	user_id INT,
    Messages VARCHAR(700),
    FOREIGN KEY (user_id)
		REFERENCES User_Details (Id_no)
);
```

```
DESC QUERIES;
```

```
INSERT INTO QUERIES VALUES(1002,"All good but need some improvement in pages"),(1003,"Need some improvement in About us page");
```


## EER DIAGRAM

![EER DIAGRAM](https://user-images.githubusercontent.com/93571046/160389624-58db9c5d-0f70-4c33-a640-f69a934dd480.png)

----
## ER DIAGRAM

![ERD](https://user-images.githubusercontent.com/93571046/160389671-341102ff-b9f0-491c-8771-96bbc612916a.png)


