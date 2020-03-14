package tela;

import javax.swing.*;
import java.awt.Container;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JTextField;

public class GUICalcCientifica extends JFrame {

	JButton MC, MR, MS, mAd, mSub;
	JButton apaga, CE, C, adSub, raiz;
	JButton vii, viii, ix, dividir, percent;
	JButton iv, v, vi, vezes, umDivx;
	JButton i, ii, iii, menos, igual;
	JButton zero, virg, mais;

	JButton vazio, inv, in, parentAbre, parentFecha;
	JButton inte, sinh, sin, xe2, nex;
	JButton dms, cosh, cos, xeY, raiz1;
	JButton pi, tanh, tan, xe3, raiz2;
	JButton fe, exp, mod, loge, dezeX;

	JRadioButton graus, radianos, grados;

	JTextField painel;

	public GUICalcCientifica() {
		super("Científica");
		Container tela = getContentPane();
		setLayout(null);

		painel = new JTextField();

		graus = new JRadioButton("graus");
		radianos = new JRadioButton("radiano");
		grados = new JRadioButton("grados");

		vazio = new JButton("");
		inv = new JButton("Inv");
		in = new JButton("In");
		parentAbre = new JButton("(");
		parentFecha = new JButton(")");

		inte = new JButton("Int");
		sinh = new JButton("sinh");
		sin = new JButton("sin");
		xe2 = new JButton("x²");
		nex = new JButton("n!");

		dms = new JButton("dms");
		cosh = new JButton("cosh");
		cos = new JButton("cos");
		xeY = new JButton("x^y");
		raiz1 = new JButton("√");

		pi = new JButton("π");
		tanh = new JButton("tanh");
		tan = new JButton("tan");
		xe3 = new JButton("x³");
		raiz2 = new JButton("√");

		fe = new JButton("F-E");
		exp = new JButton("Exp");
		mod = new JButton("Mod");
		loge = new JButton("log");
		dezeX = new JButton("10^x");

		painel.setBounds(10, 15, 196, 50);

		graus.setBounds(8, 75, 58, 29);
		radianos.setBounds(70, 75, 69, 29);
		grados.setBounds(138, 75, 69, 29);

		vazio.setBounds(10, 110, 35, 29);
		inv.setBounds(50, 110, 35, 29);
		in.setBounds(90, 110, 35, 29);
		parentAbre.setBounds(130, 110, 35, 29);
		parentFecha.setBounds(170, 110, 35, 29);

		vazio.setMargin(new Insets(1, 1, 1, 1));
		inv.setMargin(new Insets(1, 1, 1, 1));
		in.setMargin(new Insets(1, 1, 1, 1));
		parentAbre.setMargin(new Insets(1, 1, 1, 1));
		parentFecha.setMargin(new Insets(1, 1, 1, 1));

		inte.setBounds(10, 145, 35, 29);
		sinh.setBounds(50, 145, 35, 29);
		sin.setBounds(90, 145, 35, 29);
		xe2.setBounds(130, 145, 35, 29);
		nex.setBounds(170, 145, 35, 29);

		inte.setMargin(new Insets(1, 1, 1, 1));
		sinh.setMargin(new Insets(1, 1, 1, 1));
		sin.setMargin(new Insets(1, 1, 1, 1));
		xe2.setMargin(new Insets(1, 1, 1, 1));
		nex.setMargin(new Insets(1, 1, 1, 1));

		dms.setBounds(10, 180, 35, 29);
		cosh.setBounds(50, 180, 35, 29);
		cos.setBounds(90, 180, 35, 29);
		xeY.setBounds(130, 180, 35, 29);
		raiz1.setBounds(170, 180, 35, 29);

		dms.setMargin(new Insets(1, 1, 1, 1));
		cosh.setMargin(new Insets(1, 1, 1, 1));
		cos.setMargin(new Insets(1, 1, 1, 1));
		xeY.setMargin(new Insets(1, 1, 1, 1));
		raiz1.setMargin(new Insets(1, 1, 1, 1));

		pi.setBounds(10, 215, 35, 29);
		tanh.setBounds(50, 215, 35, 29);
		tan.setBounds(90, 215, 35, 29);
		xe3.setBounds(130, 215, 35, 29);
		raiz2.setBounds(170, 215, 35, 29);

		pi.setMargin(new Insets(1, 1, 1, 1));
		tanh.setMargin(new Insets(1, 1, 1, 1));
		tan.setMargin(new Insets(1, 1, 1, 1));
		xe3.setMargin(new Insets(1, 1, 1, 1));
		raiz2.setMargin(new Insets(1, 1, 1, 1));

		fe.setBounds(10, 250, 35, 29);
		exp.setBounds(50, 250, 35, 29);
		mod.setBounds(90, 250, 35, 29);
		loge.setBounds(130, 250, 35, 29);
		dezeX.setBounds(170, 250, 35, 29);

		fe.setMargin(new Insets(1, 1, 1, 1));
		exp.setMargin(new Insets(1, 1, 1, 1));
		mod.setMargin(new Insets(1, 1, 1, 1));
		loge.setMargin(new Insets(1, 1, 1, 1));
		dezeX.setMargin(new Insets(1, 1, 1, 1));

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

		painel.setBounds(10, 15, 396, 50);

		MC.setBounds(210, 75, 35, 29);
		MR.setBounds(250, 75, 35, 29);
		MS.setBounds(290, 75, 35, 29);
		mAd.setBounds(330, 75, 35, 29);
		mSub.setBounds(370, 75, 35, 29);

		MC.setMargin(new Insets(1, 1, 1, 1));
		MR.setMargin(new Insets(1, 1, 1, 1));
		MS.setMargin(new Insets(1, 1, 1, 1));
		mAd.setMargin(new Insets(1, 1, 1, 1));
		mSub.setMargin(new Insets(1, 1, 1, 1));

		apaga.setBounds(210, 110, 35, 29);
		CE.setBounds(250, 110, 35, 29);
		C.setBounds(290, 110, 35, 29);
		adSub.setBounds(330, 110, 35, 29);
		raiz.setBounds(370, 110, 35, 29);

		apaga.setMargin(new Insets(1, 1, 1, 1));
		CE.setMargin(new Insets(1, 1, 1, 1));
		C.setMargin(new Insets(1, 1, 1, 1));
		adSub.setMargin(new Insets(1, 1, 1, 1));
		raiz.setMargin(new Insets(1, 1, 1, 1));

		vii.setBounds(210, 145, 35, 29);
		viii.setBounds(250, 145, 35, 29);
		ix.setBounds(290, 145, 35, 29);
		dividir.setBounds(330, 145, 35, 29);
		percent.setBounds(370, 145, 35, 29);

		vii.setMargin(new Insets(1, 1, 1, 1));
		viii.setMargin(new Insets(1, 1, 1, 1));
		ix.setMargin(new Insets(1, 1, 1, 1));
		dividir.setMargin(new Insets(1, 1, 1, 1));
		percent.setMargin(new Insets(1, 1, 1, 1));

		iv.setBounds(210, 180, 35, 29);
		v.setBounds(250, 180, 35, 29);
		vi.setBounds(290, 180, 35, 29);
		vezes.setBounds(330, 180, 35, 29);
		umDivx.setBounds(370, 180, 35, 29);

		iv.setMargin(new Insets(1, 1, 1, 1));
		v.setMargin(new Insets(1, 1, 1, 1));
		vi.setMargin(new Insets(1, 1, 1, 1));
		vezes.setMargin(new Insets(1, 1, 1, 1));
		umDivx.setMargin(new Insets(1, 1, 1, 1));

		i.setBounds(210, 215, 35, 29);
		ii.setBounds(250, 215, 35, 29);
		iii.setBounds(290, 215, 35, 29);
		menos.setBounds(330, 215, 35, 29);
		igual.setBounds(370, 215, 35, 64);

		i.setMargin(new Insets(1, 1, 1, 1));
		ii.setMargin(new Insets(1, 1, 1, 1));
		iii.setMargin(new Insets(1, 1, 1, 1));
		menos.setMargin(new Insets(1, 1, 1, 1));
		igual.setMargin(new Insets(1, 1, 1, 1));

		zero.setBounds(210, 250, 75, 29);
		virg.setBounds(290, 250, 35, 29);
		mais.setBounds(330, 250, 35, 29);

		virg.setMargin(new Insets(1, 1, 1, 1));
		mais.setMargin(new Insets(1, 1, 1, 1));

		tela.add(graus);
		tela.add(radianos);
		tela.add(grados);
		tela.add(vazio);
		tela.add(inv);
		tela.add(in);
		tela.add(parentAbre);
		tela.add(parentFecha);
		tela.add(inte);
		tela.add(sinh);
		tela.add(sin);
		tela.add(xe2);
		tela.add(nex);
		tela.add(dms);
		tela.add(cosh);
		tela.add(cos);
		tela.add(xeY);
		tela.add(raiz1);
		tela.add(pi);
		tela.add(tanh);
		tela.add(tan);
		tela.add(xe3);
		tela.add(raiz2);
		tela.add(fe);
		tela.add(exp);
		tela.add(mod);
		tela.add(loge);
		tela.add(dezeX);

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

		setSize(429, 328);
		setVisible(true);
	}
}
