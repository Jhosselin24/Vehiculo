package vista;

import hilos.HiloGuardar;
import modelo.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class VentanaVehiculo extends JFrame {

    private JTextField txtCodigo, txtMarca, txtModelo, txtPrecio;
    private JButton btnGuardar;

    public VentanaVehiculo() {

        setTitle("APP ESFOTCAR");
        setSize(550, 300); // 👈 más ancho para la imagen
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(255, 182, 193));

        JLabel lblTitulo = new JLabel("Ingrese datos del Vehículo");
        lblTitulo.setBounds(100, 5, 200, 25);
        add(lblTitulo);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(30, 30, 100, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 30, 180, 25);
        add(txtCodigo);

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(30, 70, 100, 25);
        add(lblMarca);

        txtMarca = new JTextField();
        txtMarca.setBounds(120, 70, 180, 25);
        add(txtMarca);

        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(30, 110, 100, 25);
        add(lblModelo);

        txtModelo = new JTextField();
        txtModelo.setBounds(120, 110, 180, 25);
        add(txtModelo);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(30, 150, 100, 25);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(120, 150, 180, 25);
        add(txtPrecio);

        btnGuardar = new JButton("GUARDAR");
        btnGuardar.setBounds(120, 200, 150, 30);
        add(btnGuardar);

        //Imagen
        try {
            URL url = new URL("https://d2bzx2vuetkzse.cloudfront.net/fit-in/0x450/unshoppable_producs/54e677db-9f0e-47b8-90f5-9357a6ffdf7b.png");
            ImageIcon icon = new ImageIcon(url);

            Image img = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
            ImageIcon iconPequeno = new ImageIcon(img);

            JLabel lblImagen = new JLabel(iconPequeno);
            lblImagen.setBounds(350, 60, 120, 120); // tamaño y posición
            add(lblImagen);

        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen");
        }

        btnGuardar.addActionListener(e -> guardarVehiculo());
    }

    private void guardarVehiculo() {

        try {
            if (txtCodigo.getText().isEmpty() ||
                    txtMarca.getText().isEmpty() ||
                    txtModelo.getText().isEmpty() ||
                    txtPrecio.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Complete todos los campos");
                return;
            }

            Vehiculo v = new Vehiculo();
            v.setCodigo(txtCodigo.getText());
            v.setMarca(txtMarca.getText());
            v.setModelo(txtModelo.getText());
            v.setPrecio(Double.parseDouble(txtPrecio.getText()));

            HiloGuardar hilo = new HiloGuardar(v);
            hilo.start();

            JOptionPane.showMessageDialog(this, "Datos enviados correctamente");

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El precio debe ser numérico");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar");
        }
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtPrecio.setText("");
    }
}