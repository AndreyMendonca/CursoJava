package entities;

import java.util.Objects;

public class Candidates {
	private String name;
	private Integer wishes;
	public Candidates(String name, Integer wishes) {
		this.name = name;
		this.wishes = wishes;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getWishes() {
		return wishes;
	}
	
	public void setWishes(Integer wishes) {
		this.wishes = wishes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidates other = (Candidates) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
	
}
