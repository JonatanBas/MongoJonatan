package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class Connection
{
    public static void main(String[] args)
    {
        MongoClient mc = new MongoClient();
        MongoDatabase mdb = mc.getDatabase("BBDD");
        mc.close();
    }
}
