package ÀÚÆÇ±â;

public class Rank {
	
	private int rank ;
	private String name ;
	private long playtime ;
	private String content ; 
	
	public Rank() {
	}

	public Rank(int rank, String name, long playtime, String content) {
		super();
		this.rank = rank;
		this.name = name;
		this.playtime = playtime;
		this.content = content;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPlaytime() {
		return playtime;
	}

	public void setPlaytime(long playtime) {
		this.playtime = playtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
	
}