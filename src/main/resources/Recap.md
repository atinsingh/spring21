## Recap of Spring Class
Spring is based on POJO 
POJO == stand for Plain Old Java Object 
### Dependency Injection 
### Inversion of Control 

### IOC Container 

### Application Context
-- FileSystem Based Application Context
-- ClassPath Configuration

## Constructor param injection 
## Setter based param injection 

## Bean Scope 
#### Singleton 
Only 1 bean is managed throughout the project 
#### Prototype 
new instance of bean is created everytime you request bean from 
from IOC Container/Application Context 
#### Request 
Applicable to MVC -- a new bean is created to fulfill that request 
#### Session 
Applicable to for MVC -- A bean per session will be created. 

