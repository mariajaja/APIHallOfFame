/**
 * 
 */
package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mariah
 *
 */
@Component
public class ApiService {

	private RestTemplate rest = new RestTemplate();

	public List<Tiny> getAllTiny() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		Response tiny = rest.getForObject(url, Response.class);
		return tiny.getTiny();
	}

	public List<Complete> getAllComplete() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		Response complete = rest.getForObject(url, Response.class);
		return complete.getComplete();
	}

}
