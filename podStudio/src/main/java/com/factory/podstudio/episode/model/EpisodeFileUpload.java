package com.factory.podstudio.episode.model;

import org.springframework.web.multipart.MultipartFile;

public class EpisodeFileUpload {
	private MultipartFile EpisodeFile;

	public MultipartFile getEpisodeFile() {
		return EpisodeFile;
	}

	public void setEpisodeFile(MultipartFile episodeFile) {
		EpisodeFile = episodeFile;
	}

	@Override
	public String toString() {
		return "EpisodeFileUpload [EpisodeFile=" + EpisodeFile + "]";
	}
}
