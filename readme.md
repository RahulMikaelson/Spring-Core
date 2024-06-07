# Spring Core

Learning Spring Core Fundamentals

### Explanation (Loose Coupling)

To run GameRunner we need an object of a game class. but now we have made an interface and that interface is implemented by both MarioGame and PackMan Game  and we made GameRunner class to be dependent on the Interface so that we have to pass any of the game class still it will be working as expected in this way we have achieved loose coupling.


### Loose Coupling using Spring
We have created a Configuration class called Game Config in which we Configure all the beans(Objects). This beans are used as objects for their respective class. Beans are created by Spring so this gives use the advantage of spring managing all the beans(objects).
## Usage
```

@Bean
public PackManGame packManGame(){
    return new PackManGame();
}
This is how a object for the class is created. By using the annotation @Bean spring creates a object for the respective class.


@Configuration
public class GameConfig{
}
By annotating the class as @Configuration the Spring checks into the class and creates the beans for the classes to which it is annotated with @Bean


@ComponentScan{basePackages="com.demo"}
Using this annotation spring looks for classes under this packages to create the beans for the classes under it. As defined the spring looks only for the classes under the packge "com.demo".


@Primary
If we are having two beans of same class then while calling the specific class's bean spring will be confused to which bean i have to take as input. so by adding @Primary annotation spring will by default takes bean which is annotated as @Primary.


@Qualifier
This annotation will also works mostly same as the @Primary annotation but the difference lies is when we are having multiple beans of same classes and we want to use specific bean the we will annotate with @Qualifier annotation and give it a input name. so when ever we want to call a specific bean then we will use Qualifer annotation.
```

### Spring Container

```
public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GameConfig.class);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}
 this is where Spring Container is created. "AnnotationConfigApplicationContext(GameConfig.class);" this will created a Container of beans by scanning the configuration class as we discussed in the above annotations. so it creates all beans and store all of them in the spring container. the object returned by AnnotationConfigApplicationContext(GameConfig.class) this will return the context and from this context we will be getting all beans by using the fucntion ".getBean()". By this we can achive loose coupling with the help of spring which is responsible for all bean life cycle.

```