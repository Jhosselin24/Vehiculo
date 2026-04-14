# 🚗 APP ESFOTCAR - Registro de Vehículos

## 📌 Descripción
Aplicación desarrollada en Java que permite registrar vehículos mediante una interfaz gráfica.  
El sistema utiliza **hilos (Thread)** para procesar los datos y **MongoDB Atlas** como base de datos NoSQL para almacenar la información.

---

## 🎯 Objetivo
Desarrollar una aplicación que permita el registro de vehículos utilizando:
- Programación en Java
- Hilos (multithreading)
- Conexión a MongoDB Atlas

---

## 🧩 Tecnologías utilizadas
- Java
- Swing (Interfaz gráfica)
- MongoDB Atlas
- MongoDB Driver
- Lombok

---

## 🖥️ Funcionalidades
✔ Registro de vehículos (código, marca, modelo, precio)  
✔ Uso de hilos para el guardado de datos  
✔ Conexión a base de datos en la nube  
✔ Interfaz gráfica amigable  
✔ Validación de campos  

---

## 📂 Estructura del proyecto
src/
├── conexion/
│ └── ConexionMongo.java
├── dao/
│ └── VehiculoDAO.java
├── hilos/
│ └── HiloGuardar.java
├── modelo/
│ └── Vehiculo.java
├── vista/
│ └── VentanaVehiculo.java


---

## 🔌 Configuración de MongoDB

1. Crear cuenta en MongoDB Atlas  
2. Crear un cluster  
3. Agregar IP (0.0.0.0/0)  
4. Crear usuario y contraseña  
5. Copiar la cadena de conexión  

🚀 Ejecución del proyecto
Ejecutar la clase principal
<img width="773" height="438" alt="image" src="https://github.com/user-attachments/assets/b732d2fb-d2c9-4d05-80cf-4e2ed315e818" />

Ingresar datos en la interfaz
<img width="671" height="361" alt="image" src="https://github.com/user-attachments/assets/90e3076c-94b2-47e3-9453-58fcfb066637" />

Presionar el botón GUARDAR
<img width="665" height="361" alt="image" src="https://github.com/user-attachments/assets/44d4d262-97b8-4e9a-91ca-0b06d74692e1" />

Verificar datos en MongoDB Atlas
<img width="643" height="155" alt="image" src="https://github.com/user-attachments/assets/f5642679-9f59-4edf-a86d-fd6d7b52acc9" />

🧠 Conceptos aplicados
Programación orientada a objetos
Hilos en Java (Thread)
Arquitectura en capas (DAO, Modelo, Vista)
Base de datos NoSQL

📚 Bibliografía
MongoDB (s.f.). MongoDB Atlas Documentation. https://www.mongodb.com/docs/atlas/
Oracle (s.f.). Java Documentation. https://docs.oracle.com/en/java/
Lombok (s.f.). Project Lombok. https://projectlombok.org/

👩‍💻 Autor

Proyecto desarrollado por: Jhosselin Naula
