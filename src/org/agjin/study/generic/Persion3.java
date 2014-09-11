package org.agjin.study.generic;

public class Persion3<T extends Info> {
	
	public T info;
	
	// 상속으로 구현된 생성자.
	public Persion3 (T info) {
		this.info = info;
	}
	
}
