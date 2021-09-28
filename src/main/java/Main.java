import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;

public class Main {
    public static void main(String[] args) {
        String url = "https://sfbay.craigslist.org/d/for-sale/search/sss?query=iphone%208&sort=rel";
        WebClient webClient = new WebClient();
        webClient.getOptions().setUseInsecureSSL(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(false);
        try{
            HtmlPage htmlPage = webClient.getPage(url);
            System.out.println(htmlPage.asXml());
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
