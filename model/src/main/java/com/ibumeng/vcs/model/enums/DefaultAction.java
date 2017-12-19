package com.ibumeng.vcs.model.enums;

import java.util.HashMap;
import java.util.Map;

public enum DefaultAction {
	Add("添加", 1),Update("修改", 2),Delete("删除", 3),Read("查看", 4),Audit("审批", 5);

	private String name;

	private int value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	private static Map<String, DefaultAction> nameMap;

	private static Map<Integer, DefaultAction> valueMap;

	static {
		nameMap = new HashMap<String, DefaultAction>();
		valueMap = new HashMap<Integer, DefaultAction>();

		for (DefaultAction vs : DefaultAction.values()) {
			nameMap.put(vs.name, vs);
			valueMap.put(vs.value, vs);
		}
	}

	private DefaultAction(String name, int value ) {
		this.name = name;
		this.value = value;
	}

	public static DefaultAction getByName(String name) {
		return nameMap.get(name);
	}

	public static DefaultAction getByValue(int value) {
		return valueMap.get(value);
	}
}
