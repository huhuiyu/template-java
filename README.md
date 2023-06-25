# java模板项目

## maven相关网站

- [maven官方网站](https://maven.apache.org/)
- [阿里云maven镜像指南](https://developer.aliyun.com/mvn/guide)

## 脚本相关

- 将[java环境配置模板文件](/scripts/java-home-template.ps1)复制一份，修改名称为`java-home.ps1`，然后更改里面的jdk路径为真实路径
- 将[maven环境配置模板文件](/scripts/maven-home-template.ps1)复制一份，修改名称为`maven-home.ps1`，然后更改里面的maven路径为真实路径
- 在vscode的终端（或者powershell中）中执行`test-jdk.ps1`脚本测试配置是否正确（可以看到java版本信息）
- 在vscode的终端（或者powershell中）中执行`test-maven.ps1`脚本测试配置是否正确（可以看到maven版本信息）
- 在vscode的终端（或者powershell中）中执行`java-cmd.ps1`脚本可以得到一个配置过java环境变量的命令行，可以执行java相关指令
- 在vscode的终端（或者powershell中）中执行`maven-cmd.ps1`脚本可以得到一个配置过maven环境变量的命令行，可以执行maven相关指令

## 指令相关

- 创建项目指令：`mvn archetype:generate -s D:\git\template-project\template-java\scripts\settings.xml  "-DgroupId=top.huhuiyu.template" "-DartifactId=javaproject" "-DarchetypeArtifactId=maven-archetype-quickstart" "-DinteractiveMode=false"`
- 参数说明：`-s是指定maven的配置文件`,`DgroupId是项目组id`,`DartifactId是项目名称`，其它请参考maven官方文档

## 模板项目说明

- 对指令创建的项目（pom.xml）做了如下修改
- 添加了文件编码配置
- 添加了编译等级配置
- 修改测试框架为jupiter
- 添加了阿里云maven远程仓库地址
