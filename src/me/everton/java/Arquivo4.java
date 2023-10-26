package me.everton.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Everton/Documents/workspace/XTI - Java SE/ARQUIVOS/texto.txt");
		// CREATE //
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path, "Meu Texto".getBytes());
		
		// COPY //
		Path copia = Paths.get("C:/Users/Everton/Documents/workspace/XTI - Java SE/ARQUIVOS/texto2.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		// MOVE //
		Path mover = Paths.get("C:/Users/Everton/Documents/workspace/XTI - Java SE/ARQUIVOS/move/texto.txt");
		Files.move(mover, path, StandardCopyOption.REPLACE_EXISTING);
	}

}
