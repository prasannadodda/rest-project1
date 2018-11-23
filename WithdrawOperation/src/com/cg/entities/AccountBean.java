package com.cg.entities;


	
	public class AccountBean {
		
		private int accountId;
		private String firstName;
		private String lastName;
		private double balance;
	
	
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

		public int getAccountId() {
			return accountId;
		}

		public void setAccountId(int accountId) {
			this.accountId = accountId;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}


	
		@Override
		public String toString() {
			return "AccountBean [accountId=" + accountId + ", firstName="
					+ firstName + ", lastName=" + lastName + ", balance="
					+ balance + "]";
		}

		public AccountBean(int accountId, String firstName, String lastName,
				double balance) {
			super();
			this.accountId = accountId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.balance = balance;
		}

		public AccountBean() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + accountId;
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
			AccountBean other = (AccountBean) obj;
			if (accountId != other.accountId)
				return false;
			return true;
		}
		
		

	}
