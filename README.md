# spring-cloud-demo
##### 系统框架演变

​	集中式架构-->垂直拆分-->分布式服务-->soa-->微服务

##### 远程调用方式

​	1.rpc     2.http

​	hppt客户端

RestTemplate

​	Spring提供了一个RestTemplate模板工具类，对基于Http的客户端进行了封装，并且实现了对象与json的序   		列化和反序列化，非常方便

​	

##### SpringCloud 

组件:

​netflix:

   	 Eureka：注册中心

​	Zuul：服务网关

​	Ribbon：负载均衡

​	Feign：服务调用

​	Hystix：熔断器



