package com;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("¿Desea calcular del cilindro su área o su volumen? \nDígame cual");
	String respuesta = sc.nextLine();
	System.out.println("Entendido \nIntroduce el radio");
	double radio = sc.nextDouble();
	System.out.println("Bien \nIntroduce la altura");
	double altura = sc.nextDouble();
	int Satan = 1;
	
	if (respuesta.equals("Área")) {
		System.out.println(area (radio, altura));
	} else if (respuesta.equals("Volumen")) {
		System.out.println(volumen (radio, altura));
	} else if (respuesta.equals("Satan")) 
		while (Satan == 1) {
			System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMWWWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWMMMMMMMMMMMMMMMMMMMWWWWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMWX0xoldKWMMMMMMMMMMMMMMMMMMMNOoldkKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0xoldKWMMMMMMMMMMMMMMMMMMMNOoldkKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0xoldKWMMMMMMMMMMMMMMMMMMMNOoldkKNWMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMWXxc,. .lKWMMMMMMMMMMMMMMMMMMMMMWO;...;oONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXxc,. .lKWMMMMMMMMMMMMMMMMMMMMMWO;...;oONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXxc,. .lKWMMMMMMMMMMMMMMMMMMMMMWO;...;oONMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMWXx,.....xWMMMMWNXK0OOkkkOO0KXNWMMMMXc.....:ONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx,.....xWMMMMWNXK0OOkkkOO0KXNWMMMMXc.....:ONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx,.....xWMMMMWNXK0OOkkkOO0KXNWMMMMXc.....:ONMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMWKc. .:, ;XMNKkoc;,,,,;;;;;,,,,;cdOXWMO..:;. 'dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKc. .:, ;XMNKkoc;,,,,;;;;;,,,,;cdOXWMO..:;. 'dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKc. .:, ;XMNKkoc;,,,,;;;;;,,,,;cdOXWMO..:;. 'dXMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMXc. .'c:.'dxc'....';coolllolc;'....,okl..lc.  .xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXc. .'c:.'dxc'....';coolllolc;'....,okl..lc.  .xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXc. .'c:.'dxc'....';coolllolc;'....,okl..lc.  .xNMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMWx.  .';oc...    ...,:lkKK0xl:'...    ..'ll,..  ;0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx.  .';oc...    ...,:lkKK0xl:'...    ..'ll,..  ;0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx.  .';oc...    ...,:lkKK0xl:'...    ..'ll,..  ;0MMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMNo.  ...,lc'.       .''cOKk:'..       .,lc'...  'OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.  ...,lc'.       .''cOKk:'..       .,lc'...  'OWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.  ...,lc'.       .''cOKk:'..       .,lc'...  'OWMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMWWNd.    .......      ...;odl,..      ........    ,OWWWMMMMMMMMMMMMMMMMMMMMMMMMMWWNd.    .......      ...;odl,..      ........    ,OWWWMMMMMMMMMMMMMMMMMMMMMMMMMWWNd.    .......      ...;odl,..      ........    ,OWWWMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMM0kX0;      .          ...';;;...          ..     .lX0kXMMMMMMMMMMMMMMMMMMMMMMMMM0kX0;      .          ...';;;...          ..     .lX0kXMMMMMMMMMMMMMMMMMMMMMMMMM0kX0;      .          ...';;;...          ..     .lX0kXMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMNo,kNk,            .   ....'''...                .:0Xl'kWMMMMMMMMMMMMMMMMMMMMMMMNo,kNk,            .   ....'''...                .:0Xl'kWMMMMMMMMMMMMMMMMMMMMMMMNo,kNk,            .   ....'''...                .:0Xl'kWMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMK; ,ONx.               .'.''''.'..               ;0Nd..oNMMMMMMMMMMMMMMMMMMMMMMMK; ,ONx.               .'.''''.'..               ;0Nd..oNMMMMMMMMMMMMMMMMMMMMMMMK; ,ONx.               .'.''''.'..               ;0Nd..oNMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMM0,  ,xx'             ...'''''''''...             :kl. .oNMMMMMMMMMMMMMMMMMMMMMMM0,  ,xx'             ...'''''''''...             :kl. .oNMMMMMMMMMMMMMMMMMMMMMMM0,  ,xx'             ...'''''''''...             :kl. .oNMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMK;  .''.  ..''..'..........''''....''......'...  .''. .oNMMMMMMMMMMMMMMMMMMMMMMMK;  .''.  ..''..'..........''''....''......'...  .''. .oNMMMMMMMMMMMMMMMMMMMMMMMK;  .''.  ..''..'..........''''....''......'...  .''. .oNMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMXc  .,,.     ...';clll:'.........;clllc,...      .,'. .xWMMMMMMMMMMMMMMMMMMMMMMMXc  .,,.     ...';clll:'.........;clllc,...      .,'. .xWMMMMMMMMMMMMMMMMMMMMMMMXc  .,,.     ...';clll:'.........;clllc,...      .,'. .xWMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMWd.. ...         .,dOOxdc..',..,ldxOkl.         .'. ..'OWMMMMMMMMMMMMMMMMMMMMMMMWd.. ...         .,dOOxdc..',..,ldxOkl.         .'. ..'OWMMMMMMMMMMMMMMMMMMMMMMMWd.. ...         .,dOOxdc..',..,ldxOkl.         .'. ..'OWMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMO'..  ..          .,cc:;. .'..'::c:'           ..  ..:XMMMMMMMMMMMMMMMMMMMMMMMMMO'..  ..          .,cc:;. .'..'::c:'           ..  ..:XMMMMMMMMMMMMMMMMMMMMMMMMMO'..  ..          .,cc:;. .'..'::c:'           ..  ..:XMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMXc...    ..    ';;. ....  ... ....  ':;.    .     ...xWMMMMMMMMMMMMMMMMMMMMMMMMMXc...    ..    ';;. ....  ... ....  ':;.    .     ...xWMMMMMMMMMMMMMMMMMMMMMMMMMXc...    ..    ';;. ....  ... ....  ':;.    .     ...xWMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMWk.      ....  .:o:.      ...      .co;.  ....      ;KMMMMMMMMMMMMMMMMMMMMMMMMMMWk.      ....  .:o:.      ...      .co;.  ....      ;KMMMMMMMMMMMMMMMMMMMMMMMMMMWk.      ....  .:o:.      ...      .co;.  ....      ;KMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMXc..   .,cll:'..        .'''.        ..;cll;'.   ..dWMMMMMMMMMMMMMMMMMMMMMMMMMMMXc..   .,cll:'..        .'''.        ..;cll;'.   ..dWMMMMMMMMMMMMMMMMMMMMMMMMMMMXc..   .,cll:'..        .'''.        ..;cll;'.   ..dWMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMW0;.  ...,:lool:;,'.....;xko'.....',;codoc;'...  .lXMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0;.  ...,:lool:;,'.....;xko'.....',;codoc;'...  .lXMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0;.  ...,:lool:;,'.....;xko'.....',;codoc;'...  .lXMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMWKc.    .....';::;'.....:OXx,.....';::,'....     .dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKc.    .....';::;'.....:OXx,.....';::,'....     .dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKc.    .....';::;'.....:OXx,.....';::,'....     .dXMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMW0:.            .   ...'lOKk:.... ...            .oXWMMMMMMMMMMMMMMMMMMMMMMMMMMMW0:.            .   ...'lOKk:.... ...            .oXWMMMMMMMMMMMMMMMMMMMMMMMMMMMW0:.            .   ...'lOKk:.... ...            .oXWMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMWXx:.         . ..... .,loc'.......          .'ckNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx:.         . ..... .,loc'.......          .'ckNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx:.         . ..... .,loc'.......          .'ckNMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMW0oo:. ..   .,.....   ...  ......,.   .. .lodKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0oo:. ..   .,.....   ...  ......,.   .. .lodKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0oo:. ..   .,.....   ...  ......,.   .. .lodKWMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMWKk0Kc....   .,::;,'.....''',;;;'.   ....dXOONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKk0Kc....   .,::;,'.....''',;;;'.   ....dXOONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKk0Kc....   .,::;,'.....''',;;;'.   ....dXOONMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMWXXXo.....  ..',:ldkkokkoc;,..  .....'xXXXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXXXo.....  ..',:ldkkokkoc;,..  .....'xXXXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXXXo.....  ..',:ldkkokkoc;,..  .....'xXXXMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMXxOK0x,..'...,,''';clllc,'',,'..'...:O00xkWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxOK0x,..'...,,''';clllc,'',,'..'...:O00xkWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXxOK0x,..'...,,''';clllc,'',,'..'...:O00xkWMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMKldxokOc...'...,;:::::::::;'...'..'oOxoxldNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKldxokOc...'...,;:::::::::;'...'..'oOxoxldNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKldxokOc...'...,;:::::::::;'...'..'oOxoxldNMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMXo:do:oko'..''....'''''''....'...;xxccdo;xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo:do:oko'..''....'''''''....'...;xxccdo;xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo:do:oko'..''....'''''''....'...;xxccdo;xWMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMWO:;odloOk,.....................:Oklodl;lKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:;odloOk,.....................:Oklodl;lKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:;odloOk,.....................:Oklodl;lKMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMW0l;:okKNO;.....',,,,,,''.'...cKN0xl;;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l;:okKNO;.....',,,,,,''.'...cKN0xl;;dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l;:okKNO;.....',,,,,,''.'...cKN0xl;;dKWMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMWXkl;;oOKk;..''..    ...''..l00kl;:o0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl;;oOKk;..''..    ...''..l00kl;:o0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXkl;;oOKk;..''..    ...''..l00kl;:o0NMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMNKOxx0N0c.            ..oKXOxkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxx0N0c.            ..oKXOxkOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxx0N0c.            ..oKXOxkOXWMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkc'.      ..'lONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkc'.      ..'lONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXkc'.      ..'lONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxc'.,lxOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxc'.,lxOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxc'.,lxOXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0KWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0KWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNK0KWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
					+ "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
		}
	}
	
	
	
	
	
	
	public static double area (double radio, double altura) {
		return 2 * Math.PI * radio * (altura * radio);
		
		
		
	}
	
	
	public static double volumen (double radio, double altura) {
		return Math.PI * (radio * radio) * altura;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
