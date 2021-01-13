package view;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;
	
public class HoaDonView extends JFrame {
	JLabel lbMaKH,lbMaKH2, lbmonth, lbTenKH, lbMaHD, lbFirstIndex, lbLastIndex, lbThue, lbTotal,lbNum; 
	JTextField tfMaKH,tfMaKH2, tfMonth, tfTenKH, tfMaHD, tfFirstIndex, tfLastIndex, tfThue, tfTotal,tfNum;
	JButton btSearch, btInHD;
	
	public HoaDonView() {
		Container conHD= getContentPane();
		setLayout(new BorderLayout());// split the containenr into 2 part
		setSize(700,500);
		setLocationRelativeTo(null);
		setVisible(true);
		
		JPanel pnHD_1 = new JPanel();// include jlable, jbutton and textfield
		
		Border Border_1 = BorderFactory.createLineBorder(Color.black);
		TitledBorder titledBorder_1 = BorderFactory.createTitledBorder(Border_1, "Nhập thông tin");
		pnHD_1.setBorder(titledBorder_1);
		pnHD_1.setLayout(new GridLayout(2, 1));
		
		JPanel pnHd_1_1 = new JPanel();
		pnHd_1_1.setLayout(new GridLayout(3, 2));
		
		lbMaKH= new JLabel("Mã khách hàng");
		pnHd_1_1.add(lbMaKH);
		tfMaKH= new JTextField(10);
		pnHd_1_1.add(tfMaKH);
		
		lbmonth= new JLabel("Ngày tháng");
		pnHd_1_1.add(lbmonth);
		tfMonth= new JTextField(10);
		pnHd_1_1.add(tfMonth);
		
		JPanel pnHD_1_2 = new JPanel();
		pnHD_1_2.setLayout(new FlowLayout());
		
		btSearch= new JButton("Search");
		pnHD_1_2.add(btSearch);
		pnHD_1.add(pnHd_1_1);
		pnHD_1.add(pnHD_1_2);
		add(pnHD_1,BorderLayout.WEST);
		
		JLabel pnHD_2= new JLabel();
		Border Border_2 = BorderFactory.createLineBorder(Color.black);
		TitledBorder titledBorder_2 = BorderFactory.createTitledBorder(Border_2, "Hoá đơn chi tiết");
		pnHD_2.setBorder(titledBorder_2);
		pnHD_2.setLayout(new GridLayout(2, 1));
		
		JLabel pnHD_2_1= new JLabel();
		pnHD_2_1.setLayout(new GridLayout(10, 2));
		
		lbMaHD= new JLabel("Mã hoá đơn");
		pnHD_2_1.add(lbMaHD);
		tfMaHD= new JTextField(10);
		pnHD_2_1.add(tfMaHD);
		
		lbMaKH2= new JLabel("Mã Khách hàng");
		pnHD_2_1.add(lbMaKH2);
		tfMaKH2= new JTextField(10);
		pnHD_2_1.add(tfMaKH2);
		lbTenKH= new JLabel("Tên Khách hàng");
		pnHD_2_1.add(lbTenKH);
		tfTenKH= new JTextField(10);
		pnHD_2_1.add(tfTenKH);
		
		lbFirstIndex= new JLabel("Chỉ số đầu");
		pnHD_2_1.add(lbFirstIndex);
		tfFirstIndex= new JTextField(10);
		pnHD_2_1.add(tfFirstIndex);
		lbLastIndex= new JLabel("Chỉ số cuối");
		pnHD_2_1.add(lbLastIndex);
		tfLastIndex= new JTextField(10);
		pnHD_2_1.add(tfLastIndex);
//		
		lbNum= new JLabel("Lượng điện tiêu thụ");
		pnHD_2_1.add(lbNum);
		tfNum= new JTextField(10);
		pnHD_2_1.add(tfNum);
		
		JLabel lbDonGia= new JLabel("Đơn giá");
		pnHD_2_1.add(lbDonGia);
		TextField tfDonGia= new TextField(10);
		pnHD_2_1.add(tfDonGia);
		
		JLabel lbTempCost= new JLabel("Thành tiền");
		pnHD_2_1.add(lbTempCost);
		TextField tfTempCost= new TextField(10);

		pnHD_2_1.add(tfTempCost);
		
		lbThue= new JLabel("Thuế GTGT");
		pnHD_2_1.add(lbThue);
		tfThue= new JTextField("10%");

		pnHD_2_1.add(tfThue);
		
		lbTotal= new JLabel("Tổng cộng");
		pnHD_2_1.add(lbTotal);
		tfTotal= new JTextField(10);

		pnHD_2_1.add(tfTotal);
		JPanel pnHD_2_2 = new JPanel();
		pnHD_2_2.setLayout(new FlowLayout());
		btInHD= new JButton("Get bill");
		pnHD_2_2.add(btInHD);
		
		pnHD_2.add(pnHD_2_1);
		pnHD_2.add(pnHD_2_2);
		add(pnHD_2, BorderLayout.CENTER);
		
		//addActionlistner
		
		btInHD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int firstNum= Integer.parseInt(tfFirstIndex.getText());
				int lastNum= Integer.parseInt(tfLastIndex.getText());
				int num= lastNum-firstNum;
				tfNum.setText(String.valueOf(num));
				float tempCost= Integer.parseInt(tfDonGia.getText())*num;
				tfTempCost.setText(String.valueOf(String.valueOf(tempCost)));
				float thue= tempCost*0.1f;
				tfThue.setText(String.valueOf(thue)+" (10%)");
				tfTotal.setText(String.valueOf(tempCost+thue));
				
			}
		});;
	}

	
		
	
	
}
