package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import entities.Candidates;

public class Program {
	public static void main(String[] args) {
		String path = "C:\\Users\\andre\\votos.csv";
		
		Map<Candidates, Integer> map = new HashMap<>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer wishes = Integer.parseInt(fields[1]);
				Candidates c = new Candidates(name,wishes);
				if( !map.containsKey(c)) {
					map.put(c, wishes);
				}else {
					Integer newWishes = c.getWishes() + map.get(c);
					map.put(c, newWishes);
				}
				line = bf.readLine();
			}
			for(Candidates c : map.keySet()) {
				System.out.println(c.getName() + " : " + map.get(c));
			}
			
		}catch(IOException e) {
			System.out.println("Erro:" + e.getMessage());
		}
	}
}
