package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexion.ConexionMongo;
import modelo.Vehiculo;
import org.bson.Document;

public class VehiculoDAO {

    public void guardar(Vehiculo v) {

        MongoDatabase db = ConexionMongo.getConexion();
        MongoCollection<Document> col = db.getCollection("vehiculos");

        Document doc = new Document("codigo", v.getCodigo())
                .append("marca", v.getMarca())
                .append("modelo", v.getModelo())
                .append("precio", v.getPrecio());

        col.insertOne(doc);
    }
}