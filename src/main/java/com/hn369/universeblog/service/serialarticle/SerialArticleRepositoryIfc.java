package com.hn369.universeblog.service.serialarticle;

import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

public interface SerialArticleRepositoryIfc {
	SerialArticle findByUuid(String uuid);
}
