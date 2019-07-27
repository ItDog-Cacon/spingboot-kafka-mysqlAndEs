package com.byzoro.yjzhdatastorage.service.esImpl;


import java.util.concurrent.TimeUnit;
import org.elasticsearch.action.bulk.BulkProcessor;
import org.elasticsearch.action.index.IndexRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

@Component
public class EsBulk {

	@Autowired
	private EsBulkProcessor esBulkProcessor;

	/**单例批量处理实例*/
	private BulkProcessor bulkProcessor;

	@PostConstruct
	public void init() {
		bulkProcessor = this.esBulkProcessor.initBulkProcessor();
	}

	/**关闭es的bulk请求**/  
	public void closeESBulk(){  
	    try{  
	    	bulkProcessor.awaitClose(3, TimeUnit.MINUTES);//阻塞至所有的请求线程处理完毕后，断开连接资源
	    }catch(Exception e){  
	        e.printStackTrace();  
	    }  
	}  
	/**批量建索引伪代码**/      
	public void buildIndex(IndexRequest request) throws Exception{
			try{
				bulkProcessor.add(request);
			}catch(Exception e){
				e.getMessage();
			}
	}  
}
