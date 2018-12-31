package easygui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame
{
	
	//声明一个文本框控件，用于显示计算结果
	private JTextField txtResult;
	private JPanel p;
	//定义一个字符串数组，用来存放按钮的文字
	private String name[] = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/"};
	//声明一个按钮数组，该数组的长度以字符出串数组的长度为准
	private JButton button[] = new JButton[name.length];
	private double result = 0;
	//存放最后一个操作符，初始化操作符为=
	private String lastCommand = "=";
	//标识符是否开始
	private boolean start = true;
	public Calculator() 
	{
		super("计算器");
		//实例化文本控件
		txtResult = new JTextField(20);
		//设置文本框不是焦点状态
		txtResult.setFocusable(false);
		//将文本框控件放在窗体框架的上方
		this.add(txtResult, BorderLayout.NORTH);
		//实例化面板对象，同时设置此面板布局为4行4列的网格布局
		p = new JPanel(new GridLayout(4, 4));
		//循环实例化按钮对象数组
		//实例化键盘监听对象
		ButtonAction ba = new ButtonAction();
		KeyAction ka = new KeyAction();
		for(int i=0; i<button.length; i++)
		{
			button[i] = new JButton(name[i]);
			//注册监听
			button[i].addActionListener(ba);
			button[i].addKeyListener(ka);
			
			p.add(button[i]);
			
		}
		this.add(p, BorderLayout.CENTER);
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
		
	}
	
	/*
	 * 计算
	 */
	public void calculate(double x)
	{
		if(lastCommand.equals("+"))
		{
			result += x;
		}
		else if(lastCommand.equals("-"))
		{
			result -= x;
		}
		else if(lastCommand.equals("*"))
		{
			result *= x;
		}
		else if(lastCommand.equals("/"))
		{
			result /= x;
		}
		else if(lastCommand.equals("="))
		{
			result = x;
		}
		//将结果显示在文本框
		txtResult.setText(""+result);
		
		
	}
	
	/*
	 * 单击按钮监听
	 * 
	 */
	private class ButtonAction implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			String input = e.getActionCommand();
			//单击符号操作按钮
			if(input.equals("+")||input.equals("-")||input.equals("*")||input.equals("/")||input.equals("="))
			{
				if(start) 
				{
					if(input.equals("-"))
					{
						txtResult.setText(input);
						start = false;
					}
					else
					{
						lastCommand = input;
					}
				}
				else
				{
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = input;
					start = true;
					
				}
			}
			else
			{
				if(start)
				{
					txtResult.setText("");
					start = false;
					
				}
				txtResult.setText(txtResult.getText()+input);
				
			}
		}
		
	}
	/*
	 * 键盘监听
	 * 
	 */
	private class KeyAction extends KeyAdapter
	{
		public void keyTyped(KeyEvent e)
		{
			char key = e.getKeyChar();
			//敲击键盘是数字时
			if(key=='0'||key=='1'||key=='2'||key=='3'||key=='4'||key=='5'||key=='6'||key=='7'||key=='8'||key=='9')
			{
				if(start)
				{
					txtResult.setText("");
					start = false;
					
				}
				txtResult.setText(txtResult.getText()+key);
				
			}
			//敲击键盘是操作符号时
			else if (key=='+'||key=='-'||key=='*'||key=='/'||key=='=')
			{
				if(start)
				{
					if(key=='-')
					{
						txtResult.setText(String.valueOf(key));
						start = false;
					}
					else
					{
						lastCommand = String.valueOf(key);
					}
				}
				else
				{
					calculate(Double.parseDouble(txtResult.getText()));
					lastCommand = String.valueOf(key);
					start = true;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
//		calculator.setVisible(true);
		
	}
	
	
}













