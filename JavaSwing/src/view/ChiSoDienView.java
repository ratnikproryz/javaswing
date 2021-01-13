package view;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

public class ChiSoDienView extends JFrame{
	
	public ChiSoDienView() {
		Container conCS= getContentPane();
		setSize(500,300);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel pnCS= new JPanel();
		Border Border = BorderFactory.createLineBorder(Color.black);
		TitledBorder titledBorder = BorderFactory.createTitledBorder(Border, "Cập nhật chỉ số điện");
		pnCS.setBorder(titledBorder);
		pnCS.setLayout(new BorderLayout());
		
		
		JPanel pnCS_1 = new JPanel();
		pnCS_1.setLayout(new GridLayout(8, 2));

		JLabel lbMaKH= new JLabel("Mã Khách hàng");
		pnCS_1.add(lbMaKH);
		JTextField tfMaKH= new JTextField(10);
		pnCS_1.add(tfMaKH);
		
		JLabel lbMaHD= new JLabel("Mã Hoá đơn");
		pnCS_1.add(lbMaHD);
		JTextField tfMaHD= new JTextField(10);
		pnCS_1.add(tfMaHD);
		
		JLabel lbMaCS= new JLabel("Mã Chỉ số");
		pnCS_1.add(lbMaCS);
		JTextField tfMaCS= new JTextField(10);
		pnCS_1.add(tfMaCS);
		
		JLabel lbMonth= new JLabel("Ngày tháng");
		pnCS_1.add(lbMonth);
		JTextField tfMonth= new JTextField(10);
		pnCS_1.add(tfMonth);
		
		JLabel lbFirstIndex= new JLabel("Chỉ số đầu");
		pnCS_1.add(lbFirstIndex);
		JTextField tfFirstIndex= new JTextField(10);
		pnCS_1.add(tfFirstIndex);
		JLabel lbLastIndex= new JLabel("Chỉ số cuối");
		pnCS_1.add(lbLastIndex);
		JTextField tfLastIndex= new JTextField(10);
		pnCS_1.add(tfLastIndex);
		
		JPanel pnCS_2= new JPanel();
		JButton btInsert= new JButton("Insert");
		pnCS_2.add(btInsert);
		JButton btUpdate= new JButton("Update");
		pnCS_2.add(btUpdate);
		
		
		pnCS.add(pnCS_1,BorderLayout.CENTER);
		pnCS.add(pnCS_2, BorderLayout.SOUTH);
		add(pnCS);
	}
}
