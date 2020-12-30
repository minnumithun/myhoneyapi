# myhoneyapi
It is as set of smaple apis which mainly used for most common api operations
It is developed only for to demonstate some api testing aspetcs

### How to start and run this Apis  <br />
Go to the project location (eg: C://xxx/xxx/myhoneyapi)
Run the below command: <br />
**mvn spring-boot:run**

### APIs:
## Calaculator apis:

##### Addition api :<br />
method : GET <br />
url :/api/calculator/add/{val1}/{val2} <br />
eg: http://localhost:8080/api//calculator/add/5/9 <br />
response: 14 <br />
##### Multiplication api : <br />
method : GET <br />
url :/api/calculator/multi/{val1}/{val2} <br />
eg: http://localhost:8080/api/calculator/multi/5/9 <br />
response: 45 <br />
##### Substraction api : <br />
method : GET <br />
url :/api/calculator/sub?val1=9&val2=5 <br />
eg: http://localhost:8080/api/calculator/sub?val1=9&val2=5 <br />
response: 4 <br />
##### Division api : <br />
method : GET <br /> 
url :/api/calculator/div?val1=9&val2=5 <br />
eg: http://localhost:8080/api/calculator/div?val1=9&val2=5 <br />
response: 1



