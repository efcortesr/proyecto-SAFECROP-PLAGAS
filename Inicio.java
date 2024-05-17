package GUI;

import java.util.ArrayList;

public class Inicio extends javax.swing.JFrame {

    private static ArrayList<Cultivos> cultivos = new ArrayList<>();

    public Inicio() {
        initComponents();
    }
                        
    private void initComponents() {
        
        // CULTIVOS
        String generalidadesPlatano = "Clima: Los plátanos prosperan en ambientes cálidos y húmedos, donde las temperaturas se mantienen consistentemente entre 20-30 °C durante todo el año. Además, la humedad relativa debería ser alta, idealmente entre el 75% y el 90%."+"\n"+"\nSuelo: El plátano prefiere suelos ricos en potasio, arcillo-silíceos, calizos, o los obtenidos por la roturación de los bosques, susceptibles de riego en verano, pero que no retengan agua en invierno. Los suelos ideales para su cultivo son aquellos que tienen buen drenaje, son ricos en materia orgánica y mantienen una estructura suelta que permite una fácil penetración de las raíces. Además, el pH del suelo debe estar en el rango de 5.5 a 7.0 para promover un crecimiento saludable de las plantas"+"\n"+"\nMorfología: El plátano es una planta herbácea perenne gigante, con rizoma corto y tallo aparente, que resulta de la unión de las vainas foliares, cónico y de 3,5-7,5 m de altura, terminado en una corona de hojas. El verdadero tallo es un rizoma grande, almidonoso, subterráneo, que está coronado con yemas, las cuales se desarrollan una vez que la planta ha florecido y fructificado. Las raíces son superficiales que se distribuyen en una capa de 30-40 cm, concentrándose la mayor parte de ellas en los 15-20 cm";
        String plagasPlatano = "Nemátodos: Recimiento raquítico y atrofiado de las plantas." + "\n - Amarillamiento y marchitamiento de las hojas más viejas." + " \n - Raíces con nudosidades o agallas." + "\n - Pudrición de las raíces. " + "\n - Arañas Rojas: Aparición de puntos amarillentos o bronceados en el haz de las hojas." + "\n - Formación de telas araña en el envés de las hojas." + "\n - Decoloración y secamiento de las hojas afectadas." + "\n - Picudos Negros: Orificios de entrada en el cormo o rizoma." + "\n - Presencia de masas de fibras en los orificios." + "\n - Amarillamiento y marchitez de las hojas." + "\n - Pudrición del cormo y volcamiento de la planta en casos severos.";
        Cultivos platano = new Cultivos("Platano", generalidadesPlatano, plagasPlatano);
        cultivos.add(platano);

        String generalidadesPapa = "Origen: La papa es originaria de los valles interandinos y laderas occidentales de los Andes peruanos."+"\n"+"\nClima y Suelo: El cultivo de papa requiere suelos fértiles, sueltos y arenosos, con buen drenaje. La brotación ocurre a los 5 °C, y se maximiza a los 15 °C"+"\n"+"\nImportancia Económica: Se considera uno de los principales cultivos agrícolas en cuanto a superficie, solo superado por productos destinados a la agroindustria como soya, caña de azúcar, maíz, trigo y arroz."+"\n"+"\nManejo Agronómico: Para la producción de papa a nivel comercial, la forma asexual es la más utilizada, mediante el uso del tubérculo como semilla y producto consumible.";
        String plagasPapa = " Tizón (Phytophthora infestans): Manchas irregulares de color verde oliva a marrón en las hojas." + "\n - Lesiones oscuras en los tallos." + "\n - Pudrición húmeda y ennegrecimiento de los tubérculos." + "\n - Escarabajo de la papa (Leptinotarsa decemlineata): Defoliación total o parcial de las plantas." + "\n - Presencia de adultos y larvas devorando las hojas." + "\n - Excrementos en forma de grumos en las hojas." + "\n - Mosca minadora (Liriomyza spp.): Minas o galerías serpenteantes dentro de las hojas." + "\n - Manchas irregulares y secas en las hojas minadas." + "\n - Caída prematura de las hojas muy infestadas.";
        Cultivos papa = new Cultivos("Papa", generalidadesPapa, plagasPapa);
        cultivos.add(papa);

        String generalidadesMaiz = "Clima: El maíz es un tipo de cultivo de verano, por lo que sólo puede prosperar en climas cálidos. Durante el día, la temperatura óptima para el cultivo oscila entre 25-33°C, mientras que por la noche lo óptimo es 17-23°C"+"\n"+"\nSuelo: El maíz prefiere suelos ricos en materia orgánica, con buena capacidad de retención de agua y drenaje. Los suelos más favorables son los francos y profundos. Es esencial el mantenimiento de la “fertilidad física” del suelo. Su deterioro puede causar limitaciones no siempre fáciles de identificar y, a menudo, de muy lenta corrección. El pH óptimo para el maíz está entre 5,8 y 6,8"+"\n"+"\nMorfología: El maíz es una planta herbácea, anual, monoica de amplia adaptación. Su desarrollo se inicia en el proceso de la germinación del grano. Al germinar el grano, la primera estructura que emerge es la radícula, de la cual al poco tiempo emergen de 2 o 3 raíces en forma lateral, formando lo que dará origen a las raíces seminales. Los granos de maíz son cariópsides desnudas, cuyas partes fundamentales son el pericarpio, el endospermo, el germen y el fenículo.";
        String plagasMaiz = " Pulgones: Presencia de colonias de pulgones en las hojas, tallos y mazorcas" + "\n - Hojas arrugadas, deformadas o enrolladas." + "\n - Secreción de melaza azucarada que atrae hormigas y fumagina. " + "\n - Araña Roja: Aparición de puntos amarillentos o bronceados en el haz de las hojas." + "\n - Decoloración y secamiento de las hojas afectadas. " + "\n - Orugas: Perforaciones y defoliación de las hojas." + "\n - Presencia de excrementos en las hojas y mazorcas.";
        Cultivos maiz = new Cultivos("Maiz", generalidadesMaiz, plagasMaiz);
        cultivos.add(maiz);

        String generalidadesFresa = "Clima: La fresa puede adaptarse a diferentes períodos de temperatura y luz, dos condiciones necesarias para el establecimiento exitoso del cultivo."+"\n"+"\nSuelo: La fresa se debe cultivar en terrenos sueltos, de textura franco-franco arenosa, frescos, pero bien drenados, con una profundidad superior a 80 cm y ricos en materia orgánica entre 3% a 7%, con fertilidad media a alta. El pH debe estar entre 4,5 a 7,51"+"\n"+"\nMorfología: La fresa es una planta herbácea, por lo cual presenta un sistema radicular fasciculado, compuesto por raíces y raicillas. El tallo está constituido por un eje corto de forma cónica llamado “corona”, en el que se observan numerosas escamas foliares. Las hojas se insertan en la corona y se disponen en roseta. Las inflorescencias se pueden desarrollar a partir de una yema terminal de la corona o de yemas axilares de las hojas.";
        String plagasFresa = " Nemátodos: Recimiento raquítico y atrofiado de las plantas." + "\n - Amarillamiento y marchitamiento de las hojas más viejas." + "\n - Raíces con nudosidades o agallas." + "\n - Pudrición de las raíces." + "Ácaros: Aparición de puntos amarillentos o bronceados en el haz de las hojas" + "\n - Formación de telas en el envés de las hojas. " + "\n - Decoloración, secamiento y caída prematura de hojas";
        Cultivos fresa = new Cultivos("Fresa", generalidadesFresa, plagasFresa);
        cultivos.add(fresa);

        String generalidadesLechuga = "La lechuga es oriunda de la cuenca del Mediterráneo, aunque algunos autores afirman que proviene de la India o de Asia Central."+"\n"+"\nClima: La lechuga se adapta a diversos climas. La temperatura adecuada de crecimiento fluctúa dentro de los 15 - 20 °C12."+"\n"+"\nSuelo: La lechuga se desarrolla en suelos francos con muy buen drenaje puesto que las raíces de esta especie tienen un sistema radicular sensible al exceso de agua. El pH óptimo varía entre 5,5 y 6,51"+"\n"+"\nMorfología: La lechuga es una planta autógama que presenta raíz del tipo pivotante que llega a alcanzar los 30 cm de profundidad; tallo corto que se compone de las hojas a manera de rosetas, estas varían en color, forma y textura de acuerdo a la variedad.";
        String plagasLechuga = " Pulgones: Presencia de colonias de pulgones en el envés de las hojas y cogollo." + "\n - Hojas arrugadas, deformadas o enrolladas." + "\n - Secreción de melaza azucarada que atrae hormigas y fumagina." + "\n - Transmisión de virosis" + "Caracoles:" + "\n - Perforaciones irregulares y áreas comidas en las hojas."+"\n - Rastros de baba en las hojas y cogollos."+"\n - Daños en las hojas externas e internas de la lechuga." + "Orugas (varias especies):"+"\n - Perforaciones y defoliación de las hojas externas."+"\n - Presencia de excrementos en las hojas y cogollos."+"\n - Daños por alimentación directa en las hojas internas y cogollo."+"\n - Galerías o túneles dentro de las hojas.";
        Cultivos lechuga = new Cultivos("Lechuga", generalidadesLechuga, plagasLechuga);
        cultivos.add(lechuga);






        // INTERFAZ

        jPanel1 = new javax.swing.JPanel();
        safecrop_Lbl = new javax.swing.JLabel();
        titulo1_Lbl = new javax.swing.JLabel();
        papa_Btn = new javax.swing.JButton();
        platano_Btn1 = new javax.swing.JButton();
        fresa_Btn = new javax.swing.JButton();
        lechuga_Btn = new javax.swing.JButton();
        maiz_Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        safecrop_Lbl.setFont(new java.awt.Font("Roboto Medium", 2, 48)); // NOI18N
        safecrop_Lbl.setForeground(new java.awt.Color(0, 0, 102));
        safecrop_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        safecrop_Lbl.setText("SafeCrop");

        titulo1_Lbl.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        titulo1_Lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1_Lbl.setText("¿Qué deseas cultivar?");

        papa_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        papa_Btn.setText("Papa");
        papa_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papa_BtnActionPerformed(evt);
            }
        });

        platano_Btn1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        platano_Btn1.setText("Plátano");
        platano_Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platano_Btn1ActionPerformed(evt);
            }
        });

        fresa_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        fresa_Btn.setText("Fresa");
        fresa_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fresa_BtnActionPerformed(evt);
            }
        });

        lechuga_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lechuga_Btn.setText("Lechuga");
        lechuga_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lechuga_BtnActionPerformed(evt);
            }
        });

        maiz_Btn.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        maiz_Btn.setText("Maíz");
        maiz_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maiz_BtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fresa_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lechuga_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maiz_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(papa_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(platano_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(safecrop_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo1_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(safecrop_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo1_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(platano_Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(papa_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maiz_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fresa_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lechuga_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        pack();
    }                    

    
    private void platano_Btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        InfoCultivos infoFrame = new InfoCultivos(cultivos.get(0).getGeneralidades(), "Plátano:");
        infoFrame.setVisible(true);
        this.dispose();
    }                                            

    private void papa_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        InfoCultivos infoFrame = new InfoCultivos(cultivos.get(1).getGeneralidades(), "Papa:");
        infoFrame.setVisible(true);
        this.dispose();
    }                                        

    private void maiz_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        InfoCultivos infoFrame = new InfoCultivos(cultivos.get(2).getGeneralidades(), "Maíz:");
        infoFrame.setVisible(true);
        this.dispose();
    }   

    private void fresa_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        InfoCultivos infoFrame = new InfoCultivos(cultivos.get(3).getGeneralidades(), "Fresa:");
        infoFrame.setVisible(true);
        this.dispose();
    }                                         

    private void lechuga_BtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        InfoCultivos infoFrame = new InfoCultivos(cultivos.get(4).getGeneralidades(), "Lechuga:");
        infoFrame.setVisible(true);
        this.dispose();
    }                                                                                
                    
    private javax.swing.JButton fresa_Btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lechuga_Btn;
    private javax.swing.JButton maiz_Btn;
    private javax.swing.JButton papa_Btn;
    private javax.swing.JButton platano_Btn1;
    private javax.swing.JLabel safecrop_Lbl;
    private javax.swing.JLabel titulo1_Lbl;                  
}
