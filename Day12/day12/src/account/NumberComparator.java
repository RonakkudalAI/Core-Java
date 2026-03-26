package account;

import java.util.Comparator;

public class NumberComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o2.getAccNo().compareTo(o1.getAccNo());
	}
}
