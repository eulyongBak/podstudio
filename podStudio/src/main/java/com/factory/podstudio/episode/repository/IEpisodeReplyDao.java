package com.factory.podstudio.episode.repository;

import java.util.List;
import java.util.Map;

import com.factory.podstudio.episode.model.EpisodeReply;

public interface IEpisodeReplyDao {
	List<EpisodeReply> episodeReplyList(Map<String ,Object> map);
}
