package com.graphql.graphql.domain.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

	@Autowired
	private VehicleService vehicleService;

	public Vehicle createVehicle(final String type, final String modelCode, final String brandName,
			final String launchDate) {
		return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
	}
}