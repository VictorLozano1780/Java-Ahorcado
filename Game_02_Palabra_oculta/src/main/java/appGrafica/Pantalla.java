/**
 * 
 */
package appGrafica;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

/**
 * @author Víctor Lozano
 *
 */
public class Pantalla extends JFrame {
	
	private static int foto = 1;
	private static String palabra;
	private static JLabel palabraSecreta;
	private static JLabel imagenLabel;
	private JPanel contentPane;
	private static JPanel pistasPanel;
	private static JButton btnA;
	private static JButton btnB;
	private static JButton btnC;
	private static JButton btnD;
	private static JButton btnE;
	private static JButton btnF;
	private static JButton btnG;
	private static JButton btnH;
	private static JButton btnI;
	private static JButton btnJ;
	private static JButton btnK;
	private static JButton btnL;
	private static JButton btnM;
	private static JButton btnN;
	private static JButton btnÑ;
	private static JButton btnO;
	private static JButton btnP;
	private static JButton btnQ;
	private static JButton btnR;
	private static JButton btnS;
	private static JButton btnT;
	private static JButton btnU;
	private static JButton btnV;
	private static JButton btnW;
	private static JButton btnX;
	private static JButton btnY;
	private static JButton btnZ;
	private static JToggleButton vida1;
	private static JToggleButton vida2;
	private static JToggleButton vida3;
	private static JToggleButton vida4;
	private static JToggleButton vida5;
	private static JPanel palabraSecretaPanel;
	private static JPanel tecladoPanel;
	private static JPanel menuPanel;
	private static JButton btnResolver;
	private static JPanel imagenesPanel;
	private static JList<String> list;
	private static DefaultListModel<String> listaDiez;
	private static JButton btnIniciarJuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					//PANTALLA
					Pantalla frame = new Pantalla();
					
