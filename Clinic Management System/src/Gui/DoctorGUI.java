
package Gui;

import clinic.Medicine;
import clinic.Patient;
import clinic.Prescription;
import clinic.PresMed;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import static java.lang.System.in;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class DoctorGUI extends javax.swing.JFrame {

    private Vector<Vector<String>> ListRow;
    private Vector<String> Row;
    private Vector<String> IssuedTempNo = new Vector<String>();
    public String Ro;
    public int Id;
    JPanel mainPanel = new JPanel();

    public void set(String Ro, int Id) {
        this.Ro = Ro;
        this.Id = Id;
    }

    public DoctorGUI() {
        initComponents();
        Medicine med = new Medicine();
        med.FillSearchBox(cmbMedicine);
        cmbMedicine.setSelectedIndex(-1);
        cmbTimes.setSelectedIndex(-1);
        cmbDays.setSelectedIndex(-1);
        cmbTempNo.setSelectedIndex(-1);
        AutoCompleteDecorator.decorate(cmbMedicine);
        txtAreaPatientDetails.setEditable(false);
        txtAreaPrescriptionDetails.setEditable(false);
        cmbMedicine.setEnabled(false);
        cmbTimes.setEnabled(false);
        cmbDays.setEnabled(false);
        btnAdd.setEnabled(false);
        
        
        
        setExtendedState(DoctorGUI.MAXIMIZED_BOTH);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        presMed1 = new clinic.PresMed();
        PanelM = new javax.swing.JPanel();
        DetailsPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPatientDetails = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPrescriptionDetails = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SelectionPanel = new java.awt.Panel();
        cmbTimes = new javax.swing.JComboBox<>();
        cmbDays = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        cmbTempNo = new javax.swing.JComboBox<>();
        btnFetch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbMedicine = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        DashPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ResultPanel = new java.awt.Panel();
        txtTests = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstTests = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaSpecialNote = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnDeleteTests = new javax.swing.JButton();
        btnAddTests = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPresMedicine = new javax.swing.JTable();
        btnDeleteMedi = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelM.setBackground(new java.awt.Color(204, 204, 204));
        PanelM.setForeground(new java.awt.Color(255, 255, 255));

        DetailsPanel.setBackground(new java.awt.Color(204, 255, 255));

        txtAreaPatientDetails.setColumns(20);
        txtAreaPatientDetails.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtAreaPatientDetails.setRows(5);
        jScrollPane5.setViewportView(txtAreaPatientDetails);

        txtAreaPrescriptionDetails.setColumns(20);
        txtAreaPrescriptionDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAreaPrescriptionDetails.setRows(5);
        jScrollPane1.setViewportView(txtAreaPrescriptionDetails);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText(" Past Prescription Details");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText(" Patient Details");

        javax.swing.GroupLayout DetailsPanelLayout = new javax.swing.GroupLayout(DetailsPanel);
        DetailsPanel.setLayout(DetailsPanelLayout);
        DetailsPanelLayout.setHorizontalGroup(
            DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane5))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        DetailsPanelLayout.setVerticalGroup(
            DetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DetailsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
        );

        SelectionPanel.setBackground(new java.awt.Color(255, 255, 255));

        cmbTimes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbTimes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OD", "OD HS", "BD", "TDS", "QID" }));

        cmbDays.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbDays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27" }));
        cmbDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDaysActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAdd.setText(" Add");
        btnAdd.setNextFocusableComponent(cmbMedicine);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cmbTempNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTempNoItemStateChanged(evt);
            }
        });
        cmbTempNo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbTempNoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbTempNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTempNoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbTempNoMousePressed(evt);
            }
        });
        cmbTempNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTempNoActionPerformed(evt);
            }
        });
        cmbTempNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbTempNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbTempNoKeyTyped(evt);
            }
        });

        btnFetch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnFetch.setText("Fetch");
        btnFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Tempory Number");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Times");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Days");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        cmbMedicine.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMedicineActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Medicine");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMedicine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout SelectionPanelLayout = new javax.swing.GroupLayout(SelectionPanel);
        SelectionPanel.setLayout(SelectionPanelLayout);
        SelectionPanelLayout.setHorizontalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTempNo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDays, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        SelectionPanelLayout.setVerticalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SelectionPanelLayout.createSequentialGroup()
                        .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbDays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SelectionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(cmbTempNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DashPanel.setBackground(new java.awt.Color(255, 255, 255));
        DashPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("          Doctor DashBoard");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout DashPanelLayout = new javax.swing.GroupLayout(DashPanel);
        DashPanel.setLayout(DashPanelLayout);
        DashPanelLayout.setHorizontalGroup(
            DashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashPanelLayout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DashPanelLayout.setVerticalGroup(
            DashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ResultPanel.setBackground(new java.awt.Color(204, 255, 255));

        txtTests.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTests.setText(" ");
        txtTests.setNextFocusableComponent(txtAreaSpecialNote);
        txtTests.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTestsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTestsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTestsKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText(" Tests");

        lstTests.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(lstTests);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText(" Special Note");

        txtAreaSpecialNote.setColumns(20);
        txtAreaSpecialNote.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtAreaSpecialNote.setRows(5);
        jScrollPane3.setViewportView(txtAreaSpecialNote);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText(" Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnDeleteTests.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDeleteTests.setText(" Delete");
        btnDeleteTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTestsActionPerformed(evt);
            }
        });

        btnAddTests.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAddTests.setText(" Add");
        btnAddTests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTestsActionPerformed(evt);
            }
        });

        tblPresMedicine.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblPresMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Times", "Days"
            }
        ));
        jScrollPane2.setViewportView(tblPresMedicine);

        btnDeleteMedi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDeleteMedi.setText(" Delete");
        btnDeleteMedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultPanelLayout.createSequentialGroup()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTests, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddTests, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDeleteTests, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))))
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ResultPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteMedi)))
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultPanelLayout.createSequentialGroup()
                        .addComponent(btnDeleteMedi)
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTests, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddTests, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteTests))
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelMLayout = new javax.swing.GroupLayout(PanelM);
        PanelM.setLayout(PanelMLayout);
        PanelMLayout.setHorizontalGroup(
            PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMLayout.createSequentialGroup()
                .addGroup(PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMLayout.createSequentialGroup()
                        .addComponent(DetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(ResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelMLayout.setVerticalGroup(
            PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMLayout.createSequentialGroup()
                .addComponent(DashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelMLayout.createSequentialGroup()
                        .addComponent(ResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jMenu1.setText("File");

        jMenuItem1.setText(" Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Go to Home");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");

        jMenuItem2.setText(" Account Settings");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMedicineActionPerformed

    }//GEN-LAST:event_cmbMedicineActionPerformed

    private void cmbDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDaysActionPerformed

    }//GEN-LAST:event_cmbDaysActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (cmbMedicine.getSelectedItem() != null && cmbTimes.getSelectedItem() != null && cmbDays.getSelectedItem() != null) {
            DefaultTableModel model = (DefaultTableModel) tblPresMedicine.getModel();
            model.addRow(new Object[]{cmbMedicine.getSelectedItem().toString(), cmbTimes.getSelectedItem().toString(), cmbDays.getSelectedItem().toString()});
        } else {
            JOptionPane.showMessageDialog(null, "Fill All Required Fields");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        ListRow = new Vector<Vector<String>>();
        DefaultTableModel model = (DefaultTableModel) tblPresMedicine.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            Row = new Vector<String>();
            for (int j = 0; j < model.getColumnCount(); j++) {
                Row.add((String) tblPresMedicine.getValueAt(i, j));
            }
            ListRow.add(Row);
        }
        Prescription pres = new Prescription();
        pres.EnterMedicine(ListRow, (String) cmbTempNo.getSelectedItem());
        String Tests = "";
        for (int i = 0; i < list.size(); i++) {
            Tests = Tests + list.get(i).toString() + "\n";
        }
        pres.EnterTests(Tests);
        Patient p = new Patient();
        p.SaveSpecialNote(txtAreaSpecialNote.getText(), (String) cmbTempNo.getSelectedItem() + "/" + java.time.LocalDate.now());
        IssuedTempNo.add((String) cmbTempNo.getSelectedItem());
        cmbTempNo.removeItem(cmbTempNo.getSelectedItem());
        cmbMedicine.setSelectedIndex(-1);
        cmbTempNo.setSelectedIndex(-1);
        cmbTimes.setSelectedIndex(-1);
        cmbDays.setSelectedIndex(-1);
        lstTests.removeAll();
        txtAreaSpecialNote.setText("");
        ((DefaultTableModel) tblPresMedicine.getModel()).setNumRows(0);
    }//GEN-LAST:event_btnSubmitActionPerformed
    DefaultListModel list = new DefaultListModel();

    public void addList(String Tests) {
        lstTests.setModel(list);
        list.addElement(Tests);
    }

    private void btnAddTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTestsActionPerformed
        if (txtTests.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Any Entered Tests");
        } else {
            addList(txtTests.getText().toString());
            txtTests.setText("");
        }
    }//GEN-LAST:event_btnAddTestsActionPerformed

    private void btnDeleteTestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTestsActionPerformed
        int index = lstTests.getSelectedIndex();
        list.removeElementAt(index);
    }//GEN-LAST:event_btnDeleteTestsActionPerformed

    public int calculateAge(String birthDate, String currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            int age = Integer.parseInt(currentDate.substring(0, 3)) - Integer.parseInt(birthDate.substring(0, 3));
            return age;
        } else {
            return 0;
        }
    }
    
    private void cmbTempNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTempNoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cmbTempNo.getSelectedItem() != null) {
                Patient pa = new Patient();
                String PresId = cmbTempNo.getSelectedItem().toString() + "/" + java.time.LocalDate.now();
                pa.DoctorViewPatient(PresId, pa);
                String Age;
                String BirthDay = String.valueOf(pa.getDOB());
                String Utoday = String.valueOf(java.time.LocalDate.now());
                Age = Integer.toString(calculateAge(BirthDay, Utoday));
                String PatientDetails;
                PatientDetails = "Name:-" + pa.getName() + "\nAge:-" + Age + " \nSpecial Notes:-" + pa.getSpNotes();
                txtAreaPatientDetails.setText(PatientDetails);
                Prescription pr = new Prescription();
                pr.ViewPrescription(pa.getPid(), txtAreaPrescriptionDetails);
            } else {
                JOptionPane.showMessageDialog(null, "Please Select Tempary Number");
            }
        }
    }//GEN-LAST:event_cmbTempNoKeyPressed

    private void txtTestsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTestsKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addList(txtTests.getText().toString());
        }
    }//GEN-LAST:event_txtTestsKeyPressed

    private void txtTestsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTestsKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTests.setText("");
        }
    }//GEN-LAST:event_txtTestsKeyReleased

    private void btnDeleteMediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMediActionPerformed
        int numRows = tblPresMedicine.getSelectedRows().length;
        DefaultTableModel model = (DefaultTableModel) tblPresMedicine.getModel();
        for (int i = 0; i < numRows; i++) {
            model.removeRow(tblPresMedicine.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteMediActionPerformed

    private void cmbTempNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbTempNoKeyTyped
        char k = evt.getKeyChar();
        if (!((k >= '0' && k <= '9') || k == KeyEvent.VK_ENTER || k == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_cmbTempNoKeyTyped

    private void txtTestsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTestsKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE || c == KeyEvent.VK_ENTER)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTestsKeyTyped

    private void cmbTempNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTempNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTempNoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EditAccount ed = new EditAccount();
        ed.setID(Id);
        ed.setRole(Ro);
        ResultPanel.setVisible(false);
        SelectionPanel.setVisible(false);
        DetailsPanel.setVisible(false);
        DashPanel.setVisible(false);
        this.setContentPane(ed);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        PanelM.add(DashPanel);
        PanelM.add(SelectionPanel);
        PanelM.add(DetailsPanel);
        PanelM.add(ResultPanel);
        LoadPanel();
        this.setContentPane(PanelM);
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void cmbTempNoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTempNoMousePressed

    }//GEN-LAST:event_cmbTempNoMousePressed

    private void cmbTempNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTempNoMouseClicked

    }//GEN-LAST:event_cmbTempNoMouseClicked

    private void cmbTempNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTempNoItemStateChanged
        if (cmbTempNo.getSelectedItem() == null) {
            txtAreaPatientDetails.setText("");
            txtAreaPrescriptionDetails.setText("");
        } else {
            Patient pa = new Patient();
            String PresId = cmbTempNo.getSelectedItem().toString() + "/" + java.time.LocalDate.now();
            pa.DoctorViewPatient(PresId, pa);
            String Age;
            String BirthDay = String.valueOf(pa.getDOB());
            String Utoday = String.valueOf(java.time.LocalDate.now());
            Age = Integer.toString(calculateAge(BirthDay, Utoday));
            String PatientDetails;
            PatientDetails = "Name:-" + pa.getName() + "\nAge:-" + Age + " \nSpecial Notes:-" + pa.getSpNotes();
            txtAreaPatientDetails.setText(PatientDetails);
            Prescription pr = new Prescription();
            pr.ViewPrescription(pa.getPid(), txtAreaPrescriptionDetails);
        }
    }//GEN-LAST:event_cmbTempNoItemStateChanged

    private void btnFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchActionPerformed
        cmbTempNo.removeAllItems();
        Prescription pr = new Prescription();
        pr.refreshTempNumber(cmbTempNo);
        cmbTempNo.setSelectedIndex(-1);
        if (IssuedTempNo != null) {
            for (int j = 0; j < cmbTempNo.getItemCount(); j++) {
                if (IssuedTempNo.contains(cmbTempNo.getItemAt(j))) {
                    cmbTempNo.removeItemAt(j);
                }
            }
        }
    }//GEN-LAST:event_btnFetchActionPerformed

    private void cmbTempNoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbTempNoPopupMenuWillBecomeInvisible
        if (cmbTempNo.getSelectedItem() != null) {
            cmbMedicine.setEnabled(true);
            cmbTimes.setEnabled(true);
            cmbDays.setEnabled(true);
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_cmbTempNoPopupMenuWillBecomeInvisible

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Welcome wel = new Welcome();
        wel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    void LoadPanel() {
        ResultPanel.setVisible(true);
        SelectionPanel.setVisible(true);
        DetailsPanel.setVisible(true);
        DashPanel.setVisible(true);
    }

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashPanel;
    private javax.swing.JPanel DetailsPanel;
    private javax.swing.JPanel PanelM;
    private java.awt.Panel ResultPanel;
    private java.awt.Panel SelectionPanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddTests;
    private javax.swing.JButton btnDeleteMedi;
    private javax.swing.JButton btnDeleteTests;
    private javax.swing.JButton btnFetch;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbDays;
    private javax.swing.JComboBox<String> cmbMedicine;
    private javax.swing.JComboBox<String> cmbTempNo;
    private javax.swing.JComboBox<String> cmbTimes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> lstTests;
    private clinic.PresMed presMed1;
    private javax.swing.JTable tblPresMedicine;
    private javax.swing.JTextArea txtAreaPatientDetails;
    private javax.swing.JTextArea txtAreaPrescriptionDetails;
    private javax.swing.JTextArea txtAreaSpecialNote;
    private javax.swing.JTextField txtTests;
    // End of variables declaration//GEN-END:variables
}
