import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener {
	
	static int stepCount = 0;
	static main frame_page1 = new main();
	
	static JPanel p1 = new JPanel();
	static JPanel p2 = new JPanel();
	static JPanel p3 = new JPanel();
	static JPanel p4 = new JPanel();
	static JPanel p5 = new JPanel();
	static JPanel p6 = new JPanel();
	
	static JButton nextBtn1 = new JButton("�U�@�B"); 
	static JButton nextBtn2 = new JButton("�U�@�B2"); 
	static JButton nextBtn3 = new JButton("�U�@�B3"); 
	static JButton nextBtn4 = new JButton("�U�@�B4"); 
	static JButton nextBtn5 = new JButton("����"); 
	
	static Checkbox ckbSOFT = new Checkbox("�n�u��");
	static Checkbox ckbELEC = new Checkbox("��q��");	
	static Checkbox ckbMEDI = new Checkbox("�Ƴв�");
	
	//�Ĥ@��
	static TextField nameTextField = new TextField("���j��");
	static TextField numberTextField = new TextField("1021234");
	
	//�ĤG��
	static Label ChineseLab1 = new Label("����(�W)");
	static Label ChineseLab2 = new Label("����(�U)");
	static Label EnglishLab1 = new Label("�j�@�^��(�W)");
	static Label EnglishLab2 = new Label("�j�@�^��(�U)");
	static Label English2Lab1 = new Label("�j�G�^��(�W)");
	static Label English2Lab2 = new Label("�j�G�^��(�U)");
	static Label HistoryLab = new Label("���v�ҵ{");
	static Label SocialLab = new Label("�������");
	static TextField ChineseTextField1 = new TextField("60");
	static TextField ChineseTextField2 = new TextField("60");
	static TextField EnglishTextField1 = new TextField("60");
	static TextField EnglishTextField2 = new TextField("60");
	static TextField English2TextField1 = new TextField("60");
	static TextField English2TextField2 = new TextField("60");
	static TextField HistoryTextField = new TextField("60");
	static TextField SocialTextField = new TextField("60");
	
	//�ĤT��
	static JComboBox selectBox1 = new JComboBox();
	static JComboBox selectBox2 = new JComboBox(); 
	static JComboBox selectBox3 = new JComboBox(); 
	static JComboBox selectBox4 = new JComboBox(); 
	static JComboBox selectBox5 = new JComboBox(); 
	static JComboBox selectBox6 = new JComboBox(); 
	static JComboBox selectBox7 = new JComboBox(); 
	static TextField GeneralCourse1 = new TextField("60");
	static TextField GeneralCourse2 = new TextField("60");
	static TextField GeneralCourse3 = new TextField("60");
	static TextField GeneralCourse4 = new TextField("60");
	static TextField GeneralCourse5 = new TextField("60");
	static TextField GeneralCourse6 = new TextField("60");
	static TextField GeneralCourse7 = new TextField("60");
	
	//���ץ���
	static Label CalculusLab1 = new Label("�L�n��(�W)");
	static Label CalculusLab2 = new Label("�L�n��(�U)");
	static Label PhysicsLab = new Label("���q���z");
	static Label BCCLab = new Label("�p�������");
	static Label CProgrammingLab = new Label("C �{���]�p");
	static TextField CalculusTextField1 = new TextField("60");
	static TextField CalculusTextField2 = new TextField("60");
	static TextField PhysicsTextField = new TextField("60");
	static TextField BCCTextField = new TextField("60");
	static TextField CProgrammingTextField = new TextField("60");
	
	static Label SoftwareLab = new Label("�n��u�{����");
	static Label DataStructureLab = new Label("��Ƶ��c");
	static Label DiscreteLab = new Label("�����ƾ�");
	static Label ElectricLab = new Label("�q�l�q����");
	static Label ElectriclabLab = new Label("�q�l�q���ǹ���");
	static Label SystemAssemblyLab = new Label("�t�ε{���P�զX�y��");
	static Label ProbabilityLab = new Label("���v�έp");
	static Label LinearAlgebraLab = new Label("�u�ʥN��");
	static Label ProgrammingLanguageLab = new Label("�{���y��");
	static Label ComputerOrganLab = new Label("�p�����´");
	static Label ComputerInternetLab = new Label("�p�������");
	static Label AlgorithmLab = new Label("�t��k");
	static Label OSLab = new Label("�@�~�t��");
	static Label FinalProgramLab = new Label("�M�D��@");
	static TextField SoftwareTextField = new TextField("60");
	static TextField DataStructureTextField = new TextField("60");
	static TextField DiscreteTextField = new TextField("60");
	static TextField ElectricTextField = new TextField("60");
	static TextField ElectriclabTextField = new TextField("60");
	static TextField SystemAssemblyTextField = new TextField("60");
	static TextField ProbabilityTextField = new TextField("60");
	static TextField LinearAlgebraTextField = new TextField("60");
	static TextField ProgrammingLanguageTextField = new TextField("60");
	static TextField ComputerOrganTextField = new TextField("60");
	static TextField ComputerInternetTextField = new TextField("60");
	static TextField AlgorithmTextField = new TextField("60");
	static TextField OSTextField = new TextField("60");
	static TextField FinalProgramTextField = new TextField("60");
	
	//���ץ���(SOFT)
	//���ץ���(ELEC)
	//���ץ���(MEDI)
	
	//�Ĥ@�B�J����
	public static void main(String args[])
	{
		CheckboxGroup ckbGrp = new CheckboxGroup();
		frame_page1.setSize(600,500);

		nextBtn1.addActionListener(frame_page1);
		
		//�էO�T��@
		ckbSOFT.setCheckboxGroup(ckbGrp);
		ckbELEC.setCheckboxGroup(ckbGrp);
		ckbMEDI.setCheckboxGroup(ckbGrp);
		//�w�]����n�u��
		ckbSOFT.setState(true);
		
		p1.add(nameTextField);
		p1.add(numberTextField);
		p1.add(ckbSOFT);
		p1.add(ckbELEC);
		p1.add(ckbMEDI);
		p1.add(nextBtn1);
		
		p1.setVisible(true);
		frame_page1.add(p1);
		frame_page1.setVisible(true);
	}
	//��¦����
	public static void firstStep(String[] args) {
		stepCount = 1;
		
		p2.setVisible(true);
		p1.setVisible(false);
		
		p2.add(ChineseLab1);
		p2.add(ChineseTextField1);
		p2.add(ChineseLab2);
		p2.add(ChineseTextField2);
		p2.add(EnglishLab1);
		p2.add(EnglishTextField1);
		p2.add(EnglishLab2);
		p2.add(EnglishTextField2);
		p2.add(English2Lab1);
		p2.add(English2TextField1);
		p2.add(English2Lab2);
		p2.add(English2TextField2);
		p2.add(HistoryLab);
		p2.add(HistoryTextField);
		p2.add(SocialLab);
		p2.add(SocialTextField);
		
		p2.add(nextBtn2);
		nextBtn2.addActionListener(frame_page1);
		frame_page1.add(p2);
		frame_page1.setVisible(true);
	}
	//�q�ѽҵ{
	public static void secondStep(String[] args) {
		stepCount = 2;
		
		p3.setVisible(true);
		p2.setVisible(false);
		
		String str[]={"���I����", "�H��Ǭ�", "���|�Ǭ�", "�۵M�Ǭ�", "����P�g����Ǭ�"} ;  
		for(int i=0; i < str.length; i++)
		{
			selectBox1.addItem(str[i]);
			selectBox2.addItem(str[i]);
			selectBox3.addItem(str[i]);
			selectBox4.addItem(str[i]);
			selectBox5.addItem(str[i]);
			selectBox6.addItem(str[i]);
			selectBox7.addItem(str[i]);
		} 
		p3.add(selectBox1);
		p3.add(GeneralCourse1);
		p3.add(selectBox2);
		p3.add(GeneralCourse2);
		p3.add(selectBox3);
		p3.add(GeneralCourse3);
		p3.add(selectBox4);
		p3.add(GeneralCourse4);
		p3.add(selectBox5);
		p3.add(GeneralCourse5);
		p3.add(selectBox6);
		p3.add(GeneralCourse6);
		p3.add(selectBox7);
		p3.add(GeneralCourse7);
		p3.add(nextBtn3);
		
		nextBtn3.addActionListener(frame_page1);
		frame_page1.add(p3);
		frame_page1.setVisible(true);
	}
	//�n�u�ե��ץ���
	public static void thirdStepSOFT(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		
		Label title = new Label("�n�u��");
		p4.add(title);
		
		p4.add(CalculusLab1);
		p4.add(CalculusTextField1);
		p4.add(CalculusLab2);
		p4.add(CalculusTextField2);
		p4.add(PhysicsLab);
		p4.add(PhysicsTextField);
		p4.add(BCCLab);
		p4.add(BCCTextField);
		p4.add(CProgrammingLab);
		p4.add(CProgrammingTextField);
		
		p4.add(SoftwareLab);
		p4.add(SoftwareTextField);
		p4.add(DataStructureLab);
		p4.add(DataStructureTextField);
		p4.add(DiscreteLab);
		p4.add(DiscreteTextField);
		p4.add(ElectricLab);
		p4.add(ElectricTextField);
		p4.add(ElectriclabLab);
		p4.add(ElectriclabTextField);
		p4.add(SystemAssemblyLab);
		p4.add(SystemAssemblyTextField);
		p4.add(ProbabilityLab);
		p4.add(ProbabilityTextField);
		p4.add(LinearAlgebraLab);
		p4.add(LinearAlgebraTextField);
		p4.add(ProgrammingLanguageLab);
		p4.add(ProgrammingLanguageTextField);
		p4.add(ComputerOrganLab);
		p4.add(ComputerOrganTextField);
		p4.add(ComputerInternetLab);
		p4.add(ComputerInternetTextField);
		p4.add(AlgorithmLab);
		p4.add(AlgorithmTextField);
		p4.add(OSLab);
		p4.add(OSTextField);
		p4.add(FinalProgramLab);
		p4.add(FinalProgramTextField);
		p4.add(nextBtn4);
		
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}
	//��q�ե��ץ���
	public static void thirdStepELEC(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		
		Label title = new Label("��q��");
		p4.add(title);
		
		p4.add(CalculusLab1);
		p4.add(CalculusTextField1);
		p4.add(CalculusLab2);
		p4.add(CalculusTextField2);
		p4.add(PhysicsLab);
		p4.add(PhysicsTextField);
		p4.add(BCCLab);
		p4.add(BCCTextField);
		p4.add(CProgrammingLab);
		p4.add(CProgrammingTextField);
		
		p4.add(nextBtn4);
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}
	//�Ƴвե��ץ���
	public static void thirdStepMEDI(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		Label title = new Label("�Ƴв�");
		p4.add(title);
		
		p4.add(CalculusLab1);
		p4.add(CalculusTextField1);
		p4.add(CalculusLab2);
		p4.add(CalculusTextField2);
		p4.add(PhysicsLab);
		p4.add(PhysicsTextField);
		p4.add(BCCLab);
		p4.add(BCCTextField);
		p4.add(CProgrammingLab);
		p4.add(CProgrammingTextField);
		
		p4.add(nextBtn4);
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}
	
	//�Ҧ���׽ҵ{
	public static void finalStep(String[] args) {
		stepCount = 4;
		
		p5.setVisible(true);
		p4.setVisible(false);
		
		p5.add(nextBtn5);
		nextBtn5.addActionListener(frame_page1);
		frame_page1.add(p5);
		frame_page1.setVisible(true);
	}
	
	//�p�⵲�G
	public static void showResult(String[] args) {
		
		p6.setVisible(true);
		p5.setVisible(false);
		
	
		frame_page1.add(p6);
		frame_page1.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(stepCount == 0)
			firstStep(null);
		else if(stepCount == 1)
			secondStep(null);
		else if(stepCount == 2 && ckbSOFT.getState() == true)
			thirdStepSOFT(null);
		else if(stepCount == 2 && ckbELEC.getState() == true)
			thirdStepELEC(null);
		else if(stepCount == 2 && ckbMEDI.getState() == true)
			thirdStepMEDI(null);
		else if(stepCount == 3)
			finalStep(null);
		else if(stepCount == 4)
			showResult(null);

	}
}
