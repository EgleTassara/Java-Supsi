public class MailingListTest {

	static User createUser(String userName, String mailDomain) {
		return new User(userName, userName + "@" + mailDomain);
	}

	static void addMemberWithPrintError(User user, MailingList mailingList) {
		if (user == null || mailingList == null) {
			return;
		}

		System.out.print("Utente: ");
		user.show();
		if (!mailingList.addMember(user)) {
			System.out.println("Impossibile aggiungere utente " + mailingList.description);
		}
	}

	public static void main(String[] args) {
		User[] users = new User[10];
		users[0] = createUser("Marco", "supsi.ch");
		users[1] = createUser("Pippo", "supsi.ch");
		users[2] = createUser("Fabrizio", "supsi.ch");
		users[3] = createUser("Martina", "supsi.ch");
		users[4] = createUser("Luciana", "gmail.com");
		users[5] = createUser("Mario", "gmail.com");
		users[6] = createUser("Valentina", "gmail.com");
		users[7] = createUser("Egle", "gmail.com");
		users[8] = createUser("Pluto", "gmail.com");
		users[9] = createUser("Lucrezia", "gmail.com");

		MailingList firstMailingList = new MailingList(4, 
			"Prima Mailing List");
		MailingList secondMailingList = new MailingList(15, 
			"Seconda Mailing List");

		System.out.println("Aggiungi utenti: ");
		for (int i = 0; i < users.length; i++) {
			if (i % 2 == 0) {
				addMemberWithPrintError(users[i], firstMailingList);
			} else {
				addMemberWithPrintError(users[i], secondMailingList);
			}
		}

		System.out.println("\nMaining List: ");
		firstMailingList.show();
		secondMailingList.show();

		System.out.println("\nNumero di membri comuni: " + 
			firstMailingList.countCommonMembers(secondMailingList));

		System.out.println("\nAggiungi membri comuni");
		addMemberWithPrintError(createUser("Marco", "supsi.ch"), 
			secondMailingList);
		addMemberWithPrintError(firstMailingList.members[1], secondMailingList);

		System.out.println("\nNumero di membri comuni: " + 
			firstMailingList.countCommonMembers(secondMailingList));
	}
}

class User {
	String userName;
	String mail;

	User(String userName, String mail) {
		this.userName = userName;
		this.mail = mail;
	}

	void show() {
		System.out.println(userName + ", " + mail);
	}

	boolean isTheSame(User otherUser) {
		if (this == otherUser){
			return true;
		}

		if (otherUser == null){
			return false;
		}

		if (userName == null) {
			if (otherUser.userName != null){
				return false;
			}

		} else if (!userName.equals(otherUser.userName)){
			return false;
		}

		if (mail == null) {
			if (otherUser.mail != null){
				return false;
			}
		} else if (!mail.equals(otherUser.mail)){
			return false;
		}
		return true;
	}
}

class MailingList {
	String description;
	int numberOfMembers;
	User[] members;

	MailingList(int maximumNumberOfMembers, String description) {
		if (maximumNumberOfMembers <= 0) {
			maximumNumberOfMembers = 10;
		}

		members = new User[maximumNumberOfMembers];
		this.description = description;
	}

	boolean addMember(User newMember) {
		if (newMember != null && numberOfMembers < members.length) {
			members[numberOfMembers] = newMember;
			numberOfMembers++;
			return true;
		}
		return false;
	}

	void show() {
		System.out.println(description);
		for (int i = 0; i < numberOfMembers; i++) {
			members[i].show();
		}
		System.out.println();
	}

	int countCommonMembers(MailingList otherMailingList) {
		if (otherMailingList == null) {
			return 0;
		}

		int count = 0;

		for (int i = 0; i < numberOfMembers; i++) {
			for (int j = 0; j < otherMailingList.numberOfMembers; j++) {
				if (members[i].isTheSame(otherMailingList.members[j])) {
					count++;
				}
			}
		}
		return count;
	}
}