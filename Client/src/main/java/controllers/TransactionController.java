package controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import models.Id;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;
    List<JSONPObject> user = new ArrayList<>();
    List<JSONPObject> messages = new ArrayList<>();
    private StringBuilder informationStringUsers;
    private StringBuilder informationStringMessages;
    StringBuilder informationString;
    URL urlID = new URL(rootURL + "/ids");
    URL urlMessages = new URL("http://xipcode.rocks:8085/massages");

    {

        try {
            URL url = urlID;
            HttpURLConnection conn = null;
            try {
                conn = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.setRequestMethod("GET");
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.connect();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int responseCode = 0;
            try {
                responseCode = conn.getResponseCode();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode:")
            }


    public TransactionController(MessageController m, IdController j) {
            }

            public List<Id> getIds () {

                return null;
            }
            public String postId (String idtoRegister, String githubName){
                Id tid = new Id(idtoRegister, githubName);
                tid = idCtrl.postId(tid);
                return ("Id registered.");
            }

            public String makecall (String s, String get, String s1){
                return null;
            }
        }
    }
}
