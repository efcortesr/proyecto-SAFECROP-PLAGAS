package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InfoPlatano extends javax.swing.JFrame {
    private static ArrayList<Plaga> listaDePlaga = Plaga.plagas;

    public InfoPlatano(String tituloCultivo) {
        initComponents();

        tituloPlaga_Lbl.setText(tituloCultivo);
        
        nematodoPlatano_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(0).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(0).getNombrePlaga());
            }
        });

        arañasRojasPlatano_Btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(1).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(1).getNombrePlaga());
            }
        });

        picudosPlatano_Btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(2).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(2).getNombrePlaga());
            }
        });
    }

                             
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        safecrop3_Lbl = new javax.swing.JLabel();
        volver2_Btn = new javax.swing.JButton();
        tituloPlaga_Lbl = new javax.swing.JLabel();
        nematodoPlatano_Btn = new javax.swing.JButton();
        picudosPlatano_Btn1 = new javax.swing.JButton();
        arañasRojasPlatano_Btn2 = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        tipoPlaga_Lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoPlaga_txt = new javax.swing.JTextPane();
        productos_Btn = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        safecrop3_Lbl.setFont(new java.awt.Font("Roboto Medium", 2, 36)); // NOI18N
        safecrop3_Lbl.setForeground(new java.awt.Color(0, 0, 102));
        safecrop3_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        safecrop3_Lbl.setText("SafeCrop");

        volver2_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        volver2_Btn.setForeground(new java.awt.Color(255, 0, 0));
        volver2_Btn.setText("Volver");

        tituloPlaga_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPlaga_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPlaga_Lbl.setText("Plagas del cultivo:");

        nematodoPlatano_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        nematodoPlatano_Btn.setText("Nemátodo");

        picudosPlatano_Btn1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        picudosPlatano_Btn1.setText("Picudos Negros");

        arañasRojasPlatano_Btn2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        arañasRojasPlatano_Btn2.setText("Arañas Rojas");

        tipoPlaga_Lbl1.setFont(new java.awt.Font("Roboto Medium", 2, 36)); // NOI18N
        tipoPlaga_Lbl1.setForeground(new java.awt.Color(0, 0, 102));
        tipoPlaga_Lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoPlaga_Lbl1.setText("Tipo de plaga");

        infoPlaga_txt.setEditable(false);
        infoPlaga_txt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        infoPlaga_txt.setText("Info Aquí");
        jScrollPane1.setViewportView(infoPlaga_txt);

        productos_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        productos_Btn.setText("¿Cómo Erradicarlo?");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(tipoPlaga_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(productos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tipoPlaga_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(productos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(safecrop3_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPlaga_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arañasRojasPlatano_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nematodoPlatano_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(picudosPlatano_Btn1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(volver2_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(safecrop3_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloPlaga_Lbl)
                .addGap(38, 38, 38)
                .addComponent(nematodoPlatano_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(arañasRojasPlatano_Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(picudosPlatano_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(volver2_Btn)
                .addGap(23, 23, 23))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        volver2_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver2_BtnActionPerformed(evt);
            }
        });

        productos_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos_BtnActionPerformed(evt);
            }
        });

        pack();
    }


    private void volver2_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
        Inicio infoCultivosFrame = new Inicio();
        infoCultivosFrame.setVisible(true);
    }
    

    private void productos_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        if (tipoPlaga_Lbl1.getText() == "Nemátodo") {
            Productos infoFrame = new Productos(listaDePlaga.get(0).getProducto(), "¿Cómo Erradicar el " + listaDePlaga.get(0).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        } else if (tipoPlaga_Lbl1.getText() == "Araña Roja") {
            Productos infoFrame = new Productos(listaDePlaga.get(1).getProducto() , "¿Cómo Erradicar la " + listaDePlaga.get(1).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        } else if (tipoPlaga_Lbl1.getText() == "Picudo Negro") {
            Productos infoFrame = new Productos(listaDePlaga.get(2).getProducto(), "¿Cómo Erradicar el " + listaDePlaga.get(2).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        }
            
    }    


    private javax.swing.JButton arañasRojasPlatano_Btn2;
    private javax.swing.JPanel content;
    private javax.swing.JTextPane infoPlaga_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nematodoPlatano_Btn;
    private javax.swing.JButton picudosPlatano_Btn1;
    private javax.swing.JLabel safecrop3_Lbl;
    private javax.swing.JLabel tipoPlaga_Lbl1;
    private javax.swing.JLabel tituloPlaga_Lbl;
    private javax.swing.JButton volver2_Btn;
    private javax.swing.JButton productos_Btn;
                      
}