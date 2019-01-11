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




/**
 * Candy crush initiation
 * 
 */

public class CandyCrushInitiation {
    public int[][][] generate(int r, int c, int N) {
        int[][][] res = new int[2][r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                fill(res, i, j, N);
            }
        }
        return res;
    }
    private void fill(int[][][] array, int i, int j, int N) {
        boolean randomGenerate = true;
        while (randomGenerate) {
            int fill = (int)(Math.random() * N);
            randomGenerate = false;
            boolean checkUp = (i - 1 >= 0 && j >= 0 && fill == array[0][i - 1][j]);
            boolean checkLeft = (i >= 0 && j - 1 >= 0 && fill == array[0][i][j - 1]);
            if (checkUp && checkLeft) {
                int countMax = Math.max(array[1][i - 1][j], array[1][i][j - 1]);
                if (countMax < 2) {
                    array[1][i][j] = countMax + 1;
                    array[0][i][j] = fill;
                } else {
                    randomGenerate = true;
                    continue;
                }
            } else if (checkUp) {
                if (array[1][i - 1][j] < 2) {
                    array[1][i][j] = array[1][i - 1][j] + 1;
                    array[0][i][j] = fill;
                } else {
                    randomGenerate = true;
                    continue;
                }
            } else if (checkLeft) {
                if (array[1][i][j - 1] < 2) {
                    array[1][i][j] = array[1][i][j - 1] + 1;
                    array[0][i][j] = fill;
                } else {
                    randomGenerate = true;
                    continue;
                }
            } else {
                array[1][i][j] ++;
                array[0][i][j] = fill;
            }
        }
    }
}
