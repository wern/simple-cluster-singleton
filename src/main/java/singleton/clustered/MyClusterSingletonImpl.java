package singleton.clustered;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Startup
@Singleton(name = "MyClusterSingleton")
public class MyClusterSingletonImpl {

	@PostConstruct
	public void sayHello() {
		System.out.println("Cluster Singleton wird geSTARTet!");
	}

	@PreDestroy
	public void sayBye() {
		System.out.println("Cluster Singleton wird geSTOPt!");
	}

}
