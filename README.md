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

5 rows in set (0.00 sec)


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

6 rows in set (0.00 sec)

```
CREATE TABLE Sign_up (
	Id_no INT AUTO_INCREMENT PRIMARY KEY,
    FUll_name VARCHAR(50) NOT NULL,
    User_name VARCHAR(50) UNIQUE NOT NULL,
    contact_number VARCHAR(20) NOT NULL,
    email_id VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    Confirm_password VARCHAR(50) NOT NULL
);
```
