# Websockets_Java_Spring_React

# How to run
1. Import java project the best in Intelij IDEA
   java/websocket.communication
   and press run button
2. Import react project the best in Visual Studio Code IDEA
   react/websockets.react.com
   and type in command line "npm start"
3. localhost:3000 should be opened, if not open it manually   
4. Send message by postman, like in Technical example below
5. You should see you message on the localhost:3000 page
    

# Idea
Write simple aplication server-client application where client show message that's send to the server.

# Technical
Application that allows to send messages from Spring 3 server to React Client via Web Sockets (With StompJs)

Server Rest Api (Using postman JSON message) 
POST : localhost:8080/send

RAW

----------------------------
{
    "message" : "witam"
}
----------------------------

-> SERVER -> SERVER SENDS TO CLIENT -> CLIENT SHOW MESSAGE AT http://localhost:3000


