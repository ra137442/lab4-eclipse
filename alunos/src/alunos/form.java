package alunos;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.String;
import static java.lang.System.*;
import java.lang.StringBuffer;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textData;
	public JTextField textEmail;
	public JTextField textCPF;
	public JTextField textPhone;
	public JTextField textAd1;
	public JTextField textAd2;
	public JTextField textCEP;
	public JTextField textCity;
	public JTextField textState;
	public JTextField textCountry;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int testaCPF(StringBuffer cpf){	

		//tamanho do cpf invalido
		if(cpf.length() != 14){
			System.out.println("Tamanho incorreto de CPF");
			return -1;			
		}		
		
		//remove . e - do cpf recebido		
		cpf.deleteCharAt(3);
		cpf.deleteCharAt(6);
		cpf.deleteCharAt(9);			
		
		//verifica se o CPF contem apenas numeros
		for(int i=0; i<11; i++){
			if(cpf.charAt(i)-48 < 0 || cpf.charAt(i)-48 > 9){
				System.out.println("Formato de CPF invalido");
				return -1;
			}
		}
		
		int aux1=(int) cpf.charAt(9);
		int aux2=cpf.charAt(10);		
		int digito1, digito2;
		
		//convete da tabela asccii para int
		aux1-=48;
		aux2-=48;
		
		//calcula o digito recebido
		int digito_recebido=10*aux1 + aux2;		
		
		
		//Algoritmo para a verificacao do CPF
		int aux3=0;
		for(int i=0; i<9; i++){
			aux3+=((int)cpf.charAt(i) - 48)*(10-i);			
		}
		
		int q1=aux3/11;
		int r1=aux3%11;
		
		if(r1<2){
			digito1=0;
		}
		
		else{
			digito1=11-r1;			
		}
		
		aux3=0;
		for(int i=0; i<9; i++){
			aux3+=((int)cpf.charAt(i) - 48)*(11-i);			
		}
		
		aux3+=2*digito1;
		int q2=aux3/11;
		int r2=aux3%11;
		
		if(r2<2){
			digito2=0;			
		}
		
		else{
			digito2=11-r2;			
		}
		
		int digito_calculado=10*digito1 + digito2;
		
		//compara os dois digitos 
		if(digito_recebido != digito_calculado){
			//se nao baterem, envia mensagem e o status de -1 (nao OK)
			System.out.println("CPF invalido");
			return -1;
		}
		
		else
			//caso contrario a operacao pode seguir normalmente
			return 1;
		
	}
	
	public int verificaPreenchimento(StringBuffer campo){
		//campo obrigatorio nao preenchido
		if(campo.length() == 0){
			System.out.println("Campo obrigatório nao preenchido !");
			return -1;			
		}
		
		else
			return 1;
		
	}
	
	public int testaCEP(StringBuffer cep){
		
		if(cep.length() ==0){
			System.out.println("CEP nao preenchido !" );
			return -1;			
		}
		
		if(cep.length() != 9 ){
			System.out.println("Tamanho invalido de cep !");
			return -1;
		}
		
		//remove - do cep
		cep.deleteCharAt(5);
		
		//verifica se o cep e composto apenas por numeros
		for(int i=0; i<8; i++){
			if(cep.charAt(i)-48 < 0 || cep.charAt(i)-48 > 9){
				System.out.println("CEP invalido !");
				return -1;
			}
			
		}
		
		return 1;
		
	}

	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(99, 60, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(99, 90, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textData = new JTextField();
		textData.setBounds(99, 120, 114, 19);
		contentPane.add(textData);
		textData.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(99, 150, 160, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(20);
		
		textCPF = new JTextField();
		textCPF.setBounds(99, 180, 114, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(20);
		
		textPhone = new JTextField();
		textPhone.setBounds(99, 210, 114, 19);
		contentPane.add(textPhone);
		textPhone.setColumns(20);
		
		textAd1 = new JTextField();
		textAd1.setBounds(99, 240, 114, 19);
		contentPane.add(textAd1);
		textAd1.setColumns(20);
		
		textAd2 = new JTextField();
		textAd2.setBounds(99, 270, 114, 19);
		contentPane.add(textAd2);
		textAd2.setColumns(20);		
		
		textCEP = new JTextField();
		textCEP.setBounds(99, 300, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(20);		
		
		textCity = new JTextField();
		textCity.setBounds(99, 330, 114, 19);
		contentPane.add(textCity);
		textCity.setColumns(20);		
		
		textState = new JTextField();
		textState.setBounds(99, 360, 114, 19);
		contentPane.add(textState);
		textState.setColumns(20);		
		
		textCountry = new JTextField();
		textCountry.setBounds(99, 390, 114, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(20);		
		
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name * :");
		lblFirstName.setBounds(12, 60, 114, 19);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name * :");
		lblLastName.setBounds(12, 90, 114, 19);
		contentPane.add(lblLastName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 10);
		contentPane.add(lblTitle);
		
		JLabel lblData = new JLabel("Data Nasc. * :");
		lblData.setBounds(12, 120, 90, 19);
		contentPane.add(lblData);
		
		JLabel lblEmail = new JLabel("Email * :");
		lblEmail.setBounds(12, 132, 90, 50);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF * :");
		lblCPF.setBounds(12, 162, 90, 50);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 192, 90, 50);
		contentPane.add(lblPhone);
		
		JLabel lblAd1 = new JLabel("Address 1:");
		lblAd1.setBounds(12, 222, 90, 50);
		contentPane.add(lblAd1);
		
		JLabel lblAd2 = new JLabel("Address 2:");
		lblAd2.setBounds(12, 252, 90, 50);
		contentPane.add(lblAd2);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 282, 90, 50);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 312, 90, 50);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 342, 90, 50);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 372, 90, 50);
		contentPane.add(lblCountry);
		
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				
				StringBuffer fName = new StringBuffer(textfirstName.getText());				
				StringBuffer lName = new StringBuffer(textlastName.getText());				
				StringBuffer dataNas= new StringBuffer(textData.getText());	
				
				//verifica se os campos obrigatorios foram preenchidos
				int fNameOK=verificaPreenchimento(fName);
				int lNameOK=verificaPreenchimento(lName);
				int dataNasOK=verificaPreenchimento(dataNas);				
				
				//testa cep e cpf				
				StringBuffer cpf = new StringBuffer(textCPF.getText());				
				int cpfOK=testaCPF(cpf);			
				
				StringBuffer cep = new StringBuffer(textCEP.getText());				
				int cepOK=testaCEP(cep);
				
				//se todos os campos estiverem OK, imprime o formulario
				if(fNameOK==1 && lNameOK==1 && dataNasOK==1 && cpfOK==1 && cepOK==1){
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.DataLabel.setText(textData.getText());
					printForm.EmailLabel.setText(textEmail.getText());
					printForm.CPFLabel.setText(textCPF.getText());
					printForm.PhoneLabel.setText(textPhone.getText());
					printForm.Ad1Label.setText(textAd1.getText());
					printForm.Ad2Label.setText(textAd2.getText());
					printForm.CEPLabel.setText(textCEP.getText());
					printForm.CityLabel.setText(textCity.getText());
					printForm.StateLabel.setText(textState.getText());
					printForm.CountryLabel.setText(textCountry.getText());					
					//printForm.contentPane.setVisible(true);				
					printForm.show();						
				}				
			}
		});
		btnPrint.setBounds(12, 500, 74, 25);
		contentPane.add(btnPrint);
	}
}
