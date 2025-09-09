package com.kh.example.gearrent;

public class Member {
	private String id;
	private String name;
	
	// 생성자
	public Member() {
		super();
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	//메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	// toString()
    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

	

}
