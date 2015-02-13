package org.xmdlab.cartridge.generator.dsl.templates

import com.google.inject.Inject
import org.xmdlab.cartridge.generator.dsl.generator.GeneratorProperties
import org.xmdlab.cartridge.generator.dsl.cartridgeDsl.DslCartridge

/**
 * 
 */
class PomXmlTpl {

	@Inject extension GeneratorProperties generatorProperties

	/**
	 * 
	 */
	def generate(DslCartridge dslCartridge) '''
<?xml version="1.0" encoding="UTF-8"?>
<project xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"
  xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <modelVersion>4.0.0</modelVersion>
  <parent>
    <groupId>org.xmdlab.cartridges</groupId>
    <artifactId>xmdlab-cartridges</artifactId>
    <version>0.1.0-SNAPSHOT</version>
    <relativePath>../pom.xml</relativePath>
  </parent>

  <artifactId>org.xmdlab.cartridge.«cartridgeName»</artifactId>
  <name>Xmdlab «cartridgeName» cartridge module [${project.artifactId}]</name>
  <description>Xgen «cartridgeName» cartridge module [${project.artifactId}]</description>

  <build>
    <plugins>
      <plugin>
        <groupId>org.eclipse.xtext</groupId>
        <artifactId>xtext-maven-plugin</artifactId>
        <executions>
          <execution>
            <goals>
              <goal>generate</goal>
            </goals>
          </execution>
        </executions>
        <configuration>
          <languages>
            <language>
              <setup>org.xmdlab.cartridge.generator.dsl.CartridgeDslStandaloneSetup</setup>
              <outputConfigurations>
                <outputConfiguration>
                  <outputDirectory>src-gen</outputDirectory>
                </outputConfiguration>
              </outputConfigurations>
            </language>
          </languages>
        </configuration>
        <dependencies>
          <dependency>
            <groupId>org.xmdlab.cartridge.generator</groupId>
            <artifactId>org.xmdlab.cartridge.generator.dsl</artifactId>
            <version>${project.version}</version>
          </dependency>
        </dependencies>
      </plugin>
      
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>build-helper-maven-plugin</artifactId>
        <executions>
          <execution>
            <id>add-source</id>
            <phase>generate-sources</phase>
            <goals>
              <goal>add-source</goal>
            </goals>
            <configuration>
              <sources>
                <source>src-gen</source>
                <source>xtend-gen</source>
              </sources>
            </configuration>
          </execution>
        </executions>
      </plugin>

      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-clean-plugin</artifactId>
        <configuration>
          <filesets>
            <fileset>
              <directory>src-gen</directory>
              <excludes>
                <exclude>.gitignore</exclude>
              </excludes>
            </fileset>
            <fileset>
              <directory>xtend-gen</directory>
              <excludes>
                <exclude>.gitignore</exclude>
              </excludes>
            </fileset>
          </filesets>
        </configuration>
      </plugin>

      <plugin>
        <groupId>org.eclipse.xtend</groupId>
        <artifactId>xtend-maven-plugin</artifactId>
        <executions>
          <execution>
            <goals>
              <goal>compile</goal>
              <goal>xtend-install-debug-info</goal>
            </goals>
          </execution>
        </executions>
      </plugin>

      <plugin>
        <groupId>org.eclipse.tycho</groupId>
        <artifactId>tycho-source-plugin</artifactId>
      </plugin>
    </plugins>
  </build>

  <dependencies>
    <dependency>
      <groupId>org.xmdlab.cartridges</groupId>
      <artifactId>org.xmdlab.cartridge.common</artifactId>
      <version>${project.version}</version>
    </dependency>

    <dependency>
      <groupId>org.xmdlab.dsls</groupId>
      <artifactId>«cartridgeDslModel»</artifactId>
      <version>${project.version}</version>
    </dependency>

    <dependency>
      <groupId>org.xmdlab.mm</groupId>
      <artifactId>«cartridgeMetaModel»</artifactId>
      <version>${project.version}</version>
    </dependency>

    <dependency>
      <groupId>org.eclipse.xtext</groupId>
      <artifactId>org.eclipse.xtext.xtext</artifactId>
    </dependency>
    <dependency>
      <groupId>org.eclipse.xtext</groupId>
      <artifactId>org.eclipse.xtext.xbase</artifactId>
    </dependency>

    <dependency>
      <groupId>com.typesafe</groupId>
      <artifactId>config</artifactId>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>log4j-over-slf4j</artifactId>
    </dependency>
    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>jcl-over-slf4j</artifactId>
    </dependency>
  </dependencies>
</project>'''
}
