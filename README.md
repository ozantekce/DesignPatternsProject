# DesignPatternsProject
 
**EXPLANATION ON UTILIZED DESIGN PATTERNS**<br />

**Observer pattern**<br />
> Displayer is loosely coupled with services , services send information to displayer with update when necessary , there is no other relationship between them<br />

**Singleton pattern**<br />

>All watches must use same object for same service, so singleton must be used . Services are unique classes . They cannot be defined externally<br />

**Decorator pattern**<br />

>The displayer can be decorated with the decorator class and they can gain additional features . For example weather displayer add show weather feature to current displayer.<br />
	
**Strategy pattern**<br />

>Each watch contains a displayer , this displayer can be changed at runtime and this displayer provides extra features<br />
 
 **UML CLASS DIAGRAM**
 ![image](https://user-images.githubusercontent.com/32203867/175835787-93cc143f-82c3-4e67-a1e5-c0503d564c6f.png)
