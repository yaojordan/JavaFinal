import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	
	static JButton nextBtn1 = new JButton("下一步"); 
	static JButton nextBtn2 = new JButton("下一步"); 
	static JButton nextBtn3 = new JButton("下一步"); 
	static JButton nextBtn4 = new JButton("下一步"); 
	static JButton nextBtn5 = new JButton("完成"); 
	
	static Checkbox ckbSOFT = new Checkbox("軟工組");
	static Checkbox ckbELEC = new Checkbox("資電組");	
	static Checkbox ckbMEDI = new Checkbox("數創組");
	
	//第一頁
	static TextField nameTextField = new TextField("");
	static TextField numberTextField = new TextField("");
	
	//第二頁
	static Label ChineseLab1 = new Label("中文(上)");
	static Label ChineseLab2 = new Label("中文(下)");
	static Label EnglishLab1 = new Label("大一英文(上)");
	static Label EnglishLab2 = new Label("大一英文(下)");
	static Label English2Lab1 = new Label("大二英文(上)");
	static Label English2Lab2 = new Label("大二英文(下)");
	static Label HistoryLab = new Label("歷史課程");
	static Label SocialLab = new Label("公民文化");
	static TextField ChineseTextField1 = new TextField("60");
	static TextField ChineseTextField2 = new TextField("60");
	static TextField EnglishTextField1 = new TextField("60");
	static TextField EnglishTextField2 = new TextField("60");
	static TextField English2TextField1 = new TextField("60");
	static TextField English2TextField2 = new TextField("60");
	static TextField HistoryTextField = new TextField("60");
	static TextField SocialTextField = new TextField("60");
	
	//第三頁
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
	static boolean GeneralFinish = false;//判斷是否橫跨三領域
	
	//必修必選
	static Label CalculusLab1 = new Label("微積分(上)");
	static Label CalculusLab2 = new Label("微積分(下)");
	static Label PhysicsLab = new Label("普通物理");
	static Label BCCLab = new Label("計算機概論");
	static Label CProgrammingLab = new Label("C 程式設計");
	static TextField CalculusTextField1 = new TextField("60");
	static TextField CalculusTextField2 = new TextField("60");
	static TextField PhysicsTextField = new TextField("60");
	static TextField BCCTextField = new TextField("60");
	static TextField CProgrammingTextField = new TextField("60");
	
	static Label SoftwareLab = new Label("軟體工程概論");
	static Label DataStructureLab = new Label("資料結構");
	static Label DiscreteLab = new Label("離散數學");
	static Label ElectricLab = new Label("電子電路學");
	static Label ElectriclabLab = new Label("電子電路學實驗");
	static Label SystemAssemblyLab = new Label("系統程式組合語言");
	static Label ProbabilityLab = new Label("機率統計");
	static Label LinearAlgebraLab = new Label("線性代數");
	static Label ProgrammingLanguageLab = new Label("程式語言");
	static Label ComputerOrganLab = new Label("計算機組織");
	static Label ComputerInternetLab = new Label("計算機網路");
	static Label AlgorithmLab = new Label("演算法");
	static Label OSLab = new Label("作業系統");
	static Label FinalProgramLab = new Label("專題實作");
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
	
	static Label JavaLab = new Label("JAVA 程式設計");
	static Label TechEngLab = new Label("科技英文閱讀寫作");
	static Label OOPLab = new Label("物件導向程式設計");
	static Label LogicLab = new Label("邏輯設計");
	static Label LogiclabLab = new Label("邏輯設計實驗");
	static Label DatabaseLab = new Label("資料庫");
	static Label SoftTestLab = new Label("軟體測試與驗證");
	static Label FinalProgram1Lab = new Label("專題研究");
	static Label CompilerLab = new Label("編譯器");
	static TextField JavaTextField = new TextField("60");
	static TextField TechEngTextField = new TextField("60");
	static TextField OOPTextField = new TextField("60");
	static TextField LogicTextField = new TextField("60");
	static TextField LogiclabTextField = new TextField("60");
	static TextField DatabaseTextField = new TextField("60");
	static TextField SoftTestTextField = new TextField("60");
	static TextField FinalProgram1TextField = new TextField("60");
	static TextField CompilerTextField = new TextField("60");
	
	static Label OOPDLab = new Label("物件導向分析設計");
	static Label SMLab = new Label("軟體專案管理");//MEDI
	static Label WebPLab = new Label("WEB程式設計");//ELEC,MEDI
	static Label UXLab = new Label("使用者經驗");//MEDI
	static Label ADSLab = new Label("進階資料結構");//ELEC,MEDI
	static Label SLCLab = new Label("軟體生命週期管理");
	static Label UILab = new Label("人機介面設計");//ELEC,MEDI
	static Label SSLab = new Label("軟體架構");
	static Label CCLab = new Label("雲端計算");//ELEC,MEDI
	static TextField OOPDTextField = new TextField("0");
	static TextField SMLTextField = new TextField("0");
	static TextField WebPTextField = new TextField("0");
	static TextField UXTextField = new TextField("0");
	static TextField ADSTextField = new TextField("0");
	static TextField SLCTextField = new TextField("0");
	static TextField UITextField = new TextField("0");
	static TextField SSTextField = new TextField("0");
	static TextField CCTextField = new TextField("0");
	
	static Label ALogicLab = new Label("進階邏輯設計");
	static Label WifiLab = new Label("無線感測網路");//MEDI
	static Label VLSILab = new Label("VLSI設計導論");
	static Label EmbLab = new Label("嵌入式系統實作");
	static Label SignalLab = new Label("數位訊號處理導論");
	static TextField ALogicTextField = new TextField("0");
	static TextField WifiTextField = new TextField("0");
	static TextField VLSITextField = new TextField("0");
	static TextField EmbTextField = new TextField("0");
	static TextField SignalTextField = new TextField("0");

	
	static Label CreativeLab = new Label("服務創新");
	static Label SocialNetLab = new Label("社群網路");
	static Label VideoLab = new Label("影像視訊處理應用");
	static TextField CreativeTextField = new TextField("0");
	static TextField SocialNetTextField = new TextField("0");
	static TextField VideoTextField = new TextField("0");

	
	//必修必選(MEDI)
	static Label DigitalCreativeLab = new Label("數位創新導論");
	static Label CreativeTendLab = new Label("創意設計趨勢方法");
	static Label InternetCreativeLab = new Label("網際網路創新應用");
	static Label CreativeMathLab = new Label("創意數學");
	static Label InteractionDesignLab = new Label("資訊美學互動設計");
	static Label DigitalMaterialLab = new Label("數位創意材料");
	static Label DigitalMediLab = new Label("數位多媒體");
	static Label EmbeddedSystemLab = new Label("嵌入式系統導論");//必修必選(ELEC)
	static Label ProtableDeviceLab = new Label("行動裝置系統應用");//ELEC
	static TextField DigitalCreativeTextField = new TextField("60");
	static TextField CreativeTendTextField = new TextField("60");
	static TextField InternetCreativeTextField = new TextField("60");
	static TextField CreativeMathTextField = new TextField("60");
	static TextField InteractionDesignTextField = new TextField("60");
	static TextField DigitalMaterialTextField = new TextField("60");
	static TextField DigitalMediTextField = new TextField("60");
	static TextField EmbeddedSystemTextField = new TextField("60");
	static TextField ProtableDeviceTextField = new TextField("60");
	
	//必修必選(ELEC)
	static Label HardwareLab = new Label("硬體描述語言模擬");
	static TextField HardwareTextField = new TextField("60");
	static Label MicroProcessorLab = new Label("微算機系統");
	static TextField MicroProcessorTextField = new TextField("60");
	static Label MicroProcessorlabLab = new Label("微算機系統實驗");
	static TextField MicroProcessorlabTextField = new TextField("60");
	
	static Label name = new Label();
	static Label num = new Label();
	static Label avg = new Label();
	static Label sum = new Label();
	static Label result = new Label();
	
	static Integer point = 0;
	static double average = 0;
	static Integer averageCount = 0;//平均要除的個數
	static int gradeCounter = 0;
	
	//第一步驟頁面
	public static void main(String args[])
	{
		CheckboxGroup ckbGrp = new CheckboxGroup();
		Label title = new Label("請輸入基本資料");
		Label lab1 = new Label("姓名：");
		Label lab2 = new Label("學號：");
		frame_page1.setSize(600,500);
		
		p1.setLayout(null);//要自定義排版, 因此先設定布局為null
		
		//外觀美化
		JLabel img = new JLabel(new ImageIcon("img.png"));
		p1.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		lab1.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lab2.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		
		img.setBounds(20, 380, 310, 60);
		title.setBounds(210, 40, 180, 50);
		lab1.setBounds(210, 120, 50, 20);
		nameTextField.setBounds(270,120,100,20);
		lab2.setBounds(210, 165, 50, 20);
		numberTextField.setBounds(270, 165, 100, 20);
		ckbSOFT.setBounds(270, 210, 50, 20);
		ckbELEC.setBounds(270, 240, 50, 20);
		ckbMEDI.setBounds(270, 270, 50, 20);
		nextBtn1.setBounds(475, 400, 80, 30);
		
		nextBtn1.addActionListener(frame_page1);
			
		//組別三選一
		ckbSOFT.setCheckboxGroup(ckbGrp);
		ckbELEC.setCheckboxGroup(ckbGrp);
		ckbMEDI.setCheckboxGroup(ckbGrp);
		//預設選取軟工組
		ckbSOFT.setState(true);
		
		p1.add(img);
		p1.add(title);
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
	//基礎必修
	public static void firstStep(String[] args) {
		stepCount = 1;
		//GridLayout grid = new GridLayout(6,3);
		//p2.setLayout(grid);
		Label lab1 = new Label("基礎必修課程");
		p2.setVisible(true);
		p1.setVisible(false);
		p2.setLayout(null);
		
		p2.setBackground(Color.white);
		lab1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		ChineseLab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ChineseLab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		EnglishLab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		EnglishLab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		English2Lab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		English2Lab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		HistoryLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SocialLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		lab1.setBounds(210, 30, 180, 30);
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
	//通識課程
	public static void secondStep(String[] args) {
		stepCount = 2;
		Label lab1 = new Label("通識課程");
		p3.setVisible(true);
		p2.setVisible(false);
		p3.setLayout(null);
		
		p3.setBackground(Color.white);
		lab1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		
		lab1.setBounds(240, 30, 180, 30);
		selectBox1.setBounds(210, 80, 108, 20);
		GeneralCourse1.setBounds(330, 80, 30, 20);
		selectBox2.setBounds(210, 110, 108, 20);
		GeneralCourse2.setBounds(330, 110, 30, 20);
		selectBox3.setBounds(210, 140, 108, 20);
		GeneralCourse3.setBounds(330, 140, 30, 20);
		selectBox4.setBounds(210, 170, 108, 20);
		GeneralCourse4.setBounds(330, 170, 30, 20);
		selectBox5.setBounds(210, 200, 108, 20);
		GeneralCourse5.setBounds(330, 200, 30, 20);
		selectBox6.setBounds(210, 230, 108, 20);
		GeneralCourse6.setBounds(330, 230, 30, 20);
		selectBox7.setBounds(210, 260, 108, 20);
		GeneralCourse7.setBounds(330, 260, 30, 20);
		nextBtn3.setBounds(475, 400, 80, 30);
		String str[]={"請點選領域", "人文學科", "社會學科", "自然學科", "文明經典領域學科"} ;  
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
	//軟工組必修必選
	public static void thirdStepSOFT(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		Label title = new Label("軟工組");
		p4.setLayout(null);
		title.setBounds(240, 20, 180, 30);
		
		p4.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		CalculusLab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CalculusLab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		PhysicsLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		BCCLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CProgrammingLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SoftwareLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		JavaLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DataStructureLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DiscreteLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ElectricLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ElectriclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SystemAssemblyLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ProbabilityLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LinearAlgebraLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ProgrammingLanguageLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		TechEngLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		OOPLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogicLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogiclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ComputerOrganLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ComputerInternetLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		AlgorithmLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		OSLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DatabaseLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SoftTestLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CompilerLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgram1Lab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgramLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		
		CalculusLab1.setBounds(20, 80, 100, 20);
		CalculusTextField1.setBounds(120, 80, 30, 20);
		CalculusLab2.setBounds(20, 110, 100, 20);
		CalculusTextField2.setBounds(120, 110, 30, 20);
		PhysicsLab.setBounds(20, 140, 100, 20);
		PhysicsTextField.setBounds(120, 140, 30, 20);
		BCCLab.setBounds(20, 170, 100, 20);
		BCCTextField.setBounds(120, 170, 30, 20);
		CProgrammingLab.setBounds(20, 200, 100, 20);
		CProgrammingTextField.setBounds(120, 200, 30, 20);
		SoftwareLab.setBounds(20, 230, 100, 20);
		SoftwareTextField.setBounds(120, 230, 30, 20);
		JavaLab.setBounds(20, 260, 100, 20);
		JavaTextField.setBounds(120, 260, 30, 20);
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

		
		DataStructureLab.setBounds(200, 80, 100, 20);
		DataStructureTextField.setBounds(310, 80, 30, 20);
		DiscreteLab.setBounds(200, 110, 100, 20);
		DiscreteTextField.setBounds(310, 110, 30, 20);
		ElectricLab.setBounds(200, 140, 100, 20);
		ElectricTextField.setBounds(310, 140, 30, 20);
		ElectriclabLab.setBounds(200, 170, 100, 20);
		ElectriclabTextField.setBounds(310, 170, 30, 20);
		SystemAssemblyLab.setBounds(200, 200, 110, 20);
		SystemAssemblyTextField.setBounds(310, 200, 30, 20);
		ProbabilityLab.setBounds(200, 230, 100, 20);
		ProbabilityTextField.setBounds(310, 230, 30, 20);
		LinearAlgebraLab.setBounds(200, 260, 100, 20);
		LinearAlgebraTextField.setBounds(310, 260, 30, 20);
		ProgrammingLanguageLab.setBounds(200, 290, 100, 20);
		ProgrammingLanguageTextField.setBounds(310, 290, 30, 20);
		TechEngLab.setBounds(200, 320, 110, 20);
		TechEngTextField.setBounds(310, 320, 30, 20);
		OOPLab.setBounds(200, 350, 110, 20);
		OOPTextField.setBounds(310, 350, 30, 20);
		LogicLab.setBounds(200, 380, 100, 20);
		LogicTextField.setBounds(310, 380, 30, 20);
		LogiclabLab.setBounds(200, 410, 110, 20);
		LogiclabTextField.setBounds(310, 410, 30, 20);
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
		
		
		ComputerOrganLab.setBounds(380, 80, 100, 20);
		ComputerOrganTextField.setBounds(480, 80, 30, 20);
		ComputerInternetLab.setBounds(380, 110, 100, 20);
		ComputerInternetTextField.setBounds(480, 110, 30, 20);
		AlgorithmLab.setBounds(380, 140, 100, 20);
		AlgorithmTextField.setBounds(480, 140, 30, 20);
		OSLab.setBounds(380, 170, 100, 20);
		OSTextField.setBounds(480, 170, 30, 20);
		DatabaseLab.setBounds(380, 200, 100, 20);
		DatabaseTextField.setBounds(480, 200, 30, 20);
		SoftTestLab.setBounds(380, 230, 100, 20);
		SoftTestTextField.setBounds(480, 230, 30, 20);
		CompilerLab.setBounds(380, 260, 100, 20);
		CompilerTextField.setBounds(480, 260, 30, 20);
		FinalProgram1Lab.setBounds(380, 290, 100, 20);
		FinalProgram1TextField.setBounds(480, 290, 30, 20);
		FinalProgramLab.setBounds(380, 320, 100, 20);
		FinalProgramTextField.setBounds(480, 320, 30, 20);
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
		
		
		nextBtn4.setBounds(475, 400, 80, 30);
		p4.add(nextBtn4);
		
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}
	//資電組必修必選
	public static void thirdStepELEC(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		Label title = new Label("資電組");
		p4.setLayout(null);
		p4.add(title);
		
		title.setBounds(240, 20, 180, 30);
		p4.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		CalculusLab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CalculusLab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		PhysicsLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		BCCLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CProgrammingLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ElectricLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ElectriclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		JavaLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DataStructureLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DiscreteLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogicLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogiclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		EmbeddedSystemLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SystemAssemblyLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		HardwareLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ProbabilityLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LinearAlgebraLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ProgrammingLanguageLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		TechEngLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ComputerOrganLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ComputerInternetLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		AlgorithmLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		OSLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DatabaseLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		MicroProcessorLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		MicroProcessorlabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CompilerLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgram1Lab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgramLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		
		CalculusLab1.setBounds(20, 80, 100, 20);
		CalculusTextField1.setBounds(120, 80, 30, 20);
		CalculusLab2.setBounds(20, 110, 100, 20);
		CalculusTextField2.setBounds(120, 110, 30, 20);
		PhysicsLab.setBounds(20, 140, 100, 20);
		PhysicsTextField.setBounds(120, 140, 30, 20);
		BCCLab.setBounds(20, 170, 100, 20);
		BCCTextField.setBounds(120, 170, 30, 20);
		CProgrammingLab.setBounds(20, 200, 100, 20);
		CProgrammingTextField.setBounds(120, 200, 30, 20);
		ElectricLab.setBounds(20, 230, 100, 20);
		ElectricTextField.setBounds(120, 230, 30, 20);
		ElectriclabLab.setBounds(20, 260, 100, 20);
		ElectriclabTextField.setBounds(120, 260, 30, 20);
		JavaLab.setBounds(20, 290, 100, 20);
		JavaTextField.setBounds(120, 290, 30, 20);
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
		
		DataStructureLab.setBounds(200, 80, 100, 20);
		DataStructureTextField.setBounds(310, 80, 30, 20);
		DiscreteLab.setBounds(200, 110, 100, 20);
		DiscreteTextField.setBounds(310, 110, 30, 20);
		LogicLab.setBounds(200, 140, 100, 20);
		LogicTextField.setBounds(310, 140, 30, 20);
		LogiclabLab.setBounds(200, 170, 100, 20);
		LogiclabTextField.setBounds(310, 170, 30, 20);
		EmbeddedSystemLab.setBounds(200, 200, 100, 20);
		EmbeddedSystemTextField.setBounds(310, 200, 30, 20);
		SystemAssemblyLab.setBounds(200, 230, 110, 20);
		SystemAssemblyTextField.setBounds(310, 230, 30, 20);
		ProbabilityLab.setBounds(200, 260, 100, 20);
		ProbabilityTextField.setBounds(310, 260, 30, 20);
		LinearAlgebraLab.setBounds(200, 290, 100, 20);
		LinearAlgebraTextField.setBounds(310, 290, 30, 20);
		HardwareLab.setBounds(200, 320, 110, 20);
		HardwareTextField.setBounds(310, 320, 30, 20);
		ProgrammingLanguageLab.setBounds(200, 350, 100, 20);
		ProgrammingLanguageTextField.setBounds(310, 350, 30, 20);
		TechEngLab.setBounds(200, 380, 110, 20);
		TechEngTextField.setBounds(310, 380, 30, 20);
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

		
		ComputerOrganLab.setBounds(380, 80, 100, 20);
		ComputerOrganTextField.setBounds(480, 80, 30, 20);
		ComputerInternetLab.setBounds(380, 110, 100, 20);
		ComputerInternetTextField.setBounds(480, 110, 30, 20);
		AlgorithmLab.setBounds(380, 140, 100, 20);
		AlgorithmTextField.setBounds(480, 140, 30, 20);
		OSLab.setBounds(380, 170, 100, 20);
		OSTextField.setBounds(480, 170, 30, 20);
		DatabaseLab.setBounds(380, 200, 100, 20);
		DatabaseTextField.setBounds(480, 200, 30, 20);
		MicroProcessorLab.setBounds(380, 230, 100, 20);
		MicroProcessorTextField.setBounds(480, 230, 30, 20);
		MicroProcessorlabLab.setBounds(380, 260, 100, 20);
		MicroProcessorlabTextField.setBounds(480, 260, 30, 20);
		CompilerLab.setBounds(380, 290, 100, 20);
		CompilerTextField.setBounds(480, 290, 30, 20);
		FinalProgram1Lab.setBounds(380, 320, 100, 20);
		FinalProgram1TextField.setBounds(480, 320, 30, 20);
		FinalProgramLab.setBounds(380, 350, 100, 20);
		FinalProgramTextField.setBounds(480, 350, 30, 20);
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
		
		nextBtn4.setBounds(475, 400, 80, 30);
		p4.add(nextBtn4);
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}
	//數創組必修必選
	public static void thirdStepMEDI(String[] args) {
		stepCount = 3;
		p4.setVisible(true);
		p3.setVisible(false);
		Label title = new Label("數創組");
		p4.setLayout(null);
		p4.add(title);
		
		title.setBounds(240, 20, 180, 30);
		p4.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		CalculusLab1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CalculusLab2.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		PhysicsLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		BCCLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CProgrammingLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DigitalCreativeLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		JavaLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DataStructureLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CreativeTendLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		InternetCreativeLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogiclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CreativeMathLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		InteractionDesignLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DigitalMaterialLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DigitalMediLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogicLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		LogiclabLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		EmbeddedSystemLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		TechEngLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ComputerInternetLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		AlgorithmLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		OSLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		DatabaseLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ProtableDeviceLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgram1Lab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		FinalProgramLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		
		CalculusLab1.setBounds(20, 80, 100, 20);
		CalculusTextField1.setBounds(120, 80, 30, 20);
		CalculusLab2.setBounds(20, 110, 100, 20);
		CalculusTextField2.setBounds(120, 110, 30, 20);
		PhysicsLab.setBounds(20, 140, 100, 20);
		PhysicsTextField.setBounds(120, 140, 30, 20);
		BCCLab.setBounds(20, 170, 100, 20);
		BCCTextField.setBounds(120, 170, 30, 20);
		CProgrammingLab.setBounds(20, 200, 100, 20);
		CProgrammingTextField.setBounds(120, 200, 30, 20);
		DigitalCreativeLab.setBounds(20, 230, 100, 20);
		DigitalCreativeTextField.setBounds(120, 230, 30, 20);
		JavaLab.setBounds(20, 260, 100, 20);
		JavaTextField.setBounds(120, 260, 30, 20);
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

		
		DataStructureLab.setBounds(200, 80, 100, 20);
		DataStructureTextField.setBounds(310, 80, 30, 20);
		CreativeTendLab.setBounds(200, 110, 110, 20);
		CreativeTendTextField.setBounds(310, 110, 30, 20);
		InternetCreativeLab.setBounds(200, 140, 110, 20);
		InternetCreativeTextField.setBounds(310, 140, 30, 20);
		CreativeMathLab.setBounds(200, 170, 100, 20);
		CreativeMathTextField.setBounds(310, 170, 30, 20);
		InteractionDesignLab.setBounds(200, 200, 110, 20);
		InteractionDesignTextField.setBounds(310, 200, 30, 20);
		DigitalMaterialLab.setBounds(200, 230, 100, 20);
		DigitalMaterialTextField.setBounds(310, 230, 30, 20);
		DigitalMediLab.setBounds(200, 260, 100, 20);
		DigitalMediTextField.setBounds(310, 260, 30, 20);
		LogicLab.setBounds(200, 290, 100, 20);
		LogicTextField.setBounds(310, 290, 30, 20);
		LogiclabLab.setBounds(200, 320, 100, 20);
		LogiclabTextField.setBounds(310, 320, 30, 20);
		EmbeddedSystemLab.setBounds(200, 350, 100, 20);
		EmbeddedSystemTextField.setBounds(310, 350, 30, 20);
		TechEngLab.setBounds(200, 380, 110, 20);
		TechEngTextField.setBounds(310, 380, 30, 20);
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


		ComputerInternetLab.setBounds(380, 80, 110, 20);
		ComputerInternetTextField.setBounds(490, 80, 30, 20);
		AlgorithmLab.setBounds(380, 110, 110, 20);
		AlgorithmTextField.setBounds(490, 110, 30, 20);
		OSLab.setBounds(380, 140, 110, 20);
		OSTextField.setBounds(490, 140, 30, 20);
		ProtableDeviceLab.setBounds(380, 170, 110, 20);
		ProtableDeviceTextField.setBounds(490, 170, 30, 20);
		DatabaseLab.setBounds(380, 200, 110, 20);
		DatabaseTextField.setBounds(490, 200, 30, 20);
		FinalProgram1Lab.setBounds(380, 230, 110, 20);
		FinalProgram1TextField.setBounds(490, 230, 30, 20);
		FinalProgramLab.setBounds(380, 260, 110, 20);
		FinalProgramTextField.setBounds(490, 260, 30, 20);
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
		p4.add(LogicLab);
		p4.add(LogicTextField);
		p4.add(LogiclabLab);
		p4.add(LogiclabTextField);
		p4.add(FinalProgram1Lab);
		p4.add(FinalProgram1TextField);
		p4.add(FinalProgramLab);
		p4.add(FinalProgramTextField);

		nextBtn4.setBounds(475, 400, 80, 30);
		p4.add(nextBtn4);
		nextBtn4.addActionListener(frame_page1);
		frame_page1.add(p4);
		frame_page1.setVisible(true);
	}

	//所有選修課程
	public static void finalStep(String[] args) {
		stepCount = 4;
		p5.setVisible(true);
		p4.setVisible(false);
		
		Label title = new Label("選修課程");
		p5.setLayout(null);
		
		title.setBounds(240, 20, 180, 30);
		p5.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		OOPDLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SMLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		WebPLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		UXLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ADSLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SLCLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		UILab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SSLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CCLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		ALogicLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		WifiLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		VLSILab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		EmbLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SignalLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		CreativeLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		SocialNetLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		VideoLab.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
		
		OOPDLab.setBounds(20, 80, 110, 20);
		OOPDTextField.setBounds(130, 80, 30, 20);
		SMLab.setBounds(20, 110, 100, 20);
		SMLTextField.setBounds(130, 110, 30, 20);
		WebPLab.setBounds(20, 140, 100, 20);
		WebPTextField.setBounds(130, 140, 30, 20);
		UXLab.setBounds(20, 170, 100, 20);
		UXTextField.setBounds(130, 170, 30, 20);
		ADSLab.setBounds(20, 200, 100, 20);
		ADSTextField.setBounds(130, 200, 30, 20);
		SLCLab.setBounds(20, 230, 110, 20);
		SLCTextField.setBounds(130, 230, 30, 20);
		UILab.setBounds(20, 260, 100, 20);
		UITextField.setBounds(130, 260, 30, 20);
		SSLab.setBounds(20, 290, 100, 20);
		SSTextField.setBounds(130, 290, 30, 20);
		CCLab.setBounds(20, 320, 100, 20);
		CCTextField.setBounds(130, 320, 30, 20);
		//ProtableDeviceLab.setBounds(20, 350, 100, 20);
		//ProtableDeviceTextField.setBounds(120, 350, 30, 20);
		ALogicLab.setBounds(20, 350, 100, 20);
		ALogicTextField.setBounds(130, 350, 30, 20);
		WifiLab.setBounds(20, 380, 100, 20);
		WifiTextField.setBounds(130, 380, 30, 20);
		p5.add(title);
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
		//p5.add(ProtableDeviceLab);
		//p5.add(ProtableDeviceTextField);
		p5.add(ALogicLab);
		p5.add(ALogicTextField);
		p5.add(WifiLab);
		p5.add(WifiTextField);
		
		VLSILab.setBounds(200, 80, 100, 20);
		VLSITextField.setBounds(310, 80, 30, 20);
		EmbLab.setBounds(200, 110, 100, 20);
		EmbTextField.setBounds(310, 110, 30, 20);
		SignalLab.setBounds(200, 140, 110, 20);
		SignalTextField.setBounds(310, 140, 30, 20);
		CreativeLab.setBounds(200, 170, 100, 20);
		CreativeTextField.setBounds(310, 170, 30, 20);
		SocialNetLab.setBounds(200, 200, 100, 20);
		SocialNetTextField.setBounds(310, 200, 30, 20);
		VideoLab.setBounds(200, 230, 110, 20);
		VideoTextField.setBounds(310, 230, 30, 20);
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

		
		nextBtn5.setBounds(475, 400, 80, 30);
		p5.add(nextBtn5);
		nextBtn5.addActionListener(frame_page1);
		frame_page1.add(p5);
		frame_page1.setVisible(true);
	}
	
	public static void CalculatefirstStep(String[] args) {
		//計算區塊
				Integer Chinese1 =  Integer.parseInt(ChineseTextField1.getText());
				Integer Chinese2 =  Integer.parseInt(ChineseTextField2.getText());
				Integer English1 =  Integer.parseInt(EnglishTextField1.getText());
				Integer English2 =  Integer.parseInt(EnglishTextField2.getText());
				Integer English21 =  Integer.parseInt(English2TextField1.getText());
				Integer English22 =  Integer.parseInt(English2TextField2.getText());
				Integer History =  Integer.parseInt(HistoryTextField.getText());
				Integer Social =  Integer.parseInt(SocialTextField.getText());
				
				if(Chinese1 >= 60)
					point += 2;
				if(Chinese2 >= 60)
					point += 2;
				if(English1 >= 60)
					point += 2;
				if(English2 >= 60)
					point += 2;
				if(English21 >= 60)
					point += 1;
				if(English22 >= 60)
					point += 1;
				if(History >= 60)
					point += 2;
				if(Social >= 60)
					point += 2;
				
				if(Chinese1 != 0)
					averageCount += 1;
				if(Chinese2 != 0)
					averageCount += 1;
				if(English1 != 0)
					averageCount += 1;
				if(English2 != 0)
					averageCount += 1;
				if(English21 != 0)
					averageCount += 1;
				if(English22 != 0)
					averageCount += 1;
				if(History != 0)
					averageCount += 1;
				if(Social != 0)
					averageCount += 1;
				
				gradeCounter = Chinese1 + Chinese2 + English1 + English2 + English21 + English22 + History + Social;
	}
	public static void CalculatesecondStep(String[] args) {
		//計算區塊
				Integer Course1 =  Integer.parseInt(GeneralCourse1.getText());
				Integer Course2 =  Integer.parseInt(GeneralCourse2.getText());
				Integer Course3 =  Integer.parseInt(GeneralCourse3.getText());
				Integer Course4 =  Integer.parseInt(GeneralCourse4.getText());
				Integer Course5 =  Integer.parseInt(GeneralCourse5.getText());
				Integer Course6 =  Integer.parseInt(GeneralCourse6.getText());
				Integer Course7 =  Integer.parseInt(GeneralCourse7.getText());
				if(Course1 >= 60)
					point += 2;
				if(Course2 >= 60)
					point += 2;
				if(Course3 >= 60)
					point += 2;
				if(Course4 >= 60)
					point += 2;
				if(Course5 >= 60)
					point += 2;
				if(Course6 >= 60)
					point += 2;
				if(Course7 >= 60)
					point += 2;

				
				if(Course1 != 0)
					averageCount += 1;
				if(Course2 != 0)
					averageCount += 1;
				if(Course3 != 0)
					averageCount += 1;
				if(Course4 != 0)
					averageCount += 1;
				if(Course5 != 0)
					averageCount += 1;
				if(Course6 != 0)
					averageCount += 1;
				if(Course7 != 0)
					averageCount += 1;

				gradeCounter += Course1 + Course2 + Course3 + Course4 + Course5 + Course6 + Course7;
				//
	}
	public static void CalculateSOFT(String[] args) {
		//計算區塊1
		Integer Calculus1 =  Integer.parseInt(CalculusTextField1.getText());
		Integer Calculus2 =  Integer.parseInt(CalculusTextField2.getText());
		Integer Physics =  Integer.parseInt(PhysicsTextField.getText());
		Integer BCC =  Integer.parseInt(BCCTextField.getText());
		Integer CProgramming =  Integer.parseInt(CProgrammingTextField.getText());
		Integer Software =  Integer.parseInt(SoftwareTextField.getText());
		if(Calculus1 >= 60)
			point += 3;
		if(Calculus2 >= 60)
			point += 3;
		if(Physics >= 60)
			point += 3;
		if(BCC >= 60)
			point += 3;
		if(CProgramming >= 60)
			point += 3;
		if(Software >= 60)
			point += 3;
		

		if(Calculus1 != 0)
			averageCount += 1;
		if(Calculus2 != 0)
			averageCount += 1;
		if(Physics != 0)
			averageCount += 1;
		if(BCC != 0)
			averageCount += 1;
		if(CProgramming != 0)
			averageCount += 1;
		if(Software != 0)
			averageCount += 1;
		
		gradeCounter += Calculus1 + Calculus2 + Physics + BCC + CProgramming + Software;

		//計算區塊2
		Integer DataStructure =  Integer.parseInt(DataStructureTextField.getText());
		Integer Discrete =  Integer.parseInt(DiscreteTextField.getText());
		Integer Electric =  Integer.parseInt(ElectricTextField.getText());
		Integer Electriclab =  Integer.parseInt(ElectriclabTextField.getText());
		Integer SystemAssembly =  Integer.parseInt(SystemAssemblyTextField.getText());
		Integer Probability =  Integer.parseInt(ProbabilityTextField.getText());
		Integer LinearAlgebra =  Integer.parseInt(LinearAlgebraTextField.getText());
		Integer ProgrammingLanguage =  Integer.parseInt(ProgrammingLanguageTextField.getText());
		if(DataStructure >= 60)
			point += 3;
		if(Discrete >= 60)
			point += 3;
		if(Electric >= 60)
			point += 3;
		if(Electriclab >= 60)
			point += 1;
		if(SystemAssembly >= 60)
			point += 3;
		if(Probability >= 60)
			point += 3;
		if(LinearAlgebra >= 60)
			point += 3;
		if(ProgrammingLanguage >= 60)
			point += 3;
		
		
		if(DataStructure != 0)
			averageCount += 1;
		if(Discrete != 0)
			averageCount += 1;
		if(Electric != 0)
			averageCount += 1;
		if(Electriclab != 0)
			averageCount += 1;
		if(SystemAssembly != 0)
			averageCount += 1;
		if(Probability != 0)
			averageCount += 1;
		if(LinearAlgebra != 0)
			averageCount += 1;
		if(ProgrammingLanguage != 0)
			averageCount += 1;
					
		gradeCounter += DataStructure + Discrete + Electric + Electriclab + SystemAssembly + Probability + LinearAlgebra + ProgrammingLanguage;
		//計算區塊3
		Integer ComputerOrgan =  Integer.parseInt(ComputerOrganTextField.getText());
		Integer ComputerInternet =  Integer.parseInt(ComputerInternetTextField.getText());
		Integer Algorithm =  Integer.parseInt(AlgorithmTextField.getText());
		Integer OS =  Integer.parseInt(OSTextField.getText());
		if(ComputerOrgan >= 60)
			point += 3;
		if(ComputerInternet >= 60)
			point += 3;
		if(Algorithm >= 60)
			point += 3;
		if(OS >= 60)
			point += 3;
		
		
		if(ComputerOrgan != 0)
			averageCount += 1;
		if(ComputerInternet != 0)
			averageCount += 1;
		if(Algorithm != 0)
			averageCount += 1;
		if(OS != 0)
			averageCount += 1;

				
		gradeCounter += ComputerOrgan + ComputerInternet + Algorithm + OS;
		//計算區塊4
		Integer Java =  Integer.parseInt(JavaTextField.getText());
		Integer TechEng =  Integer.parseInt(TechEngTextField.getText());
		Integer OOP =  Integer.parseInt(OOPTextField.getText());
		Integer Logic =  Integer.parseInt(LogicTextField.getText());
		Integer Logiclab =  Integer.parseInt(LogiclabTextField.getText());
		Integer Database =  Integer.parseInt(DatabaseTextField.getText());
		Integer SoftTest =  Integer.parseInt(SoftTestTextField.getText());
		Integer Compiler =  Integer.parseInt(CompilerTextField.getText());
		Integer FinalProgram1 =  Integer.parseInt(FinalProgram1TextField.getText());
		Integer FinalProgram =  Integer.parseInt(FinalProgramTextField.getText());
		if(Java >= 60)
			point += 3;
		if(TechEng >= 60)
			point += 2;
		if(OOP >= 60)
			point += 3;
		if(Logic >= 60)
			point += 3;
		if(Logiclab >= 60)
			point += 1;
		if(Database >= 60)
			point += 3;
		if(SoftTest >= 60)
			point += 3;
		if(Compiler >= 60)
			point += 3;
		if(FinalProgram1 >= 60)
			point += 2;
		if(FinalProgram >= 60)
			point += 2;
		
		if(Java != 0)
			averageCount += 1;
		if(TechEng != 0)
			averageCount += 1;
		if(OOP != 0)
			averageCount += 1;
		if(Logic != 0)
			averageCount += 1;
		if(Logiclab != 0)
			averageCount += 1;
		if(Database != 0)
			averageCount += 1;
		if(SoftTest != 0)
			averageCount += 1;
		if(Compiler != 0)
			averageCount += 1;
		if(FinalProgram1 != 0)
			averageCount += 1;
		if(FinalProgram != 0)
			averageCount += 1;
	
		gradeCounter += Java + TechEng + OOP + Logic + Logiclab + Database + SoftTest + Compiler + FinalProgram1 + FinalProgram;
		//
	}
	public static void CalculateELEC(String[] args) {
		//計算區塊1
		Integer Calculus1 =  Integer.parseInt(CalculusTextField1.getText());
		Integer Calculus2 =  Integer.parseInt(CalculusTextField2.getText());
		Integer Physics =  Integer.parseInt(PhysicsTextField.getText());
		Integer BCC =  Integer.parseInt(BCCTextField.getText());
		Integer CProgramming =  Integer.parseInt(CProgrammingTextField.getText());
		Integer Electric =  Integer.parseInt(ElectricTextField.getText());
		Integer Electriclab =  Integer.parseInt(ElectriclabTextField.getText());
		if(Calculus1 >= 60)
			point += 3;
		if(Calculus2 >= 60)
			point += 3;
		if(Physics >= 60)
			point += 3;
		if(BCC >= 60)
			point += 3;
		if(CProgramming >= 60)
			point += 3;
		if(Electric >= 60)
			point += 3;
		if(Electriclab >= 60)
			point += 1;
		
		if(Calculus1 != 0)
			averageCount += 1;
		if(Calculus2 != 0)
			averageCount += 1;
		if(Physics != 0)
			averageCount += 1;
		if(BCC != 0)
			averageCount += 1;
		if(CProgramming != 0)
			averageCount += 1;
		if(Electric != 0)
			averageCount += 1;
		if(Electriclab != 0)
			averageCount += 1;
				
		gradeCounter += Calculus1 + Calculus2 + Physics + BCC + CProgramming + Electric + Electriclab;
		//計算區塊2
		Integer DataStructure =  Integer.parseInt(DataStructureTextField.getText());
		Integer Discrete =  Integer.parseInt(DiscreteTextField.getText());
		Integer Logic =  Integer.parseInt(LogicTextField.getText());
		Integer Logiclab =  Integer.parseInt(LogiclabTextField.getText());
		Integer EmbeddedSystem =  Integer.parseInt(EmbeddedSystemTextField.getText());
		Integer SystemAssembly =  Integer.parseInt(SystemAssemblyTextField.getText());
		Integer Probability =  Integer.parseInt(ProbabilityTextField.getText());
		Integer LinearAlgebra =  Integer.parseInt(LinearAlgebraTextField.getText());
		Integer Hardware =  Integer.parseInt(HardwareTextField.getText());
		if(DataStructure >= 60)
			point += 3;
		if(Discrete >= 60)
			point += 3;
		if(Logic >= 60)
			point += 3;
		if(Logiclab >= 60)
			point += 1;
		if(EmbeddedSystem >= 60)
			point += 3;
		if(SystemAssembly >= 60)
			point += 3;
		if(Probability >= 60)
			point += 3;
		if(LinearAlgebra >= 60)
			point += 3;
		if(Hardware >= 60)
			point += 3;
					
		if(DataStructure != 0)
			averageCount += 1;
		if(Discrete != 0)
			averageCount += 1;
		if(Logic != 0)
			averageCount += 1;
		if(Logiclab != 0)
			averageCount += 1;
		if(EmbeddedSystem != 0)
			averageCount += 1;
		if(SystemAssembly != 0)
			averageCount += 1;
		if(Probability != 0)
			averageCount += 1;
		if(LinearAlgebra != 0)
			averageCount += 1;
		if(Hardware != 0)
			averageCount += 1;

		
		gradeCounter += DataStructure + Discrete + Logic + Logiclab + EmbeddedSystem + SystemAssembly + Probability + LinearAlgebra + Hardware;
		//計算區塊3
		Integer ComputerOrgan =  Integer.parseInt(ComputerOrganTextField.getText());
		Integer ComputerInternet =  Integer.parseInt(ComputerInternetTextField.getText());
		Integer Algorithm =  Integer.parseInt(AlgorithmTextField.getText());
		Integer OS =  Integer.parseInt(OSTextField.getText());
		if(ComputerOrgan >= 60)
			point += 3;
		if(ComputerInternet >= 60)
			point += 3;
		if(Algorithm >= 60)
			point += 3;
		if(OS >= 60)
			point += 3;
		
		if(ComputerOrgan != 0)
			averageCount += 1;
		if(ComputerInternet != 0)
			averageCount += 1;
		if(Algorithm != 0)
			averageCount += 1;
		if(OS != 0)
			averageCount += 1;
		
				
		gradeCounter += ComputerOrgan + ComputerInternet + Algorithm + OS;
		
		//計算區塊4
		Integer Java =  Integer.parseInt(JavaTextField.getText());
		Integer TechEng =  Integer.parseInt(TechEngTextField.getText());
		Integer ProgrammingLanguage =  Integer.parseInt(ProgrammingLanguageTextField.getText());
		Integer Database =  Integer.parseInt(DatabaseTextField.getText());
		Integer MicroProcessor =  Integer.parseInt(MicroProcessorTextField.getText());
		Integer MicroProcessorlab =  Integer.parseInt(MicroProcessorlabTextField.getText());
		Integer Compiler =  Integer.parseInt(CompilerTextField.getText());
		Integer FinalProgram1 =  Integer.parseInt(FinalProgram1TextField.getText());
		Integer FinalProgram =  Integer.parseInt(FinalProgramTextField.getText());
		if(Java >= 60)
			point += 3;
		if(TechEng >= 60)
			point += 2;
		if(ProgrammingLanguage >= 60)
			point += 3;
		if(MicroProcessor >= 60)
			point += 3;
		if(MicroProcessorlab >= 60)
			point += 1;
		if(Database >= 60)
			point += 3;
		if(Compiler >= 60)
			point += 3;
		if(FinalProgram1 >= 60)
			point += 2;
		if(FinalProgram >= 60)
			point += 2;
		
		if(Java != 0)
			averageCount += 1;
		if(TechEng != 0)
			averageCount += 1;
		if(ProgrammingLanguage != 0)
			averageCount += 1;
		if(MicroProcessor != 0)
			averageCount += 1;
		if(MicroProcessorlab != 0)
			averageCount += 1;
		if(Database != 0)
			averageCount += 1;
		if(Compiler != 0)
			averageCount += 1;
		if(FinalProgram1 != 0)
			averageCount += 1;
		if(FinalProgram != 0)
			averageCount += 1;

		
		gradeCounter += Java + TechEng + ProgrammingLanguage + MicroProcessor + MicroProcessorlab + Database + Compiler + FinalProgram1 + FinalProgram;
		//
	}
	public static void CalculateMEDI(String[] args) {
		//計算區塊1
		Integer Calculus1 =  Integer.parseInt(CalculusTextField1.getText());
		Integer Calculus2 =  Integer.parseInt(CalculusTextField2.getText());
		Integer Physics =  Integer.parseInt(PhysicsTextField.getText());
		Integer BCC =  Integer.parseInt(BCCTextField.getText());
		Integer CProgramming =  Integer.parseInt(CProgrammingTextField.getText());
		Integer DigitalCreative =  Integer.parseInt(DigitalCreativeTextField.getText());
		Integer Java =  Integer.parseInt(JavaTextField.getText());
		if(Calculus1 >= 60)
			point += 3;
		if(Calculus2 >= 60)
			point += 3;
		if(Physics >= 60)
			point += 3;
		if(BCC >= 60)
			point += 3;
		if(CProgramming >= 60)
			point += 3;
		if(DigitalCreative >= 60)
			point += 3;
		if(Java >= 60)
			point += 3;
		
		if(Calculus1 != 0)
			averageCount += 1;
		if(Calculus2 != 0)
			averageCount += 1;
		if(Physics != 0)
			averageCount += 1;
		if(BCC != 0)
			averageCount += 1;
		if(CProgramming != 0)
			averageCount += 1;
		if(DigitalCreative != 0)
			averageCount += 1;
		if(Java != 0)
			averageCount += 1;
				
		gradeCounter += Calculus1 + Calculus2 + Physics + BCC + CProgramming + DigitalCreative + Java;
		//計算區塊2
		Integer DataStructure =  Integer.parseInt(DataStructureTextField.getText());
		Integer CreativeTend =  Integer.parseInt(CreativeTendTextField.getText());
		Integer InternetCreative =  Integer.parseInt(InternetCreativeTextField.getText());
		Integer CreativeMath =  Integer.parseInt(CreativeMathTextField.getText());
		Integer InteractionDesign =  Integer.parseInt(InteractionDesignTextField.getText());
		Integer DigitalMaterial =  Integer.parseInt(DigitalMaterialTextField.getText());
		Integer DigitalMedi =  Integer.parseInt(DigitalMediTextField.getText());
		if(DataStructure >= 60)
			point += 3;
		if(CreativeTend >= 60)
			point += 3;
		if(InternetCreative >= 60)
			point += 3;
		if(CreativeMath >= 60)
			point += 3;
		if(InteractionDesign >= 60)
			point += 3;
		if(DigitalMaterial >= 60)
			point += 3;
		if(DigitalMedi >= 60)
			point += 3;

		if(DataStructure != 0)
			averageCount += 1;
		if(CreativeTend != 0)
			averageCount += 1;
		if(InternetCreative != 0)
			averageCount += 1;
		if(CreativeMath != 0)
			averageCount += 1;
		if(InteractionDesign != 0)
			averageCount += 1;
		if(DigitalMaterial != 0)
			averageCount += 1;
		if(DigitalMedi != 0)
			averageCount += 1;

					
		gradeCounter += DataStructure + CreativeTend + InternetCreative + CreativeMath + InteractionDesign + DigitalMaterial + DigitalMedi;
		//計算區塊3
		Integer ComputerInternet =  Integer.parseInt(ComputerInternetTextField.getText());
		Integer Algorithm =  Integer.parseInt(AlgorithmTextField.getText());
		Integer OS =  Integer.parseInt(OSTextField.getText());
		if(ComputerInternet >= 60)
			point += 3;
		if(Algorithm >= 60)
			point += 3;
		if(OS >= 60)
			point += 3;
		
		if(ComputerInternet != 0)
			averageCount += 1;
		if(Algorithm != 0)
			averageCount += 1;
		if(OS != 0)
			averageCount += 1;
						
		gradeCounter += ComputerInternet + Algorithm + OS;
		
		//計算區塊4
		Integer TechEng =  Integer.parseInt(TechEngTextField.getText());
		Integer EmbeddedSystem =  Integer.parseInt(EmbeddedSystemTextField.getText());
		Integer ProtableDevice =  Integer.parseInt(ProtableDeviceTextField.getText());
		Integer Database =  Integer.parseInt(DatabaseTextField.getText());
		Integer Logic =  Integer.parseInt(LogicTextField.getText());
		Integer Logiclab =  Integer.parseInt(LogiclabTextField.getText());
		Integer FinalProgram1 =  Integer.parseInt(FinalProgram1TextField.getText());
		Integer FinalProgram =  Integer.parseInt(FinalProgramTextField.getText());
		if(TechEng >= 60)
			point += 2;
		if(EmbeddedSystem >= 60)
			point += 3;
		if(ProtableDevice >= 60)
			point += 3;
		if(Database >= 60)
			point += 3;
		if(Logic >= 60)
			point += 3;
		if(Logiclab >= 60)
			point += 1;
		if(FinalProgram1 >= 60)
			point += 2;
		if(FinalProgram >= 60)
			point += 2;
		
		if(TechEng != 0)
			averageCount += 1;
		if(EmbeddedSystem != 0)
			averageCount += 1;
		if(ProtableDevice != 0)
			averageCount += 1;
		if(Database != 0)
			averageCount += 1;
		if(Logic != 0)
			averageCount += 1;
		if(Logiclab != 0)
			averageCount += 1;
		if(FinalProgram1 != 0)
			averageCount += 1;
		if(FinalProgram != 0)
			averageCount += 1;
		
		gradeCounter += TechEng + EmbeddedSystem + ProtableDevice + Database + Logic + Logiclab + FinalProgram1 + FinalProgram;
		//
	}
	public static void CalculatefinalStep(String[] args) {
		//計算區塊1
		Integer OOPD =  Integer.parseInt(OOPDTextField.getText());
		Integer SM =  Integer.parseInt(SMLTextField.getText());
		Integer Web =  Integer.parseInt(WebPTextField.getText());
		Integer UX =  Integer.parseInt(UXTextField.getText());
		Integer ADS =  Integer.parseInt(ADSTextField.getText());
		Integer SLC =  Integer.parseInt(SLCTextField.getText());
		Integer UI =  Integer.parseInt(UITextField.getText());
		Integer SS =  Integer.parseInt(SSTextField.getText());
		Integer CC =  Integer.parseInt(CCTextField.getText());
		Integer ALogic =  Integer.parseInt(ALogicTextField.getText());
		Integer Wifi =  Integer.parseInt(WifiTextField.getText());
		if(OOPD >= 60)
			point += 3;
		if(SM >= 60)
			point += 3;
		if(Web >= 60)
			point += 3;
		if(UX >= 60)
			point += 3;
		if(ADS >= 60)
			point += 3;
		if(SLC >= 60)
			point += 3;
		if(UI >= 60)
			point += 3;
		if(SS >= 60)
			point += 3;
		if(CC >= 60)
			point += 3;
		if(ALogic >= 60)
			point += 3;
		if(Wifi >= 60)
			point += 3;
		
		//有分數的才算進成績
		if(OOPD != 0){
			averageCount += 1;
			gradeCounter += OOPD;}
		if(SM != 0){
			averageCount += 1;
			gradeCounter += SM;}
		if(Web != 0){
			averageCount += 1;
			gradeCounter += Web;}
		if(UX != 0){
			averageCount += 1;
			gradeCounter += UX;}
		if(ADS != 0){
			averageCount += 1;
			gradeCounter += ADS;}
		if(SLC != 0){
			averageCount += 1;
			gradeCounter += SLC;}
		if(UI != 0){
			averageCount += 1;
			gradeCounter += UI;}
		if(SS != 0){
			averageCount += 1;
			gradeCounter += SS;}
		if(CC != 0){
			averageCount += 1;
			gradeCounter += CC;}
		if(ALogic != 0){
			averageCount += 1;
			gradeCounter += ALogic;}
		if(Wifi != 0){
			averageCount += 1;
			gradeCounter += Wifi;}
		
		//計算區塊2
		Integer VLSI =  Integer.parseInt(VLSITextField.getText());
		Integer Emb =  Integer.parseInt(EmbTextField.getText());
		Integer Signal =  Integer.parseInt(SignalTextField.getText());
		Integer Creative =  Integer.parseInt(CreativeTextField.getText());
		Integer Social =  Integer.parseInt(SocialNetTextField.getText());
		Integer Video =  Integer.parseInt(VideoTextField.getText());
		if(VLSI >= 60)
			point += 3;
		if(Emb >= 60)
			point += 3;
		if(Signal >= 60)
			point += 3;
		if(Creative >= 60)
			point += 3;
		if(Social >= 60)
			point += 3;
		if(Video >= 60)
			point += 3;
		//有分數的才算進成績
		if(VLSI != 0){
			averageCount += 1;
			gradeCounter += VLSI;}
		if(Emb != 0){
			averageCount += 1;
			gradeCounter += Emb;}
		if(Signal != 0){
			averageCount += 1;
			gradeCounter += Signal;}
		if(Creative != 0){
			averageCount += 1;
			gradeCounter += Creative;}
		if(Social != 0){
			averageCount += 1;
			gradeCounter += Social;}
		if(Video != 0){
			averageCount += 1;
			gradeCounter += Video;}
		
			
	}
	
	//計算結果
	public static void showResult(String[] args) {
		p6.setVisible(true);
		p5.setVisible(false);
		Label title = new Label("計算結果");
		Label lab1 = new Label("姓名：");
		Label lab2 = new Label("學號：");
		Label lab3 = new Label("學分數：");
		Label lab4 = new Label("畢業成績：");
		Label lab5 = new Label("結果：");
		p6.setLayout(null);
		
		p6.setBackground(Color.white);
		title.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		lab1.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lab2.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lab3.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lab4.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		lab5.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		
		
		title.setBounds(240, 30, 180, 50);
		lab1.setBounds(200, 90, 60, 20);
		name.setBounds(280, 90, 70, 20);
		lab2.setBounds(200, 120, 60, 20);
		num.setBounds(280, 120, 70, 20);
		lab3.setBounds(200, 150, 60, 20);
		sum.setBounds(280, 150, 70, 20);
		lab4.setBounds(200, 180, 80, 20);
		avg.setBounds(280, 180, 70, 20);
		lab5.setBounds(200, 210, 60, 20);
		result.setBounds(280, 210, 120, 20);
		
		name.setText(nameTextField.getText());
		num.setText(numberTextField.getText());
		
		p6.add(title);
		p6.add(lab1);
		p6.add(name);
		p6.add(lab2);
		p6.add(num);
		p6.add(lab3);
		p6.add(sum);
		p6.add(lab4);
		p6.add(avg);
		p6.add(lab5);
		p6.add(result);
		
		//計算
		CalculatefirstStep(null);
		CalculatesecondStep(null);
		
		if(ckbSOFT.getState() == true)
			CalculateSOFT(null);
		else if(ckbELEC.getState() == true)
			CalculateELEC(null);
		else if(ckbMEDI.getState() == true)
			CalculateMEDI(null);
		
		CalculatefinalStep(null);
		
		//總學分
		String pointS = point.toString();
		sum.setText(pointS);
		
		//AVG
		average = gradeCounter / averageCount;
		String averageS = String.valueOf(average);//double to string
		avg.setText(averageS);
		
		System.out.println(gradeCounter);
		System.out.println(averageCount);
		
		//通識門檻檢查
		Integer Box1 = selectBox1.getSelectedIndex();
		Integer Box2 = selectBox2.getSelectedIndex();
		Integer Box3 = selectBox3.getSelectedIndex();
		Integer Box4 = selectBox4.getSelectedIndex();
		Integer Box5 = selectBox5.getSelectedIndex();
		Integer Box6 = selectBox6.getSelectedIndex();
		Integer Box7 = selectBox7.getSelectedIndex();
		if(Box1!=Box2 && Box2!=Box3 || Box1!=Box2 && Box2!=Box4 || Box1!=Box2 && Box2!=Box5 || Box1!=Box2 && Box2!=Box6 || Box1!=Box2 && Box2!=Box7 ||
		   Box1!=Box3 && Box3!=Box4 || Box1!=Box3 && Box3!=Box5 || Box1!=Box3 && Box3!=Box6 || Box1!=Box3 && Box3!=Box7 ||
		   Box1!=Box4 && Box4!=Box5 || Box1!=Box4 && Box4!=Box6 || Box1!=Box4 && Box4!=Box7 ||
		   Box1!=Box5 && Box5!=Box6 || Box1!=Box5 && Box5!=Box7 || Box1!=Box6 && Box6!=Box7 )
			GeneralFinish = true;
		else if(Box2!=Box3 && Box3!=Box4 || Box2!=Box3 && Box3!=Box5 || Box2!=Box3 && Box3!=Box6 || Box2!=Box3 && Box3!=Box7 || Box2!=Box4 && Box4!=Box5 ||
				Box2!=Box4 && Box4!=Box6 || Box2!=Box4 && Box4!=Box7 || Box2!=Box5 && Box5!=Box6 || Box2!=Box5 && Box5!=Box7 ||
				Box2!=Box6 && Box6!=Box7 )
			GeneralFinish = true;
		else if(Box3!=Box4 && Box4!=Box5 || Box3!=Box4 && Box4!=Box6 || Box3!=Box4 && Box4!=Box7 || Box3!=Box5 && Box5!=Box6 || Box3!=Box5 && Box5!=Box7 ||
				Box3!=Box6 && Box6!=Box7 )
			GeneralFinish = true;
		else if(Box4!=Box5 && Box5!=Box6 || Box4!=Box5 && Box5!=Box7)
			GeneralFinish = true;
		else if(Box5!=Box6 && Box6!=Box7)
			GeneralFinish = true;
		//
		
		if(point > 128 && GeneralFinish == true)
		{
			JLabel img = new JLabel(new ImageIcon("pass.png"));
			img.setBounds(160, 280, 160, 160);
			p6.add(img);
			result.setForeground(Color.GREEN);
			result.setText("通過系畢業門檻");
		}
		else
		{
			JLabel img = new JLabel(new ImageIcon("fail.png"));
			img.setBounds(160, 280, 160, 160);
			p6.add(img);
			result.setForeground(Color.RED);
			result.setText("尚未通過系畢業門檻");
		}
		
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
