package com.mycompany.ecommerce.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Component
public class Merchant {
	@Id
	@GeneratedValue(generator="merchant_id")
	@SequenceGenerator(name="merchant_id",initialValue = 111001,allocationSize = 1,sequenceName ="merchant_id")
     private int id;
	@Size(min = 5,message="*Atleast enter 5 charecter")
     private String name;
//    @Size(max = 10,message="Number Should be 10 digits")
	@NotNull
	@Digits(integer=10,fraction=0)
	@DecimalMin(value="6000000000",message = "enter proper mobile number")
	@DecimalMax(value="99000000000",message = "enter proper mobile number")
     private long mobile;
    @Email(message = "*Email format is not correct")
    @NotEmpty
     private String email;
    @NotEmpty
    @Size(min = 8,message="*Minimum 8 charecters")
     private String password;
    @NotEmpty(message="*Select atleast one gender")
     private String gender;
    @Past(message="*Date must not be Todays or Futures Date")
     private LocalDate dob;
    private boolean status;
    private int otp;
    

	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<MerchantProduct> products;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public List<MerchantProduct> getProducts() {
		return products;
	}
	public void setProducts(List<MerchantProduct> products) {
		this.products = products;
	}  
	
}
