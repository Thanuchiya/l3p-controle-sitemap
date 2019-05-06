Contrôle Sitemap avec utilisation de la librairie JAXB et l'outil XJC (16/04/2019)


1. Créer un projet Spring Boot 2 à partir de Spring Initializr, le nom du projet (l'`artifactId`) sera **l3p-controle-sitemap**

2. Créer un repo Git "l3p-controle-sitemap" dans lequel vous pousserez votre projet

3. Importer JUnit et JAXB (si nécessaire version 2.3.0)

4. La classe **Sitemap** sera générée à l'aide d'un fichier XSD et de l'outil XJC. Vous pouvez ommettre cette partie si vous perdez trop de temps et faire la classe Java à la main.

	* La documentation du protocole sitemap (présent ici: https://www.sitemaps.org/protocol.html ) vous permettra de connaitre les champs du sitemap à générer

	* Astuce Sitemap: N'utilisez que `<urlset>`, `<url>` (liste), `<loc>` (string) et `<lastmod>` (string)

	* Astuce JAXB: Vous aurez besoin de `@XmlRootElement`, `@XmlElement`, `@XmlAttribute`


5. Créer une service `SitemapService` de type `@Component`, ce service possèdera 2 fonctionnalités


	* Générer un objet Java de type `Sitemap` à partir d'un XML

	* Générer un XML à partir d'un objet Java de type `Sitemap`


6. Créer une classe de test unitaire `SitemapServiceTest` avec toutes les méthodes nécessaires vu en cours

7. Placez un fichier *sitemap.xml* dans */resources* de Maven. Créez un `@RestController` qui vous permettra de récupérer le sitemap à via une route **GET**

	* Vous pouvez utiliser la méthode `getClass().getResourceAsStream("/sitemap.xml")` pour récupérer le fichier sous forme de flux, puis utiliser votre `SitemapService` pour le transformer en objet Java.


## Solution


Commande pour générer les classes à partir du fichier XSD

```

l3p-controle-sitemap-correction> xjc -d .\src\main\java\fr\ekinci\l3pcontrolesitemap\models .\src\main\resources\static\sitemap.xsd

```

