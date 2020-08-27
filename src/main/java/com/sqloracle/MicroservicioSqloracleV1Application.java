package com.sqloracle;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sqloracle.entity.Rodo;
import com.sqloracle.service.IRodoService;
import com.sqloracle.service.impl.RodoServiceImpl;

@SpringBootApplication
public class MicroservicioSqloracleV1Application {

	private static final Logger logger = LogManager.getLogger(MicroservicioSqloracleV1Application.class);

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MicroservicioSqloracleV1Application.class, args);

		/**
		 * 
		 */

		IRodoService service = ac.getBean(RodoServiceImpl.class);

		Rodo rodo = new Rodo("Nombre", 40, new Date());
		boolean status = service.saveRodo(rodo);
		if (status)
			logger.info("insertado");
		else
			logger.info("No insertado");
	}

}
