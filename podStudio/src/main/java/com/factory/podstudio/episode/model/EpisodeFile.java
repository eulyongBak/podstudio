package com.factory.podstudio.episode.model;

public class EpisodeFile {
	private int episodeFileNo;
	private String episodeNo;
	private String episodeFileName;
	
	public int getEpisodeFileNo() {
		return episodeFileNo;
	}
	
	public void setEpisodeFileNo(int episodeFileNo) {
		this.episodeFileNo = episodeFileNo;
	}
	
	public String getEpisodeNo() {
		return episodeNo;
	}
	
	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}
	
	public String getEpisodeFileName() {
		return episodeFileName;
	}
	
	public void setEpisodeFileName(String episodeFileName) {
		this.episodeFileName = episodeFileName;
	}
	
	@Override
	public String toString() {
		return "EpisodeFile [episodeFileNo=" + episodeFileNo + ", episodeNo=" + episodeNo + ", episodeFileName="
				+ episodeFileName + "]";
	}
}
