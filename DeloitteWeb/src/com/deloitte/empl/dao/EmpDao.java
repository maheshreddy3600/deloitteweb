package com.deloitte.empl.dao;

import java.util.List;

import com.deloitte.empl.beans.Emp;

public interface EmpDao {
void openConnection() ;
void close();
int addEmp(Emp emp);
List<Emp> getEmpls();
Emp getEmpByCode(int empcode);

int updateEmp(double sal, int empno);
int deletion(int empno);
int updateCompleteEmp(String ename,String job,int mgr, String  hiredate,double sal,double comm,int deptno,int empno);
}

