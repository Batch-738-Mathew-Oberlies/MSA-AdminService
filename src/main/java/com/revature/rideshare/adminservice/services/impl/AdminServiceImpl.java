package com.revature.rideshare.adminservice.services.impl;

import com.revature.rideshare.adminservice.models.Admin;
import com.revature.rideshare.adminservice.repositories.AdminRepository;
import com.revature.rideshare.adminservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * AdminServiceImpl handles any additional services that need to be made before calling the
 * repository methods.
 *
 * @author Adonis Cabreja
 */

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;

	/**
	 * Calls AdminRepository's findAll method found in the JpaRepository.
	 *
	 * @return A list of all the admins.
	 */
	@Override
	public List<Admin> getAdmins() {
		return adminRepository.findAll();
	}

	/**
	 * Calls AdminRepository's getOne method found in the JpaRepository.
	 *
	 * @param id represents the admin's id.
	 * @return An admin that matches the id.
	 */
	@Override
	public Optional<Admin> getAdminById(int id) {
		return adminRepository.findById(id);
	}

	/**
	 * Calls AdminRepository's save method found in the JpaRepository.
	 *
	 * @param admin represents the new Admin object being sent.
	 * @return The newly created object.
	 */
	@Override
	public Admin createAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	/**
	 * Calls AdminRepository's save method found in the JpaRepository.
	 *
	 * @param admin represents the updated Admin object being sent.
	 * @return The newly updated object.
	 */
	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	/**
	 * Calls AdminRepository's deleteById method found in the JpaRepository.
	 *
	 * @param id represents admin's id.
	 * @return A string that says which admin was deleted.
	 */
	@Override
	public String deleteAdminById(int id) {
		adminRepository.deleteById(id);
		return "Admin with id: " + id + " was deleted.";
	}
}
