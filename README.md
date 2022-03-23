### MODERN-TAILORS



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
CREATE TABLE Sign_up (Id_no INT AUTO_INCREMENT PRIMARY KEY,FUll_name VARCHAR(50) NOT NULL,User_name VARCHAR(50) UNIQUE NOT NULL,contact_number VARCHAR(20) NOT NULL,email_id VARCHAR(50) UNIQUE NOT NULL,password VARCHAR(50) NOT NULL,Confirm_password VARCHAR(50) NOT NULL);
```
```
DESC Sign_up;
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
ALTER TABLE Sign_up RENAME TO User_Details;
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
INSERT INTO User_Details VALUES(1,"Kasi anotny","Kasi-antony","8682072886","antokasi44@gmail.com","kasiraj1234","kasiraj1234");
INSERT INTO User_Details VALUES(2,"Chitraj","chithu","7639312147","spideyboy44@gmail.com","chithraj1234","chithraj1234");
```

```
SELECT * FROM User_Details;
```


| Id_no | FUll_name   | User_name   | contact_number | email_id              | password     | Confirm_password |
|:-----:|:-----------:|:-----------:|:--------------:|:---------------------:|:------------:|:----------------:|
|     1 | Kasi anotny | Kasi-antony | 8682072886     | antokasi44@gmail.com  | kasiraj1234  | kasiraj1234      |
|     2 | Chitraj     | chithu      | 7639312147     | spideyboy44@gmail.com | chithraj1234 | chithraj1234     |

----

```
CREATE TABLE Applicants_Details (ID_no INT AUTO_INCREMENT PRIMARY KEY,Name VARCHAR(50) NOT NULL,Email_id VARCHAR(50) UNIQUE NOT NULL,Contact VARCHAR(50) NOT NULL,Age INT,CHECK (Age >= 18),FOREIGN KEY (Id_no) REFERENCES User_Details (Id_no));
```

```
DESC Applicants_Details;
```

| Field    | Type        | Null | Key | Default | Extra          |
|:--------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| ID_no    | int         | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(50) | NO   |     | NULL    |                |
| Email_id | varchar(50) | NO   | UNI | NULL    |                |
| Contact  | varchar(50) | NO   |     | NULL    |                |
| Age      | int         | YES  |     | NULL    |                |


```
INSERT INTO Applicants_Details VALUES(1,"Ando raj","andoraj12@gmail.com","9789255748",20);
INSERT INTO Applicants_Details VALUES(2,"Kasi ando","kasiando12@gmail.com","6381850501",22);
```
```
SELECT * FROM Applicants_Details;
```
| ID_no | Name      | Email_id             | Contact    | Age  |
|:-----:|:---------:|:--------------------:|:----------:|:----:|
|     1 | Ando raj  | andoraj12@gmail.com  | 9789255748 |   20 |
|     2 | Kasi ando | kasiando12@gmail.com | 6381850501 |   22 |

----

```
CREATE TABLE Applicants_List (Id_no INT AUTO_INCREMENT NOT NULL,NAME VARCHAR(50) NOT NULL,Email_id VARCHAR(50) UNIQUE NOT NULL,Conctact VARCHAR(50) NOT NULL,Age INT,CHECK (Age >= 18),FOREIGN KEY (Id_no) REFERENCES Applicants_Details (ID_no));
```

```
DESC Applicants_List;
```


| Field    | Type        | Null | Key | Default | Extra          |
|:--------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| Id_no    | int         | NO   | MUL | NULL    | auto_increment |
| NAME     | varchar(50) | NO   |     | NULL    |                |
| Email_id | varchar(50) | NO   | PRI | NULL    |                |
| Conctact | varchar(50) | NO   |     | NULL    |                |
| Age      | int         | YES  |     | NULL    |                |



```
INSERT INTO Applicants_List VALUES(1,"Ando raj","andoraj12@gmail.com","9789255748",20);
INSERT INTO Applicants_List VALUES(2,"Kasi ando","kasiando12@gmail.com","6381850501",22);
```

```
SELECT * FROM Applicants_List;
```

| Id_no | NAME      | Email_id             | Conctact   | Age  |
|:-----:|:---------:|:--------------------:|:----------:|:----:|
|     1 | Ando raj  | andoraj12@gmail.com  | 9789255748 |   20 |
|     2 | Kasi ando | kasiando12@gmail.com | 6381850501 |   22 |

----

```
CREATE TABLE Queries (ID_no INT AUTO_INCREMENT PRIMARY KEY,Name VARCHAR(50) NOT NULL,Email_id VARCHAR(50) UNIQUE NOT NULL,Contact VARCHAR(50) NOT NULL,Message INT,FOREIGN KEY (Id_no) REFERENCES User_Details (Id_no));
```
```
DESC Queries;
```

| Field    | Type         | Null | Key | Default | Extra          |
|:--------:|:------------:|:----:|:---:|:-------:|:--------------:|
| ID_no    | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(50)  | NO   |     | NULL    |                |
| Email_id | varchar(50)  | NO   | UNI | NULL    |                |
| Contact  | varchar(50)  | NO   |     | NULL    |                |
| Message  | int | YES  |     | NULL    |                |

```
INSERT INTO Queries VALUES(1,"Kasi antony","antokasi44@gmail.com","8682072886","All good but need some improvement in pages");
INSERT INTO Queries VALUES(2,"Andoraj","andoraj23@gmail.com","9597312147","Need some improvement in About us page");
```
```
ALTER TABLE Queries MODIFY Message VARCHAR(500);
```
```
DESC Queries;
```

| Field    | Type         | Null | Key | Default | Extra          |
|:--------:|:------------:|:----:|:---:|:-------:|:--------------:|
| ID_no    | int          | NO   | PRI | NULL    | auto_increment |
| Name     | varchar(50)  | NO   |     | NULL    |                |
| Email_id | varchar(50)  | NO   | UNI | NULL    |                |
| Contact  | varchar(50)  | NO   |     | NULL    |                |
| Message  | varchar(500) | YES  |     | NULL    |                |

```
SELECT * FROM Queries;
```

| ID_no | Name        | Email_id             | Contact    | Message                                     |
|:-----:|:-----------:|:--------------------:|:----------:|:-------------------------------------------:|
|     1 | Kasi antony | antokasi44@gmail.com | 8682072886 | All good but need some improvement in pages |
|     2 | Andoraj     | andoraj23@gmail.com  | 9597312147 | Need some improvement in About us page      |

----
```
CREATE TABLE Student_list (Id_no INT AUTO_INCREMENT NOT NULL,User_Name VARCHAR(50) NOT NULL,Email_id VARCHAR(50) UNIQUE NOT NULL,Conctact VARCHAR(50) NOT NULL,Age INT,CHECK (Age >= 14),FOREIGN KEY (Id_no) REFERENCES User_Details (ID_no),FOREIGN KEY (User_Name) REFERENCES User_Details (User_name));
```

```
DESC Student_list;
```

| Field    | Type        | Null | Key | Default | Extra          |
|:--------:|:-----------:|:----:|:---:|:-------:|:--------------:|
| Id_no    | int         | NO   | MUL | NULL    | auto_increment |
| User_Name     | varchar(50) | NO   | MUL | NULL    |                |
| Email_id | varchar(50) | NO   | PRI | NULL    |                |
| Conctact | varchar(50) | NO   |     | NULL    |                |
| Age      | int         | YES  |     | NULL    |                |

```
INSERT INTO Student_list VALUES(1,"Kasi-antony","antokasi44@gmail.com","8682072886",20);
INSERT INTO Student_list VALUES(2,"chithu","spideyboy44@gmail.com","7639312147",18);
```

```
SELECT * FROM Student_list;
```

| Id_no | User_Name   | Email_id              | Conctact   | Age  |
|:-----:|:-----------:|:---------------------:|:----------:|:----:|
|     1 | Kasi-antony | antokasi44@gmail.com  | 8682072886 |   20 |
|     2 | chithu      | spideyboy44@gmail.com | 7639312147 |   18 |

----
```
CREATE TABLE Admin_Details (Id_no INT AUTO_INCREMENT NOT NULL,Admin_Id INT UNIQUE NOT NULL,Password VARCHAR(100) NOT NULL,FOREIGN KEY (Id_no) REFERENCES User_Details (ID_no)
);
```

```
DESC Admin_Details;
```
| Field    | Type         | Null | Key | Default | Extra          |
|:--------:|:------------:|:----:|:---:|:-------:|:--------------:|
| Id_no    | int          | NO   | MUL | NULL    | auto_increment |
| Admin_Id | int          | NO   | PRI | NULL    |                |
| Password | varchar(100) | NO   |     | NULL    |                |

```
INSERT INTO Admin_Details VALUES(1,101,"Revathi@21");
INSERT INTO Admin_Details VALUES(2,102,"CHITRA@11");
```
| Id_no | Admin_Id | Password   |
|:-----:|:--------:|:----------:|
|     1 |      101 | Revathi@21 |
|     2 |      102 | CHITRA@11  |


## EER DIAGRAM

![EER DIAGRAM](https://user-images.githubusercontent.com/93571046/159673974-a2611834-6b75-450c-93d4-2e94738b0d63.png)

## ER DIAGRAM

![Drawing](https://user-images.githubusercontent.com/93571046/159674701-20e33a05-cea1-4977-a57d-0e6e4c6bdaff.png)

