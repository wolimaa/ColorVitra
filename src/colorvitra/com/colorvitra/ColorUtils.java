package colorvitra.com.colorvitra;

//import java.awt.Color;
import java.util.ArrayList;

/**
 * Java Code to get a color name from rgb/hex value/awt color
 * 
 * The part of looking up a color name from the rgb values is edited from
 * https://gist.github.com/nightlark/6482130#file-gistfile1-java (that has some errors) by Ryan Mast (nightlark)
 * 
 * @author Xiaoxiao Li
 * 
 */
public class ColorUtils {

	/**
	 * Initialize the color list that we have.
	 */
	private ArrayList<ColorName> initColorList() {
		ArrayList<ColorName> colorList = new ArrayList<ColorName>();
		colorList.add(new ColorName("Azul alice", 0xF0, 0xF8, 0xFF));
		colorList.add(new ColorName("Branco antigo", 0xFA, 0xEB, 0xD7));
		colorList.add(new ColorName("Agua(azul-esverdeado)", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorName("Agua-marinha", 0x7F, 0xFF, 0xD4));
		colorList.add(new ColorName("Azul celeste", 0xF0, 0xFF, 0xFF));
		colorList.add(new ColorName("Bege", 0xF5, 0xF5, 0xDC));
		colorList.add(new ColorName("Bisque", 0xFF, 0xE4, 0xC4));
		colorList.add(new ColorName("Preto", 0x00, 0x00, 0x00));
		colorList.add(new ColorName("Amendoa", 0xFF, 0xEB, 0xCD));
		colorList.add(new ColorName("Azul", 0x00, 0x00, 0xFF));
		colorList.add(new ColorName("Azul violeta", 0x8A, 0x2B, 0xE2));
		colorList.add(new ColorName("Castanho", 0xA5, 0x2A, 0x2A));
		colorList.add(new ColorName("Madeira", 0xDE, 0xB8, 0x87));
		colorList.add(new ColorName("Azul cadete", 0x5F, 0x9E, 0xA0));
		colorList.add(new ColorName("Verde-limao", 0x7F, 0xFF, 0x00));
		colorList.add(new ColorName("Chocolate", 0xD2, 0x69, 0x1E));
		colorList.add(new ColorName("Coral", 0xFF, 0x7F, 0x50));
		colorList.add(new ColorName("Azul flor de milho", 0x64, 0x95, 0xED));
		colorList.add(new ColorName("Milho claro", 0xFF, 0xF8, 0xDC));
		colorList.add(new ColorName("Carmesim", 0xDC, 0x14, 0x3C));
		colorList.add(new ColorName("Ciano", 0x00, 0xFF, 0xFF));
		colorList.add(new ColorName("Azul escuro", 0x00, 0x00, 0x8B));
		colorList.add(new ColorName("Ciano escuro", 0x00, 0x8B, 0x8B));
		colorList.add(new ColorName("Dourado escuro", 0xB8, 0x86, 0x0B));
		colorList.add(new ColorName("Cinza escuro", 0xA9, 0xA9, 0xA9));
		colorList.add(new ColorName("Verde escuro", 0x00, 0x64, 0x00));
		colorList.add(new ColorName("Caqui escuro", 0xBD, 0xB7, 0x6B));
		colorList.add(new ColorName("Magenta escuro", 0x8B, 0x00, 0x8B));
		colorList.add(new ColorName("Oliva(verde) escuro", 0x55, 0x6B, 0x2F));
		colorList.add(new ColorName("Laranja escuro", 0xFF, 0x8C, 0x00));
		colorList.add(new ColorName("Orquidea(magenta) escura", 0x99, 0x32, 0xCC));
		colorList.add(new ColorName("Vermelho escuro", 0x8B, 0x00, 0x00));
		colorList.add(new ColorName("Salmao escuro", 0xE9, 0x96, 0x7A));
		colorList.add(new ColorName("Verde mar escuro", 0x8F, 0xBC, 0x8F));
		colorList.add(new ColorName("Azul ardosia escuro", 0x48, 0x3D, 0x8B));
		colorList.add(new ColorName("Cinza ardosia escuro", 0x2F, 0x4F, 0x4F));
		colorList.add(new ColorName("Turqueza escura", 0x00, 0xCE, 0xD1));
		colorList.add(new ColorName("Violeta escuro", 0x94, 0x00, 0xD3));
		colorList.add(new ColorName("Rosa profundo", 0xFF, 0x14, 0x93));
		colorList.add(new ColorName("Azul ceu profundo", 0x00, 0xBF, 0xFF));
		colorList.add(new ColorName("Cinza fosco", 0x69, 0x69, 0x69));
		colorList.add(new ColorName("Azul furtivo", 0x1E, 0x90, 0xFF));
		colorList.add(new ColorName("Tijolo refratario(vermelho)", 0xB2, 0x22, 0x22));
		colorList.add(new ColorName("Branco Floral", 0xFF, 0xFA, 0xF0));
		colorList.add(new ColorName("Verde floresta", 0x22, 0x8B, 0x22));
		colorList.add(new ColorName("Fuchsia(majenta)", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorName("Gainsboro(cinza)", 0xDC, 0xDC, 0xDC));
		colorList.add(new ColorName("Branco Ghost", 0xF8, 0xF8, 0xFF));
		colorList.add(new ColorName("Ouro", 0xFF, 0xD7, 0x00));
		colorList.add(new ColorName("Dourado", 0xDA, 0xA5, 0x20));
		colorList.add(new ColorName("Cinza", 0x80, 0x80, 0x80));
		colorList.add(new ColorName("Verde", 0x00, 0x80, 0x00));
		colorList.add(new ColorName("Verde amarelado", 0xAD, 0xFF, 0x2F));
		colorList.add(new ColorName("Mana(verde muito claro)", 0xF0, 0xFF, 0xF0));
		colorList.add(new ColorName("Rosa forte", 0xFF, 0x69, 0xB4));
		colorList.add(new ColorName("Vermelho indiano", 0xCD, 0x5C, 0x5C));
		colorList.add(new ColorName("Azul indigo", 0x4B, 0x00, 0x82));
		colorList.add(new ColorName("Marfim", 0xFF, 0xFF, 0xF0));
		colorList.add(new ColorName("Caqui", 0xF0, 0xE6, 0x8C));
		colorList.add(new ColorName("Lavanda(azul muito claro)", 0xE6, 0xE6, 0xFA));
		colorList.add(new ColorName("Lavanda(azul claro) avermelhada", 0xFF, 0xF0, 0xF5));
		colorList.add(new ColorName("Verde grama", 0x7C, 0xFC, 0x00));
		colorList.add(new ColorName("Amarelo claro", 0xFF, 0xFA, 0xCD));
		colorList.add(new ColorName("Azul claro", 0xAD, 0xD8, 0xE6));
		colorList.add(new ColorName("Coral claro", 0xF0, 0x80, 0x80));
		colorList.add(new ColorName("Ciano claro", 0xE0, 0xFF, 0xFF));
		colorList.add(new ColorName("Amarelo ouro claro", 0xFA, 0xFA, 0xD2));
		colorList.add(new ColorName("Cinza claro", 0xD3, 0xD3, 0xD3));
		colorList.add(new ColorName("Verde claro", 0x90, 0xEE, 0x90));
		colorList.add(new ColorName("Rosa claro", 0xFF, 0xB6, 0xC1));
		colorList.add(new ColorName("Salmao claro", 0xFF, 0xA0, 0x7A));
		colorList.add(new ColorName("Verde mar claro", 0x20, 0xB2, 0xAA));
		colorList.add(new ColorName("Azul ceu claro", 0x87, 0xCE, 0xFA));
		colorList.add(new ColorName("Cinza ardosia claro", 0x77, 0x88, 0x99));
		colorList.add(new ColorName("Azul aco claro", 0xB0, 0xC4, 0xDE));
		colorList.add(new ColorName("Amarelo claro", 0xFF, 0xFF, 0xE0));
		colorList.add(new ColorName("Lima", 0x00, 0xFF, 0x00));
		colorList.add(new ColorName("Lima Verde", 0x32, 0xCD, 0x32));
		colorList.add(new ColorName("Linho(branco)", 0xFA, 0xF0, 0xE6));
		colorList.add(new ColorName("Magenta", 0xFF, 0x00, 0xFF));
		colorList.add(new ColorName("Castanho avermelhado", 0x80, 0x00, 0x00));
		colorList.add(new ColorName("Agua-marinha-medio", 0x66, 0xCD, 0xAA));
		colorList.add(new ColorName("Azul medio", 0x00, 0x00, 0xCD));
		colorList.add(new ColorName("Orquidia medio", 0xBA, 0x55, 0xD3));
		colorList.add(new ColorName("Roxo medio", 0x93, 0x70, 0xDB));
		colorList.add(new ColorName("Verde mar medio", 0x3C, 0xB3, 0x71));
		colorList.add(new ColorName("Azul ardosia medio", 0x7B, 0x68, 0xEE));
		colorList.add(new ColorName("Verde primavera medio", 0x00, 0xFA, 0x9A));
		colorList.add(new ColorName("Turquesa medio", 0x48, 0xD1, 0xCC));
		colorList.add(new ColorName("Vermelho violeta medio", 0xC7, 0x15, 0x85));
		colorList.add(new ColorName("Azul meia noite", 0x19, 0x19, 0x70));
		colorList.add(new ColorName("Creme de menta(verde ciano claro)", 0xF5, 0xFF, 0xFA));
		colorList.add(new ColorName("Rosa embaçado", 0xFF, 0xE4, 0xE1));
		colorList.add(new ColorName("Mocassim(castanho claro)", 0xFF, 0xE4, 0xB5));
		colorList.add(new ColorName("Branco navajo", 0xFF, 0xDE, 0xAD));
		colorList.add(new ColorName("Azul naval", 0x00, 0x00, 0x80));
		colorList.add(new ColorName("Renda antiga(castanho claro)", 0xFD, 0xF5, 0xE6));
		colorList.add(new ColorName("Oliva(amarelo escuro)", 0x80, 0x80, 0x00));
		colorList.add(new ColorName("Oliva parda(amarelo esverdeado escuro)", 0x6B, 0x8E, 0x23));
		colorList.add(new ColorName("Lanranja", 0xFF, 0xA5, 0x00));
		colorList.add(new ColorName("Jambo(laranja avermelhado)", 0xFF, 0x45, 0x00));
		colorList.add(new ColorName("Orquidea(majenta)", 0xDA, 0x70, 0xD6));
		colorList.add(new ColorName("Dourado palido", 0xEE, 0xE8, 0xAA));
		colorList.add(new ColorName("Verde palido", 0x98, 0xFB, 0x98));
		colorList.add(new ColorName("Turquesa palida", 0xAF, 0xEE, 0xEE));
		colorList.add(new ColorName("Violeta vermelha(rosa) pálida", 0xDB, 0x70, 0x93));
		colorList.add(new ColorName("Mamão batido(castanho claro)", 0xFF, 0xEF, 0xD5));
		colorList.add(new ColorName("Pêssego(laranja claro)", 0xFF, 0xDA, 0xB9));
		//colorList.add(new ColorName("Peru", 0xCD, 0x85, 0x3F)); 
		colorList.add(new ColorName("Rosa", 0xFF, 0xC0, 0xCB));
		//colorList.add(new ColorName("Plum", 0xDD, 0xA0, 0xDD));
		colorList.add(new ColorName("Azul polvara", 0xB0, 0xE0, 0xE6));
		colorList.add(new ColorName("Purpura", 0x80, 0x00, 0x80));
		colorList.add(new ColorName("Vermelho", 0xFF, 0x00, 0x00));
		colorList.add(new ColorName("Marron rosado", 0xBC, 0x8F, 0x8F));
		colorList.add(new ColorName("Azul real", 0x41, 0x69, 0xE1));
		colorList.add(new ColorName("Marron sela", 0x8B, 0x45, 0x13));
		colorList.add(new ColorName("Salmao", 0xFA, 0x80, 0x72));
		colorList.add(new ColorName("Marron amarelado", 0xF4, 0xA4, 0x60));
		colorList.add(new ColorName("Herbal(verde ciano claro)", 0x2E, 0x8B, 0x57));
		colorList.add(new ColorName("Choncha do Mar(cinza)", 0xFF, 0xF5, 0xEE));
		//colorList.add(new ColorName("Sienna", 0xA0, 0x52, 0x2D));
		colorList.add(new ColorName("Prata", 0xC0, 0xC0, 0xC0));
		colorList.add(new ColorName("Azul ceu", 0x87, 0xCE, 0xEB));
		colorList.add(new ColorName("Azul ardosia", 0x6A, 0x5A, 0xCD));
		colorList.add(new ColorName("Cinza ardosia", 0x70, 0x80, 0x90));
		colorList.add(new ColorName("Branco neve", 0xFF, 0xFA, 0xFA));
		colorList.add(new ColorName("Verde primavera", 0x00, 0xFF, 0x7F));
		colorList.add(new ColorName("Azul aco", 0x46, 0x82, 0xB4));
		colorList.add(new ColorName("Castanho claro", 0xD2, 0xB4, 0x8C));
		colorList.add(new ColorName("Verde-azulado", 0x00, 0x80, 0x80));
		colorList.add(new ColorName("Cardo(magenta claro)", 0xD8, 0xBF, 0xD8));
		colorList.add(new ColorName("Tomate(vermelho medio)", 0xFF, 0x63, 0x47));
		colorList.add(new ColorName("Turquesa(tipo de ciano)", 0x40, 0xE0, 0xD0));
		colorList.add(new ColorName("Violeta", 0xEE, 0x82, 0xEE));
		colorList.add(new ColorName("Trigo(castanho claro)", 0xF5, 0xDE, 0xB3));
		colorList.add(new ColorName("Branco", 0xFF, 0xFF, 0xFF));
		colorList.add(new ColorName("Branco fumaça", 0xF5, 0xF5, 0xF5));
		colorList.add(new ColorName("Amarelo", 0xFF, 0xFF, 0x00));
		colorList.add(new ColorName("Verde amarelado", 0x9A, 0xCD, 0x32));
		return colorList;
	}

	/**
	 * Get the closest color name from our list
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @return
	 */
	public String getColorNameFromRgb(int r, int g, int b) {
		ArrayList<ColorName> colorList = initColorList();
		ColorName closestMatch = null;
		int minMSE = Integer.MAX_VALUE;
		int mse;
		for (ColorName c : colorList) {
			mse = c.computeMSE(r, g, b);
			if (mse < minMSE) {
				minMSE = mse;
				closestMatch = c;
			}
		}

		if (closestMatch != null) {
			return closestMatch.getName();
		} else {
			return "No matched color name.";
		}
	}

	/**
	 * Convert hexColor to rgb, then call getColorNameFromRgb(r, g, b)
	 * 
	 * @param hexColor
	 * @return
	 */
	public String getColorNameFromHex(int hexColor) {
		int r = (hexColor & 0xFF0000) >> 16;
		int g = (hexColor & 0xFF00) >> 8;
		int b = (hexColor & 0xFF);
		return getColorNameFromRgb(r, g, b);
	}

//	public int colorToHex(Color c) {
//		return Integer.decode("0x"
//				+ Integer.toHexString(c.getRGB()).substring(2));
//	}
//
//	public String getColorNameFromColor(Color color) {
//		return getColorNameFromRgb(color.getRed(), color.getGreen(),
//				color.getBlue());
//	}

	/**
	 * SubClass of ColorUtils. In order to lookup color name
	 * 
	 * @author Xiaoxiao Li
	 * 
	 */
	public class ColorName {
		public int r, g, b;
		public String name;

		public ColorName(String name, int r, int g, int b) {
			this.r = r;
			this.g = g;
			this.b = b;
			this.name = name;
		}

		public int computeMSE(int pixR, int pixG, int pixB) {
			return ((pixR - r) * (pixR - r) + (pixG - g) * (pixG - g) + (pixB - b)
					* (pixB - b)) / 3;
		}

		public int getR() {
			return r;
		}

		public int getG() {
			return g;
		}

		public int getB() {
			return b;
		}

		public String getName() {
			return name;
		}
	}
}