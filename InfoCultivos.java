package GUI;

public class InfoCultivos extends javax.swing.JFrame {     

    public InfoCultivos(String informacion, String cultivo) {
        initComponents();
        info_txt.setText(informacion);
        tituloTipoCultivo_Lbl.setText(cultivo);
    }
    
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        safecrop2_Lbl = new javax.swing.JLabel();
        volver_Btn = new javax.swing.JButton();
        conocerPlagas_Btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        info_txt = new javax.swing.JTextPane();
        tituloTipoCultivo_Lbl = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        safecrop2_Lbl.setFont(new java.awt.Font("Roboto Medium", 2, 36)); // NOI18N
        safecrop2_Lbl.setForeground(new java.awt.Color(0, 0, 102));
        safecrop2_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        safecrop2_Lbl.setText("SafeCrop");

        volver_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        volver_Btn.setForeground(new java.awt.Color(255, 0, 0));
        volver_Btn.setText("Volver");

        conocerPlagas_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        conocerPlagas_Btn.setText("Conocer Plagas");
        conocerPlagas_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conocerPlagas_BtnActionPerformed(evt);
            }
        });

        info_txt.setEditable(false);
        info_txt.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        info_txt.setText("Info Aquí");
        jScrollPane1.setViewportView(info_txt);

        tituloTipoCultivo_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloTipoCultivo_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTipoCultivo_Lbl.setText("Cultivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(conocerPlagas_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(volver_Btn)
                        .addGap(76, 76, 76)
                        .addComponent(safecrop2_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(tituloTipoCultivo_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(volver_Btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(safecrop2_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloTipoCultivo_Lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conocerPlagas_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
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

        volver_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_BtnActionPerformed(evt);
            }
        });
        pack();
    }                       

    private void conocerPlagas_BtnActionPerformed(java.awt.event.ActionEvent evt) {    
        String cultivo = tituloTipoCultivo_Lbl.getText();
   
    if (cultivo.equals("Plátano:")) {
        InfoPlatano infoPlagasFrame = new InfoPlatano("Plagas del Plátano:");
        infoPlagasFrame.setVisible(true);
    } else if (cultivo.equals("Papa:")) {
        InfoPapa infoPlagasFrame = new InfoPapa("Plagas de la Papa:");
        infoPlagasFrame.setVisible(true);
    } else if (cultivo.equals("Maíz:")) {
        InfoMaiz infoPlagasFrame = new InfoMaiz("Plagas del Maíz:");
        infoPlagasFrame.setVisible(true);
    } else if (cultivo.equals("Fresa:")) {
        InfoFresa infoPlagasFrame = new InfoFresa("Plagas de la Fresa:");
        infoPlagasFrame.setVisible(true);
    } else if (cultivo.equals("Lechuga:")) {
        InfoLechuga infoPlagasFrame = new InfoLechuga("Plagas de la Lechuga:");
        infoPlagasFrame.setVisible(true);
    }
    
    this.dispose();
    }                                                 

    private void volver_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
        Inicio inicioFrame = new Inicio();
        inicioFrame.setVisible(true);
    }
                       
    private javax.swing.JButton conocerPlagas_Btn;
    private javax.swing.JTextPane info_txt;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel safecrop2_Lbl;
    private javax.swing.JLabel tituloTipoCultivo_Lbl;
    private javax.swing.JButton volver_Btn; 
}
