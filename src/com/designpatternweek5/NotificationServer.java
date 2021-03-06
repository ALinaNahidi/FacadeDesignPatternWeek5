package com.designpatternweek5;

public class NotificationServer {
    //Connect to server -> connection object
    //authenticate(appID,key) -> AuthToken
    //send(authToken, message, target)
    //connection.disconnect()

    public Connection connect(String ipAddress){
        return new Connection();
    }

    public AuthToken authenticate(String aapId, String key){
        return new AuthToken();
    }

    public void send(AuthToken authToken,Message message, String target){
        System.out.println("Sending a message");
    }

}
