pom.xml backup

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <properties>
    <start-class>com.primefaces.example.DemoApplication</start-class>
  </properties>

  <parent>
    <groupId>org.joinfaces</groupId>
    <artifactId>joinfaces-parent</artifactId>
    <version>3.2.1</version>
    <relativePath /> <!-- lookup parent from repository -->
  </parent>

  <groupId>com.primefaces.example</groupId>
  <artifactId>Primefaces</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <dependencies>
    <!-- spring-boot -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <!-- joinfaces -->
    <dependency>
      <groupId>org.joinfaces</groupId>
      <artifactId>primefaces-spring-boot-starter</artifactId>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
    </dependency>

    <dependency>
      <groupId>org.joinfaces</groupId>
      <artifactId>primefaces-spring-boot-starter</artifactId>
    </dependency>
    <!-- https://mvnrepository.com/artifact/net.sf.dozer/dozer -->
    <dependency>
      <groupId>net.sf.dozer</groupId>
      <artifactId>dozer</artifactId>
      <version>5.5.1</version>
    </dependency>

  </dependencies>

  <build>
    <plugins>
      <!-- spring-boot-maven-plugin -->
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
      </plugin>
      <plugin>
        <groupId>com.spotify</groupId>
        <artifactId>docker-maven-plugin</artifactId>
        <version>0.4.11</version>
        <configuration>
          <imageName>hackathon/machineanalysis</imageName>
          <baseImage>java:8</baseImage>
          <entryPoint>["java", "-jar", "-Dspring.profiles.active=distributed", "/${project.build.finalName}.jar"]
          </entryPoint>
          <!-- copy the service's jar file from target into the root directory of the image -->
          <resources>
            <resource>
              <targetPath>/</targetPath>
              <directory>${project.build.directory}</directory>
              <include>${project.build.finalName}.jar</include>
            </resource>
          </resources>
        </configuration>
        <executions>
          <execution>
            <id>build</id>
            <phase>install</phase>
            <goals>
              <goal>build</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
  <packaging>jar</packaging>
</project>