package com.revature.rideshare.adminservice.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
public class AdminDTO {
	private int adminId;

	@NotBlank(message = "Username cannot be blank.")
	@Size(min = 3, max = 12, message = "Number of characters must be between 3 and 12.")
	@Pattern(regexp = "^\\w+\\.?\\w+$", message = "Username format is incorrect.")
	private String userName;

	public AdminDTO(Admin admin) {
		super();
		if (admin != null) {
			this.adminId = admin.getAdminId();
			this.userName = admin.getUserName();
		}
	}
}
