package com.zensar.payroll.daoservices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.zensar.payroll.beans.Associate;
import com.zensar.payroll.exceptions.PayRollServicesNotFoundException;

public class PayrollDAOServicesImpl implements PayrollDAOServices {

	static int associateId = 100;

	Map<Integer, Associate> map = new HashMap<Integer, Associate>();
	
	public PayrollDAOServicesImpl() {
		try {
			FileInputStream fos = new FileInputStream(".\\src\\resources\\store.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fos);
			Map<Integer, Associate> map = (Map<Integer, Associate>) objectInputStream.readObject();
			System.out.println(map.get(100));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int insertAssociate(Associate associate) {
		associate.setAssociateId(associateId);
		map.put(associateId, associate);
		associateId++;
		return associate.getAssociateId();
	}

	@Override
	public boolean updateAssociate(Associate associate) {
		if(map.put(associate.getAssociateId(), associate)!=null)
			return true;
		else
			return false;
	}

	@Override
	public Associate getAssociate(int associateId) {
		if(map.get(associateId)!=null)
			return map.get(associateId);
		else
			return null;
	}

	@Override
	public ArrayList<Associate> getAssociates() {
		ArrayList<Associate> associates = new ArrayList<Associate>(map.values());
		if(associates.isEmpty())
			return null;
		else
			return associates;
	}

	@Override
	public boolean closePayrollDAOServices() {
		try {
			FileOutputStream fos = new FileOutputStream(".\\src\\resources\\store.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
			objectOutputStream.writeObject(map);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
