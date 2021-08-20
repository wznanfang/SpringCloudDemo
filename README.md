# SpringCloudDemo
SpringCloudDemo简单示例，使用nacos作为服务配置中心
### 项目简介
#### 项目架构
> springboot版本：2.4.9，
> nacos控制台版本：2.0.3，下载地址https://github.com/alibaba/nacos/releases，在解压后的文件的/bin目录下，windows系统启动命令：.\startup.cmd -m standalone 
> 就可以启动nacos，linux或mac执行以下命令启动nacos：sh startup.sh -m standalone，账号/密码：nacos/nacos
> 
> sentinel控制台版本：1.8.1，下载地址为https://github.com/alibaba/Sentinel/releases，启动命令如下：java -Dserver.port=8748 -Dcsp.sentinel.dashboard.
> server=localhost:8748 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.1.jar，账号/密码：sentinel/sentinel
> 
> springCloud版本：Hoxton.SR10
> 
> spring-cloud-alibaba版本：2021.1
> 
> openfeign版本：3.0.3
> 
> loadbalancer版本：3.0.3
> 
> gateway版本：3.0.1
> 
> alibaba-sentinel版本：2021.1
> 
> 上述仅说明主要引用，详情依赖见各pom.xml文件
