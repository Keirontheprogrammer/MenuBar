package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Frame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMune;
    JMenu contactMune;
    JMenu helpMune;

    JMenuItem deleteFile;
    JMenuItem saveFile;
    JMenuItem exitfile;
    JMenuItem call;

    ImageIcon delete=new ImageIcon("delete.png");
    ImageIcon save=new ImageIcon("save.png");
    ImageIcon exit=new ImageIcon("exit.png");
 //   ImageIcon file=new ImageIcon("file.png");

    Frame(){

        deleteFile=new JMenuItem("Delete");
        deleteFile.setIcon(delete);
        deleteFile.addActionListener(this);
        saveFile=new JMenuItem("Save");
        saveFile.addActionListener(this);
        saveFile.setIcon(save);
        exitfile=new JMenuItem("Exit");
        exitfile.addActionListener(this);
        exitfile.setIcon(exit);

        call=new JMenuItem("Call 911");


        deleteFile.setMnemonic(KeyEvent.VK_D);
        saveFile.setMnemonic(KeyEvent.VK_S);
        exitfile.setMnemonic(KeyEvent.VK_E);

        helpMune=new JMenu("Help");
        contactMune=new JMenu("Contact");
        contactMune.add(call);

        fileMune=new JMenu("File");
//        fileMune.setIcon(file);
        fileMune.add(deleteFile);
        fileMune.add(saveFile);
        fileMune.add(exitfile);

        fileMune.setMnemonic(KeyEvent.VK_F);
        helpMune.setMnemonic(KeyEvent.VK_H);
        contactMune.setMnemonic(KeyEvent.VK_C);

        menuBar=new JMenuBar();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setJMenuBar(menuBar);
        menuBar.add(fileMune);
        menuBar.add(helpMune);
        menuBar.add(contactMune);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deleteFile){
            JOptionPane.showMessageDialog(null,"File deleted homie");
        }
        if(e.getSource()==saveFile){
            JOptionPane.showMessageDialog(null,"File saved homie");
        }
        if(e.getSource()==exitfile){
            JOptionPane.showMessageDialog(null,"You Just existed ma bowii");
            System.exit(0);
        }
    }
}
