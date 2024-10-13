
package Gui;

import clinic.Bill;
import clinic.DatePicker;
import clinic.Patient;
import clinic.PresMed;
import clinic.Prescription;
import DataBase.PresMedQuery;
import clinic.Clinic;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ReceptionistWindow extends javax.swing.JFrame {

    /**
     * Creates new form Receptionistwindow
     */
    public String Ro;
    public int Id;

    public void set(String Ro, int Id) {
        this.Ro = Ro;
        this.Id = Id;
    }

    public ReceptionistWindow() {
        initComponents();
        groupButton();
        lblNo.setText("0");
        jpPres.setVisible(true);
        jpRegister.setVisible(false);
        jpBill.setVisible(false);
        tbMed.setEnabled(false);
        
        setExtendedState(ReceptionistWindow.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelM = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpRegister = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jpPres = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtDid = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jpBill = new javax.swing.JPanel();
        txtBPname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPreMed = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtPharMed = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtTests = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtBPid = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        lblChnFee = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblMedFee = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbMed = new javax.swing.JTable();
        lblNo = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblRegister = new javax.swing.JLabel();
        lblEnter = new javax.swing.JLabel();
        lblBill = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpRegister.setBackground(new java.awt.Color(204, 255, 255));
        jpRegister.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register a Patient", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 17))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel9.setText("E-mail            :");

        txtEmail.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel2.setText("Name             :");

        txtName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel7.setText("Date of Birth  :");

        txtDob.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel8.setText("Address          :");

        txtAddress.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel10.setText("Gender           :");

        radMale.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        radMale.setText("Male");
        radMale.setOpaque(false);

        radFemale.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        radFemale.setText("Female");
        radFemale.setOpaque(false);
        radFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFemaleActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jButton4.setText("Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jButton6.setText("Pick");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/standing-nurse-hospital-reception-background_23-2147987275.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jpRegisterLayout = new javax.swing.GroupLayout(jpRegister);
        jpRegister.setLayout(jpRegisterLayout);
        jpRegisterLayout.setHorizontalGroup(
            jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegisterLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegisterLayout.createSequentialGroup()
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(166, 166, 166))
                    .addGroup(jpRegisterLayout.createSequentialGroup()
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpRegisterLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(radMale))
                            .addGroup(jpRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(101, 101, 101)
                                .addComponent(radFemale))
                            .addGroup(jpRegisterLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpRegisterLayout.createSequentialGroup()
                                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        jpRegisterLayout.setVerticalGroup(
            jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegisterLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpRegisterLayout.createSequentialGroup()
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName))
                        .addGap(39, 39, 39)
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDob)
                            .addComponent(jLabel7)
                            .addComponent(jButton6))
                        .addGap(18, 18, 18)
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(radMale)
                            .addComponent(radFemale))
                        .addGap(27, 27, 27)
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jpRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
        );

        jLayeredPane1.add(jpRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 1080));

        jpPres.setBackground(new java.awt.Color(204, 255, 255));
        jpPres.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel23.setText("Temporary No:");

        txtNo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        txtNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel24.setText("Patient ID         :");

        txtPid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPidActionPerformed(evt);
            }
        });
        txtPid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPidKeyTyped(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jButton5.setText("Issue");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtDid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtDid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDidActionPerformed(evt);
            }
        });
        txtDid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDidKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel25.setText("Doctor ID        :");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/Simple_DoctorWithPatient_WEB.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jpPresLayout = new javax.swing.GroupLayout(jpPres);
        jpPres.setLayout(jpPresLayout);
        jpPresLayout.setHorizontalGroup(
            jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPresLayout.createSequentialGroup()
                .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPresLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPresLayout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpPresLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPresLayout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPresLayout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jpPresLayout.setVerticalGroup(
            jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPresLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpPresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jpPres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 1080));

        jpBill.setBackground(new java.awt.Color(204, 255, 255));
        jpBill.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtBPname.setEditable(false);
        txtBPname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtBPname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPnameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel12.setText("Prescribed Medicine :");

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel13.setText("Patient ID        :");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel14.setText("Date                 :");

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        txtPreMed.setEditable(false);
        txtPreMed.setColumns(20);
        txtPreMed.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPreMed.setRows(5);
        jScrollPane1.setViewportView(txtPreMed);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel16.setText("Pharmacy Medicine :");

        txtPharMed.setEditable(false);
        txtPharMed.setColumns(20);
        txtPharMed.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPharMed.setRows(5);
        jScrollPane6.setViewportView(txtPharMed);

        txtTests.setEditable(false);
        txtTests.setColumns(20);
        txtTests.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtTests.setRows(5);
        jScrollPane7.setViewportView(txtTests);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel17.setText("Lists of Tests :");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel18.setText("Patient Name :");

        txtBPid.setEditable(false);
        txtBPid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtBPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPidActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel19.setText("Doctor Fee :");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(20, 20, 130, 30);

        lblChnFee.setEditable(false);
        lblChnFee.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblChnFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblChnFeeActionPerformed(evt);
            }
        });
        jPanel7.add(lblChnFee);
        lblChnFee.setBounds(50, 50, 210, 28);

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel20.setText("Medicine Fee :");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(20, 80, 130, 30);

        lblMedFee.setEditable(false);
        lblMedFee.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblMedFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMedFeeActionPerformed(evt);
            }
        });
        jPanel7.add(lblMedFee);
        lblMedFee.setBounds(50, 110, 210, 28);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel15.setText("Total Payment :");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(20, 140, 130, 30);

        lblTotal.setEditable(false);
        lblTotal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTotalActionPerformed(evt);
            }
        });
        jPanel7.add(lblTotal);
        lblTotal.setBounds(50, 170, 210, 28);

        btnPrint.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnPrint.setText("Print Bill");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        tbMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Before/After", "Times", "Quantity", "Availability"
            }
        ));
        jScrollPane2.setViewportView(tbMed);

        lblNo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblNo.setText("No");

        btnNext.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnGenerate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBillLayout = new javax.swing.GroupLayout(jpBill);
        jpBill.setLayout(jpBillLayout);
        jpBillLayout.setHorizontalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(183, 183, 183))
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpBillLayout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtBPname, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpBillLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtDate))
                            .addGroup(jpBillLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(23, 23, 23)
                                .addComponent(txtBPid)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jpBillLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(166, 166, 166))
        );
        jpBillLayout.setVerticalGroup(
            jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBillLayout.createSequentialGroup()
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrevious)
                            .addComponent(btnNext))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBPname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBillLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(92, 92, 92))
        );

        jLayeredPane1.add(jpBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 1080));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/clinic logo.png"))); // NOI18N
        jLabel30.setText("jLabel6");

        jLabel31.setBackground(new java.awt.Color(153, 204, 255));
        jLabel31.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/patient (1).png"))); // NOI18N
        jLabel3.setOpaque(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/bill.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/login.png"))); // NOI18N

        lblRegister.setBackground(new java.awt.Color(255, 255, 255));
        lblRegister.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Register");
        lblRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRegister.setOpaque(true);
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblRegisterMousePressed(evt);
            }
        });

        lblEnter.setBackground(new java.awt.Color(255, 255, 255));
        lblEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnter.setText("Enter Patient");
        lblEnter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEnter.setOpaque(true);
        lblEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEnterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEnterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEnterMousePressed(evt);
            }
        });

        lblBill.setBackground(new java.awt.Color(255, 255, 255));
        lblBill.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBill.setText("Bill");
        lblBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblBill.setOpaque(true);
        lblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBillMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 31, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblBill, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(636, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelMLayout = new javax.swing.GroupLayout(PanelM);
        PanelM.setLayout(PanelMLayout);
        PanelMLayout.setHorizontalGroup(
            PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1608, Short.MAX_VALUE))
            .addGroup(PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMLayout.createSequentialGroup()
                    .addContainerGap(358, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        PanelMLayout.setVerticalGroup(
            PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText(" Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText(" Go to Home");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");

        jMenuItem2.setText(" Settings");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(1967, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1)
                .addContainerGap(689, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(PanelM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void groupButton() {

        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(radMale);
        bg1.add(radFemale);
    }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void radFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radFemaleActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DatePicker datePicker = new DatePicker(this);
        txtDob.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_jButton6ActionPerformed

    final static String DATE_FORMAT = "yyyy-MM-dd";

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ButtonGroup bg1 = new ButtonGroup();

        bg1.add(radMale);
        bg1.add(radFemale);

        String Name = txtName.getText();
        String DOB = txtDob.getText();
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(txtDob.getText());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid date!!");
        }

        Date userdate = null;

        Date today = null;
        try {
            userdate = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(txtDob.getText());
        } catch (ParseException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            today = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(String.valueOf(java.time.LocalDate.now()));
        } catch (ParseException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        Calendar gc1 = new GregorianCalendar();

        gc1.setTime(today);
        Calendar gc2 = new GregorianCalendar();
        gc2.setTime(userdate);
        long daysdiff = (gc1.getTimeInMillis() - gc2.getTimeInMillis()) / (1000 * 3600 * 24);

        String Address = txtAddress.getText();
        boolean valid = false;
        valid = validate(txtEmail.getText());
        if (valid == true || txtEmail.getText().equals("")) {
            String Email = txtEmail.getText();
            String Gender = "";
            if (radMale.isSelected()) {
                Gender = "M";
            } else if (radFemale.isSelected()) {
                Gender = "F";
            }
            if (Name.equals("") || DOB.equals("") || Gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Name, Date of Birth and Gender Should be filled!!");
            } else {
                if (daysdiff > 0) {
                    Patient p = new Patient(Name, DOB, Gender, Address, Email);
                    try {
                        p.CreatePatientAccount(p);
                    } catch (IOException ex) {
                        Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    txtName.setText("");
                    txtDob.setText("");
                    txtAddress.setText("");
                    txtEmail.setText("");
                    bg1.clearSelection();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Age!!");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Email!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPidActionPerformed

    private void txtDidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDidActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (txtPid.getText().equals("") || txtNo.getText().equals("") || txtDid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields should be filled !!");
        } else {
            if (Pattern.matches("[0-9]{9}|[0-9]{12}", txtDid.getText())) {

                int Pid = Integer.parseInt(txtPid.getText());
                int No = Integer.parseInt(txtNo.getText());
                int Did = Integer.parseInt(txtDid.getText());

                Prescription pres = new Prescription(Pid, No, Did);
                try {
                    pres.CreatePrescription(pres);
                } catch (IOException ex) {
                    Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtPid.setText("");
                txtNo.setText(String.valueOf(Integer.parseInt(txtNo.getText()) + 1));

            } else {
                JOptionPane.showMessageDialog(null, "Invalid Doctor Id !!");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtBPnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPnameActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtBPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPidActionPerformed

    private void lblChnFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblChnFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblChnFeeActionPerformed

    private void lblMedFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMedFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMedFeeActionPerformed

    private void lblTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTotalActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        int no = Integer.parseInt(lblNo.getText()) + 1;
        lblNo.setText(String.valueOf(no));
        PresMed pm = new PresMed();
        try {
            pm.Showmed(tbMed, no);

        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        int no = Integer.parseInt(lblNo.getText()) - 1;
        if (no < 1) {
            no = 1;
        }
        lblNo.setText(String.valueOf(no));
        PresMed pm = new PresMed();
        try {
            pm.Showmed(tbMed, no);

        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        Bill b = new Bill();
        b.setRid(Id);
        txtDate.setText(b.getDate());//print date
        b.setPresid(lblNo.getText() + "/" + txtDate.getText());
        //set the Pid
        try {
            b.GetPidDidFromDB(b);
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtBPid.setText(String.valueOf(b.getPid()));
        try {
            //set the Pname
            b.GetPnameFromDB();
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtBPname.setText(b.getPname());

        //fill Medicines
        try {
            b.PrePharDevid(tbMed);
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtPreMed.setText(b.getPreMed());
        txtPharMed.setText(b.getPharMed());
        lblMedFee.setText(String.valueOf(b.getPayment()));//setMedFee

        //fillchnfee
        try {
            b.GetChnFeeFromDB();
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblChnFee.setText(String.valueOf(b.getChnFee()));

        lblTotal.setText(String.valueOf(b.getPayment() + b.getChnFee()));

        //filltest
        try {
            b.GetTestFromDB();
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtTests.setText(b.getTest());


    }//GEN-LAST:event_btnGenerateActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNoKeyTyped

    private void txtPidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPidKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPidKeyTyped

    private void txtDidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDidKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDidKeyTyped

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        EditAccount ea = new EditAccount();
        ea.setRole(Ro);
        ea.setID(Id);
        jPanel3.setVisible(false);
        jLayeredPane1.setVisible(false);
        this.setContentPane(ea);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PanelM.add(jPanel3);
        PanelM.add(jLayeredPane1);
        this.setContentPane(PanelM);
        jPanel3.setVisible(true);
        jLayeredPane1.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void lblBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMousePressed
        // TODO add your handling code here:
        jpPres.setVisible(false);
        jpRegister.setVisible(false);
        jpBill.setVisible(true);
    }//GEN-LAST:event_lblBillMousePressed

    private void lblRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMousePressed
        // TODO add your handling code here:
        jpPres.setVisible(false);
        jpBill.setVisible(false);
        jpRegister.setVisible(true);

    }//GEN-LAST:event_lblRegisterMousePressed

    private void lblEnterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterMousePressed
        // TODO add your handling code here:
        jpPres.setVisible(true);
        jpRegister.setVisible(false);
        jpBill.setVisible(false);

    }//GEN-LAST:event_lblEnterMousePressed

    private void lblEnterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterMouseEntered
        // TODO add your handling code here:

        lblEnter.setBackground(Color.gray);
        lblEnter.setForeground(Color.white);

    }//GEN-LAST:event_lblEnterMouseEntered

    private void lblEnterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEnterMouseExited
        // TODO add your handling code here:
        lblEnter.setBackground(Color.white);
        lblEnter.setForeground(black);

    }//GEN-LAST:event_lblEnterMouseExited

    private void lblBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseEntered
        // TODO add your handling code here:

        lblBill.setBackground(Color.gray);
        lblBill.setForeground(Color.white);
    }//GEN-LAST:event_lblBillMouseEntered

    private void lblBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBillMouseExited
        // TODO add your handling code here:

        lblBill.setBackground(Color.white);
        lblBill.setForeground(black);
    }//GEN-LAST:event_lblBillMouseExited

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        // TODO add your handling code here:

        lblRegister.setBackground(Color.gray);
        lblRegister.setForeground(Color.white);
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        // TODO add your handling code here:

        lblRegister.setBackground(Color.white);
        lblRegister.setForeground(black);
    }//GEN-LAST:event_lblRegisterMouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Welcome wel = new Welcome();
        wel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelM;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jpBill;
    private javax.swing.JPanel jpPres;
    private javax.swing.JPanel jpRegister;
    private javax.swing.JLabel lblBill;
    private javax.swing.JTextField lblChnFee;
    private javax.swing.JLabel lblEnter;
    private javax.swing.JTextField lblMedFee;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JTextField lblTotal;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTable tbMed;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBPid;
    private javax.swing.JTextField txtBPname;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDid;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextArea txtPharMed;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextArea txtPreMed;
    private javax.swing.JTextArea txtTests;
    // End of variables declaration//GEN-END:variables
}
