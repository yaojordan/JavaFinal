import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener {
		
	static main frame_page1 = new main();
	
	static JPanel p1 = new JPanel();
	static JPanel p2 = new JPanel();
	static JPanel p3 = new JPanel();
	static JPanel p4 = new JPanel();
	static JPanel p5 = new JPanel();
	static JPanel p6 = new JPanel();
	
	static JButton nextBtn1 = new JButton("下一步"); 
	static JButton nextBtn2 = new JButton("下一步2"); 
	static JButton nextBtn3 = new JButton("下一步3"); 
	static JButton nextBtn4 = new JButton("下一步4"); 
	static JButton nextBtn5 = new JButton("完成"); 
	
	static Checkbox ckbSOFT = new Checkbox("軟工組");
	static Checkbox ckbELEC = new Checkbox("資電組");	
	static Checkbox ckbMEDI = new Checkbox("數創組");
	
	//第一頁
	static TextField nameTextField = new TextField("王大明");
	static TextField numberTextField = new TextField("1021234");

	static int stepCount = 0;
	
	public static void main(String args[])
	{
		CheckboxGroup ckbGrp = new CheckboxGroup();
		frame_page1.setSize(600,500);

		nextBtn1.addActionListener(frame_page1);
		
		//組別三選一
		ckbSOFT.setCheckboxGroup(ckbGrp);
		ckbELEC.setCheckboxGroup(ckbGrp);
		ckbMEDI.setCheckboxGroup(ckbGrp);
		//預設選取軟工組
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

	//基礎必修
	public static void firstStep(String[] args) {
		stepCount = 1;
		
		p2.setVisible(true);
		p1.setVisible(false);
		
		p2.add(nextBtn2);
		nextBtn2.addActionListener(frame_page1);
		frame_page1.add(p2);
		frame_page1.setVisible(true);
	}
	
	//通識課程
	public static void secondStep(String[] args) {
		stepCount = 2;
		
		p3.setVisible(true);
		p2.setVisible(false);
		
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
		
		p5.add(nextBtn5);
		nextBtn5.addActionListener(frame_page1);
		frame_page1.add(p5);
		frame_page1.setVisible(true);
	}
	
	//計算結果
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
