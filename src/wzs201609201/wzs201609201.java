package wzs201609201;

import java.awt.*;
import java.awt.event.*;
public class wzs201609201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame mFrm = new MainFrame();
		mFrm.setVisible(true);
	}

}

class MainFrame extends Frame{
	private Label lab = new Label("Are you handsome?");
	private Button btnStay = new Button("Yes");
	private Button btnExit = new Button("No");
	public MainFrame(){
		initComp();
	}
	private void initComp(){
		this.setBounds(200,150,380,320);
		this.setLayout(new BorderLayout(2,1));
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		this.setBackground(Color.black);
		this.setLayout(null);
		lab.setLocation(150,100);
		lab.setBackground(Color.black);
		lab.setForeground(Color.white);
		lab.setSize(120,50);
		btnExit.setLocation(100, 200);
		btnExit.setSize(80,25);
		btnExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
			System.exit(0);	
			}
		});
		btnStay.setLocation(200,200);
		btnStay.setSize(80,25);
		btnStay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				fun1();
				//System.exit(0);
			}
		});

		this.add(btnStay);
		this.add(btnExit);
		this.add(lab);
	}
	private void fun1(){
		this.setTitle("Keep Stay ! You idiot !");
	}
}