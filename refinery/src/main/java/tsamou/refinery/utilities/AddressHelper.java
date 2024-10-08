package tsamou.refinery.utilities;

import tsamou.refinery.models.Address;

public class AddressHelper {
    public static void updateAddress(Address addressToBeUpdated, Address address){
        addressToBeUpdated.setCity(address.getCity());
        addressToBeUpdated.setEmployee(address.getEmployee());
        addressToBeUpdated.setId(address.getId());
        addressToBeUpdated.setNumber(address.getNumber());
        addressToBeUpdated.setMail(address.getMail());
        addressToBeUpdated.setFlatNum(address.getFlatNum());
        addressToBeUpdated.setPhoneNum(address.getPhoneNum());
        addressToBeUpdated.setPostCode(address.getPostCode());
        addressToBeUpdated.setStreet(address.getStreet());
        addressToBeUpdated.setCity(address.getCity());
    }
}
