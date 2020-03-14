package tela;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculadora extends JFrame {

	JButton MC, MR, MS, mAd, mSub;
	JButton apaga, CE, C, adSub, raiz;
	JButton vii, viii, ix, dividir, percent;
	JButton iv, v, vi, vezes, umDivx;
	JButton i, ii, iii, menos, igual;
	JButton zero, virg, mais;

	JTextField painel;

	public GUICalculadora() {
		super("Calculadora");
		Container tela = getContentPane();
		setLayout(null);

		painel = new JTextField();

		MC = new JButton("MC");
		MR = new JButton("MR");
		MS = new JButton("MS");
		mAd = new JButton("M+");
		mSub = new JButton("M-");

		apaga = new JButton("←");
		CE = new JButton("CE");
		C = new JButton("C");
		adSub = new JButton("±");
		raiz = new JButton("√");

		vii = new JButton("7");
		viii = new JButton("8");
		ix = new JButton("9");
		dividir = new JButton("/");
		percent = new JButton("%");

		iv = new JButton("4");
		v = new JButton("5");
		vi = new JButton("6");
		vezes = new JButton("*");
		umDivx = new JButton("1/x");

		i = new JButton("1");
		ii = new JButton("2");
		iii = new JButton("3");
		menos = new JButton("-");
		igual = new JButton("=");

		zero = new JButton("0");
		virg = new JButton(",");
		mais = new JButton("+");

		painel.setBounds(10, 15, 196, 50);

		MC.setBounds(10, 75, 35, 29);
		MR.setBounds(50, 75, 35, 29);
		MS.setBounds(90, 75, 35, 29);
		mAd.setBounds(130, 75, 35, 29);
		mSub.setBounds(170, 75, 35, 29);

		MC.setMargin(new Insets(1, 1, 1, 1));
		MR.setMargin(new Insets(1, 1, 1, 1));
		MS.setMargin(new Insets(1, 1, 1, 1));
		mAd.setMargin(new Insets(1, 1, 1, 1));
		mSub.setMargin(new Insets(1, 1, 1, 1));

		apaga.setBounds(10, 110, 35, 29);
		CE.setBounds(50, 110, 35, 29);
		C.setBounds(90, 110, 35, 29);
		adSub.setBounds(130, 110, 35, 29);
		raiz.setBounds(170, 110, 35, 29);

		apaga.setMargin(new Insets(1, 1, 1, 1));
		CE.setMargin(new Insets(1, 1, 1, 1));
		C.setMargin(new Insets(1, 1, 1, 1));
		adSub.setMargin(new Insets(1, 1, 1, 1));
		raiz.setMargin(new Insets(1, 1, 1, 1));

		vii.setBounds(10, 145, 35, 29);
		viii.setBounds(50, 145, 35, 29);
		ix.setBounds(90, 145, 35, 29);
		dividir.setBounds(130, 145, 35, 29);
		percent.setBounds(170, 145, 35, 29);

		vii.setMargin(new Insets(1, 1, 1, 1));
		viii.setMargin(new Insets(1, 1, 1, 1));
		ix.setMargin(new Insets(1, 1, 1, 1));
		dividir.setMargin(new Insets(1, 1, 1, 1));
		percent.setMargin(new Insets(1, 1, 1, 1));

		iv.setBounds(10, 180, 35, 29);
		v.setBounds(50, 180, 35, 29);
		vi.setBounds(90, 180, 35, 29);
		vezes.setBounds(130, 180, 35, 29);
		umDivx.setBounds(170, 180, 35, 29);

		iv.setMargin(new Insets(1, 1, 1, 1));
		v.setMargin(new Insets(1, 1, 1, 1));
		vi.setMargin(new Insets(1, 1, 1, 1));
		vezes.setMargin(new Insets(1, 1, 1, 1));
		umDivx.setMargin(new Insets(1, 1, 1, 1));

		i.setBounds(10, 215, 35, 29);
		ii.setBounds(50, 215, 35, 29);
		iii.setBounds(90, 215, 35, 29);
		menos.setBounds(130, 215, 35, 29);
		igual.setBounds(170, 215, 35, 64);

		i.setMargin(new Insets(1, 1, 1, 1));
		ii.setMargin(new Insets(1, 1, 1, 1));
		iii.setMargin(new Insets(1, 1, 1, 1));
		menos.setMargin(new Insets(1, 1, 1, 1));
		igual.setMargin(new Insets(1, 1, 1, 1));

		zero.setBounds(10, 250, 75, 29);
		virg.setBounds(90, 250, 35, 29);
		mais.setBounds(130, 250, 35, 29);

		virg.setMargin(new Insets(1, 1, 1, 1));
		mais.setMargin(new Insets(1, 1, 1, 1));

		tela.add(painel);
		tela.add(MC);
		tela.add(MR);
		tela.add(MS);
		tela.add(mAd);
		tela.add(mSub);

		tela.add(apaga);
		tela.add(CE);
		tela.add(C);
		tela.add(adSub);
		tela.add(raiz);

		tela.add(vii);
		tela.add(viii);
		tela.add(ix);
		tela.add(dividir);
		tela.add(percent);

		tela.add(iv);
		tela.add(v);
		tela.add(vi);
		tela.add(vezes);
		tela.add(umDivx);

		tela.add(i);
		tela.add(ii);
		tela.add(iii);
		tela.add(menos);
		tela.add(igual);

		tela.add(zero);
		tela.add(virg);
		tela.add(mais);

		setSize(229, 328);
		setVisible(true);

	}
}
