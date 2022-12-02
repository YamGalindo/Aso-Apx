# Run the integration tests

## Requirements

* Configure Global Testing maven repository: https://globaldevtools.bbva.com/artifactory-api/repository-testing-global-maven
* Generate the &lt;apiKey&gt; in [Testing Portal](https://globaldevtools.bbva.com/testing)
* Access to required Data Manager namespace

## Local standalone execution

```shell
mvn clean verify -Dbackends=aso=<aso-endpoint> -DdefaultBackend=aso -Ddata.manager.namespace=<datamanager-namespace> -Ddata.manager.apikey=<apikey>
```

* **aso-endpoint**: Can any local accesible aso endpoint, e.g: https://ei-servicios.bbva.es/ASO, http://ei-arqaso.igrupobbva:7050, https://int-arqaso.work.es.nextgen.igrupobbva:8150, ... 
* **datamanager-namespace**: Data Manager namespace where test data is store.
* **apikey**: API Key to be granted access to Data Manager.

If your machine is connected to the corporate network you have to specify an internal proxy to reach data manager services using the option **data.manager.proxy**, for example:

```shell
mvn clean verify -Dbackends=aso=<aso-endpoint> -DdefaultBackend=aso -Ddata.manager.namespace=<datamanager-namespace> -Ddata.manager.apikey=<apikey> -Ddata.manager.proxy=socks5://proxyvip.igrupobbva:1080
```

Tests can be executed from IDE as an standard junit execution providing previous system properties in related run configuration