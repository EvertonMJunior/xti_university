package me.everton.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Everton/Documents/workspace/XTI - Java SE/ARQUIVOS/texto.txt");
		try(BufferedWriter wr = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			wr.write("Everton Marcelino Junior:91830743\n");
			wr.write("Everton Marcelino Junior:91830743\n");
		} catch (IOException e) {}
		
		// LEITURA //
		try(BufferedReader r = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			String linha = null;
			while((linha = r.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {}
	}
}
