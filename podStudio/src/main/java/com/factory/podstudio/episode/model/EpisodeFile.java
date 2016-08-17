package com.factory.podstudio.episode.model;

public class EpisodeFile {
	private int episodeFileNo;
	private int episodeNo;
	private String episodePath;
	
	public int getEpisodeFileNo() {
		return episodeFileNo;
	}
	
	public void setEpisodeFileNo(int episodeFileNo) {
		this.episodeFileNo = episodeFileNo;
	}
	
	public int getEpisodeNo() {
		return episodeNo;
	}
	
	public void setEpisodeNo(int episodeNo) {
		this.episodeNo = episodeNo;
	}
	
	public String getEpisodePath() {
		return episodePath;
	}
	
	public void setEpisodePath(String episodePath) {
		this.episodePath = episodePath;
	}
	
	@Override
	public String toString() {
		return "EpisodeFile [episodeFileNo=" + episodeFileNo + ", episodeNo=" + episodeNo + ", episodePath="
				+ episodePath + "]";
	}
	
	
}
