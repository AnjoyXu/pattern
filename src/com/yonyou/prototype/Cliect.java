package com.yonyou.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cliect {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		
		Sheep s1 = new Sheep();
		s1.setBirthday(new Date(123211433314L));
		
		s1.setName("多利羊");
		
		s1.setHead(new Head("多利羊头"));
		s1.setBody(new Body("多利羊身体"));
		
		Leg flleg = new Leg("左前腿");
		Leg blleg = new Leg("左后腿");
		Leg frleg = new Leg("右前腿");
		Leg brleg = new Leg("右后腿");
		List<Leg> legs = new ArrayList<>();
		legs.add(frleg);
		legs.add(brleg);
		legs.add(blleg);
		legs.add(flleg);
		s1.setListleg(legs);
		Map<String,String> map = new HashMap<>();
		map.put("111", "111");
		s1.setMap(map);
		
		System.out.println(s1);
		System.out.println(s1.getName() +":" +s1.getHead().getName() +":"+ s1.getListleg().get(0).getDirectname());
	
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(s1);
		
		byte [] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Sheep s2 = (Sheep) ois.readObject();
		
		s2.getMap().put("222", "222");
		s2.setName("多利羊儿子");
		System.out.println(s2);
		s2.getHead().setName("多利羊儿子头");
		s2.getListleg().get(0).setDirectname("11111");
		
		System.out.println(s2.getName() +":" +s2.getHead().getName() +":"+ s2.getListleg().get(0).getDirectname()+":"+s2.getMap());
		System.out.println(s1.getName() +":" +s1.getHead().getName() +":"+ s1.getListleg().get(0).getDirectname()+":"+s1.getMap());

		
		
		
		
	}
}
