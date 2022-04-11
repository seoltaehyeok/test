package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.*;

public class Test {

	public static void main(String[] args) {
		try {
		//	Class t = Class.forName("java.lang.Thread");
			Class t = Class.forName("java.util.Date");
			System.out.println("Date�� ���� ������ ����� �������.");
			
			for(Constructor res : t.getConstructors()) {
				System.out.println(res.getName()+","+res.toString());
				for(Parameter param : res.getParameters())	{
					System.out.println(param.getName()+","+param.toString());
				}
			}
			System.out.println("Date�� ���� �޼ҵ� ����� �������.");
			
			for(Method res : t.getMethods()) {
				System.out.println(res.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
