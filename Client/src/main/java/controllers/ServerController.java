package controllers;

//import spiffyURLManipulator
import models.Id;

import javax.json.JsonString;
import java.net.HttpURLConnection;

public class ServerController{
  // HttpURLConnection
    private String rootURL = "http://zipcode.rocks:8085";

    private ServerController svr = new ServerController();

    private ServerController() {}

    public ServerController shared() {
        return svr;
    }

    public JsonString idGet() {
        // url -> /ids/
        // send the server a get with url
        // return json from server
        return null;
    }
    public JsonString idPost(Id id) {
        // url -> /ids/
        // create json from Id
        // request
        // reply
        // return json
        return null;
    }
    public JsonString idPut(Id id) {
        // url -> /ids/
        return null;
    }


}

// ServerController.shared.doGet()