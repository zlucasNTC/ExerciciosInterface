package tela;

import java.awt.Container;
import java.awt.Insets;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {

	String[] choices = {""};
	final JComboBox<String> cb = new JComboBox<String>(choices);

	JLabel titulo, codCliente, nome, endereco, bairro, cidade, estado, celular, cep, sexo, tel, dataNasc, dataCad;

	JTextField codClienteBox, nomeBox, enderecoBox, bairroBox, cidadeBox;

	JButton btnIncluir, btnLimpar, btnSair, btnConsultar, btnConsultarTodos;

	JRadioButton masc, fem;

	JPanel estadoPanel;

	MaskFormatter maskCep, maskCelular, maskTel, maskDataNasc, maskDataCad;

	JFormattedTextField cepBox, celBox, telBox, dataNascBox, dataCadBox;
	
	ImageIcon iconincluir, iconlimpar, iconsair, iconconsultar, iconconstodos;

	public TelaCadastro() {
		super("Sistema de Controle de Produção Apícula");
		Container tela = getContentPane();
		setLayout(null);

		try {
			maskCep = new MaskFormatter("#####-###");
			maskCelular = new MaskFormatter("(##)#####-####");
			maskTel = new MaskFormatter("(##)####-####");
			maskDataNasc = new MaskFormatter("##/##/####");
			maskDataCad = new MaskFormatter("##/##/####");
		} catch (ParseException ecxp) {}
        
		iconincluir = new ImageIcon("incluir.png");
		iconlimpar = new ImageIcon("limpar.png");
		iconsair = new ImageIcon("sair.png");
		iconconsultar = new ImageIcon("consultar.png");
		iconconstodos = new ImageIcon("consultartodos.png");
		
		titulo = new JLabel("Cadastro de Cliente");
        
		codCliente = new JLabel("Código de Cliente");
		nome = new JLabel("Nome completo");
		endereco = new JLabel("Endereço");
		bairro = new JLabel("Bairro");
		cidade = new JLabel("Cidade");
		estado = new JLabel("Estado");
		cep = new JLabel("C.E.P.");
		sexo = new JLabel("Sexo");
		celular = new JLabel("Celular");
		tel = new JLabel("Telefone");
		dataNasc = new JLabel("Data de Nascimento");
		dataCad = new JLabel("Data de Cadastro");

		codClienteBox = new JTextField();
		nomeBox = new JTextField();
		enderecoBox = new JTextField();
		bairroBox = new JTextField();
		cidadeBox = new JTextField();

		cepBox = new JFormattedTextField();
		celBox = new JFormattedTextField();
		telBox = new JFormattedTextField();
		dataNascBox = new JFormattedTextField();
		dataCadBox = new JFormattedTextField();

		cepBox = new JFormattedTextField(maskCep);
		celBox = new JFormattedTextField(maskCelular);
		telBox = new JFormattedTextField(maskTel);
		dataNascBox = new JFormattedTextField(maskDataNasc);
		dataCadBox = new JFormattedTextField(maskDataCad);

		estadoPanel = new JPanel();

		masc = new JRadioButton("Masculino", false);
		fem = new JRadioButton("Feminino", false);

		btnIncluir = new JButton("Incluir", iconincluir);
		btnLimpar = new JButton("Limpar", iconlimpar);
		btnSair = new JButton("Sair", iconsair);
		btnConsultar = new JButton("Consultar", iconconsultar);
		btnConsultarTodos = new JButton("Consultar Todos", iconconstodos);
		
		btnConsultarTodos.setMargin(new Insets(1,1,1,1));
		btnSair.setMargin(new Insets(1,1,1,8));

		titulo.setBounds(215, 25, 120, 20);
		codCliente.setBounds(25, 70, 100, 20);
		nome.setBounds(25, 100, 100, 20);
		endereco.setBounds(25, 130, 100, 20);
		bairro.setBounds(25, 160, 100, 20);
		cidade.setBounds(25, 190, 100, 20);
		estado.setBounds(25, 220, 100, 20);
		cep.setBounds(25, 250, 100, 20);
		sexo.setBounds(25, 280, 100, 20);
		celular.setBounds(25, 310, 100, 20);
		tel.setBounds(25, 340, 100, 20);
		dataNasc.setBounds(25, 370, 120, 20);
		dataCad.setBounds(25, 400, 100, 20);

		codClienteBox.setBounds(170, 70, 220, 20);
		nomeBox.setBounds(170, 100, 220, 20);
		enderecoBox.setBounds(170, 130, 220, 20);
		bairroBox.setBounds(170, 160, 220, 20);
		cidadeBox.setBounds(170, 190, 220, 20);
		cb.setBounds(170, 220, 220, 20);
		cepBox.setBounds(170, 250, 220, 20);
		fem.setBounds(170, 280, 100, 20);
		masc.setBounds(280, 280, 220, 20);
		celBox.setBounds(170, 310, 220, 20);
		telBox.setBounds(170, 340, 220, 20);
		dataNascBox.setBounds(170, 370, 220, 20);
		dataCadBox.setBounds(170, 400, 220, 20);

		btnIncluir.setBounds(25, 450, 150, 35);
		btnLimpar.setBounds(185, 450, 150, 35);
		btnSair.setBounds(345, 450, 150, 35);
		btnConsultar.setBounds(25, 500, 150, 35);
		btnConsultarTodos.setBounds(185, 500, 150, 35);

		tela.add(titulo);
		tela.add(codCliente);
		tela.add(nome);
		tela.add(endereco);
		tela.add(bairro);
		tela.add(cidade);
		tela.add(estado);
		tela.add(celular);
		tela.add(tel);
		tela.add(cep);
		tela.add(sexo);
		tela.add(dataNasc);
		tela.add(dataCad);
		tela.add(codClienteBox);
		tela.add(nomeBox);
		tela.add(enderecoBox);
		tela.add(bairroBox);
		tela.add(cidadeBox);
		tela.add(cepBox);
		tela.add(celBox);
		tela.add(telBox);
		tela.add(dataNascBox);
		tela.add(dataCadBox);
		tela.add(masc);
		tela.add(fem);
		tela.add(cb);

		tela.add(btnIncluir);
		tela.add(btnLimpar);
		tela.add(btnSair);
		tela.add(btnConsultar);
		tela.add(btnConsultarTodos);

		tela.setVisible(true);

		setSize(550, 600);
		setVisible(true);

	}

}
