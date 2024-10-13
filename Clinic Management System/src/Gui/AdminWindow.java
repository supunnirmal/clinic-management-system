package Gui;

import static Gui.ReceptionistWindow.DATE_FORMAT;
import clinic.Complain;
import clinic.DatePicker;
import clinic.Doctor;
import clinic.Employee;
import clinic.Medicine;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Component;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.nashorn.internal.runtime.Specialization;
import sun.swing.DefaultLookup;

public class AdminWindow extends javax.swing.JFrame {

    private Vector<Vector<String>> data;
    private Vector<String> heading;
    /**
     * Creates new form adminAcc
     */
    Color col;
    public String Ro;
    public int Id;

    public void set(String Ro, int Id) {
        this.Ro = Ro;
        this.Id = Id;
    }

    public AdminWindow() {
        initComponents();

        col = lblVAcc.getBackground();

        jpAccount.setVisible(true);
        jpMedicine.setVisible(false);
        jpComplain.setVisible(false);
        jpComplainPrevious.setVisible(false);
        jpDetails.setVisible(false);
        jpMedQ.setVisible(false);
        btnDltSearch.setVisible(false);

        txtMedname.setEditable(false);
        txtQuantity.setEditable(false);
        txtPrice.setEditable(false);
        txtDescription.setEditable(false);
        txtComBid.setEditable(false);
        txtComid.setEditable(false);
        txtDate.setEditable(false);
        txtDoc.setEditable(false);
        txtRec.setEditable(false);
        txtComDes.setEditable(false);
        btnMedDelete.setVisible(false);
        btnANItem.setVisible(false);
        btnUpdateItem.setVisible(false);
        btnShow.setVisible(false);
        txtUsername.setEditable(false);
        txtPassword.setEditable(false);

        lblRole.setText("");
        txtId.setBackground(white);
        txtFname.setBackground(white);
        txtLname.setBackground(white);
        txtAddress.setBackground(white);
        txtDob.setBackground(white);
        txtSpecial.setBackground(white);
        txtChnFee.setBackground(white);
        txtWplace.setBackground(white);

        txtPassword.setBackground(white);
        txtUsername.setBackground(white);
        lblUsername.setBackground(white);
        lblPassword.setBackground(white);

        lblRequired.setVisible(false);
        lblRequired1.setVisible(false);
        lblRequired2.setVisible(false);
        lblRequired3.setVisible(false);
        lblRequired4.setVisible(false);
        lblRequired5.setVisible(false);
        lblRequired6.setVisible(false);

        heading = new Vector<String>();
        heading.add("Medicine Name");
        heading.add("Quantity");
        heading.add("Price");
        heading.add("Descrition");

        setExtendedState(AdminWindow.MAXIMIZED_BOTH);
    }