					//LOGICA BOTON INICIAR JUEGO
					btnIniciarJuego.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
							palabraSecreta.setText("");
							tecladoPanel.setVisible(true);
							imagenesPanel.setVisible(true);
							pistasPanel.setVisible(true);
							int random = (int) (Math.random() * listaDiez.getSize());
							palabra = listaDiez.get(random);
							System.out.println(palabra);
							for (int i = 0; i < palabra.length(); i++) {
								palabraSecreta.setText(palabraSecreta.getText() + " _");
							
									
							}
							
							
							
						}
						
					});
					
					
					
					
					ActionListener click = new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							String letra;
							JButton boton = (JButton) e.getSource();
							letra = boton.getText();
							System.out.println(letra);
							compruebaLetra(letra);
							
						}			
					};
					btnA.addActionListener(click);
					btnB.addActionListener(click);
					btnC.addActionListener(click);
					btnD.addActionListener(click);
					btnE.addActionListener(click);
					btnF.addActionListener(click);
					btnG.addActionListener(click);
					btnH.addActionListener(click);
					btnI.addActionListener(click);
					btnJ.addActionListener(click);
					btnK.addActionListener(click);
					btnL.addActionListener(click);
					btnM.addActionListener(click);
					btnN.addActionListener(click);
					btnÑ.addActionListener(click);
					btnO.addActionListener(click);
					btnP.addActionListener(click);
					btnQ.addActionListener(click);
					btnR.addActionListener(click);
					btnS.addActionListener(click);
					btnT.addActionListener(click);
					btnU.addActionListener(click);
					btnV.addActionListener(click);
					btnW.addActionListener(click);
					btnX.addActionListener(click);
					btnY.addActionListener(click);
					btnZ.addActionListener(click);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	//PANTALLA
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// SECCION DE MENUS - CESAR
				JMenuBar menuBar = new JMenuBar();
				setJMenuBar(menuBar);
				
				//MENU JUEGO
				JMenu NewMenuJuego = new JMenu("Juego");
				menuBar.add(NewMenuJuego);
				
				//LOGICA MENU SALIR - CESAR 9.2
				JMenuItem MenuItemSalir = new JMenuItem("Salir");
				MenuItemSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
					int salir =	JOptionPane.showConfirmDialog(null, "Deseas finalizar el programa? ", "Salir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
						
						if (salir==0) {
						System.exit(0);
						}
						else;
					}
				});
				
				NewMenuJuego.add(MenuItemSalir);
				
				
				
				//CREACION MENU Y LOGICA JUEGO NUEVO
				JMenuItem MenuItemNuevoJuego = new JMenuItem("Nuevo Juego");
				MenuItemNuevoJuego.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
						palabraSecreta.setText("");
						tecladoPanel.setVisible(true);
						imagenesPanel.setVisible(true);
						pistasPanel.setVisible(true);
						int random = (int) (Math.random() * listaDiez.getSize());
						palabra = listaDiez.get(random);
						System.out.println(palabra);
						for (int i = 0; i < palabra.length(); i++) {
							palabraSecreta.setText(palabraSecreta.getText() + " _");
						}
				}});
				
				
				
				
				NewMenuJuego.add(MenuItemNuevoJuego);	
				
				
				
				
				//CREACION MENU  AYUDA
				JMenu NewMenuAyuda1 = new JMenu("Ayuda");
				menuBar.add(NewMenuAyuda1);
				
				//CREACION MENU Y LOGICA  COMO JUGAR - CESAR
				JMenuItem MenuItemComoJugar = new JMenuItem("Como jugar");
				MenuItemComoJugar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						JOptionPane.showMessageDialog(null,"Instrucciones: "
								+ "\n1. Has de darle al boton iniciar juego "
								+ "\n2. Aparecen los espacios de las letras  de una palabra oculta "
								+ "\n3. Has de adivinar la palabra pulsando en el teclado de palabras que hay abajo "
								+ "\n4. Si te equivocas, el ahorcado se ira completando "
								+ "\n5. Tienes 10 intentos antes de que se complete el ahorcado "
								+ "\n6. Puedes usar las pistas las cuales te descubriran una letra, hay un numero limitado de pistas");
						
					}
				});
				
				NewMenuAyuda1.add(MenuItemComoJugar);
				
				//LOGICA MENU 'ACERCA DE' - CESAR
				JMenuItem MenuItemAcercaDe = new JMenuItem("acerca de ");
				MenuItemAcercaDe.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,"Juego del Ahorcado creado en Java con Swing y AWT "
								+ "\n \nCreadores: \nVictor Lozano, Cesar Torrelles, Giovanny");
						
					}
				});
				NewMenuAyuda1.add(MenuItemAcercaDe);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);

		//JPANELS TECLADO Y BOTONES - VICTOR
		tecladoPanel = new JPanel();
		tecladoPanel.setBounds(10, 361, 221, 189);
		tecladoPanel.setToolTipText("Teclado");
		contentPane.add(tecladoPanel);
		tecladoPanel.setLayout(null);

		btnA = new JButton("A");
		btnA.setBounds(0, 0, 39, 39);
		tecladoPanel.add(btnA);

		btnB = new JButton("B");
		btnB.setBounds(38, 0, 39, 39);
		tecladoPanel.add(btnB);

		btnC = new JButton("C");
		btnC.setBounds(74, 0, 39, 39);
		tecladoPanel.add(btnC);

		btnD = new JButton("D");
		btnD.setBounds(110, 0, 39, 39);
		tecladoPanel.add(btnD);

		btnE = new JButton("E");
		btnE.setBounds(147, 0, 39, 39);
		tecladoPanel.add(btnE);

		btnF = new JButton("F");
		btnF.setBounds(183, 0, 39, 39);
		tecladoPanel.add(btnF);

		btnG = new JButton("G");
		btnG.setBounds(0, 40, 39, 39);
		tecladoPanel.add(btnG);

		btnH = new JButton("H");
		btnH.setBounds(38, 40, 39, 39);
		tecladoPanel.add(btnH);

		btnI = new JButton("I");
		btnI.setBounds(74, 40, 39, 39);
		tecladoPanel.add(btnI);

		btnJ = new JButton("J");
		btnJ.setBounds(110, 40, 39, 39);
		tecladoPanel.add(btnJ);

		btnK = new JButton("K");
		btnK.setBounds(147, 40, 39, 39);
		tecladoPanel.add(btnK);

		btnL = new JButton("L");
		btnL.setBounds(183, 40, 39, 39);
		tecladoPanel.add(btnL);

		btnM = new JButton("M");
		btnM.setBounds(0, 78, 39, 39);
		btnM.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnM);

		btnN = new JButton("N");
		btnN.setBounds(38, 78, 39, 39);
		tecladoPanel.add(btnN);

		btnÑ = new JButton("Ñ");
		btnÑ.setBounds(74, 78, 39, 39);
		tecladoPanel.add(btnÑ);

		btnO = new JButton("O");
		btnO.setBounds(110, 78, 39, 39);
		btnO.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnO);

		btnP = new JButton("P");
		btnP.setBounds(147, 78, 39, 39);
		tecladoPanel.add(btnP);

		btnQ = new JButton("Q");
		btnQ.setBounds(183, 78, 39, 39);
		btnQ.setFont(new Font("Arial", Font.PLAIN, 9));
		tecladoPanel.add(btnQ);

		btnR = new JButton("R");
		btnR.setBounds(0, 116, 39, 39);
		tecladoPanel.add(btnR);

		btnS = new JButton("S");
		btnS.setBounds(38, 116, 39, 39);
		tecladoPanel.add(btnS);

		btnT = new JButton("T");
		btnT.setBounds(74, 116, 39, 39);
		tecladoPanel.add(btnT);

		btnU = new JButton("U");
		btnU.setBounds(110, 116, 39, 39);
		tecladoPanel.add(btnU);

		btnV = new JButton("V");
		btnV.setBounds(147, 116, 39, 39);
		tecladoPanel.add(btnV);

		btnW = new JButton("W");
		btnW.setBounds(183, 116, 39, 39);
		btnW.setFont(new Font("Arial", Font.PLAIN, 8));
		tecladoPanel.add(btnW);

		btnX = new JButton("X");
		btnX.setBounds(61, 150, 39, 39);
		tecladoPanel.add(btnX);

		btnY = new JButton("Y");
		btnY.setBounds(98, 150, 39, 39);
		tecladoPanel.add(btnY);

		btnZ = new JButton("Z");
		btnZ.setBounds(134, 150, 39, 39);
		tecladoPanel.add(btnZ);

		pistasPanel = new JPanel();
		pistasPanel.setBounds(10, 182, 221, 158);
		contentPane.add(pistasPanel);
		pistasPanel.setLayout(null);

		palabraSecretaPanel = new JPanel();
		palabraSecretaPanel.setBounds(10, 93, 201, 54);
		pistasPanel.add(palabraSecretaPanel);
		palabraSecretaPanel.setLayout(null);

		palabraSecreta = new JLabel();
		palabraSecreta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		palabraSecreta.setBounds(10, 11, 181, 32);
		palabraSecretaPanel.add(palabraSecreta);
		
		//VIDAS PANEL - CESAR
		
				JPanel vidasPanel = new JPanel();
				vidasPanel.setBounds(10, 6, 205, 75);
				pistasPanel.add(vidasPanel);
				vidasPanel.setLayout(null);
				
				JToggleButton vida1 = new JToggleButton("1");
				vida1.setForeground(Color.RED);
				vida1.setBackground(Color.RED);
				vida1.setBounds(6, 6, 44, 22);
				vidasPanel.add(vida1);
				vida1.setVisible(false);
				
				JToggleButton vida2 = new JToggleButton("2");
				vida2.setBounds(76, 6, 44, 22);
				vidasPanel.add(vida2);
				vida2.setForeground(Color.RED);
				vida2.setBackground(Color.RED);
				vida2.setVisible(false);
				
				JToggleButton vida3 = new JToggleButton("3");
				vida3.setForeground(Color.RED);
				vida3.setBackground(Color.RED);
				vida3.setBounds(155, 6, 44, 22);
				vidasPanel.add(vida3);
				vida3.setVisible(false);
				
				JToggleButton vida4 = new JToggleButton("4");
				vida4.setForeground(Color.RED);
				vida4.setBackground(Color.RED);
				vida4.setBounds(41, 47, 44, 22);
				vidasPanel.add(vida4);
				vida4.setVisible(false);
				
				JToggleButton vida5 = new JToggleButton("5");
				vida5.setForeground(Color.RED);
				vida5.setBackground(Color.RED);
				vida5.setBounds(118, 47, 44, 22);
				vidasPanel.add(vida5);	
				vida5.setVisible(false);
				//HASTA AQUI LAS VIDAS
				
				
				
				
	

		//PANEL DE PISTAS - VICTOR
		menuPanel = new JPanel();
		menuPanel.setBounds(10, 11, 221, 158); //revisar luego dimensiones
		contentPane.add(menuPanel);
		menuPanel.setLayout(null);
		
		

		//boton resolver que luego sera boton pistas
		//btnResolver = new JButton("Resolver");
		//btnResolver.setBounds(10, 77, 201, 55); //modificar luego 
		//menuPanel.add(btnResolver);
		
		
		//BOTON PISTA, (MODIFICADO DE 'btnResolver')
				JButton btnPista = new JButton("Pista");
				btnPista.setBounds(10, 77, 201, 55);
				menuPanel.add(btnPista);

		//PANEL DE LAS IMAGENES
		imagenesPanel = new JPanel();
		imagenesPanel.setBounds(241, 11, 333, 539);
		contentPane.add(imagenesPanel);
		imagenesPanel.setLayout(null);

		// imagenlABEL - VICTOR
		imagenLabel = new JLabel();
		elegirImagen(foto);
		imagenLabel.setBounds(10, 11, 313, 517);
		imagenesPanel.add(imagenLabel);

		//JLIST DE PALABRAS PARA ACERTAR - VICTOR
		list = new JList<String>();
		listaDiez = new DefaultListModel<String>();
		listaDiez.addElement("TARRAGONA");
		listaDiez.addElement("BARCELONA");
		listaDiez.addElement("LLEIDA");
		listaDiez.addElement("GIRONA");
		listaDiez.addElement("FUTBOL");
		listaDiez.addElement("BALONCESTO");
		listaDiez.addElement("MACARRONES");
		listaDiez.addElement("ALBONDIGAS");
		listaDiez.addElement("TECLADO");
		list.setModel(listaDiez);
		list.setVisible(false);
		list.setBounds(10, 170, 1, 1);
		contentPane.add(list);

		//BOTON INICIAR JUEGO
		btnIniciarJuego = new JButton("Iniciar juego");
		btnIniciarJuego.setBounds(10, 11, 201, 55);
		menuPanel.add(btnIniciarJuego);

	}
	
	
	  public static void numeroDeVidas() {
			
			int numero=1;
			
		  System.out.println(numero);  
				
				switch (numero) {
				
				case 1:
					vida1.setVisible(false);
					vida2.setVisible(false);
					vida3.setVisible(false);
					vida4.setVisible(false);
					vida5.setVisible(false);
					break;
				case 2:
					vida1.setVisible(true);
					vida2.setVisible(true);
					vida3.setVisible(false);
					vida4.setVisible(false);
					vida5.setVisible(false);
					break;
				case 3:
					vida1.setVisible(true);
					vida2.setVisible(true);
					vida3.setVisible(true);
					vida4.setVisible(false);
					vida5.setVisible(false);
					break;
				case 4:
					vida1.setVisible(true);
					vida2.setVisible(true);
					vida3.setVisible(true);
					vida4.setVisible(true);
					vida5.setVisible(false);
					break;
				case 5:
					vida1.setVisible(true);
					vida2.setVisible(true);
					vida3.setVisible(true);
					vida4.setVisible(true);
					vida5.setVisible(true);
					break;
				default:
					vida1.setVisible(true);
					vida2.setVisible(true);
					vida3.setVisible(true);
					vida4.setVisible(true);
					vida5.setVisible(true);
					break;
					
			}	
			
		}
	  
	  public static void cuantasVidas() {
		  
		String numeroString =   JOptionPane.showInputDialog( "Cantidad de vidas: ");
		   
		int num = Integer.parseInt(numeroString);
		 System.out.println(num);  
		
		 //numeroDeVidas(num);
		 
	  }
	
	
	
	//METODO ELECCION DE IMAGEN - VICTOR
	public static void elegirImagen(int numero) {
		ImageIcon img = new ImageIcon(Pantalla.class.getResource("/Imagenes/Vida" + numero + ".jpg"));
		Image imagen = img.getImage();
		Image newSize = imagen.getScaledInstance(440, 400, Image.SCALE_SMOOTH);
		img = new ImageIcon(newSize);
		imagenLabel.setIcon(img);
		imagenLabel.repaint();

	}
	//METODO PARA COMPROBAR LA LETRA - VICTOR
	public static void compruebaLetra(String letra) {
		String resultado = "";
		palabraSecreta.setText("");
		boolean esta = false;
		for (int j = 0; j < palabra.length(); j++) {
			if (palabra.charAt(j) == letra.charAt(0)) {
				resultado = resultado + " " + letra;
				esta = true;
			} else {
				resultado = resultado + " _";
			}
		}
		palabraSecreta.setText(resultado);
		if (!esta) {
			foto++;
			elegirImagen(foto);
		}
		System.out.println(palabra);
		System.out.println(palabraSecreta.getText());
	}
}
