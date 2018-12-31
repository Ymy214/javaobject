package com.dh.hrmanager.entity;

import java.io.Serializable;

public class Employee implements Serializable
{

	//用户id
	private int userId;
	//用户名
	private String userName;
	//密码
	private String password;
	//角色id
	private int roleId;
	//员工编号
	private String empNo;
	//部门id
	private int deptId;
	//薪资
	private double salary;
	//自动成成getter and setter
	public int getUserId()
	{
		return userId;
	}
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public int getRoleId()
	{
		return roleId;
	}
	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}
	public String getEmpNo()
	{
		return empNo;
	}
	public void setEmpNo(String empNo)
	{
		this.empNo = empNo;
	}
	public int getDeptId()
	{
		return deptId;
	}
	public void setDeptId(int deptId)
	{
		this.deptId = deptId;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
		//构造方法
	public Employee(int userId, String empNo, String userName, String password, int deptId, int roleId, double salary)
	{
		//super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.roleId = roleId;
		this.empNo = empNo;
		this.deptId = deptId;
		this.salary = salary;
	}
		public Employee()
		{
			
		}
		
	/**
	 * 显示员工信息
	 * 
	 */

	public void displayInfo() {
		String position = null;
		if (roleId==1) {
			position = "Staff";
		}
		if (roleId==2)
		{
			position = "Manager";
		}
		if (roleId==3) {
			position="Admin";
		}
		
		String department = null;
		if(deptId==1)
		{
			department = "市场部";
		}
		if(deptId==2) 
		{
			department = "开发部";
		}
		if(deptId==3)
		{
			department = "信息部";
		}
		
		System.out.println("\t\t 当前用户信息\n\n");
		System.out.println("**************************************");
		System.out.println("\t\t 雇员编号："+ empNo);
		System.out.println("\t\t 姓名："+ userName);
		System.out.println("\t\t 职务："+ position);
		System.out.println("\t\t 部门："+ department);
		System.out.println("\t\t 薪水："+ String.valueOf(salary));
		System.out.println("**************************************");
		
	}
	/**
	 * 修改密码
	 * @param newPassword
	 */
	public void modifyPassword(String newPassowrd) 
	{
		this.password = newPassowrd;
		System.out.println("密码修改成功");
		
	}
}








