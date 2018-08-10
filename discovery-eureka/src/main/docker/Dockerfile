# 基于镜像 java
FROM java:8

# 将本地文件夹挂载到当前容器
VOLUME /root/test-ci/logs

# 复制文件到容器
ADD discovery-eureka-0.0.1-SNAPSHOT.jar discovery-eureka.jar
RUN bash -c 'touch /discovery-eureka.jar'

# 声明需要暴露的端口
EXPOSE 5008

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/discovery-eureka.jar"]