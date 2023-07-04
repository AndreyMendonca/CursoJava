package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\Users\\andre\\texto.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			Set<LogEntry> set = new HashSet<>();
			
			while(line != null) {
				String[] fields = line.split(" ");
				String name =  fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(name,moment));
				line = br.readLine();
			}
			
			System.out.println("Total user: " + set.size());
			
		}catch(IOException e) {
			System.out.println("Erro: " +  e.getMessage());
		}

	}

}
