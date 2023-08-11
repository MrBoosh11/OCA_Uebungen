package ConflictExample.NewPackage;

import java.util.List;

// import java.sql.*;

/**
 * @author Timon 11/08/2023
 */

public class ConflictExample {

	public static void main(String[] args) {
		java.util.Date date;
		java.sql.Date sqlDate;

	}

	public void checkEmpty(List list) {
		if (list.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}
	}
}
