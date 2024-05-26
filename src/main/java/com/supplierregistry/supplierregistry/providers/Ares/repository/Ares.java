package com.supplierregistry.supplierregistry.providers.Ares.repository;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.supplierregistry.supplierregistry.providers.Ares.entities.FindByIconResponse;

public class Ares {
	private static final HttpClient client = HttpClient.newHttpClient();
	private static final String ARES_URL = "https://ares.gov.cz";

	public static FindByIconResponse findByIco(String ico) {
		URI uri = createUri("/ekonomicke-subjekty-v-be/rest/ekonomicke-subjekty/" + ico);

		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(uri)
					.header("Accept", "application/json")
					.build();
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			if (response.statusCode() != 200) {
				throw new Exception();
			}

			Gson gson = new Gson();
			FindByIconResponse myObject = gson.fromJson(response.body(), FindByIconResponse.class);

			return myObject;
		} catch (Exception _e) {
			return null;
		}
	}

	private static URI createUri(String path) {
		try {
			return new URI(ARES_URL + path);
		} catch (Exception _e) {
			return null;
		}
	}
}
