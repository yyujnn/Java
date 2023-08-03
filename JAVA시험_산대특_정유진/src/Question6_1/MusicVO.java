package Question6_1;

public class MusicVO {
	private String title; // 노래 제목
	private String singer; // 가수 이름
	private int playTime; // 노래 길이
	

	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	// get
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}
	// set

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	@Override
	public String toString() {
		return "제목 : " + title + "\t 가수 : " + singer + "\t시간:" + playTime;
	}

}
