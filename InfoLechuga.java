package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InfoLechuga extends javax.swing.JFrame {
    private static ArrayList<Plaga> listaDePlaga = Plaga.plagas;
    public InfoLechuga(String tituloCultivo) {
        initComponents();

        tituloPlaga_Lbl.setText(tituloCultivo);

        pulgonesLechuga_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(6).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(6).getNombrePlaga());
            }
        });
    
        caracolesLechuga_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(8).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(8).getNombrePlaga());
            }
        });

        orugasLechuga_Btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                infoPlaga_txt.setText(listaDePlaga.get(7).getDescripcionPlaga());
                tipoPlaga_Lbl1.setText(listaDePlaga.get(7).getNombrePlaga());
            }
        });
    }
                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        safecrop3_Lbl = new javax.swing.JLabel();
        tituloPlaga_Lbl = new javax.swing.JLabel();
        pulgonesLechuga_Btn = new javax.swing.JButton();
        volver3_Btn = new javax.swing.JButton();
        caracolesLechuga_Btn = new javax.swing.JButton();
        orugasLechuga_Btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
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

        tituloPlaga_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tituloPlaga_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPlaga_Lbl.setText("Plagas del cultivo:");

        pulgonesLechuga_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        pulgonesLechuga_Btn.setText("Pulgones");

        volver3_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        volver3_Btn.setForeground(new java.awt.Color(255, 0, 0));
        volver3_Btn.setText("Volver");

        caracolesLechuga_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        caracolesLechuga_Btn.setText("Caracoles");

        orugasLechuga_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        orugasLechuga_Btn.setText("Orugas");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(tipoPlaga_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(productos_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tipoPlaga_Lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(safecrop3_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloPlaga_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(caracolesLechuga_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(pulgonesLechuga_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orugasLechuga_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(volver3_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(safecrop3_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloPlaga_Lbl)
                .addGap(46, 46, 46)
                .addComponent(pulgonesLechuga_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(caracolesLechuga_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(orugasLechuga_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(volver3_Btn)
                .addGap(31, 31, 31))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        volver3_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver3_BtnActionPerformed(evt);
            }
        });

        productos_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos_BtnActionPerformed(evt);
            }
        });

        pack();
    }

    private void volver3_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.dispose();
        Inicio infoCultivosFrame = new Inicio();
        infoCultivosFrame.setVisible(true);
    }

    private void productos_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
        if (tipoPlaga_Lbl1.getText() == "Pulgones") {
            Productos infoFrame = new Productos(listaDePlaga.get(6).getProducto(), "¿Cómo Erradicar " + listaDePlaga.get(6).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        } else if (tipoPlaga_Lbl1.getText() == "Caracoles") {
            Productos infoFrame = new Productos(listaDePlaga.get(8).getProducto() , "¿Cómo Erradicar a los " + listaDePlaga.get(8).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        } else if (tipoPlaga_Lbl1.getText() == "Orugas") {
            Productos infoFrame = new Productos(listaDePlaga.get(7).getProducto(), "¿Cómo Erradicar a las " + listaDePlaga.get(7).getNombrePlaga() + "?");
            infoFrame.setVisible(true);
            this.dispose();
        }
            
    }    
                 
    private javax.swing.JButton caracolesLechuga_Btn;
    private javax.swing.JTextPane infoPlaga_txt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orugasLechuga_Btn;
    private javax.swing.JLabel safecrop3_Lbl;
    private javax.swing.JLabel tipoPlaga_Lbl1;
    private javax.swing.JLabel tituloPlaga_Lbl;
    private javax.swing.JButton pulgonesLechuga_Btn;
    private javax.swing.JButton volver3_Btn;
    private javax.swing.JButton productos_Btn;
               
}
