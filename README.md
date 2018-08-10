# Spring Boot For Docker CI Starter

Spring结合Docker实现CI案例

# master分支: 
基本保持Spring项目初始化状态
- 添加SpringCloud，实现eureka、provider和consumer（Eureka依赖、Feign调用依赖）
- 替换SpringBoot自带日志logback为log4j，统一日志输出
- 添加Docker构建镜像脚本和Docker-compose启动脚本
- 添加provider-user和consumer-user模块的Dockerfile，统一端口配置
