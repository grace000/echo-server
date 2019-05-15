# echo-server

### Java Echo Server
Network client/server application

### Requirements
- Software: [Java](https://docs.oracle.com/en/java/javase/12/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A)
- Connection Protocol: [NetCat](http://netcat.sourceforge.net/)
- Optional IDE: [IntelliJ](https://www.jetbrains.com/idea/)

### Getting Started
Clone this repo: https://github.com/grace000/echo-server.git

### Usage
1. In one terminal window, Run EchoServer.java to start the server
2. To connect to the server, in a new terminal window:

```
nc localhost 59898
```
3. Send your request. The server will echo your request as a response.
```
Howdy!
```


