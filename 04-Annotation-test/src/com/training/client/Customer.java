package com.training.client;
@Table(name="Customer")
@Entity
public class Customer {
	@Id
int id;
@Column(name="c_name", notNull = false, size = 0)
String name;
@Column(name="c_city", notNull = false, size = 0)
String city;
double outStandingAmount;
}
