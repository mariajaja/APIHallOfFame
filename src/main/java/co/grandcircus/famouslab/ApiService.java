/**
 * 
 */
package co.grandcircus.famouslab;

import java.util.ArrayList;
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

	private RestTemplate restTemplateWithUserAgent;

	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	// My Deck ID: 3l0483xpl21f

	public List<Tiny> getAllTiny() {
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		List<Tiny> allTiny = new ArrayList<>();
		Tiny response = new Tiny();
		do {
			response = restTemplateWithUserAgent.getForObject(url, Tiny.class);
			allTiny.add(response);
		} while (response != null);

		return allTiny;
	}
}
