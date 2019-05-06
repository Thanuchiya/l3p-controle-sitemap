package fr.thanuchiya.l3pcontrolesitemap.service;

import fr.thanuchiya.l3pcontrolesitemap.models.generated.Url;
import fr.thanuchiya.l3pcontrolesitemap.models.generated.Urlset;
import org.junit.Assert;
import org.junit.Test;


public class SitemapServiceTest {

    private final SitemapService sitemapService = new SitemapService();

    @Test
    public void test_serialize_nominal(){
        //GIVEN
        Urlset sitemap = new Urlset();
        Url url1= new Url();
        url1.setLoc("A");
        url1.setLastmod("B");

        Url url2= new Url();
        url2.setLoc("C");
        url2.setLastmod("D");

        sitemap.getUrl().add(url1);
        sitemap.getUrl().add(url2);
        String expected = "";


        // WHEN
        String actual = sitemapService.serialize(sitemap);

        //THEN

        Assert.assertEquals(expected,actual);

    }
}
