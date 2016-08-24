package com.factory.podstudio.listen.repository;

import java.util.List;

import com.factory.podstudio.listen.model.Listen;

public interface IListenDao {
	List<Listen> selectListenRankingByListenCount(Listen listen);
}
