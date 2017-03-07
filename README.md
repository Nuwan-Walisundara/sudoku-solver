# Sudoku-solver
jee solution for compiling 9*9 sudoku puzzel.the solution contains following components 
web-client,ejb-parent,ejb-service.The project is maven based.Use the Glassfish 4 runtime.
# Project Structure
```sh
├── ear-application
│   └── pom.xml
├── ejb-service
│   ├── pom.xml
│   └── src
├── pom.xml
└── web-client
    ├── pom.xml
    └── src
```
* [ejb-service] - contains the compiling logic of Sudoku. test cases. Developed using ejb3.
* [web-client] - depend on the ejb-service . expose the service as rest web service. Use jersey 1.8 as run time.
* [ear-application] -  bundle the ejb and web component as ear file.

### Installation

Install /download glassfish4 https://glassfish.java.net/getstarted.html.
start the server using
```sh
glassfish4/bin/asadmin start-domain 
```
loging into admin console . (eg http://localhost:4848/)
upload the ear as a application.

### How to run
sample curl as follows:
```sh
[SUCCESS]
curl http://localhost:8080/sud,8,2,5,9er/query?input=4,3,5,2,6,9,7,8,1,6,8,2,5,7,1,4,9,3,1,9,7,8,3,4,5,6,2,8,2,6,1,9,5,3,4,7,3,7,4,6,8,2,9,1,5,9,5,1,7,4,3,6,2,8,5,1,9,3,2,6,8,7,4,2,4,8,9,5,7,1,3,6,7,6,3,4,1,
{"solution":"4,3,5,2,6,9,7,8,1,6,8,2,5,7,1,4,9,3,1,9,7,8,3,4,5,6,2,8,2,6,1,9,5,3,4,7,3,7,4,6,8,2,9,1,5,9,5,1,7,4,3,6,2,8,5,1,9,3,2,6,8,7,4,2,4,8,9,5,7,1,3,6,7,6,3,4,1,8,2,5,9"}

[ERROR response]
>curl http://localhost:8080/sudoku-solver/query?input=4,3,5,2,6,9,7,8,1,6,8,2,5,7,1,4,9,3,1,9,7,8,3,4,5,6,2,8,2,6,1,9,5,3,4,7,3,7,4,6,8,2,9,1,5,9,5,1,7,4,3,6,2,8,5,1,9,3,2,6,8,7,4,2,4,8,9,5,7,1,3,6,7,6,3,4,1,8,2,5,9x
> {"error":"cannot be completed"}

```