    private void loadTable() {
        Medicine med = new Medicine();
        data = med.getMedQuantity();

        tbMed.setModel(new javax.swing.table.DefaultTableModel(data, heading));
        jScrollPane3.setViewportView(tbMed);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jpAccount = new javax.swing.JPanel();
        jpDetails = new javax.swing.JPanel();
        cmbRole = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        btnPick = new javax.swing.JButton();
        txtLname = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblSpecial = new javax.swing.JLabel();
        lblFee = new javax.swing.JLabel();
        lblPlace = new javax.swing.JLabel();
        btnEmpDelete = new javax.swing.JButton();
        btnEmpSubmit = new javax.swing.JButton();
        txtWplace = new javax.swing.JTextField();
        txtChnFee = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtSpecial = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        lblRequired2 = new javax.swing.JLabel();
        lblRequired1 = new javax.swing.JLabel();
        lblRequired3 = new javax.swing.JLabel();
        lblRequired4 = new javax.swing.JLabel();
        lblRequired5 = new javax.swing.JLabel();
        lblRequired6 = new javax.swing.JLabel();
        lblRequired = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnEmpSearch = new javax.swing.JButton();
        lblRole = new javax.swing.JLabel();
        btnDltSearch = new javax.swing.JButton();
        lblEmp = new javax.swing.JLabel();
        lblVAcc = new javax.swing.JLabel();
        lblDAcc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpComplain = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtBillid = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComDescription = new javax.swing.JTextPane();
        jButton12 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCom = new javax.swing.JLabel();
        jpMedicine = new javax.swing.JPanel();
        txtMSearch = new javax.swing.JTextField();
        txtQuantityEdit = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtMedname = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btnAddItem = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtMednameEdit = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtDescriptionEdit = new javax.swing.JTextField();
        txtPriceEdit = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnANItem = new javax.swing.JButton();
        btnMedDelete = new javax.swing.JButton();
        lblCheck = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpComplainPrevious = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtFindBillid = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtComBid = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtComid = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        txtRec = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComDes = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jpMedQ = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMed = new javax.swing.JTable();
        txtUpdateQty = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        btnUpdateMedQty = new javax.swing.JButton();
        txtUpdateMName = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        ManagePanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        lblComplaint = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAccount.setBackground(new java.awt.Color(255, 255, 255));
        jpAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 18)));

        cmbRole.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select here", "Doctor", "Receptionist", "Admin" }));
        cmbRole.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmbRoleMouseMoved(evt);
            }
        });
        cmbRole.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbRolePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });
        cmbRole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRoleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmbRoleKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel17.setText("Employee ID  :");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel5.setText("First Name     :");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel6.setText("Surname         :");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel15.setText("Date of Birth  :");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel16.setText("Address          :");

        txtAddress.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDob.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });

        btnPick.setText("p");
        btnPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickActionPerformed(evt);
            }
        });

        txtLname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });
        txtLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLnameKeyTyped(evt);
            }
        });

        txtFname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFnameKeyTyped(evt);
            }
        });

        txtId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblUsername.setText("Username      :");

        lblPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblPassword.setText("Password       :");

        lblSpecial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblSpecial.setText("Specialized field :");

        lblFee.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblFee.setText("Channeling Fee   :");

        lblPlace.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblPlace.setText("Working Place     :");

        btnEmpDelete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEmpDelete.setText("Delete");
        btnEmpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpDeleteActionPerformed(evt);
            }
        });

        btnEmpSubmit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEmpSubmit.setText("Submit");
        btnEmpSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpSubmitActionPerformed(evt);
            }
        });

        txtWplace.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtWplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWplaceKeyTyped(evt);
            }
        });

        txtChnFee.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtChnFee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChnFeeKeyTyped(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        txtSpecial.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtSpecial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSpecialKeyTyped(evt);
            }
        });

        lblType.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        lblType.setText("User Type      :");

        lblRequired2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired2.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired2.setText("*");

        lblRequired1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired1.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired1.setText("*");

        lblRequired3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired3.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired3.setText("*");

        lblRequired4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired4.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired4.setText("*");

        lblRequired5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired5.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired5.setText("*");

        lblRequired6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired6.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired6.setText("*");

        lblRequired.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRequired.setForeground(new java.awt.Color(255, 0, 51));
        lblRequired.setText("*");

        javax.swing.GroupLayout jpDetailsLayout = new javax.swing.GroupLayout(jpDetails);
        jpDetails.setLayout(jpDetailsLayout);
        jpDetailsLayout.setHorizontalGroup(
            jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetailsLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel17)
                            .addComponent(lblType))
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtDob)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPick, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(638, 638, 638))
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLname)
                                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                                .addComponent(txtId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRequired2)
                                                .addGap(65, 65, 65))
                                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                                .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblRequired1))
                                            .addComponent(txtFname))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRequired4)
                                            .addComponent(lblRequired3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33))
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(txtAddress)))
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRequired6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDetailsLayout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblPassword)
                                                    .addComponent(lblUsername))
                                                .addGap(37, 37, 37)
                                                .addComponent(txtUsername))
                                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                                .addGap(138, 138, 138)
                                                .addComponent(txtPassword))))))))
                    .addGroup(jpDetailsLayout.createSequentialGroup()
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addComponent(txtSpecial)
                                        .addGap(76, 76, 76))
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addComponent(txtChnFee)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRequired)
                                        .addGap(61, 61, 61))
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addComponent(txtWplace)
                                        .addGap(76, 76, 76))
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addComponent(btnEmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnEmpSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPlace)
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFee)
                                    .addComponent(lblSpecial)))
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(lblRequired5)))
                        .addGap(560, 560, 560)))
                .addContainerGap())
        );
        jpDetailsLayout.setVerticalGroup(
            jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDetailsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDetailsLayout.createSequentialGroup()
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType)
                            .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRequired1)
                                .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRequired2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRequired3)))
                    .addGroup(jpDetailsLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDetailsLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblUsername))
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPassword))
                                .addGap(4, 4, 4)))
                        .addGap(17, 17, 17)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lblRequired4))
                        .addGap(18, 18, 18)
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(btnPick, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblRequired5)))
                        .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel16))
                            .addGroup(jpDetailsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRequired6)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecial)
                    .addComponent(txtSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFee)
                    .addComponent(txtChnFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequired))
                .addGap(12, 12, 12)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlace)
                    .addComponent(txtWplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btnEmpSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnEmpSearch.setText("Search");
        btnEmpSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpSearchActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        btnDltSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnDltSearch.setText("Search");
        btnDltSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltSearchActionPerformed(evt);
            }
        });

        lblEmp.setBackground(new java.awt.Color(153, 255, 255));
        lblEmp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp.setText("Add New Employee");
        lblEmp.setOpaque(true);
        lblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEmpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblEmpMousePressed(evt);
            }
        });

        lblVAcc.setBackground(new java.awt.Color(153, 255, 255));
        lblVAcc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVAcc.setText("View Account");
        lblVAcc.setOpaque(true);
        lblVAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVAccMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblVAccMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVAccMouseReleased(evt);
            }
        });

        lblDAcc.setBackground(new java.awt.Color(153, 255, 255));
        lblDAcc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDAcc.setText("Delete Account");
        lblDAcc.setOpaque(true);
        lblDAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDAccMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDAccMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblDAccMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 255, 255));
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jpAccountLayout = new javax.swing.GroupLayout(jpAccount);
        jpAccount.setLayout(jpAccountLayout);
        jpAccountLayout.setHorizontalGroup(
            jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEmpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDltSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpAccountLayout.setVerticalGroup(
            jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAccountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEmpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDltSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpComplain.setBackground(new java.awt.Color(255, 255, 255));
        jpComplain.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complaint Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 18))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel23.setText("Bill Number    :");

        txtBillid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtBillid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBillidKeyTyped(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Due Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 16))); // NOI18N

        txtComDescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(txtComDescription);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jButton12.setText("Add New Complain");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(153, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setOpaque(true);

        lblCom.setBackground(new java.awt.Color(153, 255, 255));
        lblCom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCom.setText("Check Complains");
        lblCom.setOpaque(true);
        lblCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpComplainLayout = new javax.swing.GroupLayout(jpComplain);
        jpComplain.setLayout(jpComplainLayout);
        jpComplainLayout.setHorizontalGroup(
            jpComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComplainLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpComplainLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtBillid, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addGap(584, 584, 584))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComplainLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCom, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpComplainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(205, 205, 205))
        );
        jpComplainLayout.setVerticalGroup(
            jpComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComplainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jpComplainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.getAccessibleContext().setAccessibleName("Description");

        jpMedicine.setBackground(new java.awt.Color(255, 255, 255));
        jpMedicine.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 18))); // NOI18N

        txtMSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtMSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMSearchKeyTyped(evt);
            }
        });

        txtQuantityEdit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtQuantityEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityEditKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel24.setText("Medicine Name  :");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medicine Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 17))); // NOI18N

        txtMedname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel30.setText("Medicine Name  :");

        txtQuantity.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel25.setText("Price                     :");

        txtPrice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel26.setText("Description         :");

        txtDescription.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel32.setText("Quantity              :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel32))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescription)
                    .addComponent(txtMedname)
                    .addComponent(txtPrice)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtMedname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel32)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel25)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel26)))
                .addGap(63, 63, 63))
        );

        btnAddItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAddItem.setText("Add");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        btnShow.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        btnShow.setText("<<");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel27.setText("Price                     :");

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel28.setText("Description         :");

        txtMednameEdit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtMednameEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMednameEditKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel31.setText("Quantity              :");

        txtDescriptionEdit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtDescriptionEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionEditKeyTyped(evt);
            }
        });

        txtPriceEdit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtPriceEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceEditKeyTyped(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdateItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnUpdateItem.setText("Update");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnANItem.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnANItem.setText("Add New Item");
        btnANItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANItemActionPerformed(evt);
            }
        });

        btnMedDelete.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnMedDelete.setText("Delete");
        btnMedDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedDeleteActionPerformed(evt);
            }
        });

        lblCheck.setBackground(new java.awt.Color(153, 255, 255));
        lblCheck.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCheck.setText("Check Stock");
        lblCheck.setOpaque(true);
        lblCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCheckMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCheckMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCheckMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jpMedicineLayout = new javax.swing.GroupLayout(jpMedicine);
        jpMedicine.setLayout(jpMedicineLayout);
        jpMedicineLayout.setHorizontalGroup(
            jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jpMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMedicineLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMedicineLayout.createSequentialGroup()
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpMedicineLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtQuantityEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                    .addComponent(btnANItem)
                                    .addGroup(jpMedicineLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMednameEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                    .addGroup(jpMedicineLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDescriptionEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtPriceEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))))
                                    .addGroup(jpMedicineLayout.createSequentialGroup()
                                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(93, 93, 93)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addComponent(txtMSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)))
                        .addGap(33, 33, 33)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMedicineLayout.createSequentialGroup()
                                .addComponent(btnMedDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)))))
                .addContainerGap())
        );
        jpMedicineLayout.setVerticalGroup(
            jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMedicineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMedicineLayout.createSequentialGroup()
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtMSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSearch))
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpMedicineLayout.createSequentialGroup()
                        .addComponent(btnANItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel24))
                            .addComponent(txtMednameEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantityEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(32, 32, 32)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel27))
                            .addComponent(txtPriceEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMedicineLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel28))
                            .addComponent(txtDescriptionEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jpMedicineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addComponent(btnMedDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpComplainPrevious.setBackground(new java.awt.Color(255, 255, 255));
        jpComplainPrevious.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complaint Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 18))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel29.setText("Bill Number    :");

        txtFindBillid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtFindBillid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFindBillidKeyTyped(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Due Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 16))); // NOI18N

        txtComBid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel33.setText("Bill Number    :");

        txtComid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        txtDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        txtDoc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        txtRec.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N

        txtComDes.setColumns(20);
        txtComDes.setRows(5);
        jScrollPane1.setViewportView(txtComDes);

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel34.setText("Complain Number    :");

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel35.setText("Date    : ");

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel36.setText("Doctor   :");

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel37.setText("Description   :");

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel38.setText("Receptionist    :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(txtComBid))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(txtRec, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel36)
                                .addGap(18, 18, 18)
                                .addComponent(txtDoc))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel34))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addComponent(txtComid))))
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(175, 175, 175))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(157, 157, 157)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtComBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpComplainPreviousLayout = new javax.swing.GroupLayout(jpComplainPrevious);
        jpComplainPrevious.setLayout(jpComplainPreviousLayout);
        jpComplainPreviousLayout.setHorizontalGroup(
            jpComplainPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComplainPreviousLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpComplainPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpComplainPreviousLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(txtFindBillid, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton15)
                        .addGap(767, 767, 767)))
                .addContainerGap())
        );
        jpComplainPreviousLayout.setVerticalGroup(
            jpComplainPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpComplainPreviousLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jpComplainPreviousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtFindBillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jpMedQ.setBackground(new java.awt.Color(255, 255, 255));
        jpMedQ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "          Medicine Stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semibold", 0, 18)));

        tbMed.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        tbMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMedMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbMed);

        txtUpdateQty.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtUpdateQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateQtyKeyTyped(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel39.setText("Quantity                 :");

        btnUpdateMedQty.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        btnUpdateMedQty.setText("Update");
        btnUpdateMedQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMedQtyActionPerformed(evt);
            }
        });

        txtUpdateMName.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        txtUpdateMName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUpdateMNameKeyTyped(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel40.setText("Medicine Name    :");

        javax.swing.GroupLayout jpMedQLayout = new javax.swing.GroupLayout(jpMedQ);
        jpMedQ.setLayout(jpMedQLayout);
        jpMedQLayout.setHorizontalGroup(
            jpMedQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMedQLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3)
                .addGap(40, 40, 40))
            .addGroup(jpMedQLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(jpMedQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMedQLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpdateMName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMedQLayout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpdateQty, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnUpdateMedQty)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jpMedQLayout.setVerticalGroup(
            jpMedQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMedQLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addGap(84, 84, 84)
                .addGroup(jpMedQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtUpdateMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMedQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtUpdateQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateMedQty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        jLayeredPane1.setLayer(jpAccount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpComplain, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpMedicine, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpComplainPrevious, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jpMedQ, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jpAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jpMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jpComplain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jpComplainPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(jpMedQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpMedicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpComplain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpComplainPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpMedQ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpAccount.getAccessibleContext().setAccessibleName("");

        ManagePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/clinic logo.png"))); // NOI18N
        jLabel42.setText("jLabel6");

        lblIcon.setBackground(new java.awt.Color(153, 204, 255));
        lblIcon.setOpaque(true);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/account.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/complaint.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Images/drug.png"))); // NOI18N

        lblAccount.setBackground(new java.awt.Color(255, 255, 255));
        lblAccount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccount.setText("Account");
        lblAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAccount.setOpaque(true);
        lblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAccountMousePressed(evt);
            }
        });

        lblMedicine.setBackground(new java.awt.Color(255, 255, 255));
        lblMedicine.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicine.setText("Medicine");
        lblMedicine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblMedicine.setOpaque(true);
        lblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMedicineMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMedicineMousePressed(evt);
            }
        });

        lblComplaint.setBackground(new java.awt.Color(255, 255, 255));
        lblComplaint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblComplaint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComplaint.setText("Complaint");
        lblComplaint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblComplaint.setOpaque(true);
        lblComplaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComplaintMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComplaintMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblComplaintMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ManagePanelLayout = new javax.swing.GroupLayout(ManagePanel);
        ManagePanel.setLayout(ManagePanelLayout);
        ManagePanelLayout.setHorizontalGroup(
            ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ManagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblComplaint, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(ManagePanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ManagePanelLayout.createSequentialGroup()
                    .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagePanelLayout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagePanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        ManagePanelLayout.setVerticalGroup(
            ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagePanelLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblComplaint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ManagePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(ManagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ManagePanelLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(441, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");

        jMenuItem1.setText(" Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText(" Go to Home");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");

        jMenuItem3.setText(" Settings");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ManagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManagePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnEmpSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpSearchActionPerformed

        search();
    }//GEN-LAST:event_btnEmpSearchActionPerformed

    private void search() {

        lblRequired.setVisible(false);
        lblRequired1.setVisible(false);
        lblRequired2.setVisible(false);
        lblRequired3.setVisible(false);
        lblRequired4.setVisible(false);
        lblRequired5.setVisible(false);
        lblRequired6.setVisible(false);

        txtUsername.setText("");
        txtPassword.setText("");
        if (Pattern.matches("[0-9]{9}|[0-9]{12}", txtSearch.getText())) {
            String Id = txtSearch.getText();
            Employee emp = new Employee();
            emp.setId(Integer.parseInt(Id));
            try {
                emp.ViewAccount(emp);
            } catch (IOException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtId.setText(String.valueOf(emp.getId()));
            txtFname.setText(emp.getFname());
            txtLname.setText(emp.getLname());
            txtAddress.setText(emp.getAddress());
            txtDob.setText(emp.getDOB());

            if (emp.getRole().equals("R")) {
                lblRole.setText("Receptionist");

                txtSpecial.setVisible(false);
                txtChnFee.setVisible(false);
                txtWplace.setVisible(false);
                lblSpecial.setVisible(false);
                lblFee.setVisible(false);
                lblPlace.setVisible(false);

            } else if (emp.getRole().equals("D")) {
                lblRole.setText("Doctor");
                Doctor doc = new Doctor(Integer.parseInt(txtId.getText()));
                try {
                    doc.ViewAccount(doc);
                } catch (IOException ex) {
                    Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                txtSpecial.setVisible(true);
                txtChnFee.setVisible(true);
                txtWplace.setVisible(true);
                lblSpecial.setVisible(true);
                lblFee.setVisible(true);
                lblPlace.setVisible(true);

                txtSpecial.setText(doc.getSpecialization());
                txtChnFee.setText(String.valueOf(doc.getChnFee()));
                txtWplace.setText(doc.getWplace());

            } else if (emp.getRole().equals("A")) {
                lblRole.setText("Admin");

                txtSpecial.setVisible(false);
                txtChnFee.setVisible(false);
                txtWplace.setVisible(false);
                lblSpecial.setVisible(false);
                lblFee.setVisible(false);
                lblPlace.setVisible(false);

            }
            jpDetails.setVisible(true);
            lblType.setVisible(false);
            cmbRole.setVisible(false);
            txtId.setEditable(false);
            txtFname.setEditable(false);
            txtLname.setEditable(false);
            txtAddress.setEditable(false);
            txtDob.setEditable(false);
            txtSpecial.setEditable(false);
            txtChnFee.setEditable(false);
            txtWplace.setEditable(false);
            btnPick.setEnabled(false);

            btnEmpDelete.setVisible(false);
            btnEmpSubmit.setVisible(false);
            txtPassword.setVisible(false);
            txtUsername.setVisible(false);
            lblUsername.setVisible(false);
            lblPassword.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Invalid Employee ID !!");
        }
    }
    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed

    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtMedname.setEditable(false);
        txtQuantity.setEditable(false);
        txtPrice.setEditable(false);
        txtDescription.setEditable(false);
        btnMedDelete.setVisible(true);
        btnANItem.setVisible(false);
        btnShow.setVisible(true);

        String Medname = txtMSearch.getText();
        Medicine med = new Medicine();
        med.setMedname(Medname);

        try {
            med.ViewMedicine(med);
        } catch (SQLException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtDescription.setText(med.getMedDescription());
        txtMedname.setText(med.getMedname());
        txtPrice.setText(String.valueOf(med.getPrice()));
        txtQuantity.setText(String.valueOf(med.getQuantity()));
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
          if (!txtMednameEdit.getText().equals("") && !txtQuantityEdit.getText().equals("") && !txtPriceEdit.getText().equals("") && !txtDescriptionEdit.getText().equals("")) {
            Medicine med = new Medicine();
            med.setMedname(txtMednameEdit.getText());
            med.setQuantity(Integer.parseInt(txtQuantityEdit.getText()));
            med.setPrice(Float.parseFloat(txtPriceEdit.getText()));
            med.setMedDescription(txtDescriptionEdit.getText());

            try {
                med.AddMedicine(med);
            } catch (IOException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            txtMednameEdit.setText("");
            txtQuantityEdit.setText("");
            txtPriceEdit.setText("");
            txtDescriptionEdit.setText("");
        } else {

            JOptionPane.showMessageDialog(null, "Fill all the fields!!");
            
        }
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        if (!txtMednameEdit.getText().equals("") && !txtQuantityEdit.getText().equals("") && !txtPriceEdit.getText().equals("") && !txtDescriptionEdit.getText().equals("")) {
            Medicine med = new Medicine();
            med.setMedname(txtMednameEdit.getText());
            med.setQuantity(Integer.parseInt(txtQuantityEdit.getText()));
            med.setPrice(Float.parseFloat(txtPriceEdit.getText()));
            med.setMedDescription(txtDescriptionEdit.getText());
            try {
                med.UpdateMedicine(med);
                txtMednameEdit.setText("");
                txtQuantityEdit.setText("");
                txtPriceEdit.setText("");
                txtDescriptionEdit.setText("");
            } catch (IOException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Fill all the fields!!");
        }
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void btnANItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANItemActionPerformed


        txtDescription.setText("");
        txtMedname.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");

        txtDescription.setText("");
        txtMedname.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
        btnShow.setVisible(false);
        btnMedDelete.setVisible(false);

        txtMednameEdit.setEditable(true);
        btnAddItem.setVisible(true);
        btnUpdateItem.setVisible(false);
        txtMednameEdit.setText("");
        txtQuantityEdit.setText("");
        txtPriceEdit.setText("");
        txtDescriptionEdit.setText("");

    }//GEN-LAST:event_btnANItemActionPerformed

    private void btnMedDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedDeleteActionPerformed

        Medicine med = new Medicine();
        med.setMedname(txtMedname.getText());
        try {
            med.DeleteMedicine(med);
        } catch (IOException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtDescription.setText("");
        txtMedname.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnMedDeleteActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed

        if (!txtDescription.getText().equals("")) {
            txtMednameEdit.setEditable(false);
            txtMednameEdit.setText(txtMedname.getText());
            txtQuantityEdit.setText(txtQuantity.getText());
            txtPriceEdit.setText(txtPrice.getText());
            txtDescriptionEdit.setText(txtDescription.getText());
            btnANItem.setVisible(true);
            btnAddItem.setVisible(false);
            btnUpdateItem.setVisible(true);
        }

    }//GEN-LAST:event_btnShowActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        if (!txtFindBillid.getText().equals("")) {
            int Billid = Integer.parseInt(txtFindBillid.getText());
            Complain com = new Complain();
            com.setBillid(Billid);

            try {
                com.SetDetails(com);
            } catch (SQLException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtComid.setText(String.valueOf(com.getComid()));
            txtComBid.setText(String.valueOf(com.getBillid()));
            txtDate.setText(com.getDate());
            txtDoc.setText(com.getDocFname() + " " + com.getDocLname());
            txtRec.setText(com.getResFname() + " " + com.getResLname());
            txtComDes.setText(com.getComDescription());
        } else {
            JOptionPane.showMessageDialog(null, "Empty bill number!!");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        if (!txtBillid.getText().equals("") && !txtComDescription.getText().equals("")) {
            int Billid = Integer.parseInt(txtBillid.getText());
            String ComDescription = txtComDescription.getText();

            Complain com = new Complain();
            com.setDate(String.valueOf(java.time.LocalDate.now()));
            com.setBillid(Billid);
            com.setComDescription(ComDescription);

            try {
                com.AddComplain(com);
            } catch (IOException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Fill all the fields!!");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed

    }//GEN-LAST:event_txtDocActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped

        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    final static String DATE_FORMAT = "yyyy-MM-dd";

    private void btnEmpSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpSubmitActionPerformed

        if (cmbRole.getSelectedIndex() != 0 && !txtId.getText().equals("") && !txtFname.getText().equals("") && !txtLname.getText().equals("") && !txtAddress.getText().equals("") && !txtDob.getText().equals("")) {

            if (Pattern.matches("[0-9]{9}|[0-9]{12}", txtId.getText())) {
                int Id = Integer.parseInt(txtId.getText());
                String Role = null;
                String Fname = txtFname.getText();
                String Lname = txtLname.getText();
                String Address = txtAddress.getText();
                String Dob = txtDob.getText();
                boolean date = false;
                //date format
                try {
                    DateFormat df = new SimpleDateFormat(DATE_FORMAT);
                    df.setLenient(false);
                    df.parse(txtDob.getText());
                    date = true;
                } catch (ParseException e) {
                    date = false;
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

                String Username = txtFname.getText() + txtLname.getText();
                String Password = txtId.getText();

                if (daysdiff > 0 && date == true) {
                    if (cmbRole.getSelectedIndex() == 1) {
                        Role = "D";
                        if (!txtChnFee.getText().equals("")) {
                            String Specialization = txtSpecial.getText();
                            String Wplace = txtWplace.getText();
                            float ChnFee = Float.parseFloat(txtChnFee.getText());

                            Doctor doc = new Doctor(Specialization, ChnFee, Wplace, Id, Role, Fname, Lname, Address, Dob, Username, Password);
                            try {
                                doc.CreateEmployee(doc);
                            } catch (IOException ex) {
                                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Enter Channeling Fee!!");
                        }
                    } else if (cmbRole.getSelectedIndex() == 2) {
                        Role = "R";
                        Employee emp = new Employee(Id, Role, Fname, Lname, Address, Dob, Username, Password);
                        try {
                            emp.CreateEmployee(emp);
                        } catch (IOException ex) {
                            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else if (cmbRole.getSelectedIndex() == 3) {
                        Role = "A";
                        Employee emp = new Employee(Id, Role, Fname, Lname, Address, Dob, Username, Password);
                        try {
                            emp.CreateEmployee(emp);
                        } catch (IOException ex) {
                            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                    lblUsername.setVisible(true);
                    lblPassword.setVisible(true);
                    txtUsername.setVisible(true);
                    txtPassword.setVisible(true);
                    txtUsername.setText(Username);
                    txtPassword.setText(Password);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Date!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Employee ID !!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fill all the required fields !!");
        }
    }//GEN-LAST:event_btnEmpSubmitActionPerformed

    private void btnEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpDeleteActionPerformed
        // TODO add your handling code here:

        Employee emp = new Employee();
        emp.setId(Integer.parseInt(txtSearch.getText()));
        try {
            emp.DropEmployeeAccount();
            jpDetails.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEmpDeleteActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void btnPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickActionPerformed

        DatePicker datePicker = new DatePicker(this);
        txtDob.setText(datePicker.setPickedDate());
    }//GEN-LAST:event_btnPickActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed

    }//GEN-LAST:event_txtAddressActionPerformed

    private void cmbRoleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRoleKeyReleased

    }//GEN-LAST:event_cmbRoleKeyReleased

    private void cmbRoleMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbRoleMouseMoved

    }//GEN-LAST:event_cmbRoleMouseMoved

    private void btnDltSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltSearchActionPerformed
        search();
        btnEmpDelete.setVisible(true);
    }//GEN-LAST:event_btnDltSearchActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void cmbRoleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRoleKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbRoleKeyPressed

    private void cmbRolePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbRolePopupMenuWillBecomeInvisible

        if (cmbRole.getSelectedIndex() == 1) {

            txtSpecial.setVisible(true);
            txtChnFee.setVisible(true);
            txtWplace.setVisible(true);
            lblSpecial.setVisible(true);
            lblFee.setVisible(true);
            lblPlace.setVisible(true);
            lblRequired.setVisible(true);
            txtSpecial.setEditable(true);
            txtChnFee.setEditable(true);
            txtWplace.setEditable(true);
        } else {

            txtSpecial.setVisible(false);
            txtChnFee.setVisible(false);
            txtWplace.setVisible(false);
            lblSpecial.setVisible(false);
            lblFee.setVisible(false);
            lblPlace.setVisible(false);
            lblRequired.setVisible(false);
            txtSpecial.setEditable(false);
            txtChnFee.setEditable(false);
            txtWplace.setEditable(false);
        }
    }//GEN-LAST:event_cmbRolePopupMenuWillBecomeInvisible

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFnameKeyTyped

    private void txtLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtLnameKeyTyped

    private void txtSpecialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSpecialKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSpecialKeyTyped

    private void txtWplaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWplaceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWplaceKeyTyped

    private void txtChnFeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChnFeeKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtChnFeeKeyTyped

    private void txtMSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMSearchKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(c >= '0' && c <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMSearchKeyTyped

    private void txtMednameEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMednameEditKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(c >= '0' && c <= '9')) {
            evt.consume();
        }

    }//GEN-LAST:event_txtMednameEditKeyTyped

    private void txtQuantityEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityEditKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantityEditKeyTyped

    private void txtPriceEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceEditKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceEditKeyTyped

    private void txtDescriptionEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionEditKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescriptionEditKeyTyped

    private void txtBillidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBillidKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBillidKeyTyped

    private void txtFindBillidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindBillidKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFindBillidKeyTyped

    private void txtUpdateQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateQtyKeyTyped
        // TODO add your handling code here:
        char k = evt.getKeyChar();
        if (!(k >= '0' && k <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUpdateQtyKeyTyped

    private void btnUpdateMedQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMedQtyActionPerformed
        // TODO add your handling code here:
        if (!txtUpdateMName.getText().equals("") && !txtUpdateQty.getText().equals("")) {
            Medicine med = new Medicine();
            med.setMedname(txtUpdateMName.getText());
            med.setQuantity(Integer.parseInt(txtUpdateQty.getText()) + Integer.parseInt((String) tbMed.getValueAt(tbMed.getSelectedRow(), 1)));
            try {
                med.RefillQuantity(med);
            } catch (IOException ex) {
                Logger.getLogger(AdminWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            loadTable();
        } else {
            JOptionPane.showMessageDialog(null, "Fill all the fields !!");
        }
    }//GEN-LAST:event_btnUpdateMedQtyActionPerformed

    private void txtUpdateMNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateMNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpdateMNameKeyTyped

    private void tbMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMedMouseClicked
        // TODO add your handling code here:
        txtUpdateMName.setText((String) tbMed.getValueAt(tbMed.getSelectedRow(), 0));
    }//GEN-LAST:event_tbMedMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Welcome wel = new Welcome();
        wel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        EditAccount ea = new EditAccount();
        ea.setRole(Ro);
        ea.setID(Id);
        jLayeredPane1.setVisible(false);
        ManagePanel.setVisible(false);
        this.setContentPane(ea);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(ManagePanel);
        mainPanel.add(jLayeredPane1);
        jLayeredPane1.setVisible(true);
        ManagePanel.setVisible(true);

        this.setContentPane(mainPanel);
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lblVAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVAccMousePressed

        lblRole.setText("");
        jpDetails.setVisible(false);
        btnEmpSearch.setVisible(true);
        btnDltSearch.setVisible(false);
        txtSearch.setVisible(true);
        btnEmpDelete.setVisible(true);
        txtSearch.setText("");

        lblRequired1.setVisible(true);
        lblRequired2.setVisible(true);
        lblRequired3.setVisible(true);
        lblRequired4.setVisible(true);
        lblRequired5.setVisible(true);
        lblRequired6.setVisible(true);
    }//GEN-LAST:event_lblVAccMousePressed

    private void lblDAccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDAccMousePressed
        // TODO add your handling code here:
        lblRole.setText("");
        jpDetails.setVisible(false);
        btnEmpSearch.setVisible(false);
        btnDltSearch.setVisible(true);
        txtSearch.setVisible(true);
        btnEmpDelete.setVisible(true);
        txtSearch.setText("");

        lblRequired1.setVisible(true);
        lblRequired2.setVisible(true);
        lblRequired3.setVisible(true);
        lblRequired4.setVisible(true);
        lblRequired5.setVisible(true);
        lblRequired6.setVisible(true);
    }//GEN-LAST:event_lblDAccMousePressed

    private void lblEmpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpMousePressed

        lblRole.setText("");
        jpDetails.setVisible(true);
        btnEmpSearch.setVisible(false);
        btnDltSearch.setVisible(false);
        txtSearch.setVisible(false);
        btnEmpDelete.setVisible(false);
        btnEmpSubmit.setVisible(true);

        lblSpecial.setVisible(false);
        lblFee.setVisible(false);
        lblPlace.setVisible(false);
        lblRequired.setVisible(false);

        txtSpecial.setVisible(false);
        txtChnFee.setVisible(false);
        txtWplace.setVisible(false);

        lblType.setVisible(true);
        cmbRole.setVisible(true);
        txtId.setText("");
        txtFname.setText("");
        txtLname.setText("");
        txtAddress.setText("");
        txtDob.setEditable(true);
        txtDob.setText("");
        txtSpecial.setText("");
        txtChnFee.setText("");
        txtWplace.setText("");

        txtId.setEditable(true);
        txtFname.setEditable(true);
        txtLname.setEditable(true);
        txtAddress.setEditable(true);

        txtSpecial.setEditable(true);
        txtChnFee.setEditable(true);
        txtWplace.setEditable(true);
        btnPick.setEnabled(true);

        txtPassword.setText("");
        txtUsername.setText("");


        lblRequired1.setVisible(true);
        lblRequired2.setVisible(true);
        lblRequired3.setVisible(true);
        lblRequired4.setVisible(true);
        lblRequired5.setVisible(true);
        lblRequired6.setVisible(true);

    }//GEN-LAST:event_lblEmpMousePressed

    private void lblVAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVAccMouseEntered

        lblVAcc.setBackground(Color.blue);
        lblVAcc.setForeground(white);
    }//GEN-LAST:event_lblVAccMouseEntered

    private void lblVAccMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVAccMouseReleased

    }//GEN-LAST:event_lblVAccMouseReleased

    private void lblVAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVAccMouseExited
        
        lblVAcc.setBackground(col);
        lblVAcc.setForeground(black);

    }//GEN-LAST:event_lblVAccMouseExited

    private void lblDAccMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDAccMouseEntered

        lblDAcc.setBackground(Color.blue);
        lblDAcc.setForeground(white);

    }//GEN-LAST:event_lblDAccMouseEntered

    private void lblDAccMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDAccMouseExited
        lblDAcc.setBackground(col);
        lblDAcc.setForeground(black);
    }//GEN-LAST:event_lblDAccMouseExited

    private void lblEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpMouseEntered

        lblEmp.setBackground(Color.blue);
        lblEmp.setForeground(white);

    }//GEN-LAST:event_lblEmpMouseEntered

    private void lblEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmpMouseExited
        // TODO add your handling code here:
        lblEmp.setBackground(col);
        lblEmp.setForeground(black);

    }//GEN-LAST:event_lblEmpMouseExited

    private void lblCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_lblCheckMouseClicked

    private void lblCheckMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMousePressed
        // TODO add your handling code here:
        jpMedQ.setVisible(true);
        jpComplainPrevious.setVisible(false);
        jpAccount.setVisible(false);
        jpMedicine.setVisible(false);
        jpComplain.setVisible(false);
        loadTable();
        txtUpdateMName.setEditable(false);
        txtUpdateMName.setBackground(white);


    }//GEN-LAST:event_lblCheckMousePressed

    private void lblCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseEntered
        // TODO add your handling code here:

        lblCheck.setBackground(Color.blue);
        lblCheck.setForeground(white);
    }//GEN-LAST:event_lblCheckMouseEntered

    private void lblCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCheckMouseExited
        // TODO add your handling code here:

        lblCheck.setBackground(col);
        lblCheck.setForeground(black);
    }//GEN-LAST:event_lblCheckMouseExited

    private void lblComMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComMousePressed
        // TODO add your handling code here:

        jpAccount.setVisible(false);
        jpMedicine.setVisible(false);
        jpComplain.setVisible(false);
        jpComplainPrevious.setVisible(true);
    }//GEN-LAST:event_lblComMousePressed

    private void lblComMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComMouseEntered
        // TODO add your handling code here:

        lblCom.setBackground(Color.blue);
        lblCom.setForeground(white);
    }//GEN-LAST:event_lblComMouseEntered

    private void lblComMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComMouseExited
        // TODO add your handling code here:

        lblCom.setBackground(col);
        lblCom.setForeground(black);
    }//GEN-LAST:event_lblComMouseExited

    private void lblAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMousePressed
        // TODO add your handling code here:
        jpComplainPrevious.setVisible(false);
        jpAccount.setVisible(true);
        txtMSearch.setVisible(true);
        btnSearch.setVisible(true);
        jpMedicine.setVisible(false);
        jpComplain.setVisible(false);
        jpDetails.setVisible(false);
        btnDltSearch.setVisible(false);
        txtSearch.setText("");
        lblRole.setText("");

    }//GEN-LAST:event_lblAccountMousePressed

    private void lblMedicineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMousePressed
        // TODO add your handling code here:
        jpComplainPrevious.setVisible(false);
        jpAccount.setVisible(false);
        jpMedicine.setVisible(true);
        jpComplain.setVisible(false);
        jpMedQ.setVisible(false);
    }//GEN-LAST:event_lblMedicineMousePressed

    private void lblComplaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComplaintMousePressed
        // TODO add your handling code here:

        jpComplainPrevious.setVisible(false);
        jpAccount.setVisible(false);
        jpMedicine.setVisible(false);
        jpComplain.setVisible(true);
        jpMedQ.setVisible(false);
    }//GEN-LAST:event_lblComplaintMousePressed

    private void lblAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseEntered
        // TODO add your handling code here:
        lblAccount.setBackground(Color.gray);
        lblAccount.setForeground(Color.white);

    }//GEN-LAST:event_lblAccountMouseEntered

    private void lblAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccountMouseExited
        // TODO add your handling code here:
        lblAccount.setBackground(Color.white);
        lblAccount.setForeground(black);
    }//GEN-LAST:event_lblAccountMouseExited

    private void lblMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMouseEntered
        // TODO add your handling code here:
        lblMedicine.setBackground(Color.gray);
        lblMedicine.setForeground(Color.white);
    }//GEN-LAST:event_lblMedicineMouseEntered

    private void lblMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMedicineMouseExited
        // TODO add your handling code here:

        lblMedicine.setBackground(Color.white);
        lblMedicine.setForeground(black);
    }//GEN-LAST:event_lblMedicineMouseExited

    private void lblComplaintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComplaintMouseEntered
        // TODO add your handling code here:

        lblComplaint.setBackground(Color.gray);
        lblComplaint.setForeground(Color.white);
    }//GEN-LAST:event_lblComplaintMouseEntered

    private void lblComplaintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComplaintMouseExited
        // TODO add your handling code here:

        lblComplaint.setBackground(Color.white);
        lblComplaint.setForeground(Color.black);
    }//GEN-LAST:event_lblComplaintMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ManagePanel;
    private javax.swing.JButton btnANItem;
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnDltSearch;
    private javax.swing.JButton btnEmpDelete;
    private javax.swing.JButton btnEmpSearch;
    private javax.swing.JButton btnEmpSubmit;
    private javax.swing.JButton btnMedDelete;
    private javax.swing.JButton btnPick;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JButton btnUpdateMedQty;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAccount;
    private javax.swing.JPanel jpComplain;
    private javax.swing.JPanel jpComplainPrevious;
    private javax.swing.JPanel jpDetails;
    private javax.swing.JPanel jpMedQ;
    private javax.swing.JPanel jpMedicine;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblCheck;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblComplaint;
    private javax.swing.JLabel lblDAcc;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblFee;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lblRequired;
    private javax.swing.JLabel lblRequired1;
    private javax.swing.JLabel lblRequired2;
    private javax.swing.JLabel lblRequired3;
    private javax.swing.JLabel lblRequired4;
    private javax.swing.JLabel lblRequired5;
    private javax.swing.JLabel lblRequired6;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblSpecial;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVAcc;
    private javax.swing.JTable tbMed;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBillid;
    private javax.swing.JTextField txtChnFee;
    private javax.swing.JTextField txtComBid;
    private javax.swing.JTextArea txtComDes;
    private javax.swing.JTextPane txtComDescription;
    private javax.swing.JTextField txtComid;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDescriptionEdit;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtFindBillid;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtMSearch;
    private javax.swing.JTextField txtMedname;
    private javax.swing.JTextField txtMednameEdit;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceEdit;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtQuantityEdit;
    private javax.swing.JTextField txtRec;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSpecial;
    private javax.swing.JTextField txtUpdateMName;
    private javax.swing.JTextField txtUpdateQty;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtWplace;
    // End of variables declaration//GEN-END:variables
}
