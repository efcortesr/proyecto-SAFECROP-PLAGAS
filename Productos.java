package GUI;

public class Productos extends javax.swing.JFrame {

    public Productos(String informacion, String titulo) {
        initComponents();
        infoProductos_txt.setText(informacion);
        tituloProducto_Lbl.setText(titulo);
    }
                        
    private void initComponents() {

        volver_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_txt = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        tituloProducto_Lbl = new javax.swing.JLabel();
        volverProductos_Btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoProductos_txt = new javax.swing.JTextPane();

        volver_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        volver_Btn.setForeground(new java.awt.Color(255, 0, 0));
        volver_Btn.setText("Volver");

        info_txt.setEditable(false);
        info_txt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        info_txt.setText("Info Aquí");
        jScrollPane1.setViewportView(info_txt);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloProducto_Lbl.setFont(new java.awt.Font("Roboto Medium", 2, 28)); // NOI18N
        tituloProducto_Lbl.setForeground(new java.awt.Color(0, 0, 102));
        tituloProducto_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProducto_Lbl.setText("¿Cómo contrarrestar");

        volverProductos_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        volverProductos_Btn.setForeground(new java.awt.Color(255, 0, 0));
        volverProductos_Btn.setText("Volver");

        infoProductos_txt.setEditable(false);
        infoProductos_txt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        infoProductos_txt.setText("Info Aquí");
        jScrollPane2.setViewportView(infoProductos_txt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloProducto_Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(volverProductos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloProducto_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(volverProductos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(105, Short.MAX_VALUE)))
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

        volverProductos_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverProductos_BtnActionPerformed(evt);
            }
        });

        pack();
    }

    private void volverProductos_BtnActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
        String titulo = tituloProducto_Lbl.getText();
        if (titulo.contains("¿Cómo Erradicar el Nemátodo?")) {
            InfoPlatano panta = new InfoPlatano("Plagas del Plátano:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar la Araña Roja?")) {
            InfoPlatano panta = new InfoPlatano("Plagas del Plátano:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar el Picudo Negro")) {
            InfoPlatano panta = new InfoPlatano("Plagas del Plátano:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar el Tizón?")) {
            InfoPapa panta = new InfoPapa("Plagas de la Papa:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar el Escarabajo?")) {
            InfoPapa panta = new InfoPapa("Plagas de la Papa:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar la Mosca?")) {
            InfoPapa panta = new InfoPapa("Plagas de la Papa:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar los Pulgones?")) {
            InfoMaiz panta = new InfoMaiz("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar a la Araña Roja?")) {
            InfoMaiz panta = new InfoMaiz("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar las Orugas?")) {
            InfoMaiz panta = new InfoMaiz("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar los Nemátodos?")) {
            InfoFresa panta = new InfoFresa("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar los Ácaros?")) {
            InfoFresa panta = new InfoFresa("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar a los Pulgones?")) {
            InfoFresa panta = new InfoFresa("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar Pulgones?")) {
            InfoLechuga panta = new InfoLechuga("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar a los Caracoles?")) {
            InfoLechuga panta = new InfoLechuga("Plagas del Maíz:");
            panta.setVisible(true);
        } else if (titulo.contains("¿Cómo Erradicar a las Orugas")) {
            InfoLechuga panta = new InfoLechuga("Plagas del Maíz:");
            panta.setVisible(true);
        }
            
        
        
    }

    private javax.swing.JTextPane infoProductos_txt;
    private javax.swing.JTextPane info_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel tituloProducto_Lbl;
    private javax.swing.JButton volverProductos_Btn;
    private javax.swing.JButton volver_Btn;
                 
}
