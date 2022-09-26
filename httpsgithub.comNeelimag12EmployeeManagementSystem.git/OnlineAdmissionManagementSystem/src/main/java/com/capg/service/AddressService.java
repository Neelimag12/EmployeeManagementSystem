package com.capg.service;

import com.capg.entity.Address;

public interface AddressService {
	Address addAddress(Address address);
	void deleteAddressById(int addressId);
	Address getAddressById(int addressId);
	Address updateAddress(Address add);
	


}
