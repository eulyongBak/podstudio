/*package com.factory.podstudio.episode.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.episode.model.EpisodeFile;

@Repository
public class EpisodeFileDaoImpl implements IEpisodeFileDao {
	private final String NAME_SPACE_EPISODE = "com.factory.podstudio.episode.repository.EpisodeMapper";
	@Autowired
	SqlSessionTemplate sqlSessionTemplateEpisodeFile;

	@Override
	public int insertEpisodeFile(EpisodeFile episodeFile) {
		return sqlSessionTemplateEpisodeFile.insert(NAME_SPACE_EPISODE+".insertEpisodeFile", episodeFile);
	}
	
}
*/