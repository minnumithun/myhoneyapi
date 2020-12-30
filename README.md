# myhoneyapi
It is as set of smaple apis which mainly used for most common api operations
It is developed only for to demonstate some api testing aspetcs

How to start and run this Apis
Go to the project location (eg: C://xxx/xxx/myhoneyapi)
Run the below command: mvn spring-boot:run
APIs:
Calaculator apis:

Addition api :
method : GET
url :/api/calculator/add/{val1}/{val2}
eg: http://localhost:8080/api//calculator/add/5/9
response: 14

Multiplication api :
method : GET
url :/api/calculator/multi/{val1}/{val2}
eg: http://localhost:8080/api/calculator/multi/5/9
response: 45

Substraction api :
method : GET
url :/api/calculator/sub?val1=9&val2=5
eg: http://localhost:8080/api/calculator/sub?val1=9&val2=5
response: 4

Division api :
method : GET
url :/api/calculator/div?val1=9&val2=5
eg: http://localhost:8080/api/calculator/div?val1=9&val2=5
response: 1



