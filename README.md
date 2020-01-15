# SpringMVC
Spring Web 框架入门
* Spring Web 
* Spring MVC 表单处理
* Spring MVC 页面重定向
* Spring MVC 异常处理 

##SpringMVC的DAO层、Service层、Controller层和View层 
* DAO层  
DAO层主要是做数据持久层的工作，负责与数据库进行联络的一些任务都封装在此，DAO层的设计首先是设计DAO的接口，然后在Spring的配置文件中定义此接口的实现类，然后就可在模块中调用此接口来进行数据业务的处理，而不用关心此接口的具体实现类是哪个类，显得结构非常清晰，DAO层的数据源配置，以及有关数据库连接的参数都在Spring的配置文件中进行配置。
* Service层  
Service层主要负责业务模块的逻辑应用设计。
* Controller层
Controller层负责具体的业务模块流程的控制。  
* View层  
此层与控制层结合比较紧密，需要二者结合起来协同工发。View层主要负责前台jsp页面的表示  

Service层是建立在DAO层之上的，建立了DAO层后才可以建立Service层，而Service层又是在Controller层之下的，因而Service层应该既调用DAO层的接口，又要提供接口给Controller层的类来进行调用，它刚好处于一个中间层的位置。每个模型都有一个Service接口，每个接口分别封装各自的业务处理方法。


