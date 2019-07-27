package com.byzoro.yjzhdatastorage.service.esImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EsMappingDef {

	public final static int ES_SHARDS = 9;   //分片，提高写入性能（根据实际环境适配）
	public final static int ES_REPLICAS = 0;	//备份（根据实际环境适配）创建的新索引一般没有副本，提高插入速度
	public static Map<String, String> ES_TABLE = new HashMap<String, String>();
	public static Map<String, String[]> ES_TABLEMAP = new HashMap<String, String[]>();
	
	public static final String BS_NODE_STATUS         = "51";//节点运行状态
	public static final String BS_FORCE_RESOLVE       = "52";//递归节点强制域名解析统计信息
	public static final String BS_CACHE               = "53";//递归节点缓存侧统计信息
	public static final String BS_ITERATION           = "54";//递归节点迭代侧统计信息
	public static final String BS_INITIATIVE_NODE     = "55";//主动监测节点统计信息
	public static final String BS_PASSIVE_NODE        = "56";//被动监测节点统计信息
	public static final String BS_INFORMATION_EXTRACT = "57";//信息提取节点统计信息
	public static final String BS_MULTI_COLLECT_NODE  = "58";//多源采集节点统计信息
	public static final String BS_DATABASE_NODE       = "59";//数据库节点统计信息
	public static final String BS_EMERGENCY_NODE      = "60";//应急响应节点统计信息
	public static final String BS_WARNING_BUSINESS    = "61";//预警统计信息
	public static final String BS_USER                = "62";//递归节点用户侧域名解析排行统计信息
	public static final String BS_RECURSIVE_DR        = "63";//递归节点递归侧域名解析排行统计信息
	public static final String BS_ITERATION_DR        = "64";//递归节点迭代侧域名解析排行统计信息

	//节点运行状态
	public static String[] bs_node_status = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"cityId,keyword",
		"serverNum,keyword",
		"nodeStatus,keyword",
		"statusMsg,keyword",
		"nodeQps,keyword",
		"payloadRate,keyword",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//递归节点强制域名解析统计信息
	public static String[] bs_force_resolve = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//递归节点缓存侧统计信息
	public static String[] bs_cache={
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"queryCnt,keyword",
		"sucRespCnt,keyword",
		"resolveAvgT,keyword",
		"tldList,nested",
		"aQueryCnt,keyword",
		"aaaaQueryCnt,keyword",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//递归节点迭代侧统计信息
	public static String[] bs_iteration = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"rootList,nested",
		"rcopyRCnt,keyword",
		"rcopyRAvgT,keyword",
		"tldList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//主动监测节点统计信息
	public static String[] bs_initiative_node = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"monList,nested",
		"testStat,nested",
		"domainCheckNum,keyword",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//被动监测节点统计信息
	public static String[] bs_passive_node = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"dataStat,nested",
		"monList,nested",
		"resolveAvgT,keyword",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//应急响应节点统计信息
	public static String[] bs_emergency_node = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"queryCnt,keyword",
		"sucRespCnt,keyword",
		"resolveAvgT,keyword",
		"resStat,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//信息提取节点统计信息
	public static String[] bs_information_extract = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"dataStat,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//数据库节点统计信息
	public static String[] bs_database_node = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//多源采集节点统计信息
	public static String[] bs_multi_collect_node = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"dataStat,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//预警统计信息
	public static String[] bs_warning_business = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//递归节点用户侧域名解析排行统计信息
	public static String[] bs_user = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"domainNum,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	////递归节点递归侧域名解析排行统计信息
	public static String[] bs_recursive_dr = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"tldNum,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	//递归节点迭代侧域名解析排行统计信息
	public static String[] bs_iteration_dr = {
		"nodeId,keyword",
		"orgId,keyword",
		"subsysId,keyword",
		"intfId,keyword",
		"tldNum,keyword",
		"statList,nested",
		"statPeriod,keyword",
		"timeStamp,keyword",
		"dataTag,keyword"
	};

	static {
		ES_TABLE.put(BS_NODE_STATUS, "bs_node_status");
		ES_TABLE.put(BS_FORCE_RESOLVE, "bs_force_resolve");
		ES_TABLE.put(BS_CACHE, "bs_cache");
		ES_TABLE.put(BS_ITERATION, "bs_iteration");
		ES_TABLE.put(BS_INITIATIVE_NODE, "bs_initiative_node");
		ES_TABLE.put(BS_PASSIVE_NODE, "bs_passive_node");
		ES_TABLE.put(BS_EMERGENCY_NODE, "bs_emergency_node");
		ES_TABLE.put(BS_INFORMATION_EXTRACT, "bs_information_extract");
		ES_TABLE.put(BS_DATABASE_NODE, "bs_database_node");
		ES_TABLE.put(BS_MULTI_COLLECT_NODE, "bs_multi_collect_node");
		ES_TABLE.put(BS_WARNING_BUSINESS, "bs_warning_business");
		ES_TABLE.put(BS_USER, "bs_user");
		ES_TABLE.put(BS_RECURSIVE_DR, "bs_recursive_dr");
		ES_TABLE.put(BS_ITERATION_DR, "bs_iteration_dr");
	}

//	static {
//		ES_TABLEMAP.put("bs_node_status", bs_node_status);
//		ES_TABLEMAP.put("bs_force_resolve", bs_force_resolve);
//		ES_TABLEMAP.put("bs_cache", bs_cache);
//		ES_TABLEMAP.put("bs_iteration", bs_iteration);
//		ES_TABLEMAP.put("bs_initiative_node", bs_initiative_node);
//		ES_TABLEMAP.put("bs_passive_node", bs_passive_node);
//		ES_TABLEMAP.put("bs_emergency_node", bs_emergency_node);
//		ES_TABLEMAP.put("bs_information_extract", bs_information_extract);
//		ES_TABLEMAP.put("bs_database_node", bs_database_node);
//		ES_TABLEMAP.put("bs_multi_collect_node", bs_multi_collect_node);
//		ES_TABLEMAP.put("bs_warning_business", bs_warning_business);
//		ES_TABLEMAP.put("bs_user", bs_user);
//		ES_TABLEMAP.put("bs_recursive_dr", bs_recursive_dr);
//		ES_TABLEMAP.put("bs_iteration_dr", bs_iteration_dr);
//	}
	static {
		ES_TABLEMAP.put(BS_NODE_STATUS, bs_node_status);
		ES_TABLEMAP.put(BS_FORCE_RESOLVE, bs_force_resolve);
		ES_TABLEMAP.put(BS_CACHE, bs_cache);
		ES_TABLEMAP.put(BS_ITERATION, bs_iteration);
		ES_TABLEMAP.put(BS_INITIATIVE_NODE, bs_initiative_node);
		ES_TABLEMAP.put(BS_PASSIVE_NODE, bs_passive_node);
		ES_TABLEMAP.put(BS_EMERGENCY_NODE, bs_emergency_node);
		ES_TABLEMAP.put(BS_INFORMATION_EXTRACT, bs_information_extract);
		ES_TABLEMAP.put(BS_DATABASE_NODE, bs_database_node);
		ES_TABLEMAP.put(BS_MULTI_COLLECT_NODE, bs_multi_collect_node);
		ES_TABLEMAP.put(BS_WARNING_BUSINESS, bs_warning_business);
		ES_TABLEMAP.put(BS_USER, bs_user);
		ES_TABLEMAP.put(BS_RECURSIVE_DR, bs_recursive_dr);
		ES_TABLEMAP.put(BS_ITERATION_DR, bs_iteration_dr);
	}
}
