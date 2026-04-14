package conexion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class ConexionMongo {

    private static final String URI = "mongodb+srv://admin:1234@cluster0.m7gozse.mongodb.net/?appName=Cluster0";

    public static MongoDatabase getConexion() {
        MongoClient client = MongoClients.create(URI);
        return client.getDatabase("vehiculosDB");
    }
}