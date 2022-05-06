package Desafios;

import org.apache.commons.lang3.StringUtils;

public class Exercicio4 {
	public static void main(String[] args) {

		// String documento = null;
//
//		int[] abas = { 0, 1, 2 };
//
//		if (documento.startsWith("0")) {
//			for (int xx = 0; xx < 10; xx++) {
//				if (documento.length() > 1 && documento.startsWith("0")) {
//					documento = documento.substring(1);
//				}
//			}
//		}

//		StringBuilder txtDados = new StringBuilder();
//		txtDados.append("Este é um exemplo de dados para um arquivo");
//		String filename = "C:/Arquivos/teste.txt";
//		FileWriter writer = new FileWriter(filename); // add IOXException
//		writer.writeNewFile(txtDados.toString());

		String dataMovimento = "07/05/2018";
		if (dataMovimento.length() > 9) {
			int mesRef = Integer.parseInt(dataMovimento.substring(3, 5)) - 1;
			int anoRef = Integer.parseInt(dataMovimento.substring(6, 10));
			if (mesRef == 0) {
				mesRef = 12;
				anoRef = anoRef - 1;
				String mesAnoX = StringUtils.leftPad(String.valueOf(mesRef), 2, "0") + "/" + String.valueOf(anoRef);
				System.out.print(mesAnoX);
			}

		}

	}
}
