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
		f = new JFrame("서울 관광정보 서비스");
		f.setSize(1080, 570);
		f.getContentPane().setBackground(Color.getHSBColor(0.0f, 20.0f, 40.0f));
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Label lb3 = new Label("서비스 분류", Label.RIGHT);
		lb3.setBounds(27, 50, 70, 40);
		Font yellow = new Font("", Font.BOLD, 10);
		lb3.setFont(yellow);
		Checkbox cb = new Checkbox("전체", true);
		cb.setBounds(121, 50, 50, 40);
		Checkbox cb2 = new Checkbox("명소");
		cb2.setBounds(171, 50, 50, 40);
		Checkbox cb3 = new Checkbox("맛집");
		cb3.setBounds(221, 50, 50, 40);
		Checkbox cb4 = new Checkbox("쇼핑");
		cb4.setBounds(271, 50, 50, 40);
		Label lb4 = new Label("지역 분류");
		lb4.setFont(yellow);
		lb4.setBounds(34, 82, 70, 40);
		Choice ci = new Choice();
		ci.setBounds(120, 90, 80, 40);
		ci.add("지역선택");
		ci.add("서울");
		Choice ci2 = new Choice();
		ci2.setBounds(210, 90, 100, 40);
		ci2.add("시군구 선택");
		ci2.add("강남구");
		ci2.add("강동구");
		ci2.add("강북구");
		ci2.add("강서구");
		ci2.add("관악구");
		ci2.add("광진구");
		ci2.add("구로구");
		ci2.add("금천구");
		ci2.add("노원구");
		ci2.add("도봉구");
		ci2.add("동대문구");
		ci2.add("동작구");
		ci2.add("마포구");
		ci2.add("서대문구");
		ci2.add("서초구");
		ci2.add("성동구");
		ci2.add("성북구");
		ci2.add("송파구");
		ci2.add("양천구");
		ci2.add("영등포구");
		ci2.add("용산구");
		ci2.add("은평구");
		ci2.add("종로구");
		ci2.add("중구");
		ci2.add("중랑구");

		Label lb6 = new Label("", Label.LEFT);
		lb6.setBounds(118, 185, 180, 40);
		Label lb5 = new Label("검색결과", Label.RIGHT);
		lb5.setBounds(2, 230, 80, 20);
		lb5.setFont(yellow);
		Label lb = new Label("검색 ", Label.RIGHT);
		lb.setFont(yellow);
		lb.setBounds(13, 112, 50, 50);
		Label lb2 = new Label("키워드 검색 ", Label.RIGHT);
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
		btn = new JButton("검색");
		btn.setBounds(223, 124, 60, 20);
		btn2 = new JButton("검색");
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

		String header[] = { "분류" };

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
