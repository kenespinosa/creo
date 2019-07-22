package io.swagger.api.service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import io.swagger.model.Platform;

public interface IPlatform {
	
	public Platform createPlatform(Platform p);

}
