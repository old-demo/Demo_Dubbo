dubbo+maven+spring+mybatis整合：
	dubbo版本：2.5.3
	zookeeper版本：3.4.6
	spring版本：4.1.5.RELEASE
	mybatis版本：3.4.0
	
Demo_Dubbo    		： 主示例项目
Demo_DubboApi 		：底层模块，主要引用jar，创建工具类。注：创建test包是为了测试dubbo
Demo_DubboProducer  ：测试模块，用来测试Mybatis数据访问，dubbo服务提供
Demo_DubboConsumer  ：测试模块，用来测试springMVC，dubbo服务消费

参考文档：
	maven搭建多模块企业级项目：		http://www.cnblogs.com/quanyongan/archive/2013/05/28/3103243.html
	
	DUBBO官网：				http://dubbo.io/
	Dubbo+Zookeeper+Spring：	http://blog.csdn.net/hejingyuan6/article/details/47403299
	
	zookeeper原理				http://cailin.iteye.com/blog/2014486
	Zookeeper系列				http://blog.csdn.net/tswisdom/article/details/41522069		

备注：
1.本示例须在 ‘JDK7’的环境下方可运行。如是‘JDK8’，请参考：
	http://blog.csdn.net/futureluck/article/details/50081611
2.如果xml配置文件中dubbo报错，请参考：
	http://blog.csdn.net/happylife_haha/article/details/52755425
3.数据库使用Druid。具体原因：
	http://blog.csdn.net/xzknet/article/details/49127701
