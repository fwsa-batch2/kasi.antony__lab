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
CREATE DATABASE Modern_Tailors;
```
```
SHOW DATABASES;
```

| Database           |
|:------------------:|
| Modern_Tailors     |
| information_schema |
| mysql              |
| performance_schema |
| studnet_academy    |
| sys                |

```
USE Modern_Tailors;
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
DESC roles_details;
```
| Field     | Type         | Null | Key | Default | Extra |
|:---------:|:------------:|:----:|:---:|:-------:|:-----:|
| role_Id   | int          | NO   | PRI | NULL    |       |
| role_name | varchar(100) | NO   |     | NULL    |       |


```
INSERT INTO roles_details VALUES (1,"Admin"),(2,"Students"),(3,"Teacher");
```
```
SELECT * FROM roles_details;
```
| role_Id | role_name |
|:-------:|:---------:|
|       1 | Admin     |
|       2 | Students  |
|       3 | Teacher   |

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
| Field   | Type | Null | Key | Default | Extra |
|:-------:|:----:|:----:|:---:|:-------:|:-----:|
| user_id | int  | YES  | MUL | NULL    |       |
| role_id | int  | YES  | MUL | NULL    |       |



```
INSERT INTO roles VALUES(1001,1),(1002,2),(1003,3),(1004,3),(1005,2);
```

```
SELECT * FROM roles;
```
| user_id | role_id |
|:-------:|:-------:|
|    1001 |       1 |
|    1002 |       2 |
|    1003 |       3 |
|    1004 |       3 |
|    1005 |       2 |

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
| Field       | Type         | Null | Key | Default | Extra |
|:-----------:|:------------:|:----:|:---:|:-------:|:-----:|
| course_id   | int          | NO   | PRI | NULL    |       |
| course_name | varchar(100) | NO   |     | NULL    |       |
| teacher_id  | int          | YES  | MUL | NULL    |       |

```
SELECT * FROM COURSE_DETAILS;
```
| course_id | course_name             | teacher_id |
|:---------:|:-----------------------:|:----------:|
|       101 | Gents                   |       1003 |
|       102 | Women                   |       1004 |
|       103 | Kids                    |       1003 |
|       104 | Sweing machine tutorial |       1003 |

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
| Field     | Type | Null | Key | Default | Extra |
|:---------:|:----:|:----:|:---:|:-------:|:-----:|
| user_id   | int  | YES  | MUL | NULL    |       |
| course_id | int  | YES  | MUL | NULL    |       |

```
insert INTO USER_COURSE VALUES(1002,101),(1002,104),(1005,103);
```

```
SELECT * FROM USER_COURSE;
```
| user_id | course_id |
|:-------:|:---------:|
|    1002 |       101 |
|    1002 |       104 |
|    1005 |       103 |

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
| Field    | Type         | Null | Key | Default | Extra |
|:--------:|:------------:|:----:|:---:|:-------:|:-----:|
| user_id  | int          | YES  | MUL | NULL    |       |
| Messages | varchar(700) | YES  |     | NULL    |       |

```
INSERT INTO QUERIES VALUES(1002,"All good but need some improvement in pages"),(1003,"Need some improvement in About us page");
```
```
SELECT * FROM QUERIES;
```
| user_id | Messages                                    |
|:-------:|:-------------------------------------------:|
|    1002 | All good but need some improvement in pages |
|    1003 | Need some improvement in About us page      |


## EER DIAGRAM


![EER DIAGRAM](https://user-images.githubusercontent.com/93571046/159673974-a2611834-6b75-450c-93d4-2e94738b0d63.png)
----
## ER DIAGRAM


![Drawing](https://user-images.githubusercontent.com/93571046/159674701-20e33a05-cea1-4977-a57d-0e6e4c6bdaff.png)

