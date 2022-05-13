package com.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	@Bean
	public RouteLocator routeLocateFarmer(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p.
						path("/addfarmer")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/findfarmer")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/findfarmer/{id}")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/update/{id}")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/deletefarmer/{id}")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/get/crop")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/get/crop/{id}")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/add/crop")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/delete/crop/{_id}")
						.uri("lb://farmer-service/"))
				.route(p ->p.
						path("/farmer/update/crop/{id}")
						.uri("lb://farmer-service/"))
				.route(p -> p.path("/reg")
						      .uri("lb://farmer-service/"))
				.route(p -> p.path("/auth")
						    .uri("lb://farmer-service/")
						
						
						)
				.build();
	}
	@Bean
	public RouteLocator routeLocatDealer(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p.
						path("/adddealer")
						.uri("lb://dealer-service/"))
				.route(p ->p.
						path("/dealer/finddealer")
						.uri("lb://dealer-service/"))
				.route(p ->p.
						path("/dealer/finddealer/{id}")
						.uri("lb://dealer-service/"))
				.route(p ->p.
						path("/dealer/deleteddealer/{id}")
						.uri("lb://dealer-service/"))
				.route(p ->p.
						path("/dealer/dealer/get/crop")
						.uri("lb://dealer-service/"))
				.build();
	}
	@Bean
	public RouteLocator routeLocatAdmin(RouteLocatorBuilder routeLocatorBuilder)
	{
		return routeLocatorBuilder.routes()
				.route(p ->p.
						path("/admin")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/reg")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/auth")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/addadmin")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/findadmin")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/findadmin/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/deleteadmin/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/get/crop")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/get/crop/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/delete/crop/{_id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/farmer")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/farmer/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/delete/farmer/{_id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/get/dealer/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/get/dealer")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/deleteddealer/{id}")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/")
						.uri("lb://admin-service/"))
				.route(p ->p.
						path("/admin/admin/delete/dealer/{_id}")
						.uri("lb://admin-service/"))
					
			.build();
	}

	

}
