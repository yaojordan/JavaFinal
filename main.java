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
	static JButton nextBtn2 = new JButton("�U�@�B"); 
	static JButton nextBtn3 = new JButton("�U�@�B"); 
	static JButton nextBtn4 = new JButton("�U�@�B"); 
	static JButton nextBtn5 = new JButton("����"); 
	
	static Checkbox ckbSOFT = new Checkbox("�n�u��");
	static Checkbox ckbELEC = new Checkbox("��q��");	
	static Checkbox ckbMEDI = new Checkbox("�Ƴв�");
	
	//�Ĥ@��
	static TextField nameTextField = new TextField("");
	static TextField numberTextField = new TextField("");
	
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
	
	static Label JavaLab = new Label("JAVA �{���]�p");
	static Label TechEngLab = new Label("��ޭ^��\Ū�g�@");
	static Label OOPLab = new Label("����ɦV�{���]�p");
	static Label LogicLab = new Label("�޿�]�p");
	static Label LogiclabLab = new Label("�޿�]�p����");
	static Label DatabaseLab = new Label("��Ʈw");
	static Label SoftTestLab = new Label("�n����ջP����");
	static Label FinalProgram1Lab = new Label("�M�D��s");
	static Label CompilerLab = new Label("�sĶ��");
	static TextField JavaTextField = new TextField("60");
	static TextField TechEngTextField = new TextField("60");
	static TextField OOPTextField = new TextField("60");
	static TextField LogicTextField = new TextField("60");
	static TextField LogiclabTextField = new TextField("60");
	static TextField DatabaseTextField = new TextField("60");
	static TextField SoftTestTextField = new TextField("60");
	static TextField FinalProgram1TextField = new TextField("60");
	static TextField CompilerTextField = new TextField("60");
	
	static Label OOPDLab = new Label("����ɦV���R�P�]�p");
	static Label SMLab = new Label("�n��M�׺޲z");//MEDI
	static Label WebPLab = new Label("WEB�{���]�p");//ELEC,MEDI
	static Label UXLab = new Label("�ϥΪ̸g��");//MEDI
	static Label ADSLab = new Label("�i����Ƶ��c");//ELEC,MEDI
	static Label SLCLab = new Label("�n��ͩR�g���޲z");
	static Label UILab = new Label("�H�������]�p");//ELEC,MEDI
	static Label SSLab = new Label("�n��[�c");
	static Label CCLab = new Label("���ݭp��");//ELEC,MEDI
	static TextField OOPDTextField = new TextField("0");
	static TextField SMLTextField = new TextField("0");
	static TextField WebPTextField = new TextField("0");
	static TextField UXTextField = new TextField("0");
	static TextField ADSTextField = new TextField("0");
	static TextField SLCTextField = new TextField("0");
	static TextField UITextField = new TextField("0");
	static TextField SSTextField = new TextField("0");
	static TextField CCTextField = new TextField("0");
	
	static Label ALogicLab = new Label("�i���޿�]�p");
	static Label WifiLab = new Label("�L�u�P������");//MEDI
	static Label VLSILab = new Label("VLSI�]�p�ɽ�");
	static Label EmbLab = new Label("�O�J���t�γ]�p�P��@");
	static Label SignalLab = new Label("�Ʀ�T���B�z�ɽ�");
	static TextField ALogicTextField = new TextField("0");
	static TextField WifiTextField = new TextField("0");
	static TextField VLSITextField = new TextField("0");
	static TextField EmbTextField = new TextField("0");
	static TextField SignalTextField = new TextField("0");

	
	static Label CreativeLab = new Label("�A�ȳзs");
	static Label SocialNetLab = new Label("���s����");
	static Label VideoLab = new Label("�v�����T�B�z����");
	static TextField CreativeTextField = new TextField("0");
	static TextField SocialNetTextField = new TextField("0");
	static TextField VideoTextField = new TextField("0");

	
	//���ץ���(MEDI)
	static Label DigitalCreativeLab = new Label("�Ʀ�зs�ɽ�");
	static Label CreativeTendLab = new Label("�зN�]�p�ͶջP��k");
	static Label InternetCreativeLab = new Label("���ں����зs����");
	static Label CreativeMathLab = new Label("�зN�ƾ�");
	static Label InteractionDesignLab = new Label("��T���ǻP���ʳ]�p");
	static Label DigitalMaterialLab = new Label("�Ʀ�зN����");
	static Label DigitalMediLab = new Label("�Ʀ�h�C��");
	static Label EmbeddedSystemLab = new Label("�O�J���t�ξɽ�");//���ץ���(ELEC)
	static Label ProtableDeviceLab = new Label("��ʸ˸m�t�λP����");//ELEC
	static TextField DigitalCreativeTextField = new TextField("60");
	static TextField CreativeTendTextField = new TextField("60");
	static TextField InternetCreativeTextField = new TextField("60");
	static TextField CreativeMathTextField = new TextField("60");
	static TextField InteractionDesignTextField = new TextField("60");
	static TextField DigitalMaterialTextField = new TextField("60");
	static TextField DigitalMediTextField = new TextField("60");
	static TextField EmbeddedSystemTextField = new TextField("60");
	static TextField ProtableDeviceTextField = new TextField("60");
	
	//���ץ���(ELEC)
	static Label HardwareLab = new Label("�w��y�z�y���]�p�P����");
	static TextField HardwareTextField = new TextField("60");
	static Label MicroProcessorLab = new Label("�L����t��");
	static TextField MicroProcessorTextField = new TextField("60");
	static Label MicroProcessorlabLab = new Label("�L����t�ι���");
	static TextField MicroProcessorlabTextField = new TextField("60");
	
	//�Ĥ@�B�J����
	public static void main(String args[])
	{
		CheckboxGroup ckbGrp = new CheckboxGroup();
		Label lab1 = new Label("�m�W�G");
		Label lab2 = new Label("�Ǹ��G");
		frame_page1.setSize(600,500);
		
		p1.setLayout(null);//�n�۩w�q�ƪ�, �]�����]�w������null
		
		lab1.setBounds(210, 120, 50, 20);
		nameTextField.setBounds(270,120,100,20);
		lab2.setBounds(210, 165, 50, 20);
		numberTextField.setBounds(270, 165, 100, 20);
		ckbSOFT.setBounds(270, 210, 50, 20);
		ckbELEC.setBounds(270, 240, 50, 20);
		ckbMEDI.setBounds(270, 270, 50, 20);
		nextBtn1.setBounds(475, 400, 80, 30);
		
		nextBtn1.addActionListener(frame_page1);
			
		//�էO�T��@
		ckbSOFT.setCheckboxGroup(ckbGrp);
		ckbELEC.setCheckboxGroup(ckbGrp);
		ckbMEDI.setCheckboxGroup(ckbGrp);
		//�w�]����n�u��
		ckbSOFT.setState(true);
		
		p1.add(lab1);
		p1.add(lab2);
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
		//GridLayout grid = new GridLayout(6,3);
		//p2.setLayout(grid);
		Label lab1 = new Label("��¦���׽ҵ{");
		p2.setVisible(true);
		p1.setVisible(false);
		p2.setLayout(null);
		
		lab1.setBounds(230, 30, 50, 20);
		ChineseLab1.setBounds(210, 80, 50, 20);
		ChineseTextField1.setBounds(270,80,30,20);
		ChineseLab2.setBounds(210, 110, 50, 20);
		ChineseTextField2.setBounds(270, 110, 30, 20);
		
		EnglishLab1.setBounds(210, 140, 100, 20);
		EnglishTextField1.setBounds(310, 140, 30, 20);
		EnglishLab2.setBounds(210, 170, 100, 20);
		EnglishTextField2.setBounds(310, 170, 30, 20);
		English2Lab1.setBounds(210, 200, 100, 20);
		English2TextField1.setBounds(310, 200, 30, 20);
		English2Lab2.setBounds(210, 230, 100, 20);
		English2TextField2.setBounds(310, 230, 30, 20);
		HistoryLab.setBounds(210, 260, 100, 20);
		HistoryTextField.setBounds(310, 260, 30, 20);
		SocialLab.setBounds(210, 290, 100, 20);
		SocialTextField.setBounds(310, 290, 30, 20);
		nextBtn2.setBounds(475, 400, 80, 30);
		
		p2.add(lab1);
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
		Label lab1 = new Label("�q�ѽҵ{");
		p3.setVisible(true);
		p2.setVisible(false);
		p3.setLayout(null);
		
		lab1.setBounds(230, 30, 50, 20);
		selectBox1.setBounds(210, 80, 100, 20);
		GeneralCourse1.setBounds(320, 80, 30, 20);
		selectBox2.setBounds(210, 110, 100, 20);
		GeneralCourse2.setBounds(320, 110, 30, 20);
		selectBox3.setBounds(210, 140, 100, 20);
		GeneralCourse3.setBounds(320, 140, 30, 20);
		selectBox4.setBounds(210, 170, 100, 20);
		GeneralCourse4.setBounds(320, 170, 30, 20);
		selectBox5.setBounds(210, 200, 100, 20);
		GeneralCourse5.setBounds(320, 200, 30, 20);
		selectBox6.setBounds(210, 230, 100, 20);
		GeneralCourse6.setBounds(320, 230, 30, 20);
		selectBox7.setBounds(210, 260, 100, 20);
		GeneralCourse7.setBounds(320, 260, 30, 20);
		nextBtn3.setBounds(475, 400, 80, 30);
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
		p3.add(lab1);
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
		
		p4.add(JavaLab);
		p4.add(JavaTextField);
		p4.add(TechEngLab);
		p4.add(TechEngTextField);
		p4.add(OOPLab);
		p4.add(OOPTextField);
		p4.add(LogicLab);
		p4.add(LogicTextField);
		p4.add(LogiclabLab);
		p4.add(LogiclabTextField);
		p4.add(DatabaseLab);
		p4.add(DatabaseTextField);
		p4.add(SoftTestLab);
		p4.add(SoftTestTextField);
		p4.add(CompilerLab);
		p4.add(CompilerTextField);
		p4.add(FinalProgram1Lab);
		p4.add(FinalProgram1TextField);
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
		
		p4.add(ElectricLab);
		p4.add(ElectricTextField);
		p4.add(ElectriclabLab);
		p4.add(ElectriclabTextField);
		p4.add(DataStructureLab);
		p4.add(DataStructureTextField);
		p4.add(DiscreteLab);
		p4.add(DiscreteTextField);
		p4.add(LogicLab);
		p4.add(LogicTextField);
		p4.add(LogiclabLab);
		p4.add(LogiclabTextField);
		p4.add(EmbeddedSystemLab);
		p4.add(EmbeddedSystemTextField);
		p4.add(SystemAssemblyLab);
		p4.add(SystemAssemblyTextField);
		p4.add(ProbabilityLab);
		p4.add(ProbabilityTextField);
		p4.add(LinearAlgebraLab);
		p4.add(LinearAlgebraTextField);
		p4.add(HardwareLab);
		p4.add(HardwareTextField);
		p4.add(ComputerOrganLab);
		p4.add(ComputerOrganTextField);
		p4.add(ComputerInternetLab);
		p4.add(ComputerInternetTextField);
		p4.add(AlgorithmLab);
		p4.add(AlgorithmTextField);
		p4.add(OSLab);
		p4.add(OSTextField);
		
		p4.add(JavaLab);
		p4.add(JavaTextField);
		p4.add(TechEngLab);
		p4.add(TechEngTextField);
		p4.add(ProgrammingLanguageLab);
		p4.add(ProgrammingLanguageTextField);
		p4.add(DatabaseLab);
		p4.add(DatabaseTextField);
		p4.add(MicroProcessorLab);
		p4.add(MicroProcessorTextField);
		p4.add(MicroProcessorlabLab);
		p4.add(MicroProcessorlabTextField);
		p4.add(CompilerLab);
		p4.add(CompilerTextField);
		p4.add(FinalProgram1Lab);
		p4.add(FinalProgram1TextField);
		p4.add(FinalProgramLab);
		p4.add(FinalProgramTextField);
		
		
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
		p4.add(DigitalCreativeLab);
		p4.add(DigitalCreativeTextField);
		p4.add(JavaLab);
		p4.add(JavaTextField);
		p4.add(DataStructureLab);
		p4.add(DataStructureTextField);
		p4.add(CreativeTendLab);
		p4.add(CreativeTendTextField);
		p4.add(InternetCreativeLab);
		p4.add(InternetCreativeTextField);
		p4.add(CreativeMathLab);
		p4.add(CreativeMathTextField);
		p4.add(InteractionDesignLab);
		p4.add(InteractionDesignTextField);
		p4.add(DigitalMaterialLab);
		p4.add(DigitalMaterialTextField);
		p4.add(DigitalMediLab);
		p4.add(DigitalMediTextField);
		p4.add(ComputerInternetLab);
		p4.add(ComputerInternetTextField);
		p4.add(AlgorithmLab);
		p4.add(AlgorithmTextField);
		p4.add(OSLab);
		p4.add(OSTextField);
		
		p4.add(TechEngLab);
		p4.add(TechEngTextField);
		p4.add(EmbeddedSystemLab);
		p4.add(EmbeddedSystemTextField);
		p4.add(ProtableDeviceLab);
		p4.add(ProtableDeviceTextField);
		p4.add(DatabaseLab);
		p4.add(DatabaseTextField);
		p4.add(MicroProcessorLab);
		p4.add(MicroProcessorTextField);
		p4.add(MicroProcessorlabLab);
		p4.add(MicroProcessorlabTextField);
		p4.add(FinalProgram1Lab);
		p4.add(FinalProgram1TextField);
		p4.add(FinalProgramLab);
		p4.add(FinalProgramTextField);
		
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
		
		p5.add(OOPDLab);
		p5.add(OOPDTextField);
		p5.add(SMLab);
		p5.add(SMLTextField);
		p5.add(WebPLab);
		p5.add(WebPTextField);
		p5.add(UXLab);
		p5.add(UXTextField);
		p5.add(ADSLab);
		p5.add(ADSTextField);
		p5.add(SLCLab);
		p5.add(SLCTextField);
		p5.add(UILab);
		p5.add(UITextField);
		p5.add(SSLab);
		p5.add(SSTextField);
		p5.add(CCLab);
		p5.add(CCTextField);
		
		p5.add(ProtableDeviceLab);
		p5.add(ProtableDeviceTextField);
		p5.add(ALogicLab);
		p5.add(ALogicTextField);
		p5.add(WifiLab);
		p5.add(WifiTextField);
		p5.add(VLSILab);
		p5.add(VLSITextField);
		p5.add(EmbLab);
		p5.add(EmbTextField);
		p5.add(SignalLab);
		p5.add(SignalTextField);
		
		p5.add(CreativeLab);
		p5.add(CreativeTextField);
		p5.add(SocialNetLab);
		p5.add(SocialNetTextField);
		p5.add(VideoLab);
		p5.add(VideoTextField);
		
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
