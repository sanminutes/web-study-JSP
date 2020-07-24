import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MemberTest extends WindowAdapter {

	static MemberDAO dao;
	static JFrame f;
	static JTextField sc, sc2;
	static JButton btn, btn2;
	static Panel p;
	static String[][] table;
	static JScrollPane scroll;
	static DefaultTableModel model;
	static JTable tb, tb2;
	static Checkbox cb, cb2;

	public static void main(String[] args) {
		dao = new MemberDAO();
		f = new JFrame("���� �������� ����");
		f.setSize(1080, 570);
		f.getContentPane().setBackground(Color.getHSBColor(0.0f, 20.0f, 40.0f));
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Label lb3 = new Label("���� �з�", Label.RIGHT);
		lb3.setBounds(27, 50, 70, 40);
		Font yellow = new Font("", Font.BOLD, 10);
		lb3.setFont(yellow);
		Checkbox cb = new Checkbox("��ü", true);
		cb.setBounds(121, 50, 50, 40);
		Checkbox cb2 = new Checkbox("���");
		cb2.setBounds(171, 50, 50, 40);
		Checkbox cb3 = new Checkbox("����");
		cb3.setBounds(221, 50, 50, 40);
		Checkbox cb4 = new Checkbox("����");
		cb4.setBounds(271, 50, 50, 40);
		Label lb4 = new Label("���� �з�");
		lb4.setFont(yellow);
		lb4.setBounds(34, 82, 70, 40);
		Choice ci = new Choice();
		ci.setBounds(120, 90, 80, 40);
		ci.add("��������");
		ci.add("����");
		Choice ci2 = new Choice();
		ci2.setBounds(210, 90, 100, 40);
		ci2.add("�ñ��� ����");
		ci2.add("������");
		ci2.add("������");
		ci2.add("���ϱ�");
		ci2.add("������");
		ci2.add("���Ǳ�");
		ci2.add("������");
		ci2.add("���α�");
		ci2.add("��õ��");
		ci2.add("�����");
		ci2.add("������");
		ci2.add("���빮��");
		ci2.add("���۱�");
		ci2.add("������");
		ci2.add("���빮��");
		ci2.add("���ʱ�");
		ci2.add("������");
		ci2.add("���ϱ�");
		ci2.add("���ı�");
		ci2.add("��õ��");
		ci2.add("��������");
		ci2.add("��걸");
		ci2.add("����");
		ci2.add("���α�");
		ci2.add("�߱�");
		ci2.add("�߶���");

		Label lb6 = new Label("", Label.LEFT);
		lb6.setBounds(118, 185, 180, 40);
		Label lb5 = new Label("�˻����", Label.RIGHT);
		lb5.setBounds(2, 230, 80, 20);
		lb5.setFont(yellow);
		Label lb = new Label("�˻� ", Label.RIGHT);
		lb.setFont(yellow);
		lb.setBounds(13, 112, 50, 50);
		Label lb2 = new Label("Ű���� �˻� ", Label.RIGHT);
		lb2.setFont(yellow);
		lb2.setBounds(19, 150, 80, 50);
		sc = new JTextField(10);
		sc.setBounds(120, 125, 100, 20);
		sc2 = new JTextField(10);
		sc2.setBounds(120, 163, 100, 20);
		TextArea ta = new TextArea();
		ta.setBackground(Color.getHSBColor(0, 20, 40));
		ta.setBounds(35, 260, 500, 250);
		ta.setEditable(false);
		p = new Panel();
		p.setBackground(Color.white);
		p.setBounds(360, 50, 170, 170);
		btn = new JButton("�˻�");
		btn.setBounds(223, 124, 60, 20);
		btn2 = new JButton("�˻�");
		btn2.setBounds(223, 162, 60, 20);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO db = new MemberDAO();
				ArrayList<MemberVo> f_list = db.f_list(sc.getText(), ci2.getSelectedItem());
				System.out.println(f_list.size());
				table_test(f_list);
			}

		});

//	

		f.add(lb3);
		f.add(cb);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		f.add(lb4);
		f.add(ci);
		f.add(ci2);
		f.add(lb);
		f.add(sc);
		f.add(btn);
		f.add(lb2);
		f.add(sc2);
		f.add(btn2);
		f.add(lb5);
		f.add(p);
		f.add(lb6);
		f.setVisible(true);

	}

	public static void table_test(ArrayList<MemberVo> f_list) {

		String header[] = { "�з�" };

		String[][] str = new String[f_list.size()][7];
		for (int i = 0; i < f_list.size(); i++) {
			MemberVo data23 = (MemberVo) f_list.get(i);

			String ADDRESS = data23.getADDRESS();

			for (int j = 0; j < 7; j++) {
				if (j == 0) {
					str[i][j] = ADDRESS;
				}
			}
		}
		JTable jTable = new JTable(str, header);
		JScrollPane jScollPane = new JScrollPane(jTable);
		f.add(jScollPane);
		jScollPane.setBounds(35, 266, 500, 245);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

//
//			
//

//		model = new DefaultTableModel(str, header);
//		tb2 = new JTable(model);
//		scroll = new JScrollPane(tb2);
//		scroll.setBounds(35, 266, 500, 245);
//		f.add(scroll);
