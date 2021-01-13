package view;
import java.awt.*;
import java.awt.event.*;

//import javax.jws.Oneway;
import javax.swing.*;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class KhachHangView extends JFrame{
	
	JLabel lbMaKH,lbTenkH, lbNumPhone, lbCMND, lbAddress;
	JTextField tfMaKH, tfTenKH, tfNumPhone, tfCMND, tfAddress;
	JButton btInsert, btUpdate, btDelete, btFind;
	
	public KhachHangView() {
		Container conKH = getContentPane();
		setLayout(new BorderLayout());
		setSize(700,500);
		setLocationRelativeTo(null);
		setVisible(true);
		//create jpanel pnpk_1 to input information about customer
		
		JPanel pnKh_1= new JPanel();
		Border Border_1 = BorderFactory.createLineBorder(Color.black);
		TitledBorder titledBorder_1 = BorderFactory.createTitledBorder(Border_1, "Khách hàng");
		pnKh_1.setBorder(titledBorder_1);
		pnKh_1.setLayout(new BorderLayout());
		//
		JPanel pnKH_1_1= new JPanel();
		pnKH_1_1.setLayout(new GridLayout(7,2));
		lbMaKH=new JLabel("Mã Khách hàng");
		pnKH_1_1.add(lbMaKH);
		tfMaKH= new JTextField(10);
		pnKH_1_1.add(tfMaKH);
		
		lbTenkH= new JLabel("Tên Khách hàng");
		pnKH_1_1.add(lbTenkH);
		tfTenKH= new JTextField(10);
		pnKH_1_1.add(tfTenKH);
		
		lbCMND= new JLabel("CMND");
		pnKH_1_1.add(lbCMND);
		tfCMND= new JTextField(10);
		pnKH_1_1.add(tfCMND);
		
		lbAddress= new JLabel("Địa chỉ");
		pnKH_1_1.add(lbAddress);
		tfAddress= new JTextField(10);
		pnKH_1_1.add(tfAddress);
		
		lbNumPhone= new JLabel("Số điện thoại");
		pnKH_1_1.add(lbNumPhone);
		tfNumPhone= new JTextField(10);
		pnKH_1_1.add(tfNumPhone);
		
		JLabel lbNgDK= new JLabel("Ngày tháng");
		pnKH_1_1.add(lbNgDK);
		JTextField tfNgDK= new JTextField(10);
		pnKH_1_1.add(tfNgDK);
		
		JLabel pnKH_1_2 = new JLabel();
		pnKH_1_2.setLayout(new FlowLayout());
		btInsert= new JButton("Insert");
		pnKH_1_2.add(btInsert);
		btUpdate= new JButton("Update");
		pnKH_1_2.add(btUpdate);
		btDelete= new JButton("Delete");
		pnKH_1_2.add(btDelete);
		btFind= new JButton("Find");
		pnKH_1_2.add(btFind);
		
		
		pnKh_1.add(pnKH_1_1,BorderLayout.NORTH);
		pnKh_1.add(pnKH_1_2);
		add(pnKh_1,BorderLayout.WEST);
		//create jpanelpnkh_2 to show informaton about customer
		
		JPanel pnKH_2 = new JPanel();
		Border Border_2 = BorderFactory.createLineBorder(Color.black);
		TitledBorder titledBorder_2 = BorderFactory.createTitledBorder(Border_2, "Thông tin");
		pnKH_2.setBorder(titledBorder_2);
		add(pnKH_2,BorderLayout.CENTER);
		
		
		
		
		

		btInsert.addActionListener(new ActionListener() {//set action insert information in sql
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
}
	
	