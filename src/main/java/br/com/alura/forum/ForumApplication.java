package br.com.alura.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
import org.springframework.cache.annotation.EnableCaching;
=======
<<<<<<< HEAD
>>>>>>> bbf2bbea1e0116e0e609cb171910bee197b9e690
>>>>>>> 700a712bcca54c8f26d7c12b7bd7ab04f79af085
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSpringDataWebSupport
<<<<<<< HEAD
@EnableCaching
@EnableSwagger2
=======
<<<<<<< HEAD
@EnableCaching
@EnableSwagger2
public class ForumApplication extends SpringBootServletInitializer {
=======
<<<<<<< HEAD
@EnableCaching
@EnableSwagger2
=======
<<<<<<< HEAD
@EnableCaching
@EnableSwagger2
=======
<<<<<<< HEAD
@EnableCaching
=======
<<<<<<< HEAD
@EnableCaching
=======
<<<<<<< HEAD
@EnableCaching
=======
=======

@SpringBootApplication
>>>>>>> 8d20120058d7729b68641a7af43324c6d512cae8
>>>>>>> bbf2bbea1e0116e0e609cb171910bee197b9e690
>>>>>>> 700a712bcca54c8f26d7c12b7bd7ab04f79af085
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
public class ForumApplication {
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3

	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ForumApplication.class);
	}

}
