package tela;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaMatrix extends JFrame {

	JLabel titulo, varx, vary, varz, start, start1, start2, end, end1, end2, labelx, labely, labelz, x, y, title,
			output, terminal, stdout, x11;

	JTextField fileNameBox, functionBox, varxBox, varyBox, varzBox, startBox, start1Box, start2Box, endBox, end1Box,
			end2Box, xLabelBox, yLabelBox, zLabelBox, xBox, x1Box, x2Box, x3Box, yBox, y1Box, y2Box, y3Box, titleBox;

	JButton btnPlot, btnReplot, btnQuit;

	JCheckBox checkFile, checkFunction, checkMultipleFiles, checkMultipleFunc;

	public TelaMatrix() {
		super("Gnuplot Front End");
		Container tela = getContentPane();
		setLayout(null);

		/* Instanciando os textos */

		titulo = new JLabel("Matrix Screen");
		checkFile = new JCheckBox("Filename");
		checkFunction = new JCheckBox("Function");
		checkMultipleFunc = new JCheckBox("Multiple functions");
		checkMultipleFiles = new JCheckBox("Multiple files");

		varx = new JLabel("Variable X: ");
		vary = new JLabel("Variable Y: ");
		varz = new JLabel("Variable Z: ");

		start = new JLabel("Start");
		start1 = new JLabel("Start");
		start2 = new JLabel("Start");
		end = new JLabel("End: ");
		end1 = new JLabel("End: ");
		end2 = new JLabel("End: ");

		labelx = new JLabel("X Label: ");
		labely = new JLabel("Y Label: ");
		labelz = new JLabel("Z Label: ");
		title = new JLabel("Title: ");
		x = new JLabel("X");
		y = new JLabel("Y");

		output = new JLabel("Output: ");
		terminal = new JLabel("Terminal: ");
		stdout = new JLabel("stdout");
		x11 = new JLabel("x11");

		/* Instanciando as caixas de texto */

		fileNameBox = new JTextField();
		functionBox = new JTextField();

		varxBox = new JTextField(20);
		varyBox = new JTextField(20);
		varzBox = new JTextField(20);
		startBox = new JTextField(20);
		start1Box = new JTextField(20);
		start2Box = new JTextField(20);
		endBox = new JTextField(20);
		end1Box = new JTextField(20);
		end2Box = new JTextField(20);

		xLabelBox = new JTextField();
		yLabelBox = new JTextField();
		zLabelBox = new JTextField();

		xBox = new JTextField(20);
		x1Box = new JTextField(20);
		x2Box = new JTextField(20);
		x3Box = new JTextField(20);
		yBox = new JTextField(20);
		y1Box = new JTextField(20);
		y2Box = new JTextField(20);
		y3Box = new JTextField(20);
		titleBox = new JTextField(20);

		btnPlot = new JButton("Plot");
		btnReplot = new JButton("Replot");
		btnQuit = new JButton("Quit");

		titulo.setBounds(175, 15, 100, 20);

		checkFile.setBounds(25, 50, 80, 20);
		fileNameBox.setBounds(105, 50, 300, 20);
		checkFunction.setBounds(25, 80, 80, 20);
		functionBox.setBounds(105, 80, 300, 20);

		checkMultipleFiles.setBounds(101, 115, 100, 20);
		checkMultipleFunc.setBounds(283, 115, 150, 20);

		varx.setBounds(25, 150, 100, 20);
		varxBox.setBounds(100, 150, 45, 20);
		vary.setBounds(25, 180, 100, 20);
		varyBox.setBounds(100, 180, 45, 20);
		varz.setBounds(25, 210, 100, 20);
		varzBox.setBounds(100, 210, 45, 20);

		start.setBounds(165, 150, 100, 20);
		startBox.setBounds(205, 150, 70, 20);
		start1.setBounds(165, 180, 100, 20);
		start1Box.setBounds(205, 180, 70, 20);
		start2.setBounds(165, 210, 100, 20);
		start2Box.setBounds(205, 210, 70, 20);

		end.setBounds(305, 150, 100, 20);
		endBox.setBounds(335, 150, 70, 20);
		end1.setBounds(305, 180, 100, 20);
		end1Box.setBounds(335, 180, 70, 20);
		end2.setBounds(305, 210, 100, 20);
		end2Box.setBounds(335, 210, 70, 20);

		x.setBounds(320, 255, 100, 20);
		y.setBounds(375, 255, 100, 20);
		xBox.setBounds(300, 275, 50, 20);
		yBox.setBounds(355, 275, 50, 20);
		x1Box.setBounds(300, 305, 50, 20);
		y1Box.setBounds(355, 305, 50, 20);
		x2Box.setBounds(300, 335, 50, 20);
		y2Box.setBounds(355, 335, 50, 20);
		x3Box.setBounds(300, 365, 50, 20);
		y3Box.setBounds(355, 365, 50, 20);

		labelx.setBounds(25, 275, 100, 20);
		xLabelBox.setBounds(100, 275, 195, 20);
		labely.setBounds(25, 305, 100, 20);
		yLabelBox.setBounds(100, 305, 195, 20);
		labelz.setBounds(25, 335, 100, 20);
		zLabelBox.setBounds(100, 335, 195, 20);
		title.setBounds(25, 365, 100, 20);
		titleBox.setBounds(100, 365, 195, 20);

		output.setBounds(25, 395, 100, 20);
		stdout.setBounds(100, 395, 100, 20);
		terminal.setBounds(25, 425, 100, 20);
		x11.setBounds(100, 425, 100, 20);

		stdout.setForeground(Color.blue);
		x11.setForeground(Color.blue);

		btnPlot.setBounds(37, 455, 100, 35);
		btnReplot.setBounds(167, 455, 100, 35);
		btnQuit.setBounds(297, 455, 100, 35);

		tela.add(titulo);
		tela.add(checkFile);
		tela.add(checkFunction);
		tela.add(checkMultipleFiles);
		tela.add(checkMultipleFunc);
		tela.add(varx);
		tela.add(vary);
		tela.add(varz);
		tela.add(start);
		tela.add(start1);
		tela.add(start2);
		tela.add(end);
		tela.add(end1);
		tela.add(end2);
		tela.add(labelx);
		tela.add(labely);
		tela.add(labelz);
		tela.add(title); /* ADICIONANDO TODOS OS ELEMENTOS NO OBJETO TELA */
		tela.add(x);
		tela.add(y);
		tela.add(terminal);
		tela.add(terminal);
		tela.add(fileNameBox);
		tela.add(functionBox);
		tela.add(varxBox);
		tela.add(varyBox);
		tela.add(varzBox);
		tela.add(startBox);
		tela.add(start1Box);
		tela.add(start2Box);
		tela.add(endBox);
		tela.add(end1Box);
		tela.add(end2Box);
		tela.add(xLabelBox);
		tela.add(yLabelBox);
		tela.add(zLabelBox);
		tela.add(xBox);
		tela.add(x1Box);
		tela.add(x2Box);
		tela.add(x3Box);
		tela.add(yBox);
		tela.add(y1Box);
		tela.add(y2Box);
		tela.add(y3Box);
		tela.add(titleBox);
		tela.add(output);
		tela.add(terminal);
		tela.add(stdout);
		tela.add(x11);
		tela.add(btnPlot);
		tela.add(btnReplot);
		tela.add(btnQuit);

		setSize(450, 550);
		setVisible(true);
	}

}
