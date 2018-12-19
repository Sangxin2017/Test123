package jxau.software.java;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class StudentManagementFrame extends JFrame {
    JLabel mJlTitle,mJlPageInfo;
    JTable mJtStudent;
    JScrollPane mSpane;
    JButton mJbFiristPage,mJbPageUp,mJbPageDown,mJbLastpage;
    JButton mJbAdd,mJbDel,mJbQuery,mJbUpdate;
    JTextField mJtfStudentNumber;


    public StudentManagementFrame()  {
        initUI();
    }

    private void initUI() {
        JPanel jbTitle = new JPanel();
        mJlTitle = new JLabel("学生信息列表");
        jbTitle.add(mJlTitle);
        this.add(jbTitle, BorderLayout.NORTH);

        mSpane = new JScrollPane();
        mJtStudent = new JTable();
        mSpane.setViewportView(mJtStudent);
        this.add(mSpane, BorderLayout.CENTER);


        JPanel jp =  new JPanel(new GridLayout(4,1,5,5));
        JPanel[] jps = new JPanel[4];
        for(int i=0;i<4;i++){
            jps[i]= new JPanel();
            this.add(jps[i]);
        }

        mJlPageInfo = new JLabel("共10页，当前第1页");
        jps[0].add(mJlPageInfo);

        mJbFiristPage = new JButton("首页");
        mJbPageUp     = new JButton("上一页");
        mJbPageDown   = new JButton("下一页");
        mJbLastpage   = new JButton("末页 ");
        jps[1].add(mJbFiristPage);
        jps[1].add(mJbPageUp);
        jps[1].add(mJbPageDown);
        jps[1].add(mJbLastpage);

        mJbAdd    = new JButton("添加");
        mJbDel    = new JButton("删除");
        mJbUpdate = new JButton("修改");
        jps[2].add(    mJbAdd   );
        jps[2].add(    mJbDel   );
        jps[2].add(    mJbUpdate);

        mJbQuery = new JButton("查询");
        mJtfStudentNumber = new JTextField(20);
        jps[3].add(mJbQuery);
        jps[3].add(mJtfStudentNumber);

        this.add(jp,BorderLayout.SOUTH);

        this.setTitle("学生信息管理系统");
        this.setExtendedState(MAXIMIZED_BOTH);  //设置全屏
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //响应关闭按钮
        this.setVisible(true);


    }
}
