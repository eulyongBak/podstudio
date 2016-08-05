package com.factory.podstudio.notice.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.factory.podstudio.notice.model.Notice;
@Repository
public class NoticeDaoImpl implements INoticeDao {
	
	private static final String NAME_SPACE ="com.factory.podstudio.notice.repository.NoticeMapper";
	
	@Autowired 
	private SqlSessionTemplate sqlSessionTemplateNotice;
	
	@Override
	public List<Notice> selectNotice(Map<String, Object> map) {
		return sqlSessionTemplateNotice.selectList(NAME_SPACE+".selectNotice", map);
	}

	@Override
	public int selectTotalCount() {
		return sqlSessionTemplateNotice.selectOne(NAME_SPACE+".selectTotalCount");
	}

	@Override
	public int insertNotice(Notice notice) {
		return sqlSessionTemplateNotice.insert(NAME_SPACE +".insertNotice", notice);
	}

	@Override
	public Notice noticeOne(Notice notice) {
		return sqlSessionTemplateNotice.selectOne(NAME_SPACE+".selectOneNotice", notice);
	}

	@Override
	public int modifyNotice(Notice notice) {
		return sqlSessionTemplateNotice.update(NAME_SPACE+".modifyNotice", notice);
	}

	@Override
	public int deleteNotice(Notice notice) {
		return sqlSessionTemplateNotice.delete(NAME_SPACE+".deleteNotice", notice);
	}

}
