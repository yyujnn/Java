package model;

public class MusicDTO {

	private int seq;
	private String title;
	private String answer;
	private String info;
	private int num;
	private String under;
	

	public MusicDTO(int seq, String title, String answer, String info, int num, String under) {
		this.seq = seq;
		this.title = title;
		this.answer = answer;
		this.info = info;
		this.num = num;
		this.under = under;
	}

	public MusicDTO(int seq) {
		this.seq = seq;
	}


	public MusicDTO(String answer) {
		this.answer =answer;
	}

	public int getSeq() {
		return seq;
	}

	public String getAnswer() {
		return answer;
	}

	public String getInfo() {
		return info;
	}

	public int getNum() {
		return num;
	}

	public String getUnder() {
		return under;
	}

}
