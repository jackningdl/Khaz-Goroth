/**
 * builder pattern
 * initiate an object in a more convenient, safe and flexible way.
 */

public class User {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age = 0;
		private String phone = "";
		private String address = "";

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public static void main(String[] arv) {
		User user = new User.UserBuilder("John", "Smith")
								.setAge(25)
								.setPhone("6666666666")
								.setAddress("N 1st St")
								.build();

	}
}

/**
 * singleton pattern
 * Ensure a class has only one instance, and provide aa global point of access to it.
 */

public class SingletonExample {
	private static final SingletonExample Instance = null;

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		if (Instance == null) {
			Instance = new SingletonExample();
		}
		return Instance;
	}
}


/**
 * factory pattern
 * 
 */

