package org.example;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertOne
{
    public static void main(String[] args)
    {
        MongoClient mc = new MongoClient();
        MongoDatabase mdb = mc.getDatabase("Tienda");
        MongoCollection mco = mdb.getCollection("Smartphones");

        Smartphone s1 = new Smartphone()

    }
}
