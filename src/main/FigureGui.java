package main;

import alertsAndInformations.AlertsAndDescribes;
import figures.Rectangle;
import figures.Trapezium;
import figures.Square;
import figures.Triangle;
import java.awt.HeadlessException;


public class FigureGui extends javax.swing.JFrame {

    public FigureGui() {
        initComponents();
        setIcon(squareImagePath);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        labelField = new javax.swing.JTextField();
        buttonCount = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelPerimeter = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDiagonal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LabelASide = new javax.swing.JTextField();
        labelBSide = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LabelCSide = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        LabelHSide = new javax.swing.JTextField();
        rbSquare = new javax.swing.JRadioButton();
        rbTrapezium = new javax.swing.JRadioButton();
        rbTriangle = new javax.swing.JRadioButton();
        rbRectangle = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelkaIcon = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelDSide = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        labelHeight = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        buttonClear = new javax.swing.JToggleButton();
        labelkaWarning = new javax.swing.JLabel();
        buttonAbout = new javax.swing.JButton();
        buttonAuthor = new javax.swing.JButton();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("2DFigures");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setSize(new java.awt.Dimension(800, 700));
        getContentPane().setLayout(null);

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(null);

        labelField.setEditable(false);
        labelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelFieldActionPerformed(evt);
            }
        });
        jPanel1.add(labelField);
        labelField.setBounds(350, 220, 48, 24);

        buttonCount.setText("Oblicz!");
        buttonCount.setToolTipText("");
        buttonCount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCountActionPerformed(evt);
            }
        });
        buttonCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonCountKeyPressed(evt);
            }
        });
        jPanel1.add(buttonCount);
        buttonCount.setBounds(50, 280, 110, 40);

        jLabel3.setText("Pole:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 220, 28, 16);

        labelPerimeter.setEditable(false);
        labelPerimeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelPerimeterActionPerformed(evt);
            }
        });
        jPanel1.add(labelPerimeter);
        labelPerimeter.setBounds(350, 260, 48, 24);

        jLabel4.setText("Obwód:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 260, 43, 16);

        jLabel5.setText("Przekątna (d):");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 300, 79, 16);

        labelDiagonal.setEditable(false);
        labelDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelDiagonalActionPerformed(evt);
            }
        });
        jPanel1.add(labelDiagonal);
        labelDiagonal.setBounds(350, 300, 48, 24);

        jLabel7.setText("a:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(137, 53, 10, 16);
        jPanel1.add(LabelASide);
        LabelASide.setBounds(153, 49, 50, 24);

        labelBSide.setEditable(false);
        jPanel1.add(labelBSide);
        labelBSide.setBounds(153, 79, 50, 24);

        jLabel9.setText("c:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(137, 113, 10, 16);

        LabelCSide.setEditable(false);
        jPanel1.add(LabelCSide);
        LabelCSide.setBounds(153, 109, 50, 24);

        jLabel10.setText("h:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(137, 173, 10, 16);

        LabelHSide.setEditable(false);
        jPanel1.add(LabelHSide);
        LabelHSide.setBounds(153, 169, 50, 24);

        buttonGroup1.add(rbSquare);
        rbSquare.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        rbSquare.setSelected(true);
        rbSquare.setText("Kwadrat");
        rbSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSquareActionPerformed(evt);
            }
        });
        jPanel1.add(rbSquare);
        rbSquare.setBounds(20, 51, 81, 28);

        buttonGroup1.add(rbTrapezium);
        rbTrapezium.setText("Trapez");
        rbTrapezium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTrapeziumActionPerformed(evt);
            }
        });
        jPanel1.add(rbTrapezium);
        rbTrapezium.setBounds(20, 91, 71, 28);

        buttonGroup1.add(rbTriangle);
        rbTriangle.setText("Trójkąt");
        rbTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTriangleActionPerformed(evt);
            }
        });
        jPanel1.add(rbTriangle);
        rbTriangle.setBounds(20, 131, 72, 28);

        buttonGroup1.add(rbRectangle);
        rbRectangle.setText("Prostokat");
        rbRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRectangleActionPerformed(evt);
            }
        });
        jPanel1.add(rbRectangle);
        rbRectangle.setBounds(20, 170, 90, 28);

        jLabel1.setText("cm²");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(400, 260, 30, 30);

        jLabel11.setText("cm²");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(400, 300, 30, 30);

        jLabel8.setText("b:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(137, 83, 10, 16);

        jLabel2.setText("cm²");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(400, 220, 30, 30);

        jLabel12.setText("cm");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(209, 53, 20, 16);

        jLabel13.setText("cm");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(209, 83, 20, 20);

        jLabel14.setText("cm");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(209, 143, 20, 16);

        jLabel15.setText("cm");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(209, 113, 20, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 205, 412, 10);
        jPanel1.add(labelkaIcon);
        labelkaIcon.setBounds(250, 10, 210, 180);

        jLabel6.setText("d:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(137, 143, 10, 16);

        LabelDSide.setEditable(false);
        jPanel1.add(LabelDSide);
        LabelDSide.setBounds(153, 139, 50, 24);

        jLabel16.setText("cm");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(209, 173, 20, 16);

        jLabel17.setText("Wysokość (h):");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(260, 340, 81, 16);

        labelHeight.setEditable(false);
        jPanel1.add(labelHeight);
        labelHeight.setBounds(350, 340, 48, 24);

        jLabel18.setText("cm²");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(400, 340, 30, 30);

        buttonClear.setText("Czyść");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear);
        buttonClear.setBounds(50, 370, 110, 40);
        jPanel1.add(labelkaWarning);
        labelkaWarning.setBounds(40, 220, 220, 20);

        buttonAbout.setText("O Programie");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAbout);
        buttonAbout.setBounds(640, 400, 110, 40);

        buttonAuthor.setText("O Autorze");
        buttonAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAuthor);
        buttonAuthor.setBounds(510, 400, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final String squareImagePath = "src\\img\\kwadrat2.jpg";
    private final String triangleImagePath = "src\\img\\triangle.jpg";
    private final String rectangleImagePath = "src\\img\\prostokat.jpg";
    private final String trapeziumImgagePath = "src\\img\\trapez.jpg";

    AlertsAndDescribes alert = new AlertsAndDescribes();

    private void counting() throws HeadlessException, NumberFormatException {
        if (rbSquare.isSelected()) {
            try {
                double side_a = Double.parseDouble(LabelASide.getText());

                if (side_a > 0) {
                    Square square = new Square(side_a);
                    setScreen(square);
                    labelkaWarning.setText("");

                } else {

                }
            } catch (NumberFormatException e) {
                alert.alertLetterInsteadOfNumber();
            }
        } else if (rbTrapezium.isSelected()) {
            try {
                double side_a = Double.parseDouble(LabelASide.getText());
                double side_b = Double.parseDouble(labelBSide.getText());
                double side_c = Double.parseDouble(LabelCSide.getText());
                double side_d = Double.parseDouble(LabelDSide.getText());
                double height = Double.parseDouble(LabelHSide.getText());

                if (side_a > 0 && side_b > 0 && side_c > 0 && side_d > 0 && height > 0) {
                    Trapezium trapezium = new Trapezium(side_a, side_b, side_c, side_d, height);
                    setScreen(trapezium);
                    labelkaWarning.setText("");
                } else {
                    alert.alertNegativeNumber();
                }
            } catch (NumberFormatException e) {
                alert.alertLetterInsteadOfNumber();
            }
        } else if (rbRectangle.isSelected()) {
            try {
                double side_a = Double.parseDouble(LabelASide.getText());
                double side_b = Double.parseDouble(labelBSide.getText());
                if (side_a > 0 && side_b > 0) {
                    Rectangle rectangle = new Rectangle(side_a, side_b);
                    setScreen(rectangle);
                    labelkaWarning.setText("");
                } else {
                    alert.alertNegativeNumber();

                }
            } catch (NumberFormatException e) {
                alert.alertLetterInsteadOfNumber();
            }
        } else if (rbTriangle.isSelected()) {
            try {
                double side_a = Double.parseDouble(LabelASide.getText());
                double side_b = Double.parseDouble(labelBSide.getText());
                double side_c = Double.parseDouble(LabelCSide.getText());
                if (side_a > 0 && side_b > 0 && side_c > 0) {
                    Triangle triangle = new Triangle(side_a, side_b, side_c);
                    if (triangle.triangleExists()) {
                        setScreen(triangle);
                        labelkaWarning.setText("");
                    } else {
                        alert.alertTraingleNotExists();
                    }
                } else {
                    alert.alertNegativeNumber();
                }
            } catch (NumberFormatException e) {
                alert.alertLetterInsteadOfNumber();
            }
        }
    }

    private void setIcon(String square) {
        labelkaIcon.setIcon(new javax.swing.ImageIcon(square));
    }

    private void setScreenAreaAndPerimeter(Figure figura) {
        labelField.setText(String.valueOf(figura.area()));
        labelPerimeter.setText(String.valueOf(figura.perimeter()));
    }

    private void setScreen(Square square) {

        setScreenAreaAndPerimeter(square);
        labelDiagonal.setText(String.valueOf(square.diagonal()));
    }

    private void setScreen(Trapezium trapezium) {
        setScreenAreaAndPerimeter(trapezium);
    }

    private void setScreen(Rectangle rectangle) {
        setScreenAreaAndPerimeter(rectangle);
        labelDiagonal.setText(String.valueOf(rectangle.diagonal()));
    }

    private void setScreen(Triangle triangle) {
        setScreenAreaAndPerimeter(triangle);
        labelHeight.setText(String.valueOf(triangle.diagonal()));

    }

    private void enabledFieldIfSquareIsSelected() {
        LabelASide.setEditable(true);
        labelBSide.setEditable(false);
        LabelCSide.setEditable(false);
        LabelDSide.setEditable(false);
        LabelHSide.setEditable(false);
        setIcon(squareImagePath);
    }

    private void enabledFieldIfTrapeziumIsSelected() {

        LabelASide.setEditable(true);
        labelBSide.setEditable(true);
        LabelCSide.setEditable(true);
        LabelDSide.setEditable(true);
        LabelHSide.setEditable(true);
        setIcon(trapeziumImgagePath);
    }

    private void enabledFieldsIfTriangleIsSelected() {
        LabelASide.setEditable(true);
        labelBSide.setEditable(true);
        LabelDSide.setEditable(false);
        LabelCSide.setEditable(true);
        LabelHSide.setEditable(false);
        setIcon(triangleImagePath);
    }

    private void enabledFieldsIfRectangleIsSelected() {
        LabelASide.setEditable(true);
        labelBSide.setEditable(true);
        LabelCSide.setEditable(false);
        LabelDSide.setEditable(false);
        LabelHSide.setEditable(false);
        setIcon(rectangleImagePath);
    }

    private void clearAllFields() {
        LabelASide.setText("");
        labelBSide.setText("");
        LabelCSide.setText("");
        LabelDSide.setText("");
        LabelHSide.setText("");
        labelDiagonal.setText("");
        labelHeight.setText("");
        labelField.setText("");
        labelPerimeter.setText("");
        labelkaWarning.setText("");
    }


    private void rbRectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRectangleActionPerformed
        clearAllFields();
        enabledFieldsIfRectangleIsSelected();
    }//GEN-LAST:event_rbRectangleActionPerformed


    private void rbTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTriangleActionPerformed
        clearAllFields();
        enabledFieldsIfTriangleIsSelected();
    }//GEN-LAST:event_rbTriangleActionPerformed


    private void rbTrapeziumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTrapeziumActionPerformed
        clearAllFields();
        enabledFieldIfTrapeziumIsSelected();
    }//GEN-LAST:event_rbTrapeziumActionPerformed


    private void rbSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSquareActionPerformed
        clearAllFields();
        enabledFieldIfSquareIsSelected();
    }//GEN-LAST:event_rbSquareActionPerformed


    private void labelDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelDiagonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelDiagonalActionPerformed

    private void labelPerimeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelPerimeterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelPerimeterActionPerformed

    private void labelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelFieldActionPerformed

    private void buttonCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCountActionPerformed

        counting();

    }//GEN-LAST:event_buttonCountActionPerformed


    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clearAllFields();

    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonCountKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCountKeyPressed

    private void buttonAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAuthorActionPerformed
        alert.AboutAuthor();
    }//GEN-LAST:event_buttonAuthorActionPerformed

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        alert.AboutProject();
    }//GEN-LAST:event_buttonAboutActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FigureGui().setVisible(true);
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LabelASide;
    private javax.swing.JTextField LabelCSide;
    private javax.swing.JTextField LabelDSide;
    private javax.swing.JTextField LabelHSide;
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonAuthor;
    private javax.swing.JToggleButton buttonClear;
    private javax.swing.JButton buttonCount;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField labelBSide;
    private javax.swing.JTextField labelDiagonal;
    private javax.swing.JTextField labelField;
    private javax.swing.JTextField labelHeight;
    private javax.swing.JTextField labelPerimeter;
    private javax.swing.JLabel labelkaIcon;
    private javax.swing.JLabel labelkaWarning;
    private javax.swing.JRadioButton rbRectangle;
    private javax.swing.JRadioButton rbSquare;
    private javax.swing.JRadioButton rbTrapezium;
    private javax.swing.JRadioButton rbTriangle;
    // End of variables declaration//GEN-END:variables

}
