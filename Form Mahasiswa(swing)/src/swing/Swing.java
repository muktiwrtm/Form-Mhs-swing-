package swing;


import javax.swing.*;
import java.awt.*;


public class Swing extends JFrame {

    JLabel judul, Lnama, Lnim, Lkelamin, Lagama, Lalamat;
    JTextField nama, nim;
    JRadioButton cowo, cewe;
    JTextArea alamat;
    JComboBox Cagama;
    String[] Sagama = {"Islam","Kristen", "Hindu", "Budha","Konghucu"};
    JButton tombol1;

    public void Mahasiswa() {
        setTitle("FORM MAHASISWA");

        judul = new JLabel("DATA DIRI MAHASISWA");
        Lnama = new JLabel("Nama");
        nama = new JTextField();
        Lnim = new JLabel("Nim");
        nim = new JTextField();
        Lkelamin = new JLabel("Jenis Kelamin");
        cowo = new JRadioButton("L");
        cewe = new JRadioButton("P");
        Lagama = new JLabel("Agama");
        Cagama = new JComboBox(Sagama);
        Lalamat = new JLabel("Alamat");
        alamat = new JTextArea();
        tombol1 = new JButton("OK");

        setLayout(null);

        add(nama);
        add(nim);
        add(judul);
        add(Lnama);
        add(Lnim);
        add(Lkelamin);
        add(cowo);
        add(cewe);
        add(Lagama);
        add(Cagama);
        add(Lalamat);
        add(alamat);
        add(tombol1);


        judul.setBounds(250, 20, 200, 40);
        Lnama.setBounds(80,70, 120, 20);
        nama.setBounds(260, 70, 200, 30);
        Lnim.setBounds(80,120,120,20);
        nim.setBounds(260, 120, 200, 30);
        Lkelamin.setBounds(80,170,120,20);
        cowo.setBounds(270, 165, 50, 30);
        cewe.setBounds(330, 165, 50, 30);
        Lagama.setBounds(80,220,120,20);
        Cagama.setBounds(260, 220, 100, 30);
        Lalamat.setBounds(80,270,120,20);
        alamat.setBounds(260, 270, 300, 100);
        tombol1.setBounds(470,400,80,25);


        setSize(600,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
