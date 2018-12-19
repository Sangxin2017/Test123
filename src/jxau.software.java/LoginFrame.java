package jxau.software.java;


import util.FontUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
	private JLabel mJTitlt,mJUsername,mJPassword;
	private JTextField mJTextUsername ;
	private JPasswordField mJTextPassword;
	private JCheckBox mJIsRemeber;
	private JButton mJbLogin,mJbcanle;
	



	public LoginFrame() {
		initUI();
	}

	private void initUI() {


		//创建面板
		JPanel[] jps = new JPanel[5];
		for(int i = 0;i<5;i++){
			jps[i] = new JPanel();
			this.add(jps[i]);
		}

		mJTitlt = new JLabel("学生信息管理系统");
		mJUsername = new JLabel("用户名：");
		mJPassword = new JLabel("密    码：");
		mJTextUsername = new JTextField(20);
		mJTextPassword = new JPasswordField(20);
		mJIsRemeber = new JCheckBox("是否记住用户名与密码");
		mJbLogin = new JButton("登录");
		mJbcanle = new JButton("取消");

		mJTitlt.setFont(FontUtil.TITLE_FONT);
		mJUsername.setFont(FontUtil.CONTENT_FONT);
		mJPassword.setFont(FontUtil.CONTENT_FONT);
		mJIsRemeber.setFont(FontUtil.CONTENT_FONT);
		mJbLogin.setFont(FontUtil.CONTENT_FONT);
		mJbcanle.setFont(FontUtil.CONTENT_FONT);


		jps[0].add(mJTitlt);
		jps[1].add(mJUsername);
		jps[1].add(mJTextUsername);
		jps[2].add(mJPassword);
		jps[2].add(mJTextPassword);
		jps[3].add(mJIsRemeber);
		jps[4].add(mJbLogin);
		jps[4].add(mJbcanle);
		// TODO Auto-generated constructor stub
		this.setSize(400, 300);
		this.setResizable(false);
		this.setTitle("登录系统");
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(5, 1,5,5));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		this.dispose();
		new StudentManagementFrame();

		mJbcanle.addActionListener(this);
		mJbLogin.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                                                                                              
		new LoginFrame();
	}

	/**
	 *
	 * @param e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//登录事件
		if(e.getSource() ==  mJbLogin){

		}else {


		}
	}
}
