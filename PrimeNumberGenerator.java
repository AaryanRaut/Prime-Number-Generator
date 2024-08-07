import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	
	class MyFrame extends JFrame 
	{
		JButton b1, b2;
		JTextField t1, t2, t3;
		JLabel l1, l2, l3, l4;
		JTextArea ta1;

		public MyFrame()
		{
			super("PRIME NUMBER GENERATOR");
			setSize(500,500);
			setLocation(700,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setLayout(null);	

			l1 = new JLabel("PRIME NUMBER GENERATOR");
			l1.setFont(new Font("Elephant", Font.PLAIN,24));
			l1.setForeground(Color.magenta);
			l1.setBounds(31,30,450,50);
			add(l1);			

			l2 = new JLabel("Enter Number :");
			l2.setFont(new Font("Elephant", Font.PLAIN, 22));
			l2.setBounds(30,100,250,50);
			add(l2);

			t1 = new JTextField();
			t1.setFont(new Font("Elephant", Font.PLAIN, 22));
			t1.setBounds(220,110,100,30);
			add(t1);

			l3 = new JLabel("PRIME NUMBERS");
			l3.setFont(new Font("Elephant", Font.PLAIN, 22));
			l3.setBounds(125,170,250,50);
			add(l3);

			ta1 = new JTextArea();
			ta1.setFont(new Font("Elephant", Font.PLAIN, 20));
			ta1.setLineWrap(true);
			ta1.setBounds(20,220,455,80);
			add(ta1);

			b1 = new JButton("SUBMIT");
			b1.setFont(new Font("Elephant", Font.PLAIN, 20));
			b1.setBounds(70,330,150,30);
			add(b1);

			b2 = new JButton("CLEAR ALL");
			b2.setFont(new Font("Elephant", Font.PLAIN, 20));
			b2.setBounds(240,330,180,30);
			add(b2);

			b1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					int i, j, num;
					boolean flag = true;

					num = Integer.parseInt(t1.getText());

					for(i=2 ; i<=num ; i++)
					{
						flag = true;

						for(j=2 ; j<=i/2 ; j++)
						{
							if(i%j == 0)
							{
								flag = false;
								break;
							}
						}

						if(flag == true)
						{
							ta1.append(i+" ");
						}
					}

				}
			});

			b2.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					t1.setText("");
					ta1.setText("");
				}
			});



			setVisible(true);
		}
	}





public class PrimeNumberGenerator
{
	public static void main(String [] args)
	{
		new MyFrame();
	}
}