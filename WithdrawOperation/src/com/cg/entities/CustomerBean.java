package com.cg.entities;

	

	public class CustomerBean {
	
		private int id;
		private String firstName;
		private String lastName;
		private String emailId;
		private String gender;
		private String phoneNo;
		private String panNum;
		private String address;
		private AccountBean accountBean;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getPanNum() {
			return panNum;
		}
		public void setPanNum(String panNum) {
			this.panNum = panNum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public AccountBean getAccountBean() {
			return accountBean;
		}
		public void setAccountBean(AccountBean accountBean) {
			this.accountBean = accountBean;
		}
		@Override
		public String toString() {
			return "CustomerBean [id=" + id + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", emailId=" + emailId
					+ ", gender=" + gender + ", phoneNo=" + phoneNo
					+ ", panNum=" + panNum + ", address=" + address
					+ ", accountBean=" + accountBean + "]";
		}
		public CustomerBean() {
			super();
		}
		public CustomerBean(int id, String firstName, String lastName,
				String emailId, String gender, String phoneNo, String panNum,
				String address, AccountBean accountBean) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.gender = gender;
			this.phoneNo = phoneNo;
			this.panNum = panNum;
			this.address = address;
			this.accountBean = accountBean;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CustomerBean other = (CustomerBean) obj;
			if (id != other.id)
				return false;
			return true;
		}
		
		
		
			

}
