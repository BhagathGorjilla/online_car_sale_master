package com.cars.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cars.beans.Appointment;



public interface IAppointmentRepository extends JpaRepository<Appointment,Long > {
	
	@Query("Select a from Appointment a where a.appointmentId=?1")
	Appointment updateAppointment(Long id);
	

//	public Appointment addAppointment(Appointment appointment);
//	public Appointment removeAppointment(long id); 
//	public Appointment updateAppointment(long id, Appointment appointment);
//	public Appointment getAppointment(long id);
//	public List<Appointment> getAllAppointments(); 
//	public List<Appointment> getOpenAppointments();
}
