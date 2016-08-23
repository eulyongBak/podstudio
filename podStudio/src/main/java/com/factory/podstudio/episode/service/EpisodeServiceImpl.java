package com.factory.podstudio.episode.service;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.episode.model.EpisodeFile;
import com.factory.podstudio.episode.repository.EpisodeDaoImpl;

@Service
public class EpisodeServiceImpl implements IEpisodeService {
	@Autowired
	EpisodeDaoImpl episodeDao;
	@Autowired
	EpisodeDaoImpl episodeFileDao;
	
	//File을 DB에 저장하기 위한 DAO
	// @Autowired
	// private ArticleFileDao articleFileDao;
	
	/*
	@Override
	public Episode insertEpisode(EpisodeFileUpload episodeFileUpload, HttpServletRequest request) {
		
		// 1. Article 안의 File을 물리적 저장장소(폴더)에 저장
		// 1-1 file을 꺼낸다.
		// 1-2 파일의 마임타입을 알아서 한다.
		// 1-3 filename의 확장자와 새로만들어지는 이름 새로운 파일로만들겠다.
		// 1-4 프로젝트 안에 경로를 어떻게 잡을지..
		MultipartFile file = episodeFileUpload.getEpisodeFile();
		String rootPath = request.getSession().getServletContext().getRealPath("/");
		File destFile = new File(rootPath+"resources/"+file.getOriginalFilename());
		
		try {
			file.transferTo(destFile);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		// 2. Article 안에서 DAO 에게 넘겨줄 값을 가공한다.
		// 나머지도 다 추가하라.
		
		Episode episode = new Episode();
		episode.setEpisodeTitle(episodeFileUpload.getEpisodeTitle()); //??
		EpisodeFile episodeFile = new EpisodeFile();
		
		int episodeNo = episodeDao.insertEpisode(episode);
		episodeFile.setEpisodeNo(episodeNo);
		episodeDao.insertEpisodeFile(episodeFile);
		
		Episode episode = new Episode();
		episode.setEpisodeTitle(file.getOriginalFilename());
		return episode;
		
		
			MultipartFile file = articleCommand.getArticleFile();
			String root_path = request.getSession().getServletContext().getRealPath("/");  
			logger.info(file.getOriginalFilename());
			File destFile = new File(root_path + "resources/" + file.getOriginalFilename());
			try {
				file.transferTo(destFile);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// 2. Article 안에서 DAO 에게 넘겨줄 값을 가공한다.
			// 나머지도 다 추가하라.
			// Article article = new Article();
			// article.setArticleTitle(articleCommand.getArticleTitle());
			// ArticleFile articleFile = new ArticleFile();
			//
			// int articleNo = articleDao.insertArticle(article);
			// articleFile.setArticleNo(articleNo);
			// articleFileDao.insertARticleFile(articleFile);
			Article article = new Article();
			article.setArticleTitle(file.getOriginalFilename());
			return article;
		
	}
	*/
	
	@Override
	public List<Episode> selectEpisodeListByPodCastNo(Episode episode) {
		return episodeDao.selectEpisodeListByPodCastNo(episode);
	}
	@Override
	public void modifyEpisodeByEpisodeNo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteEpisodeByEpisodeNo() {
		// TODO Auto-generated method stub
		
	}
	
	//에피소드 리스트(controller -> service -> dao -> mapper) - 제작자 권한
	@Override
	public List<Episode> selectEpisodeByUserNo(Episode episode) {
		return episodeDao.selectEpisodeByUserNo(episode);
	}
	
	//에피소드 등록 - multiPartFileUpload cafejjdev
	@Override
	@Transactional
	public int insertEpisode(Episode episode, MultipartFile[] files, String path) {
		episodeDao.insertEpisode(episode);
		   
	    //db에서 입력 후 자동증가값을 받아옴.
	    String episodeNo = episode.getEpisodeNo();
	   
	    for(MultipartFile f : files){
	        EpisodeFile episodeFile = new EpisodeFile();
	        episodeFile.setEpisodeNo(episodeNo);
	        episodeFile.setEpisodeFileName(f.getOriginalFilename());
	        //episodeFileDao.insertEpisodeFile(episodeFile);
	        //왜 에러났는지 모르겠다..
	       
	        File destFile = new File(path+"/"+f.getOriginalFilename());
	               
	        try {
	            FileUtils.writeByteArrayToFile(destFile, f.getBytes());
	        } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("파일입력 실패!");
	        }
	    }
	    return 0;
	}

}
