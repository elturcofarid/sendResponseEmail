package com.util.email.rabbit.receiver;

import com.google.gson.Gson;
import com.util.email.model.Data;
import com.util.email.model.ResponsePosmark;
import kong.unirest.json.JSONObject;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EmailReceiver {

	@Autowired
	private Gson gson;


	@RabbitListener(queues = "${queue.responseEmail}")
	public void receive(String in) {
		try {

			ResponsePosmark email = gson.fromJson(in, ResponsePosmark.class);

			Data data = gson.fromJson(gson.toJson(email.getData()), Data.class);

			System.out.println("si pasa por aqui");
			if (data != null && data.getUrlDestino() != null)
			sendResponse(email, data.getUrlDestino());

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("finaliza bien");
	}


	private void sendResponse(ResponsePosmark email, String url) {
		JSONObject personJsonObject = new JSONObject();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> request =
				new HttpEntity<String>(personJsonObject.toString(), headers);

		HttpEntity<ResponsePosmark> entity = new HttpEntity<ResponsePosmark>(email, headers);


		try {
			RestTemplate restTemplate = new RestTemplate();

			System.out.println("si pasa por aqui servicio");

			ResponseEntity<String> responseEntity = restTemplate.exchange(
					url, HttpMethod.POST, entity,
					String.class);
System.out.println(responseEntity);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}

