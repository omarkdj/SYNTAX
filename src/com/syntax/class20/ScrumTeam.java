package com.syntax.class20;

public class ScrumTeam {
	String ceremonies;

	void attendMeetings() {
		System.out.println("Scurm team attend " + ceremonies);
	}
}

class ProductOwner extends ScrumTeam {
	void prioritizeBacklog() {
		System.out.println("PO prioritize product backlog");
	}
}

class ScrumMaster extends ScrumTeam {
	void navigateTeam() {
		System.out.println("Scrum master faciliates Scrum team");
	}
}

class Developer extends ScrumTeam {
	void coding() {
		System.out.println("Developer write codes");
	}
}