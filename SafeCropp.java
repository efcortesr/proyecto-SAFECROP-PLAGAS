import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SafeCropp {
    public static void main(String[] args) {
        ArrayList<Cultivo> cultivos = new ArrayList<>();
      
        String generalidadesPlatano = " - Clima: Los plátanos prosperan en ambientes cálidos y húmedos, donde las temperaturas se mantienen consistentemente entre 20-30 °C durante todo el año. Además, la humedad relativa debería ser alta, idealmente entre el 75% y el 90%" + "\n - Suelo: El plátano prefiere suelos ricos en potasio, arcillo-silíceos, calizos, o los obtenidos por la roturación de los bosques, susceptibles de riego en verano, pero que no retengan agua en invierno. Los suelos ideales para su cultivo son aquellos que tienen buen drenaje, son ricos en materia orgánica y mantienen una estructura suelta que permite una fácil penetración de las raíces. Además, el pH del suelo debe estar en el rango de 5.5 a 7.0 para promover un crecimiento saludable de las plantas" + "\n - Morfología: El plátano es una planta herbácea perenne gigante, con rizoma corto y tallo aparente, que resulta de la unión de las vainas foliares, cónico y de 3,5-7,5 m de altura, terminado en una corona de hojas. El verdadero tallo es un rizoma grande, almidonoso, subterráneo, que está coronado con yemas, las cuales se desarrollan una vez que la planta ha florecido y fructificado. Las raíces son superficiales que se distribuyen en una capa de 30-40 cm, concentrándose la mayor parte de ellas en los 15-20 cm";
        String plagasPlatano = "Nemátodos: Recimiento raquítico y atrofiado de las plantas." + "\n - Amarillamiento y marchitamiento de las hojas más viejas." + " \n - Raíces con nudosidades o agallas." + "\n - Pudrición de las raíces. " + "\n - Arañas Rojas: Aparición de puntos amarillentos o bronceados en el haz de las hojas." + "\n - Formación de telas araña en el envés de las hojas." + "\n - Decoloración y secamiento de las hojas afectadas." + "\n - Picudos Negros: Orificios de entrada en el cormo o rizoma." + "\n - Presencia de masas de fibras en los orificios." + "\n - Amarillamiento y marchitez de las hojas." + "\n - Pudrición del cormo y volcamiento de la planta en casos severos.";
        String productosPlatano = "";
        Cultivo platano = new Cultivo("Platano", generalidadesPlatano, plagasPlatano, productosPlatano);
        cultivos.add(platano);

        String generalidadesPapa = " - Clima y Suelo: El cultivo de papa requiere suelos fértiles, sueltos y arenosos, con buen drenaje. La brotación ocurre a los 5 °C, y se maximiza a los 15 °C"+"\n- Importancia Económica: Se considera uno de los principales cultivos agrícolas en cuanto a superficie, solo superado por productos destinados a la agroindustria como soya, caña de azúcar, maíz, trigo y arroz."+"\n- Manejo Agronómico: Para la producción de papa a nivel comercial, la forma asexual es la más utilizada, mediante el uso del tubérculo como semilla y producto consumible";
        String plagasPapa = " Tizón (Phytophthora infestans): Manchas irregulares de color verde oliva a marrón en las hojas." + "\n - Lesiones oscuras en los tallos." + "\n - Pudrición húmeda y ennegrecimiento de los tubérculos." + "\n - Escarabajo de la papa (Leptinotarsa decemlineata): Defoliación total o parcial de las plantas." + "\n - Presencia de adultos y larvas devorando las hojas." + "\n - Excrementos en forma de grumos en las hojas." + "\n - Mosca minadora (Liriomyza spp.): Minas o galerías serpenteantes dentro de las hojas." + "\n - Manchas irregulares y secas en las hojas minadas." + "\n - Caída prematura de las hojas muy infestadas.";
        String productosPapa = "";
        Cultivo papa = new Cultivo("Papa", generalidadesPapa, plagasPapa, productosPapa);
        cultivos.add(papa);

        String generalidadesMaiz = " - Clima: El maíz es un tipo de cultivo de verano, por lo que sólo puede prosperar en climas cálidos. Durante el día, la temperatura óptima para el cultivo oscila entre 25-33°C, mientras que por la noche lo óptimo es 17-23°C"+ "\n - Suelo: El maíz prefiere suelos ricos en materia orgánica, con buena capacidad de retención de agua y drenaje. Los suelos más favorables son los francos y profundos. Es esencial el mantenimiento de la “fertilidad física” del suelo. Su deterioro puede causar limitaciones no siempre fáciles de identificar y, a menudo, de muy lenta corrección. El pH óptimo para el maíz está entre 5,8 y 6,8"+"\n - Morfología: El maíz es una planta herbácea, anual, monoica de amplia adaptación. Su desarrollo se inicia en el proceso de la germinación del grano. Al germinar el grano, la primera estructura que emerge es la radícula, de la cual al poco tiempo emergen de 2 o 3 raíces en forma lateral, formando lo que dará origen a las raíces seminales. Los granos de maíz son cariópsides desnudas, cuyas partes fundamentales son el pericarpio, el endospermo, el germen y el fenículo.";
        String plagasMaiz = " Pulgones: Presencia de colonias de pulgones en las hojas, tallos y mazorcas" + "\n - Hojas arrugadas, deformadas o enrolladas." + "\n - Secreción de melaza azucarada que atrae hormigas y fumagina. " + "\n - Araña Roja: Aparición de puntos amarillentos o bronceados en el haz de las hojas." + "\n - Decoloración y secamiento de las hojas afectadas. " + "\n - Orugas: Perforaciones y defoliación de las hojas." + "\n - Presencia de excrementos en las hojas y mazorcas.";
        String productosMaiz = ""; 
        Cultivo maiz = new Cultivo("Maiz", generalidadesMaiz, plagasMaiz, productosMaiz);
        cultivos.add(maiz);

        String generalidadesFresa = " - Clima: La fresa puede adaptarse a diferentes períodos de temperatura y luz, dos condiciones necesarias para el establecimiento exitoso del cultivo."+"\n - Suelo: La fresa se debe cultivar en terrenos sueltos, de textura franco-franco arenosa, frescos, pero bien drenados, con una profundidad superior a 80 cm y ricos en materia orgánica entre 3% a 7%, con fertilidad media a alta. El pH debe estar entre 4,5 a 7,51"+"\n - Morfología: La fresa es una planta herbácea, por lo cual presenta un sistema radicular fasciculado, compuesto por raíces y raicillas. El tallo está constituido por un eje corto de forma cónica llamado “corona”, en el que se observan numerosas escamas foliares. Las hojas se insertan en la corona y se disponen en roseta. Las inflorescencias se pueden desarrollar a partir de una yema terminal de la corona o de yemas axilares de las hojas.";
        String plagasFresa = " Nemátodos: Recimiento raquítico y atrofiado de las plantas." + "\n - Amarillamiento y marchitamiento de las hojas más viejas." + "\n - Raíces con nudosidades o agallas." + "\n - Pudrición de las raíces." + "Ácaros: Aparición de puntos amarillentos o bronceados en el haz de las hojas" + "\n - Formación de telas en el envés de las hojas. " + "\n - Decoloración, secamiento y caída prematura de hojas";
        String productosFresa = "";
        Cultivo fresa = new Cultivo("Fresa", generalidadesFresa, plagasFresa, productosFresa);
        cultivos.add(fresa);

        String generalidadesLechuga = " - Clima: La lechuga se adapta a diversos climas. La temperatura adecuada de crecimiento fluctúa dentro de los 15 - 20 °C12."+ " \n - Suelo: La lechuga se desarrolla en suelos francos con muy buen drenaje puesto que las raíces de esta especie tienen un sistema radicular sensible al exceso de agua. El pH óptimo varía entre 5,5 y 6,51"+"\n - Morfología: La lechuga es una planta autógama que presenta raíz del tipo pivotante que llega a alcanzar los 30 cm de profundidad; tallo corto que se compone de las hojas a manera de rosetas, estas varían en color, forma y textura de acuerdo a la variedad.";
        String plagasLechuga = " Pulgones: Presencia de colonias de pulgones en el envés de las hojas y cogollo." + "\n - Hojas arrugadas, deformadas o enrolladas." + "\n - Secreción de melaza azucarada que atrae hormigas y fumagina." + "\n - Transmisión de virosis" + "Caracoles:" + "\n - Perforaciones irregulares y áreas comidas en las hojas."+"\n - Rastros de baba en las hojas y cogollos."+"\n - Daños en las hojas externas e internas de la lechuga." + "Orugas (varias especies):"+"\n - Perforaciones y defoliación de las hojas externas."+"\n - Presencia de excrementos en las hojas y cogollos."+"\n - Daños por alimentación directa en las hojas internas y cogollo."+"\n - Galerías o túneles dentro de las hojas.";        
        String productosLechuga = "";
        Cultivo lechuga = new Cultivo("Lechuga", generalidadesLechuga, plagasLechuga, productosLechuga);
        cultivos.add(lechuga);

        // INTERFAZ GRAFICA 

        JFrame frame = new JFrame("SafeCrop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel titleLabel = new JLabel("SafeCrop", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.ITALIC, 24));
        titleLabel.setForeground(Color.RED);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0)); // Adds some padding to the title

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Arial", Font.ITALIC, 14));
        textArea.setMargin(new Insets(10, 10, 10, 10));

        JComboBox<String> comboBox = new JComboBox<>();
        for (Cultivo cultivo : cultivos) {
            comboBox.addItem(cultivo.getNombre());
        }  

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");            
            }
        });

        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton buttonPlagas = new JButton("Conocer Plagas");
        buttonPlagas.setVisible(false); // El botón inicia oculto

        JButton buttonProductos = new JButton("Conocer Productos");
        buttonProductos.setVisible(false); // El botón inicia oculto

        JButton buttonVolverPlagas = new JButton("Volver a Plagas");
        buttonVolverPlagas.setVisible(false); // El botón inicia oculto

        JButton buttonVolverGeneralidades = new JButton("Volver a Generalidades");
        buttonVolverGeneralidades.setVisible(false); // El botón inicia oculto

        JButton buttonGeneralidades = new JButton("Mostrar generalidades");
        buttonGeneralidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                textArea.setText(cultivos.get(index).getGeneralidades());
                titleLabel.setForeground(new Color(255, 0, 0, 50));
                titleLabel.setHorizontalAlignment(JLabel.CENTER);
                textArea.add(titleLabel);
                buttonGeneralidades.setVisible(false); // El botón se va a ocultar cuando se muestran las generalidades de los cultivos
                buttonPlagas.setVisible(true); // El botón se muestra cuando se muestran las generalidades de los cultivos
                comboBox.setEnabled(false); // Quita la opción de cambiar el cultivo cuando esta en las generalidades, plagas o productos
            }
        });

        buttonPlagas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                textArea.setText(cultivos.get(index).getPlagas());
                buttonPlagas.setVisible(false); // El botón se va a ocultar cuando se muestren las plagas
                buttonProductos.setVisible(true); // El botón "Conocer Productos" se muestra cuando se muestren las plagas
                buttonVolverGeneralidades.setVisible(true); // El botón "Volver a Generalidades" se muestra cuando se muestren las plagas
            }
        });

        buttonProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                textArea.setText(cultivos.get(index).getProductos());
                buttonVolverPlagas.setVisible(true); // El botón "Volver a Plagas" se muestra cuando se muestren los productos
                buttonProductos.setVisible(false);
            }
        });

        buttonVolverPlagas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                textArea.setText(cultivos.get(index).getPlagas());
                buttonVolverPlagas.setVisible(false); // El botón "Volver a Plagas" se oculta cuando se muestren las plagas
                buttonProductos.setVisible(true); // El botón "Conocer Productos" se muestra cuando se muestren las plagas
            }
        });

        buttonVolverGeneralidades.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox.getSelectedIndex();
                textArea.setText(cultivos.get(index).getGeneralidades());
                buttonVolverGeneralidades.setVisible(false); // El botón "Volver a Generalidades" se oculta cuando se muestran las generalidades
                buttonGeneralidades.setVisible(true); // El botón "Mostrar generalidades" se muestra cuando se muestran las generalidades
                buttonPlagas.setVisible(false); // El botón "Conocer Plagas" se oculta cuando se muestran las generalidades
                buttonProductos.setVisible(false); // El botón "Conocer Productos" se oculta cuando se muestran las generalidades
                comboBox.setEnabled(true); // Habilita la opción de cambiar de cultivo 
            }
        });

        JPanel panelButtons = new JPanel();
        panelButtons.add(buttonGeneralidades);
        panelButtons.add(buttonPlagas);
        panelButtons.add(buttonProductos);
        panelButtons.add(buttonVolverPlagas);
        panelButtons.add(buttonVolverGeneralidades);

        textArea.setBackground(new Color(173, 216, 230)); 
        textArea.setForeground(Color.BLACK);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(600, 600));  
        titleLabel.setBounds(0, 300, 600, 200);
        scrollPane.setBounds(0, 0, 500, 500);
        layeredPane.add(titleLabel, Integer.valueOf(1));
        layeredPane.add(scrollPane, Integer.valueOf(0));

        frame.setLayout(new BorderLayout());
        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelButtons, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null); // Aparece la ventana en el medio de la pantalla
        frame.setVisible(true);
    }
}
